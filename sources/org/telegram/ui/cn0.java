package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoAds;
public final class cn0 implements Runnable {
    public final int f44841a;
    public final PhotoViewer f44842b;

    public cn0(PhotoViewer photoViewer, int i7) {
        this.f44841a = i7;
        this.f44842b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10 = true;
        switch (this.f44841a) {
            case 0:
                PhotoViewer photoViewer = this.f44842b;
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.c3(-1, false);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f44842b;
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer2.b3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f44842b;
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                photoViewer3.t2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f44842b;
                Drawable[] drawableArr4 = PhotoViewer.Y8;
                photoViewer4.t2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f44842b;
                Drawable[] drawableArr5 = PhotoViewer.Y8;
                photoViewer5.t2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f44842b;
                Drawable[] drawableArr6 = PhotoViewer.Y8;
                photoViewer6.W2();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f44842b;
                Drawable[] drawableArr7 = PhotoViewer.Y8;
                photoViewer7.t2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f44842b;
                Drawable[] drawableArr8 = PhotoViewer.Y8;
                ti.o oVar = photoViewer8.O8;
                if (oVar != null) {
                    oVar.c();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.fd0 fd0Var = this.f44842b.C1;
                og.f fVar = fd0Var.f33565c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                fd0Var.f33564b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f44842b;
                Drawable[] drawableArr9 = PhotoViewer.Y8;
                photoViewer9.f0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f44842b;
                photoViewer10.f41455p5.f38612b.setLoading(false);
                photoViewer10.b3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f44842b;
                photoViewer11.f41455p5.f38612b.setLoading(false);
                photoViewer11.b3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f44842b;
                Drawable[] drawableArr10 = PhotoViewer.Y8;
                photoViewer12.q0(false);
                return;
            case 13:
                PhotoViewer photoViewer13 = this.f44842b;
                Drawable[] drawableArr11 = PhotoViewer.Y8;
                photoViewer13.b3(0);
                return;
            case 14:
                this.f44842b.f41446o5.V = false;
                return;
            case 15:
                this.f44842b.f41528x4.setBackground(null);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f44842b;
                photoViewer14.h7 = null;
                photoViewer14.f0();
                photoViewer14.b3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f44842b;
                if (photoViewer15.F3 == 2) {
                    photoViewer15.q0(false);
                    return;
                }
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f44842b;
                photoViewer16.f41455p5.f38612b.setLoading(false);
                photoViewer16.b3(0);
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f44842b;
                photoViewer17.f41455p5.f38612b.setLoading(false);
                photoViewer17.b3(0);
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f44842b;
                Drawable[] drawableArr12 = PhotoViewer.Y8;
                photoViewer18.p3();
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f44842b;
                Drawable[] drawableArr13 = PhotoViewer.Y8;
                photoViewer19.d0();
                return;
            case 22:
                PhotoViewer photoViewer20 = this.f44842b;
                Drawable[] drawableArr14 = PhotoViewer.Y8;
                photoViewer20.k3(true);
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f44842b;
                if (photoViewer21.f41504v0.isEnabled()) {
                    Activity activity = photoViewer21.D;
                    Typeface typeface = org.telegram.messenger.g0.f22509a;
                    if (Settings.canDrawOverlays(activity) && l2.i.d().c() == null && photoViewer21.O3) {
                        if (photoViewer21.f41483s4) {
                            bq0 bq0Var = photoViewer21.f41366f0;
                            if (bq0Var != null) {
                                if ((!bq0Var.f31785y || !"inapp".equals(org.telegram.messenger.qp.s1(bq0Var.f31775a).A3)) && photoViewer21.f41366f0.e()) {
                                    photoViewer21.J3 = false;
                                    if (PhotoViewer.f41316f9 != null) {
                                        PhotoViewer.f41316f9.J0();
                                    }
                                    photoViewer21.I3 = true;
                                    PhotoViewer.f41316f9 = PhotoViewer.f41315e9;
                                    PhotoViewer.f41315e9 = null;
                                    photoViewer21.f41355e = false;
                                    vq0 vq0Var = photoViewer21.f41343c5;
                                    if (vq0Var != null) {
                                        ImageReceiver imageReceiver = vq0Var.f50790a;
                                        if (!imageReceiver.Q0) {
                                            imageReceiver.O0(true, true);
                                        }
                                    }
                                    photoViewer21.f41422l6 = 1.0f;
                                    photoViewer21.f41356e0.invalidate();
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
                PhotoViewer photoViewer22 = this.f44842b;
                if (photoViewer22.f41355e && photoViewer22.f41428m4 == 0) {
                    photoViewer22.s3(photoViewer22.J);
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f44842b;
                Drawable[] drawableArr15 = PhotoViewer.Y8;
                photoViewer23.D1();
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f44842b;
                org.telegram.ui.Components.n51 n51Var = photoViewer24.F2;
                if (n51Var != null && photoViewer24.Z5 <= 1.35f) {
                    long S = n51Var.S();
                    long U = photoViewer24.F2.U();
                    if (S != -9223372036854775807L && U >= 8000) {
                        float f10 = photoViewer24.D7;
                        int g12 = photoViewer24.g1(photoViewer24.f41491t4);
                        if (U > 180000) {
                            int i7 = g12 / 3;
                            if (f10 < i7 * 2) {
                                if (f10 < i7) {
                                    z10 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer24.Z3.startRewind(photoViewer24.F2, z10, photoViewer24.f41488t1);
                            return;
                        }
                        if (f10 > g12 / 3) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        photoViewer24.f41332b4.startRewind(photoViewer24.F2, z9, photoViewer24.D7, photoViewer24.f41488t1, photoViewer24.A1);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                PhotoViewer photoViewer25 = this.f44842b;
                photoViewer25.U8 = false;
                ti.o oVar2 = photoViewer25.O8;
                if (oVar2 != null) {
                    oVar2.c();
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer26 = this.f44842b;
                if (photoViewer26.T4.isPopupShown()) {
                    VideoAds videoAds = photoViewer26.T4;
                    org.telegram.ui.Components.n51 n51Var2 = photoViewer26.F2;
                    if (n51Var2 != null) {
                        z10 = n51Var2.d0();
                    }
                    videoAds.videoWasPlaying = z10;
                    org.telegram.ui.Components.n51 n51Var3 = photoViewer26.F2;
                    if (n51Var3 != null) {
                        n51Var3.g0();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.n51 n51Var4 = photoViewer26.F2;
                if (n51Var4 != null && photoViewer26.T4.videoWasPlaying) {
                    n51Var4.h0();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer27 = this.f44842b;
                Drawable[] drawableArr16 = PhotoViewer.Y8;
                photoViewer27.z0(false, false);
                org.telegram.ui.Components.di diVar = photoViewer27.f41320a2;
                if (diVar != null) {
                    diVar.a(true);
                }
                org.telegram.ui.ActionBar.f2 f2Var = photoViewer27.f41420l4;
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
        }
    }
}
