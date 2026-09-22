package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
public final class jr0 implements Runnable {
    public final int f35000a;
    public final PhotoViewer f35001b;

    public jr0(PhotoViewer photoViewer, int i10) {
        this.f35000a = i10;
        this.f35001b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f35000a) {
            case 0:
                PhotoViewer photoViewer = this.f35001b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.x0(false);
                org.telegram.ui.Components.rg0.f27960p0.k(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f35001b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer2.d3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f35001b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer3.v2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f35001b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer4.v2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f35001b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer5.v2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f35001b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer6.Y2();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f35001b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer7.v2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f35001b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer8.h2();
                return;
            case 8:
                org.telegram.ui.Components.ff0 ff0Var = this.f35001b.C1;
                lg.f fVar = ff0Var.f24218c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                ff0Var.f24217b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f35001b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer9.m0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f35001b;
                photoViewer10.f31350q5.f29065b.setLoading(false);
                photoViewer10.d3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f35001b;
                photoViewer11.f31350q5.f29065b.setLoading(false);
                photoViewer11.d3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f35001b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer12.d3(0);
                return;
            case 13:
                this.f35001b.p5.V = false;
                return;
            case 14:
                this.f35001b.f31424y4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f35001b;
                photoViewer13.f31284i7 = null;
                photoViewer13.m0();
                photoViewer13.d3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f35001b;
                photoViewer14.f31350q5.f29065b.setLoading(false);
                photoViewer14.d3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f35001b;
                photoViewer15.f31350q5.f29065b.setLoading(false);
                photoViewer15.d3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f35001b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                photoViewer16.r3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f35001b;
                Drawable[] drawableArr12 = PhotoViewer.U8;
                photoViewer17.k0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f35001b;
                Drawable[] drawableArr13 = PhotoViewer.U8;
                photoViewer18.m3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f35001b;
                if (photoViewer19.f31391v0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f31420y) && !org.telegram.ui.Components.rg0.f27960p0.P && photoViewer19.P3) {
                    if (photoViewer19.f31377t4) {
                        iu0 iu0Var = photoViewer19.f31251f0;
                        if (iu0Var != null) {
                            if ((!iu0Var.f22991x || !"inapp".equals(MessagesController.getInstance(iu0Var.f22983a).youtubePipType)) && photoViewer19.f31251f0.e()) {
                                photoViewer19.K3 = false;
                                if (PhotoViewer.f31203b9 != null) {
                                    PhotoViewer.f31203b9.P0();
                                }
                                photoViewer19.J3 = true;
                                PhotoViewer.f31203b9 = PhotoViewer.f31202a9;
                                PhotoViewer.f31202a9 = null;
                                photoViewer19.e = false;
                                dv0 dv0Var = photoViewer19.f31238d5;
                                if (dv0Var != null && !dv0Var.f33163a.getVisible()) {
                                    photoViewer19.f31238d5.f33163a.setVisible(true, true);
                                }
                                photoViewer19.f31315m6 = 1.0f;
                                photoViewer19.f31242e0.invalidate();
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
                PhotoViewer photoViewer20 = this.f35001b;
                if (photoViewer20.e && photoViewer20.f31323n4 == 0) {
                    photoViewer20.u3(photoViewer20.J);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f35001b;
                Drawable[] drawableArr14 = PhotoViewer.U8;
                photoViewer21.F1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f35001b;
                org.telegram.ui.Components.v71 v71Var = photoViewer22.F2;
                if (v71Var != null && photoViewer22.f31210a6 <= 1.35f) {
                    long n10 = v71Var.n();
                    long p5 = photoViewer22.F2.p();
                    if (n10 != -9223372036854775807L && p5 >= 8000) {
                        float f7 = photoViewer22.E7;
                        int k12 = photoViewer22.k1(photoViewer22.f31386u4);
                        if (p5 > 180000) {
                            int i10 = k12 / 3;
                            if (f7 < i10 * 2) {
                                if (f7 < i10) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.f31208a4.startRewind(photoViewer22.F2, z11, photoViewer22.f31374t1);
                            return;
                        }
                        if (f7 > k12 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.f31228c4.startRewind(photoViewer22.F2, z10, photoViewer22.E7, photoViewer22.f31374t1, photoViewer22.A1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f35001b;
                if (photoViewer23.U4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.U4;
                    org.telegram.ui.Components.v71 v71Var2 = photoViewer23.F2;
                    if (v71Var2 != null) {
                        z11 = v71Var2.y();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.v71 v71Var3 = photoViewer23.F2;
                    if (v71Var3 != null) {
                        v71Var3.B();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.v71 v71Var4 = photoViewer23.F2;
                if (v71Var4 != null && photoViewer23.U4.videoWasPlaying) {
                    v71Var4.C();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f35001b;
                Drawable[] drawableArr15 = PhotoViewer.U8;
                photoViewer24.G0(false, false);
                org.telegram.ui.Components.vi viVar = photoViewer24.a2;
                if (viVar != null) {
                    viVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = photoViewer24.f31313m4;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f35001b.f31326n7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f35001b;
                Drawable[] drawableArr16 = PhotoViewer.U8;
                photoViewer25.y3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f35001b;
                photoViewer26.D1.e(photoViewer26.J2, photoViewer26.K2, photoViewer26.L2, photoViewer26.P2, photoViewer26.R2, photoViewer26.O2, photoViewer26.q2(true), photoViewer26.q2(true), photoViewer26.M2, photoViewer26.N2, 0.0f, 0.0f, photoViewer26.Q2);
                photoViewer26.d3(0);
                return;
        }
    }
}
