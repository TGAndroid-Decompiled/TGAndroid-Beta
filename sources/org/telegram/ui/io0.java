package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.Utilities;
public final class io0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.c51, org.telegram.ui.Components.n51, org.telegram.ui.Components.zc0 {
    public final PhotoViewer f46322a;

    public io0(PhotoViewer photoViewer) {
        this.f46322a = photoViewer;
    }

    public void a(boolean z10) {
        float f10;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f46322a;
        if (photoViewer.W0.isClickable() != z11) {
            photoViewer.W0.setClickable(z11);
            photoViewer.W0.setVisibility(0);
            photoViewer.W0.clearAnimation();
            ViewPropertyAnimator animate = photoViewer.W0.animate();
            if (!z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.xq.f40452f).setDuration(150L).withEndAction(new org.telegram.ui.Components.up0(10, photoViewer, z11));
        }
    }

    public void b() {
        PhotoViewer photoViewer = this.f46322a;
        org.telegram.ui.Components.m51 m51Var = photoViewer.G2;
        if (m51Var == null) {
            return;
        }
        m51Var.p0(((float) m51Var.U()) * photoViewer.f41586x8);
        photoViewer.G2.g0();
        photoViewer.T7.setProgress(photoViewer.f41586x8);
        photoViewer.v0();
        sg0 sg0Var = new sg0(this, 21);
        photoViewer.J2 = sg0Var;
        org.telegram.messenger.g0.i3(sg0Var, 860L);
    }

    @Override
    public void c(float f10) {
        tp0 tp0Var;
        PhotoViewer photoViewer = this.f46322a;
        if (photoViewer.G2 == null && ((tp0Var = photoViewer.f41429g0) == null || !tp0Var.f38729y)) {
            return;
        }
        if (!photoViewer.C8 && photoViewer.S7.getVisibility() == 0) {
            f10 = ((photoViewer.T7.getRightProgress() - photoViewer.T7.getLeftProgress()) * f10) + photoViewer.T7.getLeftProgress();
        }
        long C1 = photoViewer.C1();
        if (C1 == -9223372036854775807L) {
            photoViewer.f41385b3 = f10;
        } else {
            photoViewer.w2((int) (f10 * ((float) C1)));
        }
        photoViewer.e3(false);
        photoViewer.f41561v3 = false;
    }

    @Override
    public void d(float f10) {
        ap0 ap0Var;
        ap0 ap0Var2;
        PhotoViewer photoViewer = this.f46322a;
        tp0 tp0Var = photoViewer.f41429g0;
        if (tp0Var != null && tp0Var.f38729y && (ap0Var2 = photoViewer.f41543t3) != null) {
            int i3 = photoViewer.f41526r3.h - org.telegram.ui.Components.o51.S;
            ap0Var2.O = tp0Var;
            if (ap0Var2.f37914a0 != 0) {
                ap0Var2.f37914a0 = 0L;
                ap0Var2.f37924g0 = null;
                ap0Var2.f37923f0 = null;
                ap0Var2.f37921e0 = null;
                ap0Var2.b(-1);
            }
            if (i3 != 0) {
                ap0Var2.f37927r = i3;
                int i10 = ((int) (i3 * f10)) / 5;
                if (ap0Var2.f37926n != i10) {
                    ap0Var2.f37926n = i10;
                }
            }
            String g02 = org.telegram.messenger.g0.g0((int) ((tp0Var.getVideoDuration() * f10) / 1000), false, false);
            ap0Var2.E = g02;
            ap0Var2.F = (int) Math.ceil(ap0Var2.G.measureText(g02));
            ap0Var2.invalidate();
            if (ap0Var2.f37922f != null) {
                Utilities.f21387e.a(ap0Var2.f37922f);
            }
            double videoDuration = (f10 * tp0Var.getVideoDuration()) / 1000.0d;
            ap0Var2.P = videoDuration;
            String c2 = tp0Var.c((int) videoDuration);
            if (c2 != null) {
                ap0Var2.R.o0(c2, null, null, null, 0L);
            }
        } else if (photoViewer.G2 != null && (ap0Var = photoViewer.f41543t3) != null) {
            ap0Var.e(photoViewer.U4, f10, photoViewer.f41526r3.h - org.telegram.ui.Components.o51.S);
        }
        this.f46322a.e3(true);
        PhotoViewer.X(this.f46322a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f46322a;
        if (photoViewer.f41480m3 && photoViewer.Q3) {
            photoViewer.v2();
        }
    }

    @Override
    public void g() {
        PhotoViewer photoViewer = this.f46322a;
        if (photoViewer.f41480m3 && photoViewer.Q3) {
            org.telegram.messenger.g0.r(photoViewer.f41590y2);
        }
    }

    @Override
    public void invalidate() {
        this.f46322a.f41420f0.invalidate();
    }
}
