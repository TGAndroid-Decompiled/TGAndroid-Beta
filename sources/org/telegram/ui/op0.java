package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class op0 extends AnimatorListenerAdapter {
    public final int f48467a;
    public final pp0 f48468b;

    public op0(pp0 pp0Var, int i7) {
        this.f48468b = pp0Var;
        this.f48467a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f48468b.f48904b.f41432j8) {
            PhotoViewer photoViewer = this.f48468b.f48904b;
            if (photoViewer.f41495r1) {
                photoViewer.z3();
            }
        }
        if (this.f48467a == 3) {
            PhotoViewer photoViewer2 = this.f48468b.f48904b;
            photoViewer2.D2(photoViewer2.O4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i7;
        PhotoViewer photoViewer = this.f48468b.f48904b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.C3()) {
            photoViewer.f41459n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f41419i2) {
            lq0 lq0Var = photoViewer.Q1;
            if (lq0Var.getTag() != null) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            lq0Var.setVisibility(i7);
        }
        if (!photoViewer.d2 && !photoViewer.f41383e2) {
            int i10 = photoViewer.f41365c2;
            if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f41398f7.size() > 1)) && !photoViewer.f41385e4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.p3();
            }
        }
    }
}
