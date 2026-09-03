package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class es0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.y61, org.telegram.ui.Components.k71, org.telegram.ui.Components.ze0 {
    public final PhotoViewer f36577a;

    public es0(PhotoViewer photoViewer) {
        this.f36577a = photoViewer;
    }

    public void a(boolean z4) {
        float f10;
        boolean z10 = !z4;
        PhotoViewer photoViewer = this.f36577a;
        if (photoViewer.S0.isClickable() != z10) {
            photoViewer.S0.setClickable(z10);
            photoViewer.S0.setVisibility(0);
            photoViewer.S0.clearAnimation();
            ViewPropertyAnimator animate = photoViewer.S0.animate();
            if (!z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.pr.f30168f).setDuration(150L).withEndAction(new org.telegram.ui.Components.qv0(5, photoViewer, z10));
        }
    }

    @Override
    public void b(float f10) {
        ut0 ut0Var;
        PhotoViewer photoViewer = this.f36577a;
        if (photoViewer.C2 == null && ((ut0Var = photoViewer.f34240c0) == null || !ut0Var.f33062x)) {
            return;
        }
        if (!photoViewer.f34438x8 && photoViewer.N7.getVisibility() == 0) {
            f10 = ((photoViewer.O7.getRightProgress() - photoViewer.O7.getLeftProgress()) * f10) + photoViewer.O7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.X2 = f10;
        } else {
            photoViewer.t2((int) (f10 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f34378r3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f36577a;
        if (photoViewer.f34297i3 && photoViewer.M3) {
            photoViewer.s2();
        }
    }

    @Override
    public void d(float f10) {
        ys0 ys0Var;
        ys0 ys0Var2;
        PhotoViewer photoViewer = this.f36577a;
        ut0 ut0Var = photoViewer.f34240c0;
        if (ut0Var != null && ut0Var.f33062x && (ys0Var2 = photoViewer.f34359p3) != null) {
            int i10 = photoViewer.f34341n3.h - org.telegram.ui.Components.l71.S;
            ys0Var2.K = ut0Var;
            if (ys0Var2.T != 0) {
                ys0Var2.T = 0L;
                ys0Var2.f30345c0 = null;
                ys0Var2.f30343b0 = null;
                ys0Var2.f30341a0 = null;
                ys0Var2.b(-1);
            }
            if (i10 != 0) {
                ys0Var2.f30350r = i10;
                int i11 = ((int) (i10 * f10)) / 5;
                if (ys0Var2.f30349n != i11) {
                    ys0Var2.f30349n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((ut0Var.getVideoDuration() * f10) / 1000));
            ys0Var2.f30354y = formatShortDuration;
            ys0Var2.B = (int) Math.ceil(ys0Var2.C.measureText(formatShortDuration));
            ys0Var2.invalidate();
            if (ys0Var2.f30348f != null) {
                Utilities.globalQueue.cancelRunnable(ys0Var2.f30348f);
            }
            double videoDuration = (f10 * ut0Var.getVideoDuration()) / 1000.0d;
            ys0Var2.L = videoDuration;
            String c3 = ut0Var.c((int) videoDuration);
            if (c3 != null) {
                ys0Var2.N.setImage(c3, null, null, null, 0L);
            }
        } else if (photoViewer.C2 != null && (ys0Var = photoViewer.f34359p3) != null) {
            ys0Var.e(photoViewer.Q4, f10, photoViewer.f34341n3.h - org.telegram.ui.Components.l71.S);
        }
        this.f36577a.b3(true);
        PhotoViewer.X(this.f36577a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f36577a;
        if (photoViewer.f34297i3 && photoViewer.M3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f34403u2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f36577a;
        org.telegram.ui.Components.j71 j71Var = photoViewer.C2;
        if (j71Var == null) {
            return;
        }
        j71Var.K(((float) j71Var.p()) * photoViewer.f34392s8);
        photoViewer.C2.B();
        photoViewer.O7.setProgress(photoViewer.f34392s8);
        photoViewer.u0();
        gl0 gl0Var = new gl0(this, 18);
        photoViewer.F2 = gl0Var;
        AndroidUtilities.runOnUIThread(gl0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f36577a.f34230b0.invalidate();
    }
}
