package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
public final class gq0 implements Runnable {
    public final int f38593a;
    public final PhotoViewer f38594b;

    public gq0(PhotoViewer photoViewer, int i9) {
        this.f38593a = i9;
        this.f38594b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f38593a) {
            case 0:
                PhotoViewer photoViewer = this.f38594b;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.w0(false);
                org.telegram.ui.Components.pf0.f31622l0.k(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f38594b;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer2.e3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f38594b;
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer3.w2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f38594b;
                Drawable[] drawableArr4 = PhotoViewer.P8;
                photoViewer4.w2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f38594b;
                Drawable[] drawableArr5 = PhotoViewer.P8;
                photoViewer5.w2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f38594b;
                Drawable[] drawableArr6 = PhotoViewer.P8;
                photoViewer6.Z2();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f38594b;
                Drawable[] drawableArr7 = PhotoViewer.P8;
                photoViewer7.w2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f38594b;
                Drawable[] drawableArr8 = PhotoViewer.P8;
                photoViewer8.h2();
                return;
            case 8:
                org.telegram.ui.Components.be0 be0Var = this.f38594b.f35799y1;
                tf.e eVar = be0Var.f27184c;
                eVar.b(0.0f);
                eVar.setMirrored(false);
                eVar.setRotated(false);
                be0Var.f27183b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f38594b;
                Drawable[] drawableArr9 = PhotoViewer.P8;
                photoViewer9.l0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f38594b;
                photoViewer10.f35693m5.f32147b.setLoading(false);
                photoViewer10.e3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f38594b;
                photoViewer11.f35693m5.f32147b.setLoading(false);
                photoViewer11.e3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f38594b;
                Drawable[] drawableArr10 = PhotoViewer.P8;
                photoViewer12.e3(0);
                return;
            case 13:
                this.f38594b.f35685l5.R = false;
                return;
            case 14:
                this.f38594b.f35765u4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f38594b;
                photoViewer13.f35624e7 = null;
                photoViewer13.l0();
                photoViewer13.e3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f38594b;
                photoViewer14.f35693m5.f32147b.setLoading(false);
                photoViewer14.e3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f38594b;
                photoViewer15.f35693m5.f32147b.setLoading(false);
                photoViewer15.e3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f38594b;
                Drawable[] drawableArr11 = PhotoViewer.P8;
                photoViewer16.s3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f38594b;
                Drawable[] drawableArr12 = PhotoViewer.P8;
                photoViewer17.j0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f38594b;
                Drawable[] drawableArr13 = PhotoViewer.P8;
                photoViewer18.n3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f38594b;
                if (photoViewer19.f35733r0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f35797y) && !org.telegram.ui.Components.pf0.f31622l0.L && photoViewer19.L3) {
                    if (photoViewer19.f35719p4) {
                        gt0 gt0Var = photoViewer19.f35588b0;
                        if (gt0Var != null) {
                            if ((!gt0Var.f35295x || !"inapp".equals(MessagesController.getInstance(gt0Var.f35286a).youtubePipType)) && photoViewer19.f35588b0.e()) {
                                photoViewer19.G3 = false;
                                if (PhotoViewer.W8 != null) {
                                    PhotoViewer.W8.P0();
                                }
                                photoViewer19.F3 = true;
                                PhotoViewer.W8 = PhotoViewer.V8;
                                PhotoViewer.V8 = null;
                                photoViewer19.f35616e = false;
                                bu0 bu0Var = photoViewer19.Z4;
                                if (bu0Var != null && !bu0Var.f36978a.getVisible()) {
                                    photoViewer19.Z4.f36978a.setVisible(true, true);
                                }
                                photoViewer19.f35660i6 = 1.0f;
                                photoViewer19.f35580a0.invalidate();
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
                PhotoViewer photoViewer20 = this.f38594b;
                if (photoViewer20.f35616e && photoViewer20.f35667j4 == 0) {
                    photoViewer20.v3(photoViewer20.F);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f38594b;
                Drawable[] drawableArr14 = PhotoViewer.P8;
                photoViewer21.F1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f38594b;
                org.telegram.ui.Components.k61 k61Var = photoViewer22.B2;
                if (k61Var != null && photoViewer22.W5 <= 1.35f) {
                    long o6 = k61Var.o();
                    long q10 = photoViewer22.B2.q();
                    if (o6 != -9223372036854775807L && q10 >= 8000) {
                        float f10 = photoViewer22.f35814z7;
                        int k12 = photoViewer22.k1(photoViewer22.f35727q4);
                        if (q10 > 180000) {
                            int i9 = k12 / 3;
                            if (f10 < i9 * 2) {
                                if (f10 < i9) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.W3.startRewind(photoViewer22.B2, z11, photoViewer22.f35716p1);
                            return;
                        }
                        if (f10 > k12 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.Y3.startRewind(photoViewer22.B2, z10, photoViewer22.f35814z7, photoViewer22.f35716p1, photoViewer22.f35780w1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f38594b;
                if (photoViewer23.Q4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.Q4;
                    org.telegram.ui.Components.k61 k61Var2 = photoViewer23.B2;
                    if (k61Var2 != null) {
                        z11 = k61Var2.z();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.k61 k61Var3 = photoViewer23.B2;
                    if (k61Var3 != null) {
                        k61Var3.C();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.k61 k61Var4 = photoViewer23.B2;
                if (k61Var4 != null && photoViewer23.Q4.videoWasPlaying) {
                    k61Var4.D();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f38594b;
                Drawable[] drawableArr15 = PhotoViewer.P8;
                photoViewer24.F0(false, false);
                org.telegram.ui.Components.ki kiVar = photoViewer24.W1;
                if (kiVar != null) {
                    kiVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.o2 o2Var = photoViewer24.f35658i4;
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f38594b.f35670j7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f38594b;
                Drawable[] drawableArr16 = PhotoViewer.P8;
                photoViewer25.z3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f38594b;
                photoViewer26.f35808z1.e(photoViewer26.F2, photoViewer26.G2, photoViewer26.H2, photoViewer26.L2, photoViewer26.N2, photoViewer26.K2, photoViewer26.r2(true), photoViewer26.r2(true), photoViewer26.I2, photoViewer26.J2, 0.0f, 0.0f, photoViewer26.M2);
                photoViewer26.e3(0);
                return;
        }
    }
}
