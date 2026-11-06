package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoAds;
public final class cn0 implements Runnable {
    public final int f44862a;
    public final PhotoViewer f44863b;

    public cn0(PhotoViewer photoViewer, int i7) {
        this.f44862a = i7;
        this.f44863b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10 = true;
        switch (this.f44862a) {
            case 0:
                PhotoViewer photoViewer = this.f44863b;
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.c3(-1, false);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f44863b;
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer2.b3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f44863b;
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                photoViewer3.t2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f44863b;
                Drawable[] drawableArr4 = PhotoViewer.Y8;
                photoViewer4.t2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f44863b;
                Drawable[] drawableArr5 = PhotoViewer.Y8;
                photoViewer5.t2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f44863b;
                Drawable[] drawableArr6 = PhotoViewer.Y8;
                photoViewer6.W2();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f44863b;
                Drawable[] drawableArr7 = PhotoViewer.Y8;
                photoViewer7.t2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f44863b;
                Drawable[] drawableArr8 = PhotoViewer.Y8;
                ti.o oVar = photoViewer8.O8;
                if (oVar != null) {
                    oVar.c();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.fd0 fd0Var = this.f44863b.C1;
                og.f fVar = fd0Var.f33509c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                fd0Var.f33508b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f44863b;
                Drawable[] drawableArr9 = PhotoViewer.Y8;
                photoViewer9.f0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f44863b;
                photoViewer10.f41480p5.f38603b.setLoading(false);
                photoViewer10.b3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f44863b;
                photoViewer11.f41480p5.f38603b.setLoading(false);
                photoViewer11.b3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f44863b;
                Drawable[] drawableArr10 = PhotoViewer.Y8;
                photoViewer12.q0(false);
                return;
            case 13:
                PhotoViewer photoViewer13 = this.f44863b;
                Drawable[] drawableArr11 = PhotoViewer.Y8;
                photoViewer13.b3(0);
                return;
            case 14:
                this.f44863b.f41471o5.V = false;
                return;
            case 15:
                this.f44863b.f41553x4.setBackground(null);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f44863b;
                photoViewer14.h7 = null;
                photoViewer14.f0();
                photoViewer14.b3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f44863b;
                if (photoViewer15.F3 == 2) {
                    photoViewer15.q0(false);
                    return;
                }
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f44863b;
                photoViewer16.f41480p5.f38603b.setLoading(false);
                photoViewer16.b3(0);
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f44863b;
                photoViewer17.f41480p5.f38603b.setLoading(false);
                photoViewer17.b3(0);
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f44863b;
                Drawable[] drawableArr12 = PhotoViewer.Y8;
                photoViewer18.p3();
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f44863b;
                Drawable[] drawableArr13 = PhotoViewer.Y8;
                photoViewer19.d0();
                return;
            case 22:
                PhotoViewer photoViewer20 = this.f44863b;
                Drawable[] drawableArr14 = PhotoViewer.Y8;
                photoViewer20.k3(true);
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f44863b;
                if (photoViewer21.f41529v0.isEnabled()) {
                    Activity activity = photoViewer21.D;
                    Typeface typeface = org.telegram.messenger.g0.f22509a;
                    if (Settings.canDrawOverlays(activity) && l2.i.d().c() == null && photoViewer21.O3) {
                        if (photoViewer21.f41508s4) {
                            cq0 cq0Var = photoViewer21.f41391f0;
                            if (cq0Var != null) {
                                if ((!cq0Var.f31797y || !"inapp".equals(org.telegram.messenger.qp.s1(cq0Var.f31787a).A3)) && photoViewer21.f41391f0.e()) {
                                    photoViewer21.J3 = false;
                                    if (PhotoViewer.f41341f9 != null) {
                                        PhotoViewer.f41341f9.J0();
                                    }
                                    photoViewer21.I3 = true;
                                    PhotoViewer.f41341f9 = PhotoViewer.f41340e9;
                                    PhotoViewer.f41340e9 = null;
                                    photoViewer21.f41380e = false;
                                    wq0 wq0Var = photoViewer21.f41368c5;
                                    if (wq0Var != null) {
                                        ImageReceiver imageReceiver = wq0Var.f51478a;
                                        if (!imageReceiver.Q0) {
                                            imageReceiver.O0(true, true);
                                        }
                                    }
                                    photoViewer21.f41447l6 = 1.0f;
                                    photoViewer21.f41381e0.invalidate();
                                    photoViewer21.M0();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        photoViewer21.J3 = false;
                        photoViewer21.e3();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f44863b;
                if (photoViewer22.f41380e && photoViewer22.f41453m4 == 0) {
                    photoViewer22.s3(photoViewer22.J);
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f44863b;
                Drawable[] drawableArr15 = PhotoViewer.Y8;
                photoViewer23.D1();
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f44863b;
                org.telegram.ui.Components.s51 s51Var = photoViewer24.F2;
                if (s51Var != null && photoViewer24.Z5 <= 1.35f) {
                    long S = s51Var.S();
                    long U = photoViewer24.F2.U();
                    if (S != -9223372036854775807L && U >= 8000) {
                        float f10 = photoViewer24.D7;
                        int g12 = photoViewer24.g1(photoViewer24.f41516t4);
                        if (U > 180000) {
                            int i7 = g12 / 3;
                            if (f10 < i7 * 2) {
                                if (f10 < i7) {
                                    z10 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer24.Z3.startRewind(photoViewer24.F2, z10, photoViewer24.f41513t1);
                            return;
                        }
                        if (f10 > g12 / 3) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        photoViewer24.f41357b4.startRewind(photoViewer24.F2, z9, photoViewer24.D7, photoViewer24.f41513t1, photoViewer24.A1);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                PhotoViewer photoViewer25 = this.f44863b;
                photoViewer25.U8 = false;
                ti.o oVar2 = photoViewer25.O8;
                if (oVar2 != null) {
                    oVar2.c();
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer26 = this.f44863b;
                if (photoViewer26.T4.isPopupShown()) {
                    VideoAds videoAds = photoViewer26.T4;
                    org.telegram.ui.Components.s51 s51Var2 = photoViewer26.F2;
                    if (s51Var2 != null) {
                        z10 = s51Var2.d0();
                    }
                    videoAds.videoWasPlaying = z10;
                    org.telegram.ui.Components.s51 s51Var3 = photoViewer26.F2;
                    if (s51Var3 != null) {
                        s51Var3.g0();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.s51 s51Var4 = photoViewer26.F2;
                if (s51Var4 != null && photoViewer26.T4.videoWasPlaying) {
                    s51Var4.h0();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer27 = this.f44863b;
                Drawable[] drawableArr16 = PhotoViewer.Y8;
                photoViewer27.z0(false, false);
                org.telegram.ui.Components.di diVar = photoViewer27.f41345a2;
                if (diVar != null) {
                    diVar.a(true);
                }
                org.telegram.ui.ActionBar.f2 f2Var = photoViewer27.f41445l4;
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
        }
    }
}
