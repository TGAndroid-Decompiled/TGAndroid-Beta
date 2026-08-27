package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;

public final class hq0 implements Runnable {

    public final int f38883a;

    public final PhotoViewer f38884b;

    public hq0(PhotoViewer photoViewer, int i10) {
        this.f38883a = i10;
        this.f38884b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38883a) {
            case 0:
                PhotoViewer photoViewer = this.f38884b;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.x0(false);
                org.telegram.ui.Components.sf0.f32415l0.k(true, true);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.f38884b;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer2.e3(0);
                break;
            case 2:
                PhotoViewer photoViewer3 = this.f38884b;
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer3.w2(true, 0, 0, false, true, false);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.f38884b;
                Drawable[] drawableArr4 = PhotoViewer.P8;
                photoViewer4.w2(true, 0, 0, false, false, false);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.f38884b;
                Drawable[] drawableArr5 = PhotoViewer.P8;
                photoViewer5.w2(false, 0, 0, true, false, false);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.f38884b;
                Drawable[] drawableArr6 = PhotoViewer.P8;
                photoViewer6.Z2();
                break;
            case 6:
                PhotoViewer photoViewer7 = this.f38884b;
                Drawable[] drawableArr7 = PhotoViewer.P8;
                photoViewer7.w2(false, 0, 0, false, false, false);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.f38884b;
                Drawable[] drawableArr8 = PhotoViewer.P8;
                photoViewer8.h2();
                break;
            case 8:
                org.telegram.ui.Components.ge0 ge0Var = this.f38884b.f35802y1;
                uf.e eVar = ge0Var.f28603c;
                eVar.b(0.0f);
                eVar.setMirrored(false);
                eVar.setRotated(false);
                ge0Var.f28602b.l(true);
                break;
            case 9:
                PhotoViewer photoViewer9 = this.f38884b;
                Drawable[] drawableArr9 = PhotoViewer.P8;
                photoViewer9.m0();
                break;
            case 10:
                PhotoViewer photoViewer10 = this.f38884b;
                photoViewer10.f35696m5.f34167b.setLoading(false);
                photoViewer10.e3(0);
                break;
            case 11:
                PhotoViewer photoViewer11 = this.f38884b;
                photoViewer11.f35696m5.f34167b.setLoading(false);
                photoViewer11.e3(0);
                break;
            case 12:
                PhotoViewer photoViewer12 = this.f38884b;
                Drawable[] drawableArr10 = PhotoViewer.P8;
                photoViewer12.e3(0);
                break;
            case 13:
                this.f38884b.f35688l5.R = false;
                break;
            case 14:
                this.f38884b.f35768u4.setBackground(null);
                break;
            case 15:
                PhotoViewer photoViewer13 = this.f38884b;
                photoViewer13.f35627e7 = null;
                photoViewer13.m0();
                photoViewer13.e3(0);
                break;
            case 16:
                PhotoViewer photoViewer14 = this.f38884b;
                photoViewer14.f35696m5.f34167b.setLoading(false);
                photoViewer14.e3(0);
                break;
            case 17:
                PhotoViewer photoViewer15 = this.f38884b;
                photoViewer15.f35696m5.f34167b.setLoading(false);
                photoViewer15.e3(0);
                break;
            case 18:
                PhotoViewer photoViewer16 = this.f38884b;
                Drawable[] drawableArr11 = PhotoViewer.P8;
                photoViewer16.s3();
                break;
            case 19:
                PhotoViewer photoViewer17 = this.f38884b;
                Drawable[] drawableArr12 = PhotoViewer.P8;
                photoViewer17.k0();
                break;
            case 20:
                PhotoViewer photoViewer18 = this.f38884b;
                Drawable[] drawableArr13 = PhotoViewer.P8;
                photoViewer18.n3(true);
                break;
            case 21:
                PhotoViewer photoViewer19 = this.f38884b;
                if (photoViewer19.f35736r0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f35800y) && !org.telegram.ui.Components.sf0.f32415l0.L && photoViewer19.L3) {
                    if (!photoViewer19.f35723p4) {
                        photoViewer19.G3 = false;
                        photoViewer19.h3();
                    } else {
                        ht0 ht0Var = photoViewer19.f35591b0;
                        if (ht0Var != null) {
                            if ((!ht0Var.f27746x || !"inapp".equals(MessagesController.getInstance(ht0Var.f27737a).youtubePipType)) && photoViewer19.f35591b0.e()) {
                                photoViewer19.G3 = false;
                                if (PhotoViewer.W8 != null) {
                                    PhotoViewer.W8.P0();
                                }
                                photoViewer19.F3 = true;
                                PhotoViewer.W8 = PhotoViewer.V8;
                                PhotoViewer.V8 = null;
                                photoViewer19.f35619e = false;
                                cu0 cu0Var = photoViewer19.Z4;
                                if (cu0Var != null && !cu0Var.f37153a.getVisible()) {
                                    photoViewer19.Z4.f37153a.setVisible(true, true);
                                }
                                photoViewer19.f35663i6 = 1.0f;
                                photoViewer19.f35583a0.invalidate();
                                photoViewer19.S0();
                            }
                        }
                    }
                    break;
                }
                break;
            case 22:
                PhotoViewer photoViewer20 = this.f38884b;
                if (photoViewer20.f35619e && photoViewer20.f35670j4 == 0) {
                    photoViewer20.v3(photoViewer20.F);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer21 = this.f38884b;
                Drawable[] drawableArr14 = PhotoViewer.P8;
                photoViewer21.F1();
                break;
            case 24:
                PhotoViewer photoViewer22 = this.f38884b;
                org.telegram.ui.Components.m61 m61Var = photoViewer22.B2;
                if (m61Var != null && photoViewer22.W5 <= 1.35f) {
                    long jO = m61Var.o();
                    long jQ = photoViewer22.B2.q();
                    if (jO != -9223372036854775807L && jQ >= 8000) {
                        float f10 = photoViewer22.f35817z7;
                        int iK1 = photoViewer22.k1(photoViewer22.f35731q4);
                        if (jQ <= 180000) {
                            photoViewer22.Y3.startRewind(photoViewer22.B2, f10 > ((float) (iK1 / 3)), photoViewer22.f35817z7, photoViewer22.f35720p1, photoViewer22.f35783w1);
                        } else {
                            int i10 = iK1 / 3;
                            if (f10 < i10 * 2) {
                                z10 = f10 >= ((float) i10);
                            }
                            photoViewer22.W3.startRewind(photoViewer22.B2, z10, photoViewer22.f35720p1);
                        }
                        break;
                    }
                }
                break;
            case 25:
                PhotoViewer photoViewer23 = this.f38884b;
                if (photoViewer23.Q4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.Q4;
                    org.telegram.ui.Components.m61 m61Var2 = photoViewer23.B2;
                    videoAds.videoWasPlaying = m61Var2 != null ? m61Var2.z() : true;
                    org.telegram.ui.Components.m61 m61Var3 = photoViewer23.B2;
                    if (m61Var3 != null) {
                        m61Var3.C();
                    }
                    break;
                } else {
                    org.telegram.ui.Components.m61 m61Var4 = photoViewer23.B2;
                    if (m61Var4 != null && photoViewer23.Q4.videoWasPlaying) {
                        m61Var4.D();
                        break;
                    }
                }
                break;
            case 26:
                PhotoViewer photoViewer24 = this.f38884b;
                Drawable[] drawableArr15 = PhotoViewer.P8;
                photoViewer24.G0(false, false);
                org.telegram.ui.Components.gi giVar = photoViewer24.W1;
                if (giVar != null) {
                    giVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = photoViewer24.f35661i4;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                }
                break;
            case 27:
                this.f38884b.f35673j7 = null;
                break;
            case 28:
                PhotoViewer photoViewer25 = this.f38884b;
                Drawable[] drawableArr16 = PhotoViewer.P8;
                photoViewer25.z3();
                break;
            default:
                PhotoViewer photoViewer26 = this.f38884b;
                photoViewer26.f35811z1.e(photoViewer26.F2, photoViewer26.G2, photoViewer26.H2, photoViewer26.L2, photoViewer26.N2, photoViewer26.K2, photoViewer26.r2(true), photoViewer26.r2(true), photoViewer26.I2, photoViewer26.J2, 0.0f, 0.0f, photoViewer26.M2);
                photoViewer26.e3(0);
                break;
        }
    }
}
