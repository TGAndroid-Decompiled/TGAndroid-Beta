package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pt0 extends AnimatorListenerAdapter {
    public final int f39534a;
    public final qt0 f39535b;

    public pt0(qt0 qt0Var, int i10) {
        this.f39535b = qt0Var;
        this.f39534a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f39535b.f39819b.f33955k8) {
            PhotoViewer photoViewer = this.f39535b.f39819b;
            if (photoViewer.f34008r1) {
                photoViewer.B3();
            }
        }
        if (this.f39534a == 3) {
            PhotoViewer photoViewer2 = this.f39535b.f39819b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f39535b.f39819b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f33972n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33932i2) {
            mu0 mu0Var = photoViewer.Q1;
            if (mu0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            mu0Var.setVisibility(i10);
        }
        if (!photoViewer.f33887d2 && !photoViewer.f33897e2) {
            int i11 = photoViewer.f33878c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33919g7.size() > 1)) && !photoViewer.f33908f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
