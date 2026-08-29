package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
public final class gq0 implements Runnable {
    public final int f38649a;
    public final PhotoViewer f38650b;

    public gq0(PhotoViewer photoViewer, int i10) {
        this.f38649a = i10;
        this.f38650b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f38649a) {
            case 0:
                PhotoViewer photoViewer = this.f38650b;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.x0(false);
                org.telegram.ui.Components.bg0.f27076l0.k(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f38650b;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer2.e3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f38650b;
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer3.w2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f38650b;
                Drawable[] drawableArr4 = PhotoViewer.P8;
                photoViewer4.w2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f38650b;
                Drawable[] drawableArr5 = PhotoViewer.P8;
                photoViewer5.w2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f38650b;
                Drawable[] drawableArr6 = PhotoViewer.P8;
                photoViewer6.Z2();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f38650b;
                Drawable[] drawableArr7 = PhotoViewer.P8;
                photoViewer7.w2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f38650b;
                Drawable[] drawableArr8 = PhotoViewer.P8;
                photoViewer8.h2();
                return;
            case 8:
                org.telegram.ui.Components.pe0 pe0Var = this.f38650b.f35866y1;
                wf.e eVar = pe0Var.f31658c;
                eVar.b(0.0f);
                eVar.setMirrored(false);
                eVar.setRotated(false);
                pe0Var.f31657b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f38650b;
                Drawable[] drawableArr9 = PhotoViewer.P8;
                photoViewer9.m0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f38650b;
                photoViewer10.f35759m5.f28391b.setLoading(false);
                photoViewer10.e3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f38650b;
                photoViewer11.f35759m5.f28391b.setLoading(false);
                photoViewer11.e3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f38650b;
                Drawable[] drawableArr10 = PhotoViewer.P8;
                photoViewer12.e3(0);
                return;
            case 13:
                this.f38650b.f35751l5.R = false;
                return;
            case 14:
                this.f38650b.f35831u4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f38650b;
                photoViewer13.f35690e7 = null;
                photoViewer13.m0();
                photoViewer13.e3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f38650b;
                photoViewer14.f35759m5.f28391b.setLoading(false);
                photoViewer14.e3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f38650b;
                photoViewer15.f35759m5.f28391b.setLoading(false);
                photoViewer15.e3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f38650b;
                Drawable[] drawableArr11 = PhotoViewer.P8;
                photoViewer16.s3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f38650b;
                Drawable[] drawableArr12 = PhotoViewer.P8;
                photoViewer17.k0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f38650b;
                Drawable[] drawableArr13 = PhotoViewer.P8;
                photoViewer18.n3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f38650b;
                if (photoViewer19.f35800r0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f35864y) && !org.telegram.ui.Components.bg0.f27076l0.L && photoViewer19.L3) {
                    if (photoViewer19.f35786p4) {
                        et0 et0Var = photoViewer19.f35656b0;
                        if (et0Var != null) {
                            if ((!et0Var.f30680x || !"inapp".equals(MessagesController.getInstance(et0Var.f30671a).youtubePipType)) && photoViewer19.f35656b0.e()) {
                                photoViewer19.G3 = false;
                                if (PhotoViewer.W8 != null) {
                                    PhotoViewer.W8.P0();
                                }
                                photoViewer19.F3 = true;
                                PhotoViewer.W8 = PhotoViewer.V8;
                                PhotoViewer.V8 = null;
                                photoViewer19.f35682e = false;
                                zt0 zt0Var = photoViewer19.Z4;
                                if (zt0Var != null && !zt0Var.f45316a.getVisible()) {
                                    photoViewer19.Z4.f45316a.setVisible(true, true);
                                }
                                photoViewer19.f35726i6 = 1.0f;
                                photoViewer19.f35647a0.invalidate();
                                photoViewer19.S0();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer19.G3 = false;
                    photoViewer19.h3();
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer20 = this.f38650b;
                if (photoViewer20.f35682e && photoViewer20.f35733j4 == 0) {
                    photoViewer20.v3(photoViewer20.F);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f38650b;
                Drawable[] drawableArr14 = PhotoViewer.P8;
                photoViewer21.F1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f38650b;
                org.telegram.ui.Components.x61 x61Var = photoViewer22.B2;
                if (x61Var != null && photoViewer22.W5 <= 1.35f) {
                    long o10 = x61Var.o();
                    long q6 = photoViewer22.B2.q();
                    if (o10 != -9223372036854775807L && q6 >= 8000) {
                        float f9 = photoViewer22.f35880z7;
                        int k12 = photoViewer22.k1(photoViewer22.f35795q4);
                        if (q6 > 180000) {
                            int i10 = k12 / 3;
                            if (f9 < i10 * 2) {
                                if (f9 < i10) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.W3.startRewind(photoViewer22.B2, z11, photoViewer22.f35783p1);
                            return;
                        }
                        if (f9 > k12 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.Y3.startRewind(photoViewer22.B2, z10, photoViewer22.f35880z7, photoViewer22.f35783p1, photoViewer22.f35847w1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f38650b;
                if (photoViewer23.Q4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.Q4;
                    org.telegram.ui.Components.x61 x61Var2 = photoViewer23.B2;
                    if (x61Var2 != null) {
                        z11 = x61Var2.z();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.x61 x61Var3 = photoViewer23.B2;
                    if (x61Var3 != null) {
                        x61Var3.C();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.x61 x61Var4 = photoViewer23.B2;
                if (x61Var4 != null && photoViewer23.Q4.videoWasPlaying) {
                    x61Var4.D();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f38650b;
                Drawable[] drawableArr15 = PhotoViewer.P8;
                photoViewer24.G0(false, false);
                org.telegram.ui.Components.ni niVar = photoViewer24.W1;
                if (niVar != null) {
                    niVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.o2 o2Var = photoViewer24.f35724i4;
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f38650b.f35736j7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f38650b;
                Drawable[] drawableArr16 = PhotoViewer.P8;
                photoViewer25.z3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f38650b;
                photoViewer26.f35874z1.e(photoViewer26.F2, photoViewer26.G2, photoViewer26.H2, photoViewer26.L2, photoViewer26.N2, photoViewer26.K2, photoViewer26.r2(true), photoViewer26.r2(true), photoViewer26.I2, photoViewer26.J2, 0.0f, 0.0f, photoViewer26.M2);
                photoViewer26.e3(0);
                return;
        }
    }
}
