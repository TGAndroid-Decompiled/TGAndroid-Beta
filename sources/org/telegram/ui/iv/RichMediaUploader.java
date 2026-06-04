package org.telegram.ui.iv;

import android.graphics.BitmapFactory;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public class RichMediaUploader implements NotificationCenter.NotificationCenterDelegate {
    private boolean cancelled;
    private final int currentAccount;
    private boolean finished;
    private final boolean isVideo;
    private final Listener listener;
    private final String path;
    private int requestToken;
    private boolean started;
    private final int videoDurationSec;
    private final int videoHeight;
    private final int videoWidth;

    public interface Listener {
        void onError();

        void onPhotoUploaded(TLRPC.Photo photo);

        void onProgress(float f);

        void onVideoUploaded(TLRPC.Document document);

        void onWidthHeightResolved(int i, int i2);
    }

    public RichMediaUploader(int i, String str, boolean z, int i2, int i3, int i4, Listener listener) {
        this.currentAccount = i;
        this.path = str;
        this.isVideo = z;
        this.videoWidth = i2;
        this.videoHeight = i3;
        this.videoDurationSec = i4;
        this.listener = listener;
    }

    public void start() {
        int i;
        int i2;
        if (this.started || this.cancelled || this.finished) {
            return;
        }
        this.started = true;
        if (!this.isVideo) {
            resolvePhotoDimensions();
        } else {
            Listener listener = this.listener;
            if (listener != null && (i = this.videoWidth) > 0 && (i2 = this.videoHeight) > 0) {
                listener.onWidthHeightResolved(i, i2);
            }
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        notificationCenter.addObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.addObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.addObserver(this, NotificationCenter.fileUploadProgressChanged);
        FileLoader.getInstance(this.currentAccount).uploadFile(this.path, false, true ^ this.isVideo, this.isVideo ? 33554432 : 16777216);
    }

    public void cancel() {
        if (this.finished || this.cancelled) {
            return;
        }
        this.cancelled = true;
        try {
            FileLoader.getInstance(this.currentAccount).cancelFileUpload(this.path, false);
        } catch (Throwable unused) {
        }
        if (this.requestToken != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestToken, true);
            this.requestToken = 0;
        }
        teardown();
    }

    private void teardown() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadProgressChanged);
    }

    private void resolvePhotoDimensions() {
        int i;
        Listener listener;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(this.path, options);
            int i2 = options.outWidth;
            if (i2 <= 0 || (i = options.outHeight) <= 0 || (listener = this.listener) == null) {
                return;
            }
            listener.onWidthHeightResolved(i2, i);
        } catch (Exception unused) {
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 != this.currentAccount || this.cancelled || this.finished) {
            return;
        }
        if (this.path.equals((String) objArr[0])) {
            if (i == NotificationCenter.fileUploaded) {
                sendUploadMediaRequest((TLRPC.InputFile) objArr[1]);
                return;
            }
            if (i == NotificationCenter.fileUploadFailed) {
                finishWithError();
                return;
            }
            if (i == NotificationCenter.fileUploadProgressChanged) {
                long jLongValue = ((Long) objArr[1]).longValue();
                long jLongValue2 = ((Long) objArr[2]).longValue();
                Listener listener = this.listener;
                if (listener != null) {
                    listener.onProgress(jLongValue2 > 0 ? jLongValue / jLongValue2 : 0.0f);
                }
            }
        }
    }

    private void sendUploadMediaRequest(TLRPC.InputFile inputFile) {
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.isVideo) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.videoDurationSec;
            tL_documentAttributeVideo.w = this.videoWidth;
            tL_documentAttributeVideo.h = this.videoHeight;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
            tL_inputMediaUploadedPhoto.file = inputFile;
            tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
        }
        this.requestToken = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_uploadMedia, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$sendUploadMediaRequest$1(tLObject, tL_error);
            }
        });
    }

    public void lambda$sendUploadMediaRequest$1(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendUploadMediaRequest$0(tLObject);
            }
        });
    }

    public void lambda$sendUploadMediaRequest$0(TLObject tLObject) {
        TLRPC.Photo photo;
        TLRPC.Document document;
        if (this.cancelled) {
            return;
        }
        this.requestToken = 0;
        if (this.isVideo) {
            if ((tLObject instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject).document) != null) {
                finishWithVideo(document);
                return;
            }
        } else if ((tLObject instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo) != null) {
            finishWithPhoto(photo);
            return;
        }
        finishWithError();
    }

    private void finishWithPhoto(TLRPC.Photo photo) {
        this.finished = true;
        teardown();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onPhotoUploaded(photo);
        }
    }

    private void finishWithVideo(TLRPC.Document document) {
        this.finished = true;
        teardown();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onVideoUploaded(document);
        }
    }

    private void finishWithError() {
        this.finished = true;
        teardown();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onError();
        }
    }
}
