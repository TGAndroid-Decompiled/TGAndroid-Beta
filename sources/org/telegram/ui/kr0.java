package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
public final class kr0 implements Runnable {
    public final int f35354a;
    public final PhotoViewer f35355b;

    public kr0(PhotoViewer photoViewer, int i10) {
        this.f35354a = i10;
        this.f35355b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f35354a) {
            case 0:
                PhotoViewer photoViewer = this.f35355b;
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.x0(false);
                org.telegram.ui.Components.fg0.f23911p0.k(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f35355b;
                Drawable[] drawableArr2 = PhotoViewer.T8;
                photoViewer2.e3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f35355b;
                Drawable[] drawableArr3 = PhotoViewer.T8;
                photoViewer3.w2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f35355b;
                Drawable[] drawableArr4 = PhotoViewer.T8;
                photoViewer4.w2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f35355b;
                Drawable[] drawableArr5 = PhotoViewer.T8;
                photoViewer5.w2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f35355b;
                Drawable[] drawableArr6 = PhotoViewer.T8;
                photoViewer6.Z2();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f35355b;
                Drawable[] drawableArr7 = PhotoViewer.T8;
                photoViewer7.w2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f35355b;
                Drawable[] drawableArr8 = PhotoViewer.T8;
                photoViewer8.h2();
                return;
            case 8:
                org.telegram.ui.Components.ue0 ue0Var = this.f35355b.C1;
                lg.f fVar = ue0Var.f28370c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                ue0Var.f28369b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f35355b;
                Drawable[] drawableArr9 = PhotoViewer.T8;
                photoViewer9.m0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f35355b;
                photoViewer10.f31058q5.f25622b.setLoading(false);
                photoViewer10.e3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f35355b;
                photoViewer11.f31058q5.f25622b.setLoading(false);
                photoViewer11.e3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f35355b;
                Drawable[] drawableArr10 = PhotoViewer.T8;
                photoViewer12.e3(0);
                return;
            case 13:
                this.f35355b.p5.V = false;
                return;
            case 14:
                this.f35355b.f31132y4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f35355b;
                photoViewer13.f30992i7 = null;
                photoViewer13.m0();
                photoViewer13.e3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f35355b;
                photoViewer14.f31058q5.f25622b.setLoading(false);
                photoViewer14.e3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f35355b;
                photoViewer15.f31058q5.f25622b.setLoading(false);
                photoViewer15.e3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f35355b;
                Drawable[] drawableArr11 = PhotoViewer.T8;
                photoViewer16.s3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f35355b;
                Drawable[] drawableArr12 = PhotoViewer.T8;
                photoViewer17.k0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f35355b;
                Drawable[] drawableArr13 = PhotoViewer.T8;
                photoViewer18.n3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f35355b;
                if (photoViewer19.f31099v0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f31128y) && !org.telegram.ui.Components.fg0.f23911p0.P && photoViewer19.P3) {
                    if (photoViewer19.f31085t4) {
                        ku0 ku0Var = photoViewer19.f30959f0;
                        if (ku0Var != null) {
                            if ((!ku0Var.f27286x || !"inapp".equals(MessagesController.getInstance(ku0Var.f27278a).youtubePipType)) && photoViewer19.f30959f0.e()) {
                                photoViewer19.K3 = false;
                                if (PhotoViewer.f30911a9 != null) {
                                    PhotoViewer.f30911a9.P0();
                                }
                                photoViewer19.J3 = true;
                                PhotoViewer.f30911a9 = PhotoViewer.Z8;
                                PhotoViewer.Z8 = null;
                                photoViewer19.e = false;
                                fv0 fv0Var = photoViewer19.f30946d5;
                                if (fv0Var != null && !fv0Var.f33763a.getVisible()) {
                                    photoViewer19.f30946d5.f33763a.setVisible(true, true);
                                }
                                photoViewer19.f31023m6 = 1.0f;
                                photoViewer19.f30950e0.invalidate();
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
                PhotoViewer photoViewer20 = this.f35355b;
                if (photoViewer20.e && photoViewer20.f31031n4 == 0) {
                    photoViewer20.v3(photoViewer20.J);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f35355b;
                Drawable[] drawableArr14 = PhotoViewer.T8;
                photoViewer21.F1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f35355b;
                org.telegram.ui.Components.h71 h71Var = photoViewer22.F2;
                if (h71Var != null && photoViewer22.f30918a6 <= 1.35f) {
                    long n10 = h71Var.n();
                    long p5 = photoViewer22.F2.p();
                    if (n10 != -9223372036854775807L && p5 >= 8000) {
                        float f7 = photoViewer22.D7;
                        int k12 = photoViewer22.k1(photoViewer22.f31094u4);
                        if (p5 > 180000) {
                            int i10 = k12 / 3;
                            if (f7 < i10 * 2) {
                                if (f7 < i10) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.f30916a4.startRewind(photoViewer22.F2, z11, photoViewer22.f31082t1);
                            return;
                        }
                        if (f7 > k12 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.f30936c4.startRewind(photoViewer22.F2, z10, photoViewer22.D7, photoViewer22.f31082t1, photoViewer22.A1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f35355b;
                if (photoViewer23.U4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.U4;
                    org.telegram.ui.Components.h71 h71Var2 = photoViewer23.F2;
                    if (h71Var2 != null) {
                        z11 = h71Var2.y();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.h71 h71Var3 = photoViewer23.F2;
                    if (h71Var3 != null) {
                        h71Var3.B();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.h71 h71Var4 = photoViewer23.F2;
                if (h71Var4 != null && photoViewer23.U4.videoWasPlaying) {
                    h71Var4.C();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f35355b;
                Drawable[] drawableArr15 = PhotoViewer.T8;
                photoViewer24.G0(false, false);
                org.telegram.ui.Components.vi viVar = photoViewer24.a2;
                if (viVar != null) {
                    viVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.o2 o2Var = photoViewer24.f31021m4;
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f35355b.f31034n7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f35355b;
                Drawable[] drawableArr16 = PhotoViewer.T8;
                photoViewer25.z3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f35355b;
                photoViewer26.D1.e(photoViewer26.J2, photoViewer26.K2, photoViewer26.L2, photoViewer26.P2, photoViewer26.R2, photoViewer26.O2, photoViewer26.r2(true), photoViewer26.r2(true), photoViewer26.M2, photoViewer26.N2, 0.0f, 0.0f, photoViewer26.Q2);
                photoViewer26.e3(0);
                return;
        }
    }
}
