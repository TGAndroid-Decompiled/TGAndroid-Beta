package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class at0 extends AnimatorListenerAdapter {
    public final int f35421a;
    public final bt0 f35422b;

    public at0(bt0 bt0Var, int i10) {
        this.f35422b = bt0Var;
        this.f35421a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f35422b.f35747b.f33344k8) {
            PhotoViewer photoViewer = this.f35422b.f35747b;
            if (photoViewer.f33397r1) {
                photoViewer.D3();
            }
        }
        if (this.f35421a == 3) {
            PhotoViewer photoViewer2 = this.f35422b.f35747b;
            photoViewer2.I2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f35422b.f35747b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.G3()) {
            photoViewer.f33361n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33320i2) {
            xt0 xt0Var = photoViewer.Q1;
            if (xt0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            xt0Var.setVisibility(i10);
        }
        if (!photoViewer.f33276d2 && !photoViewer.f33285e2) {
            int i11 = photoViewer.f33267c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33307g7.size() > 1)) && !photoViewer.f33296f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.u3();
            }
        }
    }
}
