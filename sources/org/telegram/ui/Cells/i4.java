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
import org.telegram.ui.Components.f01;
public final class i4 implements DownloadController.FileDownloadProgressListener {
    public TLRPC.MessageExtendedMedia E;
    public String F;
    public final RadialProgress2 G;
    public int H;
    public final int I;
    public final int J;
    public int K;
    public f01 L;
    public boolean M;
    public int f22082a;
    public int f22083b;
    public int f22084c;
    public int d;
    public final t1 f22085e;
    public final ImageReceiver f22086f;
    public boolean h;
    public final int f22087n;
    public final int f22088r;
    public final float[] f22089s = new float[8];
    public String v;
    public final boolean f22090w;
    public final boolean f22091x;
    public boolean f22092y;

    public i4(t1 t1Var, MessageObject messageObject, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z10, int i10, int i11) {
        new RectF();
        new Path();
        this.H = 4;
        this.J = 0;
        this.K = 0;
        this.f22085e = t1Var;
        this.f22090w = z10;
        this.f22091x = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            this.f22091x = ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && MessageObject.isVideoDocument(messageMedia.document)) ? false : false;
            this.J = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(messageMedia.document)));
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            this.f22091x = (4 & tL_messageExtendedMediaPreview.flags) != 0;
            this.J = tL_messageExtendedMediaPreview.video_duration;
        }
        if (this.f22091x) {
            int i12 = this.J;
            this.K = i12;
            this.L = new f01(AndroidUtilities.formatLongDuration(i12), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        this.f22086f = imageReceiver;
        imageReceiver.setColorFilter(null);
        this.f22087n = i10;
        this.f22088r = i11;
        this.I = DownloadController.getInstance(t1Var.I7).generateObserverTag();
        c(messageExtendedMedia, messageObject);
        RadialProgress2 radialProgress2 = new RadialProgress2(t1Var, t1Var.getResourcesProvider());
        this.G = radialProgress2;
        int a2 = a();
        this.H = a2;
        radialProgress2.setIcon(a2, false, false);
    }

    public final int a() {
        if (this.f22091x && !this.f22092y) {
            return 0;
        }
        return 4;
    }

    public final void b(int i10) {
        if (i10 != this.H) {
            this.H = i10;
            this.G.setIcon(i10, true, true);
        }
    }

    public final void c(TLRPC.MessageExtendedMedia messageExtendedMedia, MessageObject messageObject) {
        boolean z10;
        TLRPC.Document document;
        ImageLocation imageLocation;
        String str;
        if (this.E != messageExtendedMedia) {
            this.E = messageExtendedMedia;
            this.f22092y = false;
            int i10 = this.f22087n;
            int i11 = this.f22088r;
            String k10 = a4.a.k(i10, i11, "_");
            boolean z11 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
            ImageReceiver imageReceiver = this.f22086f;
            if (z11) {
                this.h = true;
                this.v = null;
                this.f22086f.setImage(ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb, messageObject.messageOwner), p6.t(k10, "_b2"), null, null, messageObject, 0);
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(1.4f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.1f);
                imageReceiver.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                boolean z12 = messageObject.isRepostPreview;
                this.h = z12;
                if (z12) {
                    k10 = p6.t(k10, "_b3");
                }
                imageReceiver.setColorFilter(null);
                TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                this.v = MessageObject.getFileName(messageMedia);
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, AndroidUtilities.getPhotoSize(), true, null, true);
                    this.f22086f.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tL_messageMediaPhoto.photo), k10, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, Math.min(i10, i11) / 100, false, closestPhotoSizeWithSize, false), tL_messageMediaPhoto.photo), k10, 0L, null, messageObject, 0);
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                    boolean z13 = this.h;
                    boolean z14 = this.f22091x;
                    boolean z15 = this.f22090w;
                    if (!z13 && !z15 && z14 && SharedConfig.isAutoplayVideo()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f22092y = z10;
                    if (!z15 && z14 && (document = tL_messageMediaDocument.document) != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(i10, i11), false, closestPhotoSizeWithSize2, false);
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_messageMediaDocument.document);
                        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize2, tL_messageMediaDocument.document);
                        ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize3, tL_messageMediaDocument.document);
                        if (this.f22092y) {
                            imageLocation = forDocument;
                        } else {
                            imageLocation = null;
                        }
                        StringBuilder u10 = a4.a.u(k10);
                        if (this.f22092y) {
                            str = "_g";
                        } else {
                            str = "";
                        }
                        u10.append(str);
                        String str2 = k10;
                        this.f22086f.setImage(imageLocation, u10.toString(), forDocument2, str2, forDocument3, str2, null, 0L, null, messageObject, 0);
                        return;
                    }
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    if (document2 != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                        this.f22086f.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, tL_messageMediaDocument.document), k10, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(i10, i11), false, closestPhotoSizeWithSize4, false), tL_messageMediaDocument.document), k10, 0L, null, messageObject, 0);
                    }
                }
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.I;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        float min;
        int a2;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.E.downloadProgress = min;
        this.G.o(min, true);
        if (min < 1.0f) {
            a2 = 3;
        } else {
            a2 = a();
        }
        b(a2);
        this.f22085e.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
        float min;
        int a2;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.E.uploadProgress = min;
        this.G.o(min, true);
        if (min < 1.0f) {
            a2 = 3;
        } else if (this.f22090w) {
            a2 = 6;
        } else {
            a2 = a();
        }
        b(a2);
        this.f22085e.invalidate();
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
    }
}
