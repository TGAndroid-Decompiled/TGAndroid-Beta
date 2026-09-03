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
import org.telegram.ui.Components.k01;
public final class i4 implements DownloadController.FileDownloadProgressListener {
    public TLRPC.MessageExtendedMedia B;
    public String C;
    public final RadialProgress2 D;
    public int E;
    public final int F;
    public final int G;
    public int H;
    public k01 I;
    public boolean J;
    public int f21171a;
    public int f21172b;
    public int f21173c;
    public int d;
    public final s1 e;
    public final ImageReceiver f21174f;
    public boolean h;
    public final int f21175n;
    public final int f21176r;
    public final float[] f21177s = new float[8];
    public String v;
    public final boolean f21178w;
    public final boolean f21179x;
    public boolean f21180y;

    public i4(s1 s1Var, MessageObject messageObject, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z4, int i10, int i11) {
        new RectF();
        new Path();
        this.E = 4;
        this.G = 0;
        this.H = 0;
        this.e = s1Var;
        this.f21178w = z4;
        this.f21179x = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            this.f21179x = ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && MessageObject.isVideoDocument(messageMedia.document)) ? false : false;
            this.G = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(messageMedia.document)));
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            this.f21179x = (4 & tL_messageExtendedMediaPreview.flags) != 0;
            this.G = tL_messageExtendedMediaPreview.video_duration;
        }
        if (this.f21179x) {
            int i12 = this.G;
            this.H = i12;
            this.I = new k01(AndroidUtilities.formatLongDuration(i12), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        this.f21174f = imageReceiver;
        imageReceiver.setColorFilter(null);
        this.f21175n = i10;
        this.f21176r = i11;
        this.F = DownloadController.getInstance(s1Var.F7).generateObserverTag();
        c(messageExtendedMedia, messageObject);
        RadialProgress2 radialProgress2 = new RadialProgress2(s1Var, s1Var.getResourcesProvider());
        this.D = radialProgress2;
        int a2 = a();
        this.E = a2;
        radialProgress2.setIcon(a2, false, false);
    }

    public final int a() {
        if (this.f21179x && !this.f21180y) {
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
            this.f21180y = false;
            int i10 = this.f21175n;
            int i11 = this.f21176r;
            String h = e2.c.h(i10, "_", i11);
            boolean z10 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
            ImageReceiver imageReceiver = this.f21174f;
            if (z10) {
                this.h = true;
                this.v = null;
                this.f21174f.setImage(ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb, messageObject.messageOwner), vh.w2.k(h, "_b2"), null, null, messageObject, 0);
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(1.4f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.1f);
                imageReceiver.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                boolean z11 = messageObject.isRepostPreview;
                this.h = z11;
                if (z11) {
                    h = vh.w2.k(h, "_b3");
                }
                imageReceiver.setColorFilter(null);
                TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                this.v = MessageObject.getFileName(messageMedia);
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, AndroidUtilities.getPhotoSize(), true, null, true);
                    this.f21174f.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tL_messageMediaPhoto.photo), h, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, Math.min(i10, i11) / 100, false, closestPhotoSizeWithSize, false), tL_messageMediaPhoto.photo), h, 0L, null, messageObject, 0);
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                    boolean z12 = this.h;
                    boolean z13 = this.f21179x;
                    boolean z14 = this.f21178w;
                    if (!z12 && !z14 && z13 && SharedConfig.isAutoplayVideo()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.f21180y = z4;
                    if (!z14 && z13 && (document = tL_messageMediaDocument.document) != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(i10, i11), false, closestPhotoSizeWithSize2, false);
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_messageMediaDocument.document);
                        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize2, tL_messageMediaDocument.document);
                        ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize3, tL_messageMediaDocument.document);
                        if (this.f21180y) {
                            imageLocation = forDocument;
                        } else {
                            imageLocation = null;
                        }
                        StringBuilder l10 = e2.c.l(h);
                        if (this.f21180y) {
                            str = "_g";
                        } else {
                            str = "";
                        }
                        l10.append(str);
                        String str2 = h;
                        this.f21174f.setImage(imageLocation, l10.toString(), forDocument2, str2, forDocument3, str2, null, 0L, null, messageObject, 0);
                        return;
                    }
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    if (document2 != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                        this.f21174f.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, tL_messageMediaDocument.document), h, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(i10, i11), false, closestPhotoSizeWithSize4, false), tL_messageMediaDocument.document), h, 0L, null, messageObject, 0);
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
        this.e.invalidate();
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
        } else if (this.f21178w) {
            a2 = 6;
        } else {
            a2 = a();
        }
        b(a2);
        this.e.invalidate();
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
    }
}
