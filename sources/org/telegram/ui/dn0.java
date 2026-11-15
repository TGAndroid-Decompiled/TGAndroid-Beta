package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoAds;
public final class dn0 implements Runnable {
    public final int f46443a;
    public final PhotoViewer f46444b;

    public dn0(PhotoViewer photoViewer, int i7) {
        this.f46443a = i7;
        this.f46444b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f46443a) {
            case 0:
                PhotoViewer photoViewer = this.f46444b;
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.d3(-1, false);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f46444b;
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                photoViewer2.c3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f46444b;
                Drawable[] drawableArr3 = PhotoViewer.Z8;
                photoViewer3.u2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f46444b;
                Drawable[] drawableArr4 = PhotoViewer.Z8;
                photoViewer4.u2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f46444b;
                Drawable[] drawableArr5 = PhotoViewer.Z8;
                photoViewer5.u2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f46444b;
                Drawable[] drawableArr6 = PhotoViewer.Z8;
                photoViewer6.X2();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f46444b;
                Drawable[] drawableArr7 = PhotoViewer.Z8;
                photoViewer7.u2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f46444b;
                Drawable[] drawableArr8 = PhotoViewer.Z8;
                wi.n nVar = photoViewer8.P8;
                if (nVar != null) {
                    nVar.c();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.gd0 gd0Var = this.f46444b.D1;
                og.f fVar = gd0Var.f34908c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                gd0Var.f34907b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f46444b;
                Drawable[] drawableArr9 = PhotoViewer.Z8;
                photoViewer9.f0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f46444b;
                photoViewer10.f42861q5.f40000b.setLoading(false);
                photoViewer10.c3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f46444b;
                photoViewer11.f42861q5.f40000b.setLoading(false);
                photoViewer11.c3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f46444b;
                Drawable[] drawableArr10 = PhotoViewer.Z8;
                photoViewer12.q0(false);
                return;
            case 13:
                PhotoViewer photoViewer13 = this.f46444b;
                Drawable[] drawableArr11 = PhotoViewer.Z8;
                photoViewer13.c3(0);
                return;
            case 14:
                this.f46444b.f42852p5.W = false;
                return;
            case 15:
                this.f46444b.f42935y4.setBackground(null);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f46444b;
                photoViewer14.i7 = null;
                photoViewer14.f0();
                photoViewer14.c3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f46444b;
                if (photoViewer15.G3 == 2) {
                    photoViewer15.q0(false);
                    return;
                }
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f46444b;
                photoViewer16.f42861q5.f40000b.setLoading(false);
                photoViewer16.c3(0);
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f46444b;
                photoViewer17.f42861q5.f40000b.setLoading(false);
                photoViewer17.c3(0);
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f46444b;
                Drawable[] drawableArr12 = PhotoViewer.Z8;
                photoViewer18.q3();
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f46444b;
                Drawable[] drawableArr13 = PhotoViewer.Z8;
                photoViewer19.d0();
                return;
            case 22:
                PhotoViewer photoViewer20 = this.f46444b;
                Drawable[] drawableArr14 = PhotoViewer.Z8;
                photoViewer20.l3(true);
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f46444b;
                if (photoViewer21.f42911w0.isEnabled()) {
                    Activity activity = photoViewer21.E;
                    Typeface typeface = org.telegram.messenger.g0.f23581a;
                    if (Settings.canDrawOverlays(activity) && l2.i.d().c() == null && photoViewer21.P3) {
                        if (photoViewer21.f42888t4) {
                            bq0 bq0Var = photoViewer21.f42772g0;
                            if (bq0Var != null) {
                                if ((!bq0Var.f32978y || !"inapp".equals(org.telegram.messenger.np.s1(bq0Var.f32968a).B3)) && photoViewer21.f42772g0.e()) {
                                    photoViewer21.K3 = false;
                                    if (PhotoViewer.f42713g9 != null) {
                                        PhotoViewer.f42713g9.J0();
                                    }
                                    photoViewer21.J3 = true;
                                    PhotoViewer.f42713g9 = PhotoViewer.f42712f9;
                                    PhotoViewer.f42712f9 = null;
                                    photoViewer21.f42752e = false;
                                    uq0 uq0Var = photoViewer21.f42748d5;
                                    if (uq0Var != null) {
                                        ImageReceiver imageReceiver = uq0Var.f51999a;
                                        if (!imageReceiver.R0) {
                                            imageReceiver.O0(true, true);
                                        }
                                    }
                                    photoViewer21.f42827m6 = 1.0f;
                                    photoViewer21.f42763f0.invalidate();
                                    photoViewer21.M0();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        photoViewer21.K3 = false;
                        photoViewer21.f3();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f46444b;
                if (photoViewer22.f42752e && photoViewer22.f42834n4 == 0) {
                    photoViewer22.t3(photoViewer22.K);
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f46444b;
                Drawable[] drawableArr15 = PhotoViewer.Z8;
                photoViewer23.D1();
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f46444b;
                org.telegram.ui.Components.u51 u51Var = photoViewer24.G2;
                if (u51Var != null && photoViewer24.f42721a6 <= 1.35f) {
                    long S = u51Var.S();
                    long U = photoViewer24.G2.U();
                    if (S != -9223372036854775807L && U >= 8000) {
                        float f10 = photoViewer24.E7;
                        int g12 = photoViewer24.g1(photoViewer24.f42896u4);
                        if (U > 180000) {
                            int i7 = g12 / 3;
                            if (f10 < i7 * 2) {
                                if (f10 < i7) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer24.f42719a4.startRewind(photoViewer24.G2, z11, photoViewer24.f42893u1);
                            return;
                        }
                        if (f10 > g12 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer24.f42739c4.startRewind(photoViewer24.G2, z10, photoViewer24.E7, photoViewer24.f42893u1, photoViewer24.B1);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                PhotoViewer photoViewer25 = this.f46444b;
                photoViewer25.V8 = false;
                wi.n nVar2 = photoViewer25.P8;
                if (nVar2 != null) {
                    nVar2.c();
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer26 = this.f46444b;
                if (photoViewer26.U4.isPopupShown()) {
                    VideoAds videoAds = photoViewer26.U4;
                    org.telegram.ui.Components.u51 u51Var2 = photoViewer26.G2;
                    if (u51Var2 != null) {
                        z11 = u51Var2.d0();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.u51 u51Var3 = photoViewer26.G2;
                    if (u51Var3 != null) {
                        u51Var3.g0();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.u51 u51Var4 = photoViewer26.G2;
                if (u51Var4 != null && photoViewer26.U4.videoWasPlaying) {
                    u51Var4.h0();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer27 = this.f46444b;
                Drawable[] drawableArr16 = PhotoViewer.Z8;
                photoViewer27.z0(false, false);
                org.telegram.ui.Components.ki kiVar = photoViewer27.f42727b2;
                if (kiVar != null) {
                    kiVar.a(true);
                }
                org.telegram.ui.ActionBar.e2 e2Var = photoViewer27.f42825m4;
                if (e2Var != null) {
                    e2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
        }
    }
}
