package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
public final class mr0 implements Runnable {
    public final int f38055a;
    public final PhotoViewer f38056b;

    public mr0(PhotoViewer photoViewer, int i10) {
        this.f38055a = i10;
        this.f38056b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        switch (this.f38055a) {
            case 0:
                PhotoViewer photoViewer = this.f38056b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.x0(false);
                org.telegram.ui.Components.fh0.f24733p0.k(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f38056b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer2.e3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f38056b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer3.w2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f38056b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer4.w2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f38056b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer5.w2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f38056b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer6.Z2();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f38056b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer7.w2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f38056b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer8.i2();
                return;
            case 8:
                org.telegram.ui.Components.uf0 uf0Var = this.f38056b.C1;
                mg.f fVar = uf0Var.f29368c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                uf0Var.f29367b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f38056b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer9.m0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f38056b;
                photoViewer10.f32037q5.f26386b.setLoading(false);
                photoViewer10.e3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f38056b;
                photoViewer11.f32037q5.f26386b.setLoading(false);
                photoViewer11.e3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f38056b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer12.e3(0);
                return;
            case 13:
                this.f38056b.p5.V = false;
                return;
            case 14:
                this.f38056b.f32111y4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f38056b;
                photoViewer13.f31970i7 = null;
                photoViewer13.m0();
                photoViewer13.e3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f38056b;
                photoViewer14.f32037q5.f26386b.setLoading(false);
                photoViewer14.e3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f38056b;
                photoViewer15.f32037q5.f26386b.setLoading(false);
                photoViewer15.e3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f38056b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                photoViewer16.s3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f38056b;
                Drawable[] drawableArr12 = PhotoViewer.U8;
                photoViewer17.k0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f38056b;
                Drawable[] drawableArr13 = PhotoViewer.U8;
                photoViewer18.n3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f38056b;
                if (photoViewer19.f32078v0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f32107y) && !org.telegram.ui.Components.fh0.f24733p0.P && photoViewer19.P3) {
                    if (photoViewer19.f32064t4) {
                        ou0 ou0Var = photoViewer19.f31937f0;
                        if (ou0Var != null) {
                            if ((!ou0Var.f28531x || !"inapp".equals(MessagesController.getInstance(ou0Var.f28523a).youtubePipType)) && photoViewer19.f31937f0.e()) {
                                photoViewer19.K3 = false;
                                if (PhotoViewer.f31889b9 != null) {
                                    PhotoViewer.f31889b9.P0();
                                }
                                photoViewer19.J3 = true;
                                PhotoViewer.f31889b9 = PhotoViewer.f31888a9;
                                PhotoViewer.f31888a9 = null;
                                photoViewer19.e = false;
                                jv0 jv0Var = photoViewer19.f31924d5;
                                if (jv0Var != null && !jv0Var.f37145a.getVisible()) {
                                    photoViewer19.f31924d5.f37145a.setVisible(true, true);
                                }
                                photoViewer19.f32002m6 = 1.0f;
                                photoViewer19.f31928e0.invalidate();
                                photoViewer19.S0();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer19.K3 = false;
                    photoViewer19.h3();
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer20 = this.f38056b;
                if (photoViewer20.e && photoViewer20.f32010n4 == 0) {
                    photoViewer20.v3(photoViewer20.J);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f38056b;
                Drawable[] drawableArr14 = PhotoViewer.U8;
                photoViewer21.G1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f38056b;
                org.telegram.ui.Components.i81 i81Var = photoViewer22.F2;
                if (i81Var != null && photoViewer22.f31896a6 <= 1.35f) {
                    long n10 = i81Var.n();
                    long p5 = photoViewer22.F2.p();
                    if (n10 != -9223372036854775807L && p5 >= 8000) {
                        float f7 = photoViewer22.E7;
                        int k12 = photoViewer22.k1(photoViewer22.f32073u4);
                        if (p5 > 180000) {
                            int i10 = k12 / 3;
                            if (f7 < i10 * 2) {
                                if (f7 < i10) {
                                    z11 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.f31894a4.startRewind(photoViewer22.F2, z11, photoViewer22.f32061t1);
                            return;
                        }
                        if (f7 > k12 / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        photoViewer22.f31914c4.startRewind(photoViewer22.F2, z10, photoViewer22.E7, photoViewer22.f32061t1, photoViewer22.A1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f38056b;
                if (photoViewer23.U4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.U4;
                    org.telegram.ui.Components.i81 i81Var2 = photoViewer23.F2;
                    if (i81Var2 != null) {
                        z11 = i81Var2.y();
                    }
                    videoAds.videoWasPlaying = z11;
                    org.telegram.ui.Components.i81 i81Var3 = photoViewer23.F2;
                    if (i81Var3 != null) {
                        i81Var3.B();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.i81 i81Var4 = photoViewer23.F2;
                if (i81Var4 != null && photoViewer23.U4.videoWasPlaying) {
                    i81Var4.C();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f38056b;
                Drawable[] drawableArr15 = PhotoViewer.U8;
                photoViewer24.G0(false, false);
                org.telegram.ui.Components.vi viVar = photoViewer24.a2;
                if (viVar != null) {
                    viVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.m2 m2Var = photoViewer24.f32000m4;
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f38056b.f32013n7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f38056b;
                Drawable[] drawableArr16 = PhotoViewer.U8;
                photoViewer25.z3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f38056b;
                photoViewer26.D1.e(photoViewer26.J2, photoViewer26.K2, photoViewer26.L2, photoViewer26.P2, photoViewer26.R2, photoViewer26.O2, photoViewer26.r2(true), photoViewer26.r2(true), photoViewer26.M2, photoViewer26.N2, 0.0f, 0.0f, photoViewer26.Q2);
                photoViewer26.e3(0);
                return;
        }
    }
}
