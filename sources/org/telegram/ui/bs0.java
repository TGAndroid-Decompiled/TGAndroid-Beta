package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class bs0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.q71, org.telegram.ui.Components.b81, org.telegram.ui.Components.mf0 {
    public final PhotoViewer f35737a;

    public bs0(PhotoViewer photoViewer) {
        this.f35737a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f35737a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.bs.f25030f).setDuration(150L).withEndAction(new org.telegram.ui.Components.b60(13, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        qt0 qt0Var;
        PhotoViewer photoViewer = this.f35737a;
        if (photoViewer.F2 == null && ((qt0Var = photoViewer.f33275f0) == null || !qt0Var.f27871x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f33231a3 = f7;
        } else {
            photoViewer.t2((int) (f7 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f33410u3 = false;
    }

    @Override
    public void c(float f7) {
        us0 us0Var;
        us0 us0Var2;
        PhotoViewer photoViewer = this.f35737a;
        qt0 qt0Var = photoViewer.f33275f0;
        if (qt0Var != null && qt0Var.f27871x && (us0Var2 = photoViewer.f33392s3) != null) {
            int i10 = photoViewer.f33373q3.h - org.telegram.ui.Components.c81.S;
            us0Var2.N = qt0Var;
            if (us0Var2.W != 0) {
                us0Var2.W = 0L;
                us0Var2.f26802f0 = null;
                us0Var2.f26800e0 = null;
                us0Var2.f26799d0 = null;
                us0Var2.b(-1);
            }
            if (i10 != 0) {
                us0Var2.f26805r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (us0Var2.f26804n != i11) {
                    us0Var2.f26804n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((qt0Var.getVideoDuration() * f7) / 1000));
            us0Var2.f26809y = formatShortDuration;
            us0Var2.E = (int) Math.ceil(us0Var2.F.measureText(formatShortDuration));
            us0Var2.invalidate();
            if (us0Var2.f26801f != null) {
                Utilities.globalQueue.cancelRunnable(us0Var2.f26801f);
            }
            double videoDuration = (f7 * qt0Var.getVideoDuration()) / 1000.0d;
            us0Var2.O = videoDuration;
            String c10 = qt0Var.c((int) videoDuration);
            if (c10 != null) {
                us0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (us0Var = photoViewer.f33392s3) != null) {
            us0Var.e(photoViewer.T4, f7, photoViewer.f33373q3.h - org.telegram.ui.Components.c81.S);
        }
        this.f35737a.b3(true);
        PhotoViewer.X(this.f35737a);
    }

    public void d() {
        PhotoViewer photoViewer = this.f35737a;
        org.telegram.ui.Components.a81 a81Var = photoViewer.F2;
        if (a81Var == null) {
            return;
        }
        a81Var.K(((float) a81Var.p()) * photoViewer.f33434w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f33434w8);
        photoViewer.u0();
        ek0 ek0Var = new ek0(this, 19);
        photoViewer.I2 = ek0Var;
        AndroidUtilities.runOnUIThread(ek0Var, 860L);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f35737a;
        if (photoViewer.f33330l3 && photoViewer.P3) {
            photoViewer.s2();
        }
    }

    @Override
    public void f() {
        PhotoViewer photoViewer = this.f35737a;
        if (photoViewer.f33330l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f33438x2);
        }
    }

    @Override
    public void invalidate() {
        this.f35737a.f33266e0.invalidate();
    }
}
