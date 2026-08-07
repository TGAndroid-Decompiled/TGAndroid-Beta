package org.telegram.ui.iv;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public class RichMediaUploader implements NotificationCenter.NotificationCenterDelegate {
    private final TLRPC.Document audioDocument;
    private boolean cancelled;
    private final int currentAccount;
    private TLRPC.InputFile documentInputFile;
    private String documentThumbPath;
    private boolean finished;
    private final boolean isAudio;
    private final boolean isDocument;
    private final boolean isVideo;
    private final Listener listener;
    private final String path;
    private int requestToken;
    private boolean started;
    private volatile String uploadPath;
    private boolean uploadingDocumentThumb;
    private final int videoDurationSec;
    private final int videoHeight;
    private final int videoWidth;

    public interface Listener {

        public abstract class CC {
            public static void $default$onAudioUploaded(Listener listener, TLRPC.Document document) {
            }

            public static void $default$onDocumentUploaded(Listener listener, TLRPC.Document document) {
            }

            public static void $default$onPhotoUploaded(Listener listener, TLRPC.Photo photo) {
            }

            public static void $default$onVideoUploaded(Listener listener, TLRPC.Document document) {
            }

            public static void $default$onWidthHeightResolved(Listener listener, int i, int i2) {
            }
        }

        void onAudioUploaded(TLRPC.Document document);

        void onDocumentUploaded(TLRPC.Document document);

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
        this.isDocument = false;
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
        this.isDocument = false;
        this.videoWidth = 0;
        this.videoHeight = 0;
        this.videoDurationSec = 0;
        this.audioDocument = document;
        this.listener = listener;
    }

    public static RichMediaUploader forAudio(int i, String str, TLRPC.Document document, Listener listener) {
        return new RichMediaUploader(i, str, document, listener);
    }

    private RichMediaUploader(int i, String str, TLRPC.Document document, boolean z, Listener listener) {
        this.currentAccount = i;
        this.path = str;
        this.isVideo = false;
        this.isAudio = false;
        this.isDocument = z;
        this.videoWidth = 0;
        this.videoHeight = 0;
        this.videoDurationSec = 0;
        this.audioDocument = document;
        this.listener = listener;
    }

    public static RichMediaUploader forDocument(int i, String str, TLRPC.Document document, Listener listener) {
        return new RichMediaUploader(i, str, document, true, listener);
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
        if (this.isDocument) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$start$1();
                }
            });
        } else if (this.isAudio) {
            beginUpload(this.path);
        } else {
            resolvePhotoDimensions();
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$start$3();
                }
            });
        }
    }

    public void lambda$start$1() {
        this.documentThumbPath = generateDocumentThumb();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$start$0();
            }
        });
    }

    public void lambda$start$0() {
        if (this.cancelled || this.finished) {
            return;
        }
        beginUpload(this.path);
    }

    public void lambda$start$3() {
        final String strEnsureJpegPath = ensureJpegPath(this.path);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$start$2(strEnsureJpegPath);
            }
        });
    }

    public void lambda$start$2(String str) {
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
        } else if (this.isAudio) {
            i = 50331648;
        } else {
            i = this.isDocument ? 67108864 : 16777216;
        }
        FileLoader.getInstance(this.currentAccount).uploadFile(this.uploadPath, false, (this.isVideo || this.isAudio || this.isDocument) ? false : true, i);
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
            } else {
                finishWithError();
                return;
            }
        }
        if (i == NotificationCenter.fileUploadProgressChanged) {
            long jLongValue = ((Long) objArr[1]).longValue();
            long jLongValue2 = ((Long) objArr[2]).longValue();
            Listener listener = this.listener;
            if (listener == null || this.uploadingDocumentThumb) {
                return;
            }
            listener.onProgress(jLongValue2 > 0 ? jLongValue / jLongValue2 : 0.0f);
        }
    }

    private void sendUploadMediaRequest(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
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
        } else if (this.isAudio || this.isDocument) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument2.file = inputFile;
            boolean z = this.isDocument;
            if (z) {
                str = "application/octet-stream";
            } else {
                TLRPC.Document document = this.audioDocument;
                if (document == null || (str = document.mime_type) == null) {
                    str = "audio/mpeg";
                }
            }
            tL_inputMediaUploadedDocument2.mime_type = str;
            TLRPC.Document document2 = this.audioDocument;
            if (document2 != null) {
                if (z) {
                    Iterator<TLRPC.DocumentAttribute> it = document2.attributes.iterator();
                    while (it.hasNext()) {
                        TLRPC.DocumentAttribute next = it.next();
                        if (next instanceof TLRPC.TL_documentAttributeFilename) {
                            tL_inputMediaUploadedDocument2.attributes.add(next);
                        }
                    }
                } else {
                    tL_inputMediaUploadedDocument2.attributes.addAll(document2.attributes);
                }
            }
            if (this.isDocument) {
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
        this.requestToken = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_uploadMedia, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$sendUploadMediaRequest$5(tLObject, tL_error);
            }
        });
    }

    public void lambda$sendUploadMediaRequest$5(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendUploadMediaRequest$4(tLObject);
            }
        });
    }

    public void lambda$sendUploadMediaRequest$4(TLObject tLObject) {
        TLRPC.Document document;
        TLRPC.Photo photo;
        if (this.cancelled) {
            return;
        }
        this.requestToken = 0;
        if (this.isVideo || this.isAudio || this.isDocument) {
            if ((tLObject instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject).document) != null) {
                if (this.isDocument) {
                    finishWithDocument(document);
                    return;
                } else if (this.isAudio) {
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

    private void finishWithDocument(TLRPC.Document document) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (document == null || document.id == 0 || document.access_hash == 0) {
            finishWithError();
            return;
        }
        this.finished = true;
        teardown();
        if (!TextUtils.isEmpty(this.documentThumbPath) && MessageObject.isDocumentHasThumb(document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320)) != null) {
            FileLoader.getInstance(this.currentAccount).setLocalPathTo(closestPhotoSizeWithSize, this.documentThumbPath);
            AndroidUtilities.copyFileSafe(new File(this.documentThumbPath), FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
        }
        Listener listener = this.listener;
        if (listener != null) {
            listener.onDocumentUploaded(document);
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

    private String generateDocumentThumb() {
        Bitmap bitmapCreateVideoThumbnail;
        String absolutePath = null;
        if (this.audioDocument != null && !TextUtils.isEmpty(this.path)) {
            try {
                String str = this.audioDocument.mime_type;
                String lowerCase = str == null ? "" : str.toLowerCase();
                if (lowerCase.startsWith("image/")) {
                    bitmapCreateVideoThumbnail = ImageLoader.loadBitmap(this.path, null, 320.0f, 320.0f, true);
                } else {
                    bitmapCreateVideoThumbnail = lowerCase.equals("video/mp4") ? SendMessagesHelper.createVideoThumbnail(this.path, 1) : null;
                }
                if (bitmapCreateVideoThumbnail != null) {
                    try {
                        Iterator<TLRPC.DocumentAttribute> it = this.audioDocument.attributes.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next() instanceof TLRPC.TL_documentAttributeImageSize) {
                                    break;
                                }
                            } else {
                                TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                tL_documentAttributeImageSize.w = bitmapCreateVideoThumbnail.getWidth();
                                tL_documentAttributeImageSize.h = bitmapCreateVideoThumbnail.getHeight();
                                this.audioDocument.attributes.add(tL_documentAttributeImageSize);
                                break;
                            }
                        }
                        TLRPC.PhotoSize photoSizeScaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmapCreateVideoThumbnail, 320.0f, 320.0f, 80, false);
                        if (photoSizeScaleAndSaveImage != null) {
                            this.audioDocument.thumbs.clear();
                            this.audioDocument.thumbs.add(photoSizeScaleAndSaveImage);
                            this.audioDocument.flags |= 1;
                            File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(photoSizeScaleAndSaveImage, true);
                            if (pathToAttach != null && pathToAttach.exists()) {
                                absolutePath = pathToAttach.getAbsolutePath();
                            }
                            if (!bitmapCreateVideoThumbnail.isRecycled()) {
                                bitmapCreateVideoThumbnail.recycle();
                            }
                            return absolutePath;
                        }
                        if (!bitmapCreateVideoThumbnail.isRecycled()) {
                            bitmapCreateVideoThumbnail.recycle();
                        }
                        return null;
                    } catch (Throwable unused) {
                        if (bitmapCreateVideoThumbnail != null && !bitmapCreateVideoThumbnail.isRecycled()) {
                            bitmapCreateVideoThumbnail.recycle();
                        }
                        return null;
                    }
                }
                if (bitmapCreateVideoThumbnail != null && !bitmapCreateVideoThumbnail.isRecycled()) {
                    bitmapCreateVideoThumbnail.recycle();
                }
                return null;
            } catch (Throwable unused2) {
                bitmapCreateVideoThumbnail = null;
            }
        }
        return null;
    }
}
