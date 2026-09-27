package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pt0 extends AnimatorListenerAdapter {
    public final int f36544a;
    public final qt0 f36545b;

    public pt0(qt0 qt0Var, int i10) {
        this.f36545b = qt0Var;
        this.f36544a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f36545b.f36911b.f31285k8) {
            PhotoViewer photoViewer = this.f36545b.f36911b;
            if (photoViewer.f31338r1) {
                photoViewer.A3();
            }
        }
        if (this.f36544a == 3) {
            PhotoViewer photoViewer2 = this.f36545b.f36911b;
            photoViewer2.F2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f36545b.f36911b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.D3()) {
            photoViewer.f31302n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f31262i2) {
            mu0 mu0Var = photoViewer.Q1;
            if (mu0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            mu0Var.setVisibility(i10);
        }
        if (!photoViewer.f31218d2 && !photoViewer.f31227e2) {
            int i11 = photoViewer.f31209c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f31249g7.size() > 1)) && !photoViewer.f31238f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.r3();
            }
        }
    }
}
