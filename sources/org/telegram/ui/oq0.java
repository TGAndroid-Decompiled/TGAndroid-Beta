package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
public final class oq0 implements Runnable {
    public final int f39822a;
    public final PhotoViewer f39823b;

    public oq0(PhotoViewer photoViewer, int i10) {
        this.f39822a = i10;
        this.f39823b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10 = true;
        switch (this.f39822a) {
            case 0:
                PhotoViewer photoViewer = this.f39823b;
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.x0(false);
                org.telegram.ui.Components.ng0.m0.k(true, true);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f39823b;
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                photoViewer2.e3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f39823b;
                Drawable[] drawableArr3 = PhotoViewer.Q8;
                photoViewer3.w2(true, 0, 0, false, true, false);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f39823b;
                Drawable[] drawableArr4 = PhotoViewer.Q8;
                photoViewer4.w2(true, 0, 0, false, false, false);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f39823b;
                Drawable[] drawableArr5 = PhotoViewer.Q8;
                photoViewer5.w2(false, 0, 0, true, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f39823b;
                Drawable[] drawableArr6 = PhotoViewer.Q8;
                photoViewer6.Z2();
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f39823b;
                Drawable[] drawableArr7 = PhotoViewer.Q8;
                photoViewer7.w2(false, 0, 0, false, false, false);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f39823b;
                Drawable[] drawableArr8 = PhotoViewer.Q8;
                photoViewer8.h2();
                return;
            case 8:
                org.telegram.ui.Components.af0 af0Var = this.f39823b.f34450z1;
                zf.e eVar = af0Var.f25249c;
                eVar.b(0.0f);
                eVar.setMirrored(false);
                eVar.setRotated(false);
                af0Var.f25248b.l(true);
                return;
            case 9:
                PhotoViewer photoViewer9 = this.f39823b;
                Drawable[] drawableArr9 = PhotoViewer.Q8;
                photoViewer9.m0();
                return;
            case 10:
                PhotoViewer photoViewer10 = this.f39823b;
                photoViewer10.f34343n5.f30385b.setLoading(false);
                photoViewer10.e3(0);
                return;
            case 11:
                PhotoViewer photoViewer11 = this.f39823b;
                photoViewer11.f34343n5.f30385b.setLoading(false);
                photoViewer11.e3(0);
                return;
            case 12:
                PhotoViewer photoViewer12 = this.f39823b;
                Drawable[] drawableArr10 = PhotoViewer.Q8;
                photoViewer12.e3(0);
                return;
            case 13:
                this.f39823b.f34333m5.S = false;
                return;
            case 14:
                this.f39823b.f34414v4.setBackground(null);
                return;
            case 15:
                PhotoViewer photoViewer13 = this.f39823b;
                photoViewer13.f34274f7 = null;
                photoViewer13.m0();
                photoViewer13.e3(0);
                return;
            case 16:
                PhotoViewer photoViewer14 = this.f39823b;
                photoViewer14.f34343n5.f30385b.setLoading(false);
                photoViewer14.e3(0);
                return;
            case 17:
                PhotoViewer photoViewer15 = this.f39823b;
                photoViewer15.f34343n5.f30385b.setLoading(false);
                photoViewer15.e3(0);
                return;
            case 18:
                PhotoViewer photoViewer16 = this.f39823b;
                Drawable[] drawableArr11 = PhotoViewer.Q8;
                photoViewer16.s3();
                return;
            case 19:
                PhotoViewer photoViewer17 = this.f39823b;
                Drawable[] drawableArr12 = PhotoViewer.Q8;
                photoViewer17.k0();
                return;
            case 20:
                PhotoViewer photoViewer18 = this.f39823b;
                Drawable[] drawableArr13 = PhotoViewer.Q8;
                photoViewer18.n3(true);
                return;
            case 21:
                PhotoViewer photoViewer19 = this.f39823b;
                if (photoViewer19.f34385s0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.f34439y) && !org.telegram.ui.Components.ng0.m0.M && photoViewer19.M3) {
                    if (photoViewer19.f34369q4) {
                        pt0 pt0Var = photoViewer19.f34240c0;
                        if (pt0Var != null) {
                            if ((!pt0Var.f33068x || !"inapp".equals(MessagesController.getInstance(pt0Var.f33059a).youtubePipType)) && photoViewer19.f34240c0.e()) {
                                photoViewer19.H3 = false;
                                if (PhotoViewer.X8 != null) {
                                    PhotoViewer.X8.P0();
                                }
                                photoViewer19.G3 = true;
                                PhotoViewer.X8 = PhotoViewer.W8;
                                PhotoViewer.W8 = null;
                                photoViewer19.f34257e = false;
                                lu0 lu0Var = photoViewer19.f34225a5;
                                if (lu0Var != null && !lu0Var.f38864a.getVisible()) {
                                    photoViewer19.f34225a5.f38864a.setVisible(true, true);
                                }
                                photoViewer19.f34309j6 = 1.0f;
                                photoViewer19.f34230b0.invalidate();
                                photoViewer19.S0();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer19.H3 = false;
                    photoViewer19.h3();
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer20 = this.f39823b;
                if (photoViewer20.f34257e && photoViewer20.f34316k4 == 0) {
                    photoViewer20.v3(photoViewer20.G);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer21 = this.f39823b;
                Drawable[] drawableArr14 = PhotoViewer.Q8;
                photoViewer21.F1();
                return;
            case 24:
                PhotoViewer photoViewer22 = this.f39823b;
                org.telegram.ui.Components.k71 k71Var = photoViewer22.C2;
                if (k71Var != null && photoViewer22.X5 <= 1.35f) {
                    long n10 = k71Var.n();
                    long p10 = photoViewer22.C2.p();
                    if (n10 != -9223372036854775807L && p10 >= 8000) {
                        float f10 = photoViewer22.A7;
                        int k12 = photoViewer22.k1(photoViewer22.f34379r4);
                        if (p10 > 180000) {
                            int i10 = k12 / 3;
                            if (f10 < i10 * 2) {
                                if (f10 < i10) {
                                    z10 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer22.X3.startRewind(photoViewer22.C2, z10, photoViewer22.f34366q1);
                            return;
                        }
                        if (f10 > k12 / 3) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        photoViewer22.Z3.startRewind(photoViewer22.C2, z4, photoViewer22.A7, photoViewer22.f34366q1, photoViewer22.f34431x1);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PhotoViewer photoViewer23 = this.f39823b;
                if (photoViewer23.R4.isPopupShown()) {
                    VideoAds videoAds = photoViewer23.R4;
                    org.telegram.ui.Components.k71 k71Var2 = photoViewer23.C2;
                    if (k71Var2 != null) {
                        z10 = k71Var2.y();
                    }
                    videoAds.videoWasPlaying = z10;
                    org.telegram.ui.Components.k71 k71Var3 = photoViewer23.C2;
                    if (k71Var3 != null) {
                        k71Var3.B();
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.k71 k71Var4 = photoViewer23.C2;
                if (k71Var4 != null && photoViewer23.R4.videoWasPlaying) {
                    k71Var4.C();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer24 = this.f39823b;
                Drawable[] drawableArr15 = PhotoViewer.Q8;
                photoViewer24.G0(false, false);
                org.telegram.ui.Components.mi miVar = photoViewer24.X1;
                if (miVar != null) {
                    miVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.p2 p2Var = photoViewer24.f34307j4;
                if (p2Var != null) {
                    p2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 27:
                this.f39823b.f34319k7 = null;
                return;
            case 28:
                PhotoViewer photoViewer25 = this.f39823b;
                Drawable[] drawableArr16 = PhotoViewer.Q8;
                photoViewer25.z3();
                return;
            default:
                PhotoViewer photoViewer26 = this.f39823b;
                photoViewer26.A1.e(photoViewer26.G2, photoViewer26.H2, photoViewer26.I2, photoViewer26.M2, photoViewer26.O2, photoViewer26.L2, photoViewer26.r2(true), photoViewer26.r2(true), photoViewer26.J2, photoViewer26.K2, 0.0f, 0.0f, photoViewer26.N2);
                photoViewer26.e3(0);
                return;
        }
    }
}
