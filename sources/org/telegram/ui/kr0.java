package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
public final class kr0 implements Runnable {
    public final int f39568a;
    public final PhotoViewer f39569b;

    public kr0(PhotoViewer photoViewer, int i10) {
        this.f39568a = i10;
        this.f39569b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f39568a) {
            case 0:
                PhotoViewer photoViewer = this.f39569b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.x0(false);
                org.telegram.ui.Components.jh0.f27497p0.k(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f39569b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer2.e3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f39569b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer3.w2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f39569b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer4.w2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f39569b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer5.w2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f39569b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer6.Z2();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f39569b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer7.w2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f39569b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer8.i2();
                return;
            case 8:
                org.telegram.ui.Components.zf0 zf0Var = this.f39569b.C1;
                lg.f fVar = zf0Var.f33351c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                zf0Var.f33350b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f39569b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer9.m0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f39569b;
                photoViewer10.f33851q5.f29498b.setLoading(false);
                photoViewer10.e3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f39569b;
                photoViewer11.f33851q5.f29498b.setLoading(false);
                photoViewer11.e3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f39569b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer12.e3(0);
                return;
            case 13:
                this.f39569b.p5.V = false;
                return;
            case 14:
                this.f39569b.f33925y4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f39569b;
                photoViewer13.f33785i7 = null;
                photoViewer13.m0();
                photoViewer13.e3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f39569b;
                photoViewer14.f33851q5.f29498b.setLoading(false);
                photoViewer14.e3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f39569b;
                photoViewer15.f33851q5.f29498b.setLoading(false);
                photoViewer15.e3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f39569b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                photoViewer16.s3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f39569b;
                Drawable[] drawableArr12 = PhotoViewer.U8;
                photoViewer17.k0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f39569b;
                Drawable[] drawableArr13 = PhotoViewer.U8;
                photoViewer18.n3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f39569b;
                if (photoViewer19.f33892v0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f33921y) && !org.telegram.ui.Components.jh0.f27497p0.P && photoViewer19.P3) {
                    if (photoViewer19.f33878t4) {
                        lu0 lu0Var = photoViewer19.f33752f0;
                        if (lu0Var != null) {
                            if ((!lu0Var.f31513x || !"inapp".equals(MessagesController.getInstance(lu0Var.f31504a).youtubePipType)) && photoViewer19.f33752f0.e()) {
                                photoViewer19.K3 = false;
                                if (PhotoViewer.f33703b9 != null) {
                                    PhotoViewer.f33703b9.P0();
                                }
                                photoViewer19.J3 = true;
                                PhotoViewer.f33703b9 = PhotoViewer.f33702a9;
                                PhotoViewer.f33702a9 = null;
                                photoViewer19.f33742e = false;
                                gv0 gv0Var = photoViewer19.f33738d5;
                                if (gv0Var != null && !gv0Var.f38147a.getVisible()) {
                                    photoViewer19.f33738d5.f38147a.setVisible(true, true);
                                }
                                photoViewer19.f33816m6 = 1.0f;
                                photoViewer19.f33743e0.invalidate();
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
                PhotoViewer photoViewer20 = this.f39569b;
                if (photoViewer20.f33742e && photoViewer20.f33824n4 == 0) {
                    photoViewer20.v3(photoViewer20.J);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f39569b;
                Drawable[] drawableArr14 = PhotoViewer.U8;
                photoViewer21.G1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f39569b;
                org.telegram.ui.Components.q81 q81Var = photoViewer22.F2;
                if (q81Var != null && photoViewer22.f33710a6 <= 1.35f) {
                    long n10 = q81Var.n();
                    long p5 = photoViewer22.F2.p();
                    if (n10 != -9223372036854775807L && p5 >= 8000) {
                        float f7 = photoViewer22.E7;
                        int k12 = photoViewer22.k1(photoViewer22.f33887u4);
                        if (p5 > 180000) {
                            int i10 = k12 / 3;
                            if (f7 < i10 * 2) {
                                if (f7 < i10) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.f33708a4.startRewind(photoViewer22.F2, z11, photoViewer22.f33875t1);
                            return;
                        }
                        if (f7 > k12 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.f33728c4.startRewind(photoViewer22.F2, z10, photoViewer22.E7, photoViewer22.f33875t1, photoViewer22.A1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f39569b;
                if (photoViewer23.U4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.U4;
                    org.telegram.ui.Components.q81 q81Var2 = photoViewer23.F2;
                    if (q81Var2 != null) {
                        z11 = q81Var2.y();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.q81 q81Var3 = photoViewer23.F2;
                    if (q81Var3 != null) {
                        q81Var3.B();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.q81 q81Var4 = photoViewer23.F2;
                if (q81Var4 != null && photoViewer23.U4.videoWasPlaying) {
                    q81Var4.C();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f39569b;
                Drawable[] drawableArr15 = PhotoViewer.U8;
                photoViewer24.G0(false, false);
                org.telegram.ui.Components.aj ajVar = photoViewer24.a2;
                if (ajVar != null) {
                    ajVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.m2 m2Var = photoViewer24.f33814m4;
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f39569b.f33827n7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f39569b;
                Drawable[] drawableArr16 = PhotoViewer.U8;
                photoViewer25.z3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f39569b;
                photoViewer26.D1.e(photoViewer26.J2, photoViewer26.K2, photoViewer26.L2, photoViewer26.P2, photoViewer26.R2, photoViewer26.O2, photoViewer26.r2(true), photoViewer26.r2(true), photoViewer26.M2, photoViewer26.N2, 0.0f, 0.0f, photoViewer26.Q2);
                photoViewer26.e3(0);
                return;
        }
    }
}
