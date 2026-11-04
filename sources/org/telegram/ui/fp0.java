package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fp0 extends AnimatorListenerAdapter {
    public final int f45317a;
    public final gp0 f45318b;

    public fp0(gp0 gp0Var, int i3) {
        this.f45318b = gp0Var;
        this.f45317a = i3;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f45318b.f45690b.f41478l8) {
            PhotoViewer photoViewer = this.f45318b.f45690b;
            if (photoViewer.f41533s1) {
                photoViewer.E3();
            }
        }
        if (this.f45317a == 3) {
            PhotoViewer photoViewer2 = this.f45318b.f45690b;
            photoViewer2.J2(photoViewer2.Q4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i3;
        PhotoViewer photoViewer = this.f45318b.f45690b;
        photoViewer.Q0.setVisibility(0);
        if (photoViewer.H3()) {
            photoViewer.f41495o0.setVisibility(0);
        } else {
            photoViewer.T0.setVisibility(0);
        }
        photoViewer.G.setVisibility(0);
        if (photoViewer.f41455j2) {
            cq0 cq0Var = photoViewer.R1;
            if (cq0Var.getTag() != null) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            cq0Var.setVisibility(i3);
        }
        if (!photoViewer.f41412e2 && !photoViewer.f41422f2) {
            int i10 = photoViewer.f41402d2;
            if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.h7.size() > 1)) && !photoViewer.f41433g4) {
                photoViewer.O0.setVisibility(0);
                photoViewer.P0.setVisibility(0);
                photoViewer.v3();
            }
        }
    }
}
