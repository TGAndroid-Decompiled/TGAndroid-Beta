package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
public final class dr0 implements Runnable {
    public final int f35827a;
    public final PhotoViewer f35828b;

    public dr0(PhotoViewer photoViewer, int i10) {
        this.f35827a = i10;
        this.f35828b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f35827a) {
            case 0:
                PhotoViewer photoViewer = this.f35828b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.x0(false);
                org.telegram.ui.Components.rg0.f30377p0.k(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f35828b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer2.e3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f35828b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer3.w2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f35828b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer4.w2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f35828b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer5.w2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f35828b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer6.Z2();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f35828b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer7.w2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f35828b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer8.i2();
                return;
            case 8:
                org.telegram.ui.Components.gf0 gf0Var = this.f35828b.C1;
                lg.f fVar = gf0Var.f26851c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                gf0Var.f26850b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f35828b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer9.m0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f35828b;
                photoViewer10.f34002q5.f32525b.setLoading(false);
                photoViewer10.e3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f35828b;
                photoViewer11.f34002q5.f32525b.setLoading(false);
                photoViewer11.e3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f35828b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer12.e3(0);
                return;
            case 13:
                this.f35828b.p5.V = false;
                return;
            case 14:
                this.f35828b.f34076y4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f35828b;
                photoViewer13.f33936i7 = null;
                photoViewer13.m0();
                photoViewer13.e3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f35828b;
                photoViewer14.f34002q5.f32525b.setLoading(false);
                photoViewer14.e3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f35828b;
                photoViewer15.f34002q5.f32525b.setLoading(false);
                photoViewer15.e3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f35828b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                photoViewer16.s3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f35828b;
                Drawable[] drawableArr12 = PhotoViewer.U8;
                photoViewer17.k0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f35828b;
                Drawable[] drawableArr13 = PhotoViewer.U8;
                photoViewer18.n3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f35828b;
                if (photoViewer19.f34043v0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f34072y) && !org.telegram.ui.Components.rg0.f30377p0.P && photoViewer19.P3) {
                    if (photoViewer19.f34029t4) {
                        du0 du0Var = photoViewer19.f33903f0;
                        if (du0Var != null) {
                            if ((!du0Var.f25723x || !"inapp".equals(MessagesController.getInstance(du0Var.f25714a).youtubePipType)) && photoViewer19.f33903f0.e()) {
                                photoViewer19.K3 = false;
                                if (PhotoViewer.f33854b9 != null) {
                                    PhotoViewer.f33854b9.P0();
                                }
                                photoViewer19.J3 = true;
                                PhotoViewer.f33854b9 = PhotoViewer.f33853a9;
                                PhotoViewer.f33853a9 = null;
                                photoViewer19.f33893e = false;
                                yu0 yu0Var = photoViewer19.f33889d5;
                                if (yu0Var != null && !yu0Var.f43619a.getVisible()) {
                                    photoViewer19.f33889d5.f43619a.setVisible(true, true);
                                }
                                photoViewer19.f33967m6 = 1.0f;
                                photoViewer19.f33894e0.invalidate();
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
                PhotoViewer photoViewer20 = this.f35828b;
                if (photoViewer20.f33893e && photoViewer20.f33975n4 == 0) {
                    photoViewer20.v3(photoViewer20.J);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f35828b;
                Drawable[] drawableArr14 = PhotoViewer.U8;
                photoViewer21.G1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f35828b;
                org.telegram.ui.Components.d81 d81Var = photoViewer22.F2;
                if (d81Var != null && photoViewer22.f33861a6 <= 1.35f) {
                    long n10 = d81Var.n();
                    long p5 = photoViewer22.F2.p();
                    if (n10 != -9223372036854775807L && p5 >= 8000) {
                        float f7 = photoViewer22.E7;
                        int k12 = photoViewer22.k1(photoViewer22.f34038u4);
                        if (p5 > 180000) {
                            int i10 = k12 / 3;
                            if (f7 < i10 * 2) {
                                if (f7 < i10) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.f33859a4.startRewind(photoViewer22.F2, z11, photoViewer22.f34026t1);
                            return;
                        }
                        if (f7 > k12 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.f33879c4.startRewind(photoViewer22.F2, z10, photoViewer22.E7, photoViewer22.f34026t1, photoViewer22.A1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f35828b;
                if (photoViewer23.U4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.U4;
                    org.telegram.ui.Components.d81 d81Var2 = photoViewer23.F2;
                    if (d81Var2 != null) {
                        z11 = d81Var2.y();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.d81 d81Var3 = photoViewer23.F2;
                    if (d81Var3 != null) {
                        d81Var3.B();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.d81 d81Var4 = photoViewer23.F2;
                if (d81Var4 != null && photoViewer23.U4.videoWasPlaying) {
                    d81Var4.C();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f35828b;
                Drawable[] drawableArr15 = PhotoViewer.U8;
                photoViewer24.G0(false, false);
                org.telegram.ui.Components.xi xiVar = photoViewer24.a2;
                if (xiVar != null) {
                    xiVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = photoViewer24.f33965m4;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f35828b.f33978n7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f35828b;
                Drawable[] drawableArr16 = PhotoViewer.U8;
                photoViewer25.z3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f35828b;
                photoViewer26.D1.e(photoViewer26.J2, photoViewer26.K2, photoViewer26.L2, photoViewer26.P2, photoViewer26.R2, photoViewer26.O2, photoViewer26.r2(true), photoViewer26.r2(true), photoViewer26.M2, photoViewer26.N2, 0.0f, 0.0f, photoViewer26.Q2);
                photoViewer26.e3(0);
                return;
        }
    }
}
