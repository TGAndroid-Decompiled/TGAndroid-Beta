package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class np0 extends AnimatorListenerAdapter {
    public final int f48075a;
    public final op0 f48076b;

    public np0(op0 op0Var, int i7) {
        this.f48076b = op0Var;
        this.f48075a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f48076b.f48440b.f41407j8) {
            PhotoViewer photoViewer = this.f48076b.f48440b;
            if (photoViewer.f41470r1) {
                photoViewer.z3();
            }
        }
        if (this.f48075a == 3) {
            PhotoViewer photoViewer2 = this.f48076b.f48440b;
            photoViewer2.D2(photoViewer2.O4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i7;
        PhotoViewer photoViewer = this.f48076b.f48440b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.C3()) {
            photoViewer.f41434n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f41394i2) {
            kq0 kq0Var = photoViewer.Q1;
            if (kq0Var.getTag() != null) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            kq0Var.setVisibility(i7);
        }
        if (!photoViewer.d2 && !photoViewer.f41358e2) {
            int i10 = photoViewer.f41340c2;
            if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f41373f7.size() > 1)) && !photoViewer.f41360e4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.p3();
            }
        }
    }
}
