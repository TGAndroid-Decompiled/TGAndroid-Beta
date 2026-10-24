package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class bs0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.z71, org.telegram.ui.Components.k81, org.telegram.ui.Components.pf0 {
    public final PhotoViewer f36134a;

    public bs0(PhotoViewer photoViewer) {
        this.f36134a = photoViewer;
    }

    @Override
    public void a(float f7) {
        qt0 qt0Var;
        PhotoViewer photoViewer = this.f36134a;
        if (photoViewer.F2 == null && ((qt0Var = photoViewer.f33591f0) == null || !qt0Var.f29277x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long B1 = photoViewer.B1();
        if (B1 == -9223372036854775807L) {
            photoViewer.f33547a3 = f7;
        } else {
            photoViewer.v2((int) (f7 * ((float) B1)));
        }
        photoViewer.d3(false);
        photoViewer.f33726u3 = false;
    }

    @Override
    public void b(float f7) {
        us0 us0Var;
        us0 us0Var2;
        PhotoViewer photoViewer = this.f36134a;
        qt0 qt0Var = photoViewer.f33591f0;
        if (qt0Var != null && qt0Var.f29277x && (us0Var2 = photoViewer.f33708s3) != null) {
            int i10 = photoViewer.f33689q3.h - org.telegram.ui.Components.l81.S;
            us0Var2.N = qt0Var;
            if (us0Var2.W != 0) {
                us0Var2.W = 0L;
                us0Var2.f29840f0 = null;
                us0Var2.f29838e0 = null;
                us0Var2.f29837d0 = null;
                us0Var2.b(-1);
            }
            if (i10 != 0) {
                us0Var2.f29843r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (us0Var2.f29842n != i11) {
                    us0Var2.f29842n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((qt0Var.getVideoDuration() * f7) / 1000));
            us0Var2.f29847y = formatShortDuration;
            us0Var2.E = (int) Math.ceil(us0Var2.F.measureText(formatShortDuration));
            us0Var2.invalidate();
            if (us0Var2.f29839f != null) {
                Utilities.globalQueue.cancelRunnable(us0Var2.f29839f);
            }
            double videoDuration = (f7 * qt0Var.getVideoDuration()) / 1000.0d;
            us0Var2.O = videoDuration;
            String c10 = qt0Var.c((int) videoDuration);
            if (c10 != null) {
                us0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (us0Var = photoViewer.f33708s3) != null) {
            us0Var.e(photoViewer.T4, f7, photoViewer.f33689q3.h - org.telegram.ui.Components.l81.S);
        }
        this.f36134a.d3(true);
        PhotoViewer.Y(this.f36134a);
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f36134a;
        if (photoViewer.f33646l3 && photoViewer.P3) {
            photoViewer.u2();
        }
    }

    @Override
    public void d() {
        PhotoViewer photoViewer = this.f36134a;
        if (photoViewer.f33646l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f33754x2);
        }
    }

    public void e(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f36134a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.zr.f33337f).setDuration(150L).withEndAction(new org.telegram.ui.Components.z50(14, photoViewer, z11));
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f36134a;
        org.telegram.ui.Components.j81 j81Var = photoViewer.F2;
        if (j81Var == null) {
            return;
        }
        j81Var.K(((float) j81Var.p()) * photoViewer.f33750w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f33750w8);
        photoViewer.v0();
        nj0 nj0Var = new nj0(this, 20);
        photoViewer.I2 = nj0Var;
        AndroidUtilities.runOnUIThread(nj0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f36134a.f33582e0.invalidate();
    }
}
