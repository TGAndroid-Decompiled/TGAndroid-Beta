package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ms0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.u61, org.telegram.ui.Components.g71, org.telegram.ui.Components.te0 {
    public final PhotoViewer f35384a;

    public ms0(PhotoViewer photoViewer) {
        this.f35384a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f35384a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.rr.f27701f).setDuration(150L).withEndAction(new org.telegram.ui.Components.sr0(7, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        bu0 bu0Var;
        PhotoViewer photoViewer = this.f35384a;
        if (photoViewer.F2 == null && ((bu0Var = photoViewer.f30917f0) == null || !bu0Var.f27337x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f30873a3 = f7;
        } else {
            photoViewer.s2((int) (f7 * ((float) A1)));
        }
        photoViewer.a3(false);
        photoViewer.f31051u3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f35384a;
        if (photoViewer.f30971l3 && photoViewer.P3) {
            photoViewer.r2();
        }
    }

    @Override
    public void d(float f7) {
        ft0 ft0Var;
        ft0 ft0Var2;
        PhotoViewer photoViewer = this.f35384a;
        bu0 bu0Var = photoViewer.f30917f0;
        if (bu0Var != null && bu0Var.f27337x && (ft0Var2 = photoViewer.f31033s3) != null) {
            int i10 = photoViewer.f31014q3.h - org.telegram.ui.Components.h71.S;
            ft0Var2.N = bu0Var;
            if (ft0Var2.W != 0) {
                ft0Var2.W = 0L;
                ft0Var2.f26120f0 = null;
                ft0Var2.f26118e0 = null;
                ft0Var2.f26117d0 = null;
                ft0Var2.b(-1);
            }
            if (i10 != 0) {
                ft0Var2.f26123r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (ft0Var2.f26122n != i11) {
                    ft0Var2.f26122n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((bu0Var.getVideoDuration() * f7) / 1000));
            ft0Var2.f26127y = formatShortDuration;
            ft0Var2.E = (int) Math.ceil(ft0Var2.F.measureText(formatShortDuration));
            ft0Var2.invalidate();
            if (ft0Var2.f26119f != null) {
                Utilities.globalQueue.cancelRunnable(ft0Var2.f26119f);
            }
            double videoDuration = (f7 * bu0Var.getVideoDuration()) / 1000.0d;
            ft0Var2.O = videoDuration;
            String c10 = bu0Var.c((int) videoDuration);
            if (c10 != null) {
                ft0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (ft0Var = photoViewer.f31033s3) != null) {
            ft0Var.e(photoViewer.T4, f7, photoViewer.f31014q3.h - org.telegram.ui.Components.h71.S);
        }
        this.f35384a.a3(true);
        PhotoViewer.X(this.f35384a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f35384a;
        if (photoViewer.f30971l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f31079x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f35384a;
        org.telegram.ui.Components.f71 f71Var = photoViewer.F2;
        if (f71Var == null) {
            return;
        }
        f71Var.K(((float) f71Var.p()) * photoViewer.f31075w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f31075w8);
        photoViewer.u0();
        jl0 jl0Var = new jl0(this, 18);
        photoViewer.I2 = jl0Var;
        AndroidUtilities.runOnUIThread(jl0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f35384a.f30908e0.invalidate();
    }
}
