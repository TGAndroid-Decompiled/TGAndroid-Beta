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
import org.telegram.ui.Components.zz0;
public final class h4 implements DownloadController.FileDownloadProgressListener {
    public TLRPC.MessageExtendedMedia A;
    public String B;
    public final RadialProgress2 C;
    public int D;
    public final int E;
    public final int F;
    public int G;
    public zz0 H;
    public boolean I;
    public int f24439a;
    public int f24440b;
    public int f24441c;
    public int d;
    public final s1 f24442e;
    public final ImageReceiver f24443f;
    public boolean h;
    public final int f24444n;
    public final int f24445r;
    public final float[] f24446s = new float[8];
    public String v;
    public final boolean f24447w;
    public final boolean f24448x;
    public boolean f24449y;

    public h4(s1 s1Var, MessageObject messageObject, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z10, int i10, int i11) {
        new RectF();
        new Path();
        this.D = 4;
        this.F = 0;
        this.G = 0;
        this.f24442e = s1Var;
        this.f24447w = z10;
        this.f24448x = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            this.f24448x = ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && MessageObject.isVideoDocument(messageMedia.document)) ? false : false;
            this.F = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(messageMedia.document)));
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            this.f24448x = (4 & tL_messageExtendedMediaPreview.flags) != 0;
            this.F = tL_messageExtendedMediaPreview.video_duration;
        }
        if (this.f24448x) {
            int i12 = this.F;
            this.G = i12;
            this.H = new zz0(AndroidUtilities.formatLongDuration(i12), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        this.f24443f = imageReceiver;
        imageReceiver.setColorFilter(null);
        this.f24444n = i10;
        this.f24445r = i11;
        this.E = DownloadController.getInstance(s1Var.E7).generateObserverTag();
        c(messageExtendedMedia, messageObject);
        RadialProgress2 radialProgress2 = new RadialProgress2(s1Var, s1Var.getResourcesProvider());
        this.C = radialProgress2;
        int a2 = a();
        this.D = a2;
        radialProgress2.setIcon(a2, false, false);
    }

    public final int a() {
        if (this.f24448x && !this.f24449y) {
            return 0;
        }
        return 4;
    }

    public final void b(int i10) {
        if (i10 != this.D) {
            this.D = i10;
            this.C.setIcon(i10, true, true);
        }
    }

    public final void c(TLRPC.MessageExtendedMedia messageExtendedMedia, MessageObject messageObject) {
        boolean z10;
        TLRPC.Document document;
        ImageLocation imageLocation;
        String str;
        if (this.A != messageExtendedMedia) {
            this.A = messageExtendedMedia;
            this.f24449y = false;
            int i10 = this.f24444n;
            int i11 = this.f24445r;
            String k9 = com.google.android.recaptcha.internal.a.k(i10, "_", i11);
            boolean z11 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
            ImageReceiver imageReceiver = this.f24443f;
            if (z11) {
                this.h = true;
                this.v = null;
                this.f24443f.setImage(ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb, messageObject.messageOwner), u3.c.k(k9, "_b2"), null, null, messageObject, 0);
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(1.4f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.1f);
                imageReceiver.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                boolean z12 = messageObject.isRepostPreview;
                this.h = z12;
                if (z12) {
                    k9 = u3.c.k(k9, "_b3");
                }
                imageReceiver.setColorFilter(null);
                TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                this.v = MessageObject.getFileName(messageMedia);
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, AndroidUtilities.getPhotoSize(), true, null, true);
                    this.f24443f.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tL_messageMediaPhoto.photo), k9, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, Math.min(i10, i11) / 100, false, closestPhotoSizeWithSize, false), tL_messageMediaPhoto.photo), k9, 0L, null, messageObject, 0);
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                    boolean z13 = this.h;
                    boolean z14 = this.f24448x;
                    boolean z15 = this.f24447w;
                    if (!z13 && !z15 && z14 && SharedConfig.isAutoplayVideo()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f24449y = z10;
                    if (!z15 && z14 && (document = tL_messageMediaDocument.document) != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(i10, i11), false, closestPhotoSizeWithSize2, false);
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_messageMediaDocument.document);
                        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize2, tL_messageMediaDocument.document);
                        ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize3, tL_messageMediaDocument.document);
                        if (this.f24449y) {
                            imageLocation = forDocument;
                        } else {
                            imageLocation = null;
                        }
                        StringBuilder n10 = com.google.android.recaptcha.internal.a.n(k9);
                        if (this.f24449y) {
                            str = "_g";
                        } else {
                            str = "";
                        }
                        n10.append(str);
                        String str2 = k9;
                        this.f24443f.setImage(imageLocation, n10.toString(), forDocument2, str2, forDocument3, str2, null, 0L, null, messageObject, 0);
                        return;
                    }
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    if (document2 != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                        this.f24443f.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, tL_messageMediaDocument.document), k9, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(i10, i11), false, closestPhotoSizeWithSize4, false), tL_messageMediaDocument.document), k9, 0L, null, messageObject, 0);
                    }
                }
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.E;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float min;
        int a2;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.A.downloadProgress = min;
        this.C.o(min, true);
        if (min < 1.0f) {
            a2 = 3;
        } else {
            a2 = a();
        }
        b(a2);
        this.f24442e.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        float min;
        int a2;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.A.uploadProgress = min;
        this.C.o(min, true);
        if (min < 1.0f) {
            a2 = 3;
        } else if (this.f24447w) {
            a2 = 6;
        } else {
            a2 = a();
        }
        b(a2);
        this.f24442e.invalidate();
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
    }
}
