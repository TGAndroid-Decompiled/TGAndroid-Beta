package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoAds;
public final class oo0 implements Runnable {
    public final int f40238a;
    public final PhotoViewer f40239b;

    public oo0(PhotoViewer photoViewer, int i10) {
        this.f40238a = i10;
        this.f40239b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f40238a) {
            case 0:
                PhotoViewer photoViewer = this.f40239b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.y0(false);
                org.telegram.ui.Components.jf0.f27400p0.d(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f40239b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer2.h3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f40239b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer3.z2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f40239b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer4.z2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f40239b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer5.z2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f40239b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer6.c3();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f40239b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer7.z2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f40239b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer8.l2();
                return;
            case 8:
                org.telegram.ui.Components.be0 be0Var = this.f40239b.C1;
                eg.f fVar = be0Var.f24716c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                be0Var.f24715b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f40239b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer9.n0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f40239b;
                photoViewer10.f33586q5.f29411b.setLoading(false);
                photoViewer10.h3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f40239b;
                photoViewer11.f33586q5.f29411b.setLoading(false);
                photoViewer11.h3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f40239b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer12.h3(0);
                return;
            case 13:
                this.f40239b.p5.V = false;
                return;
            case 14:
                this.f40239b.f33660y4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f40239b;
                photoViewer13.f33519i7 = null;
                photoViewer13.n0();
                photoViewer13.h3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f40239b;
                photoViewer14.f33586q5.f29411b.setLoading(false);
                photoViewer14.h3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f40239b;
                photoViewer15.f33586q5.f29411b.setLoading(false);
                photoViewer15.h3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f40239b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                photoViewer16.v3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f40239b;
                Drawable[] drawableArr12 = PhotoViewer.U8;
                photoViewer17.l0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f40239b;
                Drawable[] drawableArr13 = PhotoViewer.U8;
                photoViewer18.q3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f40239b;
                if (photoViewer19.f33627v0.isEnabled()) {
                    Activity activity = photoViewer19.D;
                    Typeface typeface = org.telegram.messenger.i0.f16145a;
                    if (Settings.canDrawOverlays(activity) && !org.telegram.ui.Components.jf0.f27400p0.P && photoViewer19.P3) {
                        if (photoViewer19.f33613t4) {
                            lr0 lr0Var = photoViewer19.f33486f0;
                            if (lr0Var != null) {
                                if ((!lr0Var.f31278y || !"inapp".equals(org.telegram.messenger.wp.r1(lr0Var.f31269a).A3)) && photoViewer19.f33486f0.e()) {
                                    photoViewer19.K3 = false;
                                    if (PhotoViewer.f33438b9 != null) {
                                        PhotoViewer.f33438b9.Q0();
                                    }
                                    photoViewer19.J3 = true;
                                    PhotoViewer.f33438b9 = PhotoViewer.f33437a9;
                                    PhotoViewer.f33437a9 = null;
                                    photoViewer19.e = false;
                                    fs0 fs0Var = photoViewer19.f33473d5;
                                    if (fs0Var != null) {
                                        ImageReceiver imageReceiver = fs0Var.f37215a;
                                        if (!imageReceiver.Q0) {
                                            imageReceiver.O0(true, true);
                                        }
                                    }
                                    photoViewer19.f33551m6 = 1.0f;
                                    photoViewer19.f33477e0.invalidate();
                                    photoViewer19.T0();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        photoViewer19.K3 = false;
                        photoViewer19.k3();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer20 = this.f40239b;
                if (photoViewer20.e && photoViewer20.f33559n4 == 0) {
                    photoViewer20.y3(photoViewer20.J);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f40239b;
                Drawable[] drawableArr14 = PhotoViewer.U8;
                photoViewer21.I1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f40239b;
                org.telegram.ui.Components.v61 v61Var = photoViewer22.F2;
                if (v61Var != null && photoViewer22.f33445a6 <= 1.35f) {
                    long S = v61Var.S();
                    long U = photoViewer22.F2.U();
                    if (S != -9223372036854775807L && U >= 8000) {
                        float f7 = photoViewer22.E7;
                        int m12 = photoViewer22.m1(photoViewer22.f33622u4);
                        if (U > 180000) {
                            int i10 = m12 / 3;
                            if (f7 < i10 * 2) {
                                if (f7 < i10) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.f33443a4.startRewind(photoViewer22.F2, z11, photoViewer22.f33610t1);
                            return;
                        }
                        if (f7 > m12 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.f33463c4.startRewind(photoViewer22.F2, z10, photoViewer22.E7, photoViewer22.f33610t1, photoViewer22.A1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f40239b;
                if (photoViewer23.U4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.U4;
                    org.telegram.ui.Components.v61 v61Var2 = photoViewer23.F2;
                    if (v61Var2 != null) {
                        z11 = v61Var2.d0();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.v61 v61Var3 = photoViewer23.F2;
                    if (v61Var3 != null) {
                        v61Var3.g0();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.v61 v61Var4 = photoViewer23.F2;
                if (v61Var4 != null && photoViewer23.U4.videoWasPlaying) {
                    v61Var4.h0();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f40239b;
                Drawable[] drawableArr15 = PhotoViewer.U8;
                photoViewer24.H0(false, false);
                org.telegram.ui.Components.bi biVar = photoViewer24.a2;
                if (biVar != null) {
                    biVar.a(true);
                }
                org.telegram.ui.ActionBar.k2 k2Var = photoViewer24.f33549m4;
                if (k2Var != null) {
                    k2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f40239b.f33562n7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f40239b;
                Drawable[] drawableArr16 = PhotoViewer.U8;
                photoViewer25.C3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f40239b;
                photoViewer26.D1.e(photoViewer26.J2, photoViewer26.K2, photoViewer26.L2, photoViewer26.P2, photoViewer26.R2, photoViewer26.O2, photoViewer26.u2(true), photoViewer26.u2(true), photoViewer26.M2, photoViewer26.N2, 0.0f, 0.0f, photoViewer26.Q2);
                photoViewer26.h3(0);
                return;
        }
    }
}
