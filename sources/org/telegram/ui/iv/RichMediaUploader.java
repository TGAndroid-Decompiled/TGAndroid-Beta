package org.telegram.ui.iv;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public class RichMediaUploader implements NotificationCenter.NotificationCenterDelegate {
    private final TLRPC.Document audioDocument;
    private boolean cancelled;
    private final int currentAccount;
    private boolean finished;
    private final boolean isAudio;
    private final boolean isVideo;
    private final Listener listener;
    private final String path;
    private int requestToken;
    private boolean started;
    private volatile String uploadPath;
    private final int videoDurationSec;
    private final int videoHeight;
    private final int videoWidth;

    public interface Listener {

        public abstract class CC {
            public static void $default$onAudioUploaded(Listener listener, TLRPC.Document document) {
            }

            public static void $default$onPhotoUploaded(Listener listener, TLRPC.Photo photo) {
            }

            public static void $default$onVideoUploaded(Listener listener, TLRPC.Document document) {
            }

            public static void $default$onWidthHeightResolved(Listener listener, int i, int i2) {
            }
        }

        void onAudioUploaded(TLRPC.Document document);

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
        this.isAudio = false;
        this.videoWidth = i2;
        this.videoHeight = i3;
        this.videoDurationSec = i4;
        this.audioDocument = null;
        this.listener = listener;
    }

    private RichMediaUploader(int i, String str, TLRPC.Document document, Listener listener) {
        this.currentAccount = i;
        this.path = str;
        this.isVideo = false;
        this.isAudio = true;
        this.videoWidth = 0;
        this.videoHeight = 0;
        this.videoDurationSec = 0;
        this.audioDocument = document;
        this.listener = listener;
    }

    public static RichMediaUploader forAudio(int i, String str, TLRPC.Document document, Listener listener) {
        return new RichMediaUploader(i, str, document, listener);
    }

    public void start() {
        int i;
        int i2;
        if (this.started || this.cancelled || this.finished) {
            return;
        }
        this.started = true;
        if (this.isVideo) {
            Listener listener = this.listener;
            if (listener != null && (i = this.videoWidth) > 0 && (i2 = this.videoHeight) > 0) {
                listener.onWidthHeightResolved(i, i2);
            }
            beginUpload(this.path);
            return;
        }
        if (this.isAudio) {
            beginUpload(this.path);
        } else {
            resolvePhotoDimensions();
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$start$1();
                }
            });
        }
    }

    public void lambda$start$1() {
        final String strEnsureJpegPath = ensureJpegPath(this.path);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$start$0(strEnsureJpegPath);
            }
        });
    }

    public void lambda$start$0(String str) {
        if (this.cancelled || this.finished) {
            return;
        }
        beginUpload(str);
    }

    private void beginUpload(String str) {
        int i;
        if (this.cancelled || this.finished) {
            return;
        }
        this.uploadPath = str;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        notificationCenter.addObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.addObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.addObserver(this, NotificationCenter.fileUploadProgressChanged);
        if (this.isVideo) {
            i = 33554432;
        } else {
            i = this.isAudio ? 50331648 : 16777216;
        }
        FileLoader.getInstance(this.currentAccount).uploadFile(this.uploadPath, false, (this.isVideo || this.isAudio) ? false : true, i);
    }

    private String ensureJpegPath(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            String str2 = options.outMimeType;
            boolean z = str2 != null && (str2.equalsIgnoreCase("image/jpeg") || str2.equalsIgnoreCase("image/jpg"));
            float photoSize = AndroidUtilities.getPhotoSize();
            Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(str, null, photoSize, photoSize, true);
            if (bitmapLoadBitmap == null) {
                bitmapLoadBitmap = ImageLoader.loadBitmap(str, null, 800.0f, 800.0f, true);
            }
            if (bitmapLoadBitmap == null) {
                return str;
            }
            File file = new File(FileLoader.getDirectory(4), "rich_jpeg_" + Math.abs(str.hashCode()) + ".jpg");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    boolean zCompress = bitmapLoadBitmap.compress(Bitmap.CompressFormat.JPEG, 89, fileOutputStream);
                    fileOutputStream.close();
                    if (zCompress && file.length() > 0) {
                        if (z) {
                            long length = new File(str).length();
                            if (length > 0 && file.length() >= length) {
                                return str;
                            }
                        }
                        return file.getAbsolutePath();
                    }
                    return str;
                } finally {
                }
            } finally {
                bitmapLoadBitmap.recycle();
            }
        } catch (Throwable unused) {
            return str;
        }
    }

    public void cancel() {
        if (this.finished || this.cancelled) {
            return;
        }
        this.cancelled = true;
        try {
            if (this.uploadPath != null) {
                FileLoader.getInstance(this.currentAccount).cancelFileUpload(this.uploadPath, false);
            }
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
        String str = (String) objArr[0];
        if (this.uploadPath == null || !this.uploadPath.equals(str)) {
            return;
        }
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

    private void sendUploadMediaRequest(TLRPC.InputFile inputFile) {
        String str;
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
        } else if (this.isAudio) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument2.file = inputFile;
            TLRPC.Document document = this.audioDocument;
            if (document == null || (str = document.mime_type) == null) {
                str = "audio/mpeg";
            }
            tL_inputMediaUploadedDocument2.mime_type = str;
            if (document != null) {
                tL_inputMediaUploadedDocument2.attributes.addAll(document.attributes);
            }
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument2;
        } else {
            TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
            tL_inputMediaUploadedPhoto.file = inputFile;
            tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
        }
        this.requestToken = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_uploadMedia, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$sendUploadMediaRequest$3(tLObject, tL_error);
            }
        });
    }

    public void lambda$sendUploadMediaRequest$3(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendUploadMediaRequest$2(tLObject);
            }
        });
    }

    public void lambda$sendUploadMediaRequest$2(TLObject tLObject) {
        TLRPC.Document document;
        TLRPC.Photo photo;
        if (this.cancelled) {
            return;
        }
        this.requestToken = 0;
        if (this.isVideo || this.isAudio) {
            if ((tLObject instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject).document) != null) {
                if (this.isAudio) {
                    finishWithAudio(document);
                    return;
                } else {
                    finishWithVideo(document);
                    return;
                }
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

    private void finishWithAudio(TLRPC.Document document) {
        this.finished = true;
        teardown();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onAudioUploaded(document);
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
