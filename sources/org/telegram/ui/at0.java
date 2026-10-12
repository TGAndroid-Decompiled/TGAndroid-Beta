package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class at0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.y71, org.telegram.ui.Components.i81, org.telegram.ui.Components.sf0 {
    public final PhotoViewer f34338a;

    public at0(PhotoViewer photoViewer) {
        this.f34338a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f34338a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.es.f24771f).setDuration(150L).withEndAction(new org.telegram.ui.Components.sn0(10, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        pu0 pu0Var;
        PhotoViewer photoViewer = this.f34338a;
        if (photoViewer.F2 == null && ((pu0Var = photoViewer.f32235f0) == null || !pu0Var.f28599x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f32191a3 = f7;
        } else {
            photoViewer.t2((int) (f7 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f32370u3 = false;
    }

    @Override
    public void c(float f7) {
        tt0 tt0Var;
        tt0 tt0Var2;
        PhotoViewer photoViewer = this.f34338a;
        pu0 pu0Var = photoViewer.f32235f0;
        if (pu0Var != null && pu0Var.f28599x && (tt0Var2 = photoViewer.f32352s3) != null) {
            int i10 = photoViewer.f32333q3.h - org.telegram.ui.Components.j81.S;
            tt0Var2.N = pu0Var;
            if (tt0Var2.W != 0) {
                tt0Var2.W = 0L;
                tt0Var2.f28240f0 = null;
                tt0Var2.f28238e0 = null;
                tt0Var2.f28237d0 = null;
                tt0Var2.b(-1);
            }
            if (i10 != 0) {
                tt0Var2.f28243r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (tt0Var2.f28242n != i11) {
                    tt0Var2.f28242n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((pu0Var.getVideoDuration() * f7) / 1000));
            tt0Var2.f28247y = formatShortDuration;
            tt0Var2.E = (int) Math.ceil(tt0Var2.F.measureText(formatShortDuration));
            tt0Var2.invalidate();
            if (tt0Var2.f28239f != null) {
                Utilities.globalQueue.cancelRunnable(tt0Var2.f28239f);
            }
            double videoDuration = (f7 * pu0Var.getVideoDuration()) / 1000.0d;
            tt0Var2.O = videoDuration;
            String c10 = pu0Var.c((int) videoDuration);
            if (c10 != null) {
                tt0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (tt0Var = photoViewer.f32352s3) != null) {
            tt0Var.e(photoViewer.T4, f7, photoViewer.f32333q3.h - org.telegram.ui.Components.j81.S);
        }
        this.f34338a.b3(true);
        PhotoViewer.X(this.f34338a);
    }

    @Override
    public void d() {
        PhotoViewer photoViewer = this.f34338a;
        if (photoViewer.f32290l3 && photoViewer.P3) {
            photoViewer.s2();
        }
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f34338a;
        if (photoViewer.f32290l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f32398x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f34338a;
        org.telegram.ui.Components.h81 h81Var = photoViewer.F2;
        if (h81Var == null) {
            return;
        }
        h81Var.K(((float) h81Var.p()) * photoViewer.f32394w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f32394w8);
        photoViewer.u0();
        yk0 yk0Var = new yk0(this, 19);
        photoViewer.I2 = yk0Var;
        AndroidUtilities.runOnUIThread(yk0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f34338a.f32226e0.invalidate();
    }
}
