package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ls0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.j71, org.telegram.ui.Components.t71, org.telegram.ui.Components.df0 {
    public final PhotoViewer f35410a;

    public ls0(PhotoViewer photoViewer) {
        this.f35410a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f35410a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.rr.f28031f).setDuration(150L).withEndAction(new org.telegram.ui.Components.yr0(8, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        au0 au0Var;
        PhotoViewer photoViewer = this.f35410a;
        if (photoViewer.F2 == null && ((au0Var = photoViewer.f31233f0) == null || !au0Var.f22684x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f31189a3 = f7;
        } else {
            photoViewer.s2((int) (f7 * ((float) A1)));
        }
        photoViewer.a3(false);
        photoViewer.f31367u3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f35410a;
        if (photoViewer.f31287l3 && photoViewer.P3) {
            photoViewer.r2();
        }
    }

    @Override
    public void d(float f7) {
        et0 et0Var;
        et0 et0Var2;
        PhotoViewer photoViewer = this.f35410a;
        au0 au0Var = photoViewer.f31233f0;
        if (au0Var != null && au0Var.f22684x && (et0Var2 = photoViewer.f31349s3) != null) {
            int i10 = photoViewer.f31330q3.h - org.telegram.ui.Components.u71.S;
            et0Var2.N = au0Var;
            if (et0Var2.W != 0) {
                et0Var2.W = 0L;
                et0Var2.f22624f0 = null;
                et0Var2.f22622e0 = null;
                et0Var2.f22621d0 = null;
                et0Var2.b(-1);
            }
            if (i10 != 0) {
                et0Var2.f22627r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (et0Var2.f22626n != i11) {
                    et0Var2.f22626n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((au0Var.getVideoDuration() * f7) / 1000));
            et0Var2.f22631y = formatShortDuration;
            et0Var2.E = (int) Math.ceil(et0Var2.F.measureText(formatShortDuration));
            et0Var2.invalidate();
            if (et0Var2.f22623f != null) {
                Utilities.globalQueue.cancelRunnable(et0Var2.f22623f);
            }
            double videoDuration = (f7 * au0Var.getVideoDuration()) / 1000.0d;
            et0Var2.O = videoDuration;
            String c10 = au0Var.c((int) videoDuration);
            if (c10 != null) {
                et0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (et0Var = photoViewer.f31349s3) != null) {
            et0Var.e(photoViewer.T4, f7, photoViewer.f31330q3.h - org.telegram.ui.Components.u71.S);
        }
        this.f35410a.a3(true);
        PhotoViewer.X(this.f35410a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f35410a;
        if (photoViewer.f31287l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f31395x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f35410a;
        org.telegram.ui.Components.s71 s71Var = photoViewer.F2;
        if (s71Var == null) {
            return;
        }
        s71Var.K(((float) s71Var.p()) * photoViewer.f31391w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f31391w8);
        photoViewer.u0();
        il0 il0Var = new il0(this, 18);
        photoViewer.I2 = il0Var;
        AndroidUtilities.runOnUIThread(il0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f35410a.f31224e0.invalidate();
    }
}
