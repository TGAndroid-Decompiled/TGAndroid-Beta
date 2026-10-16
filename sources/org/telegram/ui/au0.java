package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class au0 extends AnimatorListenerAdapter {
    public final int f34087a;
    public final bu0 f34088b;

    public au0(bu0 bu0Var, int i10) {
        this.f34088b = bu0Var;
        this.f34087a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f34088b.f34389b.f31989k8) {
            PhotoViewer photoViewer = this.f34088b.f34389b;
            if (photoViewer.f32042r1) {
                photoViewer.B3();
            }
        }
        if (this.f34087a == 3) {
            PhotoViewer photoViewer2 = this.f34088b.f34389b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f34088b.f34389b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f32006n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f31965i2) {
            xu0 xu0Var = photoViewer.Q1;
            if (xu0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            xu0Var.setVisibility(i10);
        }
        if (!photoViewer.f31921d2 && !photoViewer.f31930e2) {
            int i11 = photoViewer.f31912c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f31952g7.size() > 1)) && !photoViewer.f31941f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
