package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
public final class jr0 implements Runnable {
    public final int f34933a;
    public final PhotoViewer f34934b;

    public jr0(PhotoViewer photoViewer, int i10) {
        this.f34933a = i10;
        this.f34934b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f34933a) {
            case 0:
                PhotoViewer photoViewer = this.f34934b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.x0(false);
                org.telegram.ui.Components.pg0.f27209p0.k(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f34934b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer2.d3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f34934b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer3.v2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f34934b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer4.v2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f34934b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer5.v2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f34934b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer6.Y2();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f34934b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer7.v2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f34934b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer8.h2();
                return;
            case 8:
                org.telegram.ui.Components.df0 df0Var = this.f34934b.C1;
                lg.f fVar = df0Var.f23572c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                df0Var.f23571b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f34934b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer9.m0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f34934b;
                photoViewer10.f31289q5.f28376b.setLoading(false);
                photoViewer10.d3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f34934b;
                photoViewer11.f31289q5.f28376b.setLoading(false);
                photoViewer11.d3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f34934b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer12.d3(0);
                return;
            case 13:
                this.f34934b.p5.V = false;
                return;
            case 14:
                this.f34934b.f31363y4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f34934b;
                photoViewer13.f31223i7 = null;
                photoViewer13.m0();
                photoViewer13.d3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f34934b;
                photoViewer14.f31289q5.f28376b.setLoading(false);
                photoViewer14.d3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f34934b;
                photoViewer15.f31289q5.f28376b.setLoading(false);
                photoViewer15.d3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f34934b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                photoViewer16.r3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f34934b;
                Drawable[] drawableArr12 = PhotoViewer.U8;
                photoViewer17.k0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f34934b;
                Drawable[] drawableArr13 = PhotoViewer.U8;
                photoViewer18.m3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f34934b;
                if (photoViewer19.f31330v0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f31359y) && !org.telegram.ui.Components.pg0.f27209p0.P && photoViewer19.P3) {
                    if (photoViewer19.f31316t4) {
                        iu0 iu0Var = photoViewer19.f31190f0;
                        if (iu0Var != null) {
                            if ((!iu0Var.f30791x || !"inapp".equals(MessagesController.getInstance(iu0Var.f30783a).youtubePipType)) && photoViewer19.f31190f0.e()) {
                                photoViewer19.K3 = false;
                                if (PhotoViewer.f31142b9 != null) {
                                    PhotoViewer.f31142b9.P0();
                                }
                                photoViewer19.J3 = true;
                                PhotoViewer.f31142b9 = PhotoViewer.f31141a9;
                                PhotoViewer.f31141a9 = null;
                                photoViewer19.e = false;
                                dv0 dv0Var = photoViewer19.f31177d5;
                                if (dv0Var != null && !dv0Var.f33092a.getVisible()) {
                                    photoViewer19.f31177d5.f33092a.setVisible(true, true);
                                }
                                photoViewer19.f31254m6 = 1.0f;
                                photoViewer19.f31181e0.invalidate();
                                photoViewer19.S0();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer19.K3 = false;
                    photoViewer19.g3();
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer20 = this.f34934b;
                if (photoViewer20.e && photoViewer20.f31262n4 == 0) {
                    photoViewer20.u3(photoViewer20.J);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f34934b;
                Drawable[] drawableArr14 = PhotoViewer.U8;
                photoViewer21.F1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f34934b;
                org.telegram.ui.Components.u71 u71Var = photoViewer22.F2;
                if (u71Var != null && photoViewer22.f31149a6 <= 1.35f) {
                    long n10 = u71Var.n();
                    long p5 = photoViewer22.F2.p();
                    if (n10 != -9223372036854775807L && p5 >= 8000) {
                        float f7 = photoViewer22.E7;
                        int k12 = photoViewer22.k1(photoViewer22.f31325u4);
                        if (p5 > 180000) {
                            int i10 = k12 / 3;
                            if (f7 < i10 * 2) {
                                if (f7 < i10) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.f31147a4.startRewind(photoViewer22.F2, z11, photoViewer22.f31313t1);
                            return;
                        }
                        if (f7 > k12 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.f31167c4.startRewind(photoViewer22.F2, z10, photoViewer22.E7, photoViewer22.f31313t1, photoViewer22.A1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f34934b;
                if (photoViewer23.U4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.U4;
                    org.telegram.ui.Components.u71 u71Var2 = photoViewer23.F2;
                    if (u71Var2 != null) {
                        z11 = u71Var2.y();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.u71 u71Var3 = photoViewer23.F2;
                    if (u71Var3 != null) {
                        u71Var3.B();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.u71 u71Var4 = photoViewer23.F2;
                if (u71Var4 != null && photoViewer23.U4.videoWasPlaying) {
                    u71Var4.C();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f34934b;
                Drawable[] drawableArr15 = PhotoViewer.U8;
                photoViewer24.G0(false, false);
                org.telegram.ui.Components.vi viVar = photoViewer24.a2;
                if (viVar != null) {
                    viVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = photoViewer24.f31252m4;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f34934b.f31265n7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f34934b;
                Drawable[] drawableArr16 = PhotoViewer.U8;
                photoViewer25.y3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f34934b;
                photoViewer26.D1.e(photoViewer26.J2, photoViewer26.K2, photoViewer26.L2, photoViewer26.P2, photoViewer26.R2, photoViewer26.O2, photoViewer26.q2(true), photoViewer26.q2(true), photoViewer26.M2, photoViewer26.N2, 0.0f, 0.0f, photoViewer26.Q2);
                photoViewer26.d3(0);
                return;
        }
    }
}
