package org.telegram.ui.Cells;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.pz0;

public final class g4 implements DownloadController.FileDownloadProgressListener {
    public TLRPC.MessageExtendedMedia A;
    public String B;
    public final RadialProgress2 C;
    public int D;
    public final int E;
    public final int F;
    public int G;
    public pz0 H;
    public boolean I;

    public int f24378a;

    public int f24379b;

    public int f24380c;
    public int d;

    public final s1 f24381e;

    public final ImageReceiver f24382f;
    public boolean h;

    public final int f24383n;

    public final int f24384r;

    public final float[] f24385s = new float[8];
    public String v;

    public final boolean f24386w;

    public final boolean f24387x;

    public boolean f24388y;

    public g4(s1 s1Var, MessageObject messageObject, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z10, int i10, int i11) {
        new RectF();
        new Path();
        this.D = 4;
        this.F = 0;
        this.G = 0;
        this.f24381e = s1Var;
        this.f24386w = z10;
        this.f24387x = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            this.f24387x = (messageMedia instanceof TLRPC.TL_messageMediaDocument) && MessageObject.isVideoDocument(messageMedia.document);
            this.F = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(messageMedia.document)));
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            this.f24387x = (4 & tL_messageExtendedMediaPreview.flags) != 0;
            this.F = tL_messageExtendedMediaPreview.video_duration;
        }
        if (this.f24387x) {
            int i12 = this.F;
            this.G = i12;
            this.H = new pz0(AndroidUtilities.formatLongDuration(i12), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        this.f24382f = imageReceiver;
        imageReceiver.setColorFilter(null);
        this.f24383n = i10;
        this.f24384r = i11;
        this.E = DownloadController.getInstance(s1Var.E7).generateObserverTag();
        c(messageExtendedMedia, messageObject);
        RadialProgress2 radialProgress2 = new RadialProgress2(s1Var, s1Var.getResourcesProvider());
        this.C = radialProgress2;
        int iA = a();
        this.D = iA;
        radialProgress2.setIcon(iA, false, false);
    }

    public final int a() {
        return (!this.f24387x || this.f24388y) ? 4 : 0;
    }

    public final void b(int i10) {
        if (i10 != this.D) {
            this.D = i10;
            this.C.setIcon(i10, true, true);
        }
    }

    public final void c(TLRPC.MessageExtendedMedia messageExtendedMedia, MessageObject messageObject) {
        TLRPC.Document document;
        if (this.A == messageExtendedMedia) {
            return;
        }
        this.A = messageExtendedMedia;
        this.f24388y = false;
        int i10 = this.f24383n;
        int i11 = this.f24384r;
        String strL = com.google.android.recaptcha.internal.a.l(i10, "_", i11);
        boolean z10 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
        ImageReceiver imageReceiver = this.f24382f;
        if (z10) {
            this.h = true;
            this.v = null;
            this.f24382f.setImage(ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb, messageObject.messageOwner), s3.c.l(strL, "_b2"), null, null, messageObject, 0);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.4f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.1f);
            imageReceiver.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            return;
        }
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            boolean z11 = messageObject.isRepostPreview;
            this.h = z11;
            if (z11) {
                strL = s3.c.l(strL, "_b3");
            }
            imageReceiver.setColorFilter(null);
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            this.v = MessageObject.getFileName(messageMedia);
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, AndroidUtilities.getPhotoSize(), true, null, true);
                this.f24382f.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tL_messageMediaPhoto.photo), strL, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, Math.min(i10, i11) / 100, false, closestPhotoSizeWithSize, false), tL_messageMediaPhoto.photo), strL, 0L, null, messageObject, 0);
                return;
            }
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                boolean z12 = this.h;
                boolean z13 = this.f24387x;
                boolean z14 = this.f24386w;
                this.f24388y = !z12 && !z14 && z13 && SharedConfig.isAutoplayVideo();
                if (z14 || !z13 || (document = tL_messageMediaDocument.document) == null) {
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    if (document2 != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                        this.f24382f.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, tL_messageMediaDocument.document), strL, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(i10, i11), false, closestPhotoSizeWithSize2, false), tL_messageMediaDocument.document), strL, 0L, null, messageObject, 0);
                        return;
                    }
                    return;
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(i10, i11), false, closestPhotoSizeWithSize3, false);
                ImageLocation forDocument = ImageLocation.getForDocument(tL_messageMediaDocument.document);
                ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize3, tL_messageMediaDocument.document);
                ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize4, tL_messageMediaDocument.document);
                ImageLocation imageLocation = this.f24388y ? forDocument : null;
                StringBuilder sbO = com.google.android.recaptcha.internal.a.o(strL);
                sbO.append(this.f24388y ? "_g" : "");
                String str = strL;
                this.f24382f.setImage(imageLocation, sbO.toString(), forDocument2, str, forDocument3, str, null, 0L, null, messageObject, 0);
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.E;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float fMin = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.A.downloadProgress = fMin;
        this.C.o(fMin, true);
        b(fMin < 1.0f ? 3 : a());
        this.f24381e.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        int iA;
        float fMin = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.A.uploadProgress = fMin;
        this.C.o(fMin, true);
        if (fMin < 1.0f) {
            iA = 3;
        } else {
            iA = this.f24386w ? 6 : a();
        }
        b(iA);
        this.f24381e.invalidate();
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
    }
}
