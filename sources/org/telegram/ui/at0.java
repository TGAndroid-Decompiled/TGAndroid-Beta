package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class at0 extends AnimatorListenerAdapter {
    public final int f35420a;
    public final bt0 f35421b;

    public at0(bt0 bt0Var, int i10) {
        this.f35421b = bt0Var;
        this.f35420a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f35421b.f35746b.f33343k8) {
            PhotoViewer photoViewer = this.f35421b.f35746b;
            if (photoViewer.f33396r1) {
                photoViewer.D3();
            }
        }
        if (this.f35420a == 3) {
            PhotoViewer photoViewer2 = this.f35421b.f35746b;
            photoViewer2.I2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f35421b.f35746b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.G3()) {
            photoViewer.f33360n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33319i2) {
            xt0 xt0Var = photoViewer.Q1;
            if (xt0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            xt0Var.setVisibility(i10);
        }
        if (!photoViewer.f33275d2 && !photoViewer.f33284e2) {
            int i11 = photoViewer.f33266c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33306g7.size() > 1)) && !photoViewer.f33295f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.u3();
            }
        }
    }
}
