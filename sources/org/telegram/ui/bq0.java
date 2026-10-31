package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.Utilities;
public final class bq0 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.l61, org.telegram.ui.Components.v61, org.telegram.ui.Components.ae0 {
    public final PhotoViewer f36296a;

    public bq0(PhotoViewer photoViewer) {
        this.f36296a = photoViewer;
    }

    @Override
    public void a() {
        PhotoViewer photoViewer = this.f36296a;
        if (photoViewer.f33534l3 && photoViewer.P3) {
            photoViewer.v2();
        }
    }

    public void b(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f36296a;
        if (photoViewer.V0.isClickable() != z11) {
            photoViewer.V0.setClickable(z11);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            ViewPropertyAnimator animate = photoViewer.V0.animate();
            if (!z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.gr.f26495f).setDuration(150L).withEndAction(new k2.v(29, photoViewer, z11));
        }
    }

    @Override
    public void c(float f7) {
        mr0 mr0Var;
        PhotoViewer photoViewer = this.f36296a;
        if (photoViewer.F2 == null && ((mr0Var = photoViewer.f33479f0) == null || !mr0Var.f31243y)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long C1 = photoViewer.C1();
        if (C1 == -9223372036854775807L) {
            photoViewer.f33435a3 = f7;
        } else {
            photoViewer.w2((int) (f7 * ((float) C1)));
        }
        photoViewer.e3(false);
        photoViewer.f33614u3 = false;
    }

    @Override
    public void d(float f7) {
        tq0 tq0Var;
        tq0 tq0Var2;
        PhotoViewer photoViewer = this.f36296a;
        mr0 mr0Var = photoViewer.f33479f0;
        if (mr0Var != null && mr0Var.f31243y && (tq0Var2 = photoViewer.f33596s3) != null) {
            int i10 = photoViewer.f33577q3.h - org.telegram.ui.Components.w61.S;
            tq0Var2.N = mr0Var;
            if (tq0Var2.W != 0) {
                tq0Var2.W = 0L;
                tq0Var2.f24572f0 = null;
                tq0Var2.f24570e0 = null;
                tq0Var2.f24569d0 = null;
                tq0Var2.b(-1);
            }
            if (i10 != 0) {
                tq0Var2.f24575r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (tq0Var2.f24574n != i11) {
                    tq0Var2.f24574n = i11;
                }
            }
            String g02 = org.telegram.messenger.i0.g0((int) ((mr0Var.getVideoDuration() * f7) / 1000), false, false);
            tq0Var2.D = g02;
            tq0Var2.E = (int) Math.ceil(tq0Var2.F.measureText(g02));
            tq0Var2.invalidate();
            if (tq0Var2.f24571f != null) {
                Utilities.e.a(tq0Var2.f24571f);
            }
            double videoDuration = (f7 * mr0Var.getVideoDuration()) / 1000.0d;
            tq0Var2.O = videoDuration;
            String c10 = mr0Var.c((int) videoDuration);
            if (c10 != null) {
                tq0Var2.Q.o0(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (tq0Var = photoViewer.f33596s3) != null) {
            tq0Var.e(photoViewer.T4, f7, photoViewer.f33577q3.h - org.telegram.ui.Components.w61.S);
        }
        this.f36296a.e3(true);
        PhotoViewer.Y(this.f36296a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f36296a;
        if (photoViewer.f33534l3 && photoViewer.P3) {
            org.telegram.messenger.i0.r(photoViewer.f33642x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f36296a;
        org.telegram.ui.Components.u61 u61Var = photoViewer.F2;
        if (u61Var == null) {
            return;
        }
        u61Var.p0(((float) u61Var.U()) * photoViewer.f33638w8);
        photoViewer.F2.g0();
        photoViewer.S7.setProgress(photoViewer.f33638w8);
        photoViewer.v0();
        mg0 mg0Var = new mg0(this, 22);
        photoViewer.I2 = mg0Var;
        org.telegram.messenger.i0.h3(mg0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f36296a.f33470e0.invalidate();
    }
}
