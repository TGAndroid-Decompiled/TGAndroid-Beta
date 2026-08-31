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
import org.telegram.ui.Components.l01;
public final class j4 implements DownloadController.FileDownloadProgressListener {
    public TLRPC.MessageExtendedMedia B;
    public String C;
    public final RadialProgress2 D;
    public int E;
    public final int F;
    public final int G;
    public int H;
    public l01 I;
    public boolean J;
    public int f23005a;
    public int f23006b;
    public int f23007c;
    public int d;
    public final t1 f23008e;
    public final ImageReceiver f23009f;
    public boolean h;
    public final int f23010n;
    public final int f23011r;
    public final float[] f23012s = new float[8];
    public String v;
    public final boolean f23013w;
    public final boolean f23014x;
    public boolean f23015y;

    public j4(t1 t1Var, MessageObject messageObject, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z4, int i10, int i11) {
        new RectF();
        new Path();
        this.E = 4;
        this.G = 0;
        this.H = 0;
        this.f23008e = t1Var;
        this.f23013w = z4;
        this.f23014x = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            this.f23014x = ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && MessageObject.isVideoDocument(messageMedia.document)) ? false : false;
            this.G = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(messageMedia.document)));
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            this.f23014x = (4 & tL_messageExtendedMediaPreview.flags) != 0;
            this.G = tL_messageExtendedMediaPreview.video_duration;
        }
        if (this.f23014x) {
            int i12 = this.G;
            this.H = i12;
            this.I = new l01(AndroidUtilities.formatLongDuration(i12), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        this.f23009f = imageReceiver;
        imageReceiver.setColorFilter(null);
        this.f23010n = i10;
        this.f23011r = i11;
        this.F = DownloadController.getInstance(t1Var.F7).generateObserverTag();
        c(messageExtendedMedia, messageObject);
        RadialProgress2 radialProgress2 = new RadialProgress2(t1Var, t1Var.getResourcesProvider());
        this.D = radialProgress2;
        int a2 = a();
        this.E = a2;
        radialProgress2.setIcon(a2, false, false);
    }

    public final int a() {
        if (this.f23014x && !this.f23015y) {
            return 0;
        }
        return 4;
    }

    public final void b(int i10) {
        if (i10 != this.E) {
            this.E = i10;
            this.D.setIcon(i10, true, true);
        }
    }

    public final void c(TLRPC.MessageExtendedMedia messageExtendedMedia, MessageObject messageObject) {
        boolean z4;
        TLRPC.Document document;
        ImageLocation imageLocation;
        String str;
        if (this.B != messageExtendedMedia) {
            this.B = messageExtendedMedia;
            this.f23015y = false;
            int i10 = this.f23010n;
            int i11 = this.f23011r;
            String h = e2.c.h(i10, "_", i11);
            boolean z10 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
            ImageReceiver imageReceiver = this.f23009f;
            if (z10) {
                this.h = true;
                this.v = null;
                this.f23009f.setImage(ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb, messageObject.messageOwner), w.c.e(h, "_b2"), null, null, messageObject, 0);
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(1.4f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.1f);
                imageReceiver.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                boolean z11 = messageObject.isRepostPreview;
                this.h = z11;
                if (z11) {
                    h = w.c.e(h, "_b3");
                }
                imageReceiver.setColorFilter(null);
                TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                this.v = MessageObject.getFileName(messageMedia);
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, AndroidUtilities.getPhotoSize(), true, null, true);
                    this.f23009f.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tL_messageMediaPhoto.photo), h, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, Math.min(i10, i11) / 100, false, closestPhotoSizeWithSize, false), tL_messageMediaPhoto.photo), h, 0L, null, messageObject, 0);
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                    boolean z12 = this.h;
                    boolean z13 = this.f23014x;
                    boolean z14 = this.f23013w;
                    if (!z12 && !z14 && z13 && SharedConfig.isAutoplayVideo()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.f23015y = z4;
                    if (!z14 && z13 && (document = tL_messageMediaDocument.document) != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(i10, i11), false, closestPhotoSizeWithSize2, false);
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_messageMediaDocument.document);
                        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize2, tL_messageMediaDocument.document);
                        ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize3, tL_messageMediaDocument.document);
                        if (this.f23015y) {
                            imageLocation = forDocument;
                        } else {
                            imageLocation = null;
                        }
                        StringBuilder l10 = e2.c.l(h);
                        if (this.f23015y) {
                            str = "_g";
                        } else {
                            str = "";
                        }
                        l10.append(str);
                        String str2 = h;
                        this.f23009f.setImage(imageLocation, l10.toString(), forDocument2, str2, forDocument3, str2, null, 0L, null, messageObject, 0);
                        return;
                    }
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    if (document2 != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                        this.f23009f.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, tL_messageMediaDocument.document), h, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(i10, i11), false, closestPhotoSizeWithSize4, false), tL_messageMediaDocument.document), h, 0L, null, messageObject, 0);
                    }
                }
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.F;
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
        this.B.downloadProgress = min;
        this.D.o(min, true);
        if (min < 1.0f) {
            a2 = 3;
        } else {
            a2 = a();
        }
        b(a2);
        this.f23008e.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
        float min;
        int a2;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.B.uploadProgress = min;
        this.D.o(min, true);
        if (min < 1.0f) {
            a2 = 3;
        } else if (this.f23013w) {
            a2 = 6;
        } else {
            a2 = a();
        }
        b(a2);
        this.f23008e.invalidate();
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
    }
}
