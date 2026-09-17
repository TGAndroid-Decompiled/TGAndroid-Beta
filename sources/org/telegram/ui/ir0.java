package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
public final class ir0 implements Runnable {
    public final int f37425a;
    public final PhotoViewer f37426b;

    public ir0(PhotoViewer photoViewer, int i10) {
        this.f37425a = i10;
        this.f37426b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f37425a) {
            case 0:
                PhotoViewer photoViewer = this.f37426b;
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.x0(false);
                org.telegram.ui.Components.eg0.f25676p0.k(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f37426b;
                Drawable[] drawableArr2 = PhotoViewer.T8;
                photoViewer2.e3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f37426b;
                Drawable[] drawableArr3 = PhotoViewer.T8;
                photoViewer3.w2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f37426b;
                Drawable[] drawableArr4 = PhotoViewer.T8;
                photoViewer4.w2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f37426b;
                Drawable[] drawableArr5 = PhotoViewer.T8;
                photoViewer5.w2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f37426b;
                Drawable[] drawableArr6 = PhotoViewer.T8;
                photoViewer6.Z2();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f37426b;
                Drawable[] drawableArr7 = PhotoViewer.T8;
                photoViewer7.w2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f37426b;
                Drawable[] drawableArr8 = PhotoViewer.T8;
                photoViewer8.h2();
                return;
            case 8:
                org.telegram.ui.Components.ue0 ue0Var = this.f37426b.C1;
                mg.f fVar = ue0Var.f30871c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                ue0Var.f30870b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f37426b;
                Drawable[] drawableArr9 = PhotoViewer.T8;
                photoViewer9.m0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f37426b;
                photoViewer10.f33658q5.f27816b.setLoading(false);
                photoViewer10.e3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f37426b;
                photoViewer11.f33658q5.f27816b.setLoading(false);
                photoViewer11.e3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f37426b;
                Drawable[] drawableArr10 = PhotoViewer.T8;
                photoViewer12.e3(0);
                return;
            case 13:
                this.f37426b.p5.V = false;
                return;
            case 14:
                this.f37426b.f33732y4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f37426b;
                photoViewer13.f33592i7 = null;
                photoViewer13.m0();
                photoViewer13.e3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f37426b;
                photoViewer14.f33658q5.f27816b.setLoading(false);
                photoViewer14.e3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f37426b;
                photoViewer15.f33658q5.f27816b.setLoading(false);
                photoViewer15.e3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f37426b;
                Drawable[] drawableArr11 = PhotoViewer.T8;
                photoViewer16.s3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f37426b;
                Drawable[] drawableArr12 = PhotoViewer.T8;
                photoViewer17.k0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f37426b;
                Drawable[] drawableArr13 = PhotoViewer.T8;
                photoViewer18.n3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f37426b;
                if (photoViewer19.f33699v0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f33728y) && !org.telegram.ui.Components.eg0.f25676p0.P && photoViewer19.P3) {
                    if (photoViewer19.f33685t4) {
                        hu0 hu0Var = photoViewer19.f33559f0;
                        if (hu0Var != null) {
                            if ((!hu0Var.f29717x || !"inapp".equals(MessagesController.getInstance(hu0Var.f29708a).youtubePipType)) && photoViewer19.f33559f0.e()) {
                                photoViewer19.K3 = false;
                                if (PhotoViewer.f33510a9 != null) {
                                    PhotoViewer.f33510a9.P0();
                                }
                                photoViewer19.J3 = true;
                                PhotoViewer.f33510a9 = PhotoViewer.Z8;
                                PhotoViewer.Z8 = null;
                                photoViewer19.f33549e = false;
                                cv0 cv0Var = photoViewer19.f33545d5;
                                if (cv0Var != null && !cv0Var.f35541a.getVisible()) {
                                    photoViewer19.f33545d5.f35541a.setVisible(true, true);
                                }
                                photoViewer19.f33623m6 = 1.0f;
                                photoViewer19.f33550e0.invalidate();
                                photoViewer19.S0();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer19.K3 = false;
                    photoViewer19.h3();
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer20 = this.f37426b;
                if (photoViewer20.f33549e && photoViewer20.f33631n4 == 0) {
                    photoViewer20.v3(photoViewer20.J);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f37426b;
                Drawable[] drawableArr14 = PhotoViewer.T8;
                photoViewer21.F1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f37426b;
                org.telegram.ui.Components.g71 g71Var = photoViewer22.F2;
                if (g71Var != null && photoViewer22.f33517a6 <= 1.35f) {
                    long n10 = g71Var.n();
                    long p5 = photoViewer22.F2.p();
                    if (n10 != -9223372036854775807L && p5 >= 8000) {
                        float f7 = photoViewer22.D7;
                        int k12 = photoViewer22.k1(photoViewer22.f33694u4);
                        if (p5 > 180000) {
                            int i10 = k12 / 3;
                            if (f7 < i10 * 2) {
                                if (f7 < i10) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.f33515a4.startRewind(photoViewer22.F2, z11, photoViewer22.f33682t1);
                            return;
                        }
                        if (f7 > k12 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.f33535c4.startRewind(photoViewer22.F2, z10, photoViewer22.D7, photoViewer22.f33682t1, photoViewer22.A1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f37426b;
                if (photoViewer23.U4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.U4;
                    org.telegram.ui.Components.g71 g71Var2 = photoViewer23.F2;
                    if (g71Var2 != null) {
                        z11 = g71Var2.y();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.g71 g71Var3 = photoViewer23.F2;
                    if (g71Var3 != null) {
                        g71Var3.B();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.g71 g71Var4 = photoViewer23.F2;
                if (g71Var4 != null && photoViewer23.U4.videoWasPlaying) {
                    g71Var4.C();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f37426b;
                Drawable[] drawableArr15 = PhotoViewer.T8;
                photoViewer24.G0(false, false);
                org.telegram.ui.Components.vi viVar = photoViewer24.a2;
                if (viVar != null) {
                    viVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = photoViewer24.f33621m4;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f37426b.f33634n7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f37426b;
                Drawable[] drawableArr16 = PhotoViewer.T8;
                photoViewer25.z3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f37426b;
                photoViewer26.D1.e(photoViewer26.J2, photoViewer26.K2, photoViewer26.L2, photoViewer26.P2, photoViewer26.R2, photoViewer26.O2, photoViewer26.r2(true), photoViewer26.r2(true), photoViewer26.M2, photoViewer26.N2, 0.0f, 0.0f, photoViewer26.Q2);
                photoViewer26.e3(0);
                return;
        }
    }
}
