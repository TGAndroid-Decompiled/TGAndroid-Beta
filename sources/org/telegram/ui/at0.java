package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class at0 extends AnimatorListenerAdapter {
    public final int f35426a;
    public final bt0 f35427b;

    public at0(bt0 bt0Var, int i10) {
        this.f35427b = bt0Var;
        this.f35426a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f35427b.f35743b.f33333k8) {
            PhotoViewer photoViewer = this.f35427b.f35743b;
            if (photoViewer.f33386r1) {
                photoViewer.B3();
            }
        }
        if (this.f35426a == 3) {
            PhotoViewer photoViewer2 = this.f35427b.f35743b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f35427b.f35743b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f33350n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33309i2) {
            xt0 xt0Var = photoViewer.Q1;
            if (xt0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            xt0Var.setVisibility(i10);
        }
        if (!photoViewer.f33265d2 && !photoViewer.f33274e2) {
            int i11 = photoViewer.f33256c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33296g7.size() > 1)) && !photoViewer.f33285f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
