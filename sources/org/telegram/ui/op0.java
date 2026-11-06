package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class op0 extends AnimatorListenerAdapter {
    public final int f48466a;
    public final pp0 f48467b;

    public op0(pp0 pp0Var, int i7) {
        this.f48467b = pp0Var;
        this.f48466a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f48467b.f48903b.f41431j8) {
            PhotoViewer photoViewer = this.f48467b.f48903b;
            if (photoViewer.f41494r1) {
                photoViewer.z3();
            }
        }
        if (this.f48466a == 3) {
            PhotoViewer photoViewer2 = this.f48467b.f48903b;
            photoViewer2.D2(photoViewer2.O4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i7;
        PhotoViewer photoViewer = this.f48467b.f48903b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.C3()) {
            photoViewer.f41458n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f41418i2) {
            lq0 lq0Var = photoViewer.Q1;
            if (lq0Var.getTag() != null) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            lq0Var.setVisibility(i7);
        }
        if (!photoViewer.d2 && !photoViewer.f41382e2) {
            int i10 = photoViewer.f41364c2;
            if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f41397f7.size() > 1)) && !photoViewer.f41384e4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.p3();
            }
        }
    }
}
