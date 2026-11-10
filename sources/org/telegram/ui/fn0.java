package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoAds;
public final class fn0 implements Runnable {
    public final int f45812a;
    public final PhotoViewer f45813b;

    public fn0(PhotoViewer photoViewer, int i7) {
        this.f45812a = i7;
        this.f45813b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10 = true;
        switch (this.f45812a) {
            case 0:
                PhotoViewer photoViewer = this.f45813b;
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.c3(-1, false);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f45813b;
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer2.b3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f45813b;
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                photoViewer3.t2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f45813b;
                Drawable[] drawableArr4 = PhotoViewer.Y8;
                photoViewer4.t2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f45813b;
                Drawable[] drawableArr5 = PhotoViewer.Y8;
                photoViewer5.t2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f45813b;
                Drawable[] drawableArr6 = PhotoViewer.Y8;
                photoViewer6.W2();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f45813b;
                Drawable[] drawableArr7 = PhotoViewer.Y8;
                photoViewer7.t2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f45813b;
                Drawable[] drawableArr8 = PhotoViewer.Y8;
                ti.o oVar = photoViewer8.O8;
                if (oVar != null) {
                    oVar.c();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.fd0 fd0Var = this.f45813b.C1;
                og.f fVar = fd0Var.f33528c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                fd0Var.f33527b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f45813b;
                Drawable[] drawableArr9 = PhotoViewer.Y8;
                photoViewer9.f0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f45813b;
                photoViewer10.f41481p5.f38625b.setLoading(false);
                photoViewer10.b3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f45813b;
                photoViewer11.f41481p5.f38625b.setLoading(false);
                photoViewer11.b3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f45813b;
                Drawable[] drawableArr10 = PhotoViewer.Y8;
                photoViewer12.q0(false);
                return;
            case 13:
                PhotoViewer photoViewer13 = this.f45813b;
                Drawable[] drawableArr11 = PhotoViewer.Y8;
                photoViewer13.b3(0);
                return;
            case 14:
                this.f45813b.f41472o5.V = false;
                return;
            case 15:
                this.f45813b.f41554x4.setBackground(null);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f45813b;
                photoViewer14.h7 = null;
                photoViewer14.f0();
                photoViewer14.b3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f45813b;
                if (photoViewer15.F3 == 2) {
                    photoViewer15.q0(false);
                    return;
                }
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f45813b;
                photoViewer16.f41481p5.f38625b.setLoading(false);
                photoViewer16.b3(0);
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f45813b;
                photoViewer17.f41481p5.f38625b.setLoading(false);
                photoViewer17.b3(0);
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f45813b;
                Drawable[] drawableArr12 = PhotoViewer.Y8;
                photoViewer18.p3();
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f45813b;
                Drawable[] drawableArr13 = PhotoViewer.Y8;
                photoViewer19.d0();
                return;
            case 22:
                PhotoViewer photoViewer20 = this.f45813b;
                Drawable[] drawableArr14 = PhotoViewer.Y8;
                photoViewer20.k3(true);
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f45813b;
                if (photoViewer21.f41530v0.isEnabled()) {
                    Activity activity = photoViewer21.D;
                    Typeface typeface = org.telegram.messenger.g0.f22539a;
                    if (Settings.canDrawOverlays(activity) && l2.i.d().c() == null && photoViewer21.O3) {
                        if (photoViewer21.f41509s4) {
                            fq0 fq0Var = photoViewer21.f41392f0;
                            if (fq0Var != null) {
                                if ((!fq0Var.f31851y || !"inapp".equals(org.telegram.messenger.qp.s1(fq0Var.f31841a).A3)) && photoViewer21.f41392f0.e()) {
                                    photoViewer21.J3 = false;
                                    if (PhotoViewer.f41342f9 != null) {
                                        PhotoViewer.f41342f9.J0();
                                    }
                                    photoViewer21.I3 = true;
                                    PhotoViewer.f41342f9 = PhotoViewer.f41341e9;
                                    PhotoViewer.f41341e9 = null;
                                    photoViewer21.f41381e = false;
                                    zq0 zq0Var = photoViewer21.f41369c5;
                                    if (zq0Var != null) {
                                        ImageReceiver imageReceiver = zq0Var.f52503a;
                                        if (!imageReceiver.Q0) {
                                            imageReceiver.O0(true, true);
                                        }
                                    }
                                    photoViewer21.f41448l6 = 1.0f;
                                    photoViewer21.f41382e0.invalidate();
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
                PhotoViewer photoViewer22 = this.f45813b;
                if (photoViewer22.f41381e && photoViewer22.f41454m4 == 0) {
                    photoViewer22.s3(photoViewer22.J);
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f45813b;
                Drawable[] drawableArr15 = PhotoViewer.Y8;
                photoViewer23.D1();
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f45813b;
                org.telegram.ui.Components.t51 t51Var = photoViewer24.F2;
                if (t51Var != null && photoViewer24.Z5 <= 1.35f) {
                    long S = t51Var.S();
                    long U = photoViewer24.F2.U();
                    if (S != -9223372036854775807L && U >= 8000) {
                        float f10 = photoViewer24.D7;
                        int g12 = photoViewer24.g1(photoViewer24.f41517t4);
                        if (U > 180000) {
                            int i7 = g12 / 3;
                            if (f10 < i7 * 2) {
                                if (f10 < i7) {
                                    z10 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer24.Z3.startRewind(photoViewer24.F2, z10, photoViewer24.f41514t1);
                            return;
                        }
                        if (f10 > g12 / 3) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        photoViewer24.f41358b4.startRewind(photoViewer24.F2, z9, photoViewer24.D7, photoViewer24.f41514t1, photoViewer24.A1);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                PhotoViewer photoViewer25 = this.f45813b;
                photoViewer25.U8 = false;
                ti.o oVar2 = photoViewer25.O8;
                if (oVar2 != null) {
                    oVar2.c();
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer26 = this.f45813b;
                if (photoViewer26.T4.isPopupShown()) {
                    VideoAds videoAds = photoViewer26.T4;
                    org.telegram.ui.Components.t51 t51Var2 = photoViewer26.F2;
                    if (t51Var2 != null) {
                        z10 = t51Var2.d0();
                    }
                    videoAds.videoWasPlaying = z10;
                    org.telegram.ui.Components.t51 t51Var3 = photoViewer26.F2;
                    if (t51Var3 != null) {
                        t51Var3.g0();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.t51 t51Var4 = photoViewer26.F2;
                if (t51Var4 != null && photoViewer26.T4.videoWasPlaying) {
                    t51Var4.h0();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer27 = this.f45813b;
                Drawable[] drawableArr16 = PhotoViewer.Y8;
                photoViewer27.z0(false, false);
                org.telegram.ui.Components.ci ciVar = photoViewer27.f41346a2;
                if (ciVar != null) {
                    ciVar.a(true);
                }
                org.telegram.ui.ActionBar.f2 f2Var = photoViewer27.f41446l4;
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
        }
    }
}
