package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jt0 extends AnimatorListenerAdapter {
    public final int f40593a;
    public final kt0 f40594b;

    public jt0(kt0 kt0Var, int i10) {
        this.f40594b = kt0Var;
        this.f40593a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f40594b.f40915b.f35731k8) {
            PhotoViewer photoViewer = this.f40594b.f40915b;
            if (photoViewer.f35785r1) {
                photoViewer.E3();
            }
        }
        if (this.f40593a == 3) {
            PhotoViewer photoViewer2 = this.f40594b.f40915b;
            photoViewer2.J2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f40594b.f40915b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.H3()) {
            photoViewer.f35748n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f35707i2) {
            gu0 gu0Var = photoViewer.Q1;
            if (gu0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            gu0Var.setVisibility(i10);
        }
        if (!photoViewer.f35663d2 && !photoViewer.f35672e2) {
            int i11 = photoViewer.f35654c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.g7.size() > 1)) && !photoViewer.f35684f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.v3();
            }
        }
    }
}
