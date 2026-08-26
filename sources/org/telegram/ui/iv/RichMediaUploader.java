package org.telegram.ui.iv;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class RichMediaUploader implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.Document audioDocument;
    public boolean cancelled;
    public final int currentAccount;
    public TLRPC.InputFile documentInputFile;
    public String documentThumbPath;
    public boolean finished;
    public final boolean isAudio;
    public final boolean isDocument;
    public final boolean isVideo;
    public final Listener listener;
    public final String path;
    public int requestToken;
    public boolean started;
    public volatile String uploadPath;
    public boolean uploadingDocumentThumb;
    public final int videoDurationSec;
    public final int videoHeight;
    public final int videoWidth;

    public interface Listener {
        void onAudioUploaded(TLRPC.Document document);

        void onDocumentUploaded(TLRPC.Document document);

        void onError();

        void onPhotoUploaded(TLRPC.Photo photo);

        void onProgress(float f);

        void onVideoUploaded(TLRPC.Document document);

        void onWidthHeightResolved(int i, int i2);
    }

    public RichMediaUploader(int i, String str, boolean z, int i2, int i3, int i4, RichEditorListView.AnonymousClass19 anonymousClass19) {
        this.currentAccount = i;
        this.path = str;
        this.isVideo = z;
        this.isAudio = false;
        this.isDocument = false;
        this.videoWidth = i2;
        this.videoHeight = i3;
        this.videoDurationSec = i4;
        this.audioDocument = null;
        this.listener = anonymousClass19;
    }

    public final void beginUpload(String str) {
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
        } else if (this.isAudio) {
            i = 50331648;
        } else {
            i = this.isDocument ? 67108864 : 16777216;
        }
        FileLoader.getInstance(this.currentAccount).uploadFile(this.uploadPath, false, (this.isVideo || this.isAudio || this.isDocument) ? false : true, i);
    }

    public final void cancel() {
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
        teardown$1();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.InputFile inputFile;
        if (i2 != this.currentAccount || this.cancelled || this.finished) {
            return;
        }
        String str = (String) objArr[0];
        if (this.uploadPath == null || !this.uploadPath.equals(str)) {
            return;
        }
        if (i == NotificationCenter.fileUploaded) {
            TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
            if (this.isDocument && !this.uploadingDocumentThumb && !TextUtils.isEmpty(this.documentThumbPath)) {
                this.documentInputFile = inputFile2;
                this.uploadingDocumentThumb = true;
                this.uploadPath = this.documentThumbPath;
                FileLoader.getInstance(this.currentAccount).uploadFile(this.uploadPath, false, true, 16777216);
                return;
            }
            if (this.isDocument && this.uploadingDocumentThumb) {
                sendUploadMediaRequest(this.documentInputFile, inputFile2);
                return;
            } else {
                sendUploadMediaRequest(inputFile2, null);
                return;
            }
        }
        if (i == NotificationCenter.fileUploadFailed) {
            if (this.isDocument && this.uploadingDocumentThumb && (inputFile = this.documentInputFile) != null) {
                sendUploadMediaRequest(inputFile, null);
                return;
            }
            this.finished = true;
            teardown$1();
            this.listener.onError();
            return;
        }
        if (i == NotificationCenter.fileUploadProgressChanged) {
            long jLongValue = ((Long) objArr[1]).longValue();
            long jLongValue2 = ((Long) objArr[2]).longValue();
            Listener listener = this.listener;
            if (this.uploadingDocumentThumb) {
                return;
            }
            listener.onProgress(jLongValue2 > 0 ? jLongValue / jLongValue2 : 0.0f);
        }
    }

    public final void sendUploadMediaRequest(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
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
        } else {
            boolean z = this.isAudio;
            boolean z2 = this.isDocument;
            if (z || z2) {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.audioDocument;
                if (z2) {
                    str = "application/octet-stream";
                } else if (document == null || (str = document.mime_type) == null) {
                    str = "audio/mpeg";
                }
                tL_inputMediaUploadedDocument2.mime_type = str;
                if (document != null) {
                    if (z2) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i);
                            i++;
                            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                                tL_inputMediaUploadedDocument2.attributes.add(documentAttribute2);
                            }
                        }
                    } else {
                        tL_inputMediaUploadedDocument2.attributes.addAll(document.attributes);
                    }
                }
                if (z2) {
                    tL_inputMediaUploadedDocument2.force_file = true;
                    if (inputFile2 != null) {
                        tL_inputMediaUploadedDocument2.thumb = inputFile2;
                        tL_inputMediaUploadedDocument2.flags |= 4;
                    }
                }
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument2;
            } else {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            }
        }
        this.requestToken = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_uploadMedia, new RichMediaUploader$$ExternalSyntheticLambda0(this, 0));
    }

    public final void start() {
        int i;
        int i2;
        if (this.started || this.cancelled || this.finished) {
            return;
        }
        this.started = true;
        if (this.isVideo) {
            Listener listener = this.listener;
            int i3 = this.videoWidth;
            if (i3 > 0 && (i2 = this.videoHeight) > 0) {
                listener.onWidthHeightResolved(i3, i2);
            }
            beginUpload(this.path);
            return;
        }
        if (this.isDocument) {
            Utilities.globalQueue.postRunnable(new RichMediaUploader$$ExternalSyntheticLambda1(this, 0));
            return;
        }
        if (this.isAudio) {
            beginUpload(this.path);
            return;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(this.path, options);
            int i4 = options.outWidth;
            if (i4 > 0 && (i = options.outHeight) > 0) {
                this.listener.onWidthHeightResolved(i4, i);
            }
        } catch (Exception unused) {
        }
        Utilities.globalQueue.postRunnable(new RichMediaUploader$$ExternalSyntheticLambda1(this, 1));
    }

    public final void teardown$1() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadProgressChanged);
    }

    public RichMediaUploader(int i, String str, TLRPC.Document document, RichEditorListView.AnonymousClass17 anonymousClass17) {
        this.currentAccount = i;
        this.path = str;
        this.isVideo = false;
        this.isAudio = true;
        this.isDocument = false;
        this.videoWidth = 0;
        this.videoHeight = 0;
        this.videoDurationSec = 0;
        this.audioDocument = document;
        this.listener = anonymousClass17;
    }

    public RichMediaUploader(int i, String str, TLRPC.Document document, RichEditorListView.AnonymousClass16 anonymousClass16) {
        this.currentAccount = i;
        this.path = str;
        this.isVideo = false;
        this.isAudio = false;
        this.isDocument = true;
        this.videoWidth = 0;
        this.videoHeight = 0;
        this.videoDurationSec = 0;
        this.audioDocument = document;
        this.listener = anonymousClass16;
    }
}
