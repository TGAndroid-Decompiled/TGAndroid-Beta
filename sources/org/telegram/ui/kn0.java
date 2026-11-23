package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoAds;
public final class kn0 implements Runnable {
    public final int f49503a;
    public final PhotoViewer f49504b;

    public kn0(PhotoViewer photoViewer, int i7) {
        this.f49503a = i7;
        this.f49504b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f49503a) {
            case 0:
                PhotoViewer photoViewer = this.f49504b;
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                photoViewer.e3(1, false);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f49504b;
                Drawable[] drawableArr2 = PhotoViewer.f43272f9;
                photoViewer2.e3(-1, false);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f49504b;
                Drawable[] drawableArr3 = PhotoViewer.f43272f9;
                photoViewer3.d3(0);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f49504b;
                Drawable[] drawableArr4 = PhotoViewer.f43272f9;
                wi.n nVar = photoViewer4.V8;
                if (nVar != null) {
                    nVar.c();
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f49504b;
                photoViewer5.E1.e(photoViewer5.J2, photoViewer5.K2, photoViewer5.L2, photoViewer5.P2, photoViewer5.R2, photoViewer5.O2, photoViewer5.q2(true), photoViewer5.q2(true), photoViewer5.M2, photoViewer5.N2, 0.0f, 0.0f, photoViewer5.Q2);
                photoViewer5.d3(0);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f49504b;
                photoViewer6.f43432q5.f34696b.setLoading(false);
                photoViewer6.d3(0);
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f49504b;
                photoViewer7.f43432q5.f34696b.setLoading(false);
                photoViewer7.d3(0);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f49504b;
                Drawable[] drawableArr5 = PhotoViewer.f43272f9;
                photoViewer8.q0(false);
                return;
            case 8:
                this.f49504b.f43423p5.W = false;
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f49504b;
                Drawable[] drawableArr6 = PhotoViewer.f43272f9;
                photoViewer9.f0();
                return;
            case 10:
                this.f49504b.f43506y4.setBackground(null);
                return;
            case 11:
                PhotoViewer photoViewer10 = this.f49504b;
                photoViewer10.i7 = null;
                photoViewer10.f0();
                photoViewer10.d3(0);
                return;
            case 12:
                PhotoViewer photoViewer11 = this.f49504b;
                if (photoViewer11.G3 == 2) {
                    photoViewer11.q0(false);
                    return;
                }
                return;
            case 13:
                PhotoViewer photoViewer12 = this.f49504b;
                Drawable[] drawableArr7 = PhotoViewer.f43272f9;
                photoViewer12.d3(0);
                return;
            case 14:
                PhotoViewer photoViewer13 = this.f49504b;
                photoViewer13.f43432q5.f34696b.setLoading(false);
                photoViewer13.d3(0);
                return;
            case 15:
                PhotoViewer photoViewer14 = this.f49504b;
                photoViewer14.f43432q5.f34696b.setLoading(false);
                photoViewer14.d3(0);
                return;
            case 16:
                PhotoViewer photoViewer15 = this.f49504b;
                Drawable[] drawableArr8 = PhotoViewer.f43272f9;
                photoViewer15.d0();
                return;
            case 17:
                PhotoViewer photoViewer16 = this.f49504b;
                Drawable[] drawableArr9 = PhotoViewer.f43272f9;
                photoViewer16.r3();
                return;
            case 18:
                PhotoViewer photoViewer17 = this.f49504b;
                Drawable[] drawableArr10 = PhotoViewer.f43272f9;
                photoViewer17.m3(true);
                return;
            case 19:
                PhotoViewer photoViewer18 = this.f49504b;
                if (photoViewer18.f43482w0.isEnabled()) {
                    Activity activity = photoViewer18.E;
                    Typeface typeface = org.telegram.messenger.g0.f24198a;
                    if (Settings.canDrawOverlays(activity) && l2.j.d().c() == null && photoViewer18.P3) {
                        if (photoViewer18.f43459t4) {
                            dq0 dq0Var = photoViewer18.f43343g0;
                            if (dq0Var != null) {
                                if ((!dq0Var.f36730y || !"inapp".equals(org.telegram.messenger.mp.u1(dq0Var.f36720a).D3)) && photoViewer18.f43343g0.e()) {
                                    photoViewer18.K3 = false;
                                    if (PhotoViewer.f43279m9 != null) {
                                        PhotoViewer.f43279m9.J0();
                                    }
                                    photoViewer18.J3 = true;
                                    PhotoViewer.f43279m9 = PhotoViewer.f43278l9;
                                    PhotoViewer.f43278l9 = null;
                                    photoViewer18.f43322e = false;
                                    wq0 wq0Var = photoViewer18.f43317d5;
                                    if (wq0Var != null) {
                                        ImageReceiver imageReceiver = wq0Var.f53726a;
                                        if (!imageReceiver.R0) {
                                            imageReceiver.P0(true, true);
                                        }
                                    }
                                    photoViewer18.f43398m6 = 1.0f;
                                    photoViewer18.f43334f0.invalidate();
                                    photoViewer18.M0();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        photoViewer18.K3 = false;
                        photoViewer18.g3();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                PhotoViewer photoViewer19 = this.f49504b;
                if (photoViewer19.f43322e && photoViewer19.f43405n4 == 0) {
                    photoViewer19.u3(photoViewer19.K);
                    return;
                }
                return;
            case 21:
                PhotoViewer photoViewer20 = this.f49504b;
                Drawable[] drawableArr11 = PhotoViewer.f43272f9;
                photoViewer20.D1();
                return;
            case 22:
                PhotoViewer photoViewer21 = this.f49504b;
                Drawable[] drawableArr12 = PhotoViewer.f43272f9;
                photoViewer21.y3();
                return;
            case 23:
                PhotoViewer photoViewer22 = this.f49504b;
                org.telegram.ui.Components.h61 h61Var = photoViewer22.G2;
                if (h61Var != null && photoViewer22.f43287a6 <= 1.35f) {
                    long S = h61Var.S();
                    long U = photoViewer22.G2.U();
                    if (S != -9223372036854775807L && U >= 8000) {
                        float f10 = photoViewer22.K7;
                        int g12 = photoViewer22.g1(photoViewer22.f43467u4);
                        if (U > 180000) {
                            int i7 = g12 / 3;
                            if (f10 < i7 * 2) {
                                if (f10 < i7) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.f43285a4.startRewind(photoViewer22.G2, z11, photoViewer22.f43464u1);
                            return;
                        }
                        if (f10 > g12 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.f43307c4.startRewind(photoViewer22.G2, z10, photoViewer22.K7, photoViewer22.f43464u1, photoViewer22.B1);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                PhotoViewer photoViewer23 = this.f49504b;
                photoViewer23.f43301b9 = false;
                wi.n nVar2 = photoViewer23.V8;
                if (nVar2 != null) {
                    nVar2.c();
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer24 = this.f49504b;
                if (photoViewer24.U4.isPopupShown()) {
                    VideoAds videoAds = photoViewer24.U4;
                    org.telegram.ui.Components.h61 h61Var2 = photoViewer24.G2;
                    if (h61Var2 != null) {
                        z11 = h61Var2.d0();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.h61 h61Var3 = photoViewer24.G2;
                    if (h61Var3 != null) {
                        h61Var3.g0();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.h61 h61Var4 = photoViewer24.G2;
                if (h61Var4 != null && photoViewer24.U4.videoWasPlaying) {
                    h61Var4.h0();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.qd0 qd0Var = this.f49504b.D1;
                og.f fVar = qd0Var.f38812c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                qd0Var.f38811b.l(true);
                return;
            case 27:
                PhotoViewer photoViewer25 = this.f49504b;
                Drawable[] drawableArr13 = PhotoViewer.f43272f9;
                photoViewer25.A3();
                return;
            case 28:
                PhotoViewer photoViewer26 = this.f49504b;
                Drawable[] drawableArr14 = PhotoViewer.f43272f9;
                photoViewer26.v2(true, 0, 0, false, true, false);
                return;
            default:
                PhotoViewer photoViewer27 = this.f49504b;
                Drawable[] drawableArr15 = PhotoViewer.f43272f9;
                photoViewer27.v2(true, 0, 0, false, false, false);
                return;
        }
    }
}
