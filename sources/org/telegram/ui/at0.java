package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class at0 extends AnimatorListenerAdapter {
    public final int f35416a;
    public final bt0 f35417b;

    public at0(bt0 bt0Var, int i10) {
        this.f35417b = bt0Var;
        this.f35416a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f35417b.f35742b.f33339k8) {
            PhotoViewer photoViewer = this.f35417b.f35742b;
            if (photoViewer.f33392r1) {
                photoViewer.D3();
            }
        }
        if (this.f35416a == 3) {
            PhotoViewer photoViewer2 = this.f35417b.f35742b;
            photoViewer2.I2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f35417b.f35742b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.G3()) {
            photoViewer.f33356n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33315i2) {
            xt0 xt0Var = photoViewer.Q1;
            if (xt0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            xt0Var.setVisibility(i10);
        }
        if (!photoViewer.f33271d2 && !photoViewer.f33280e2) {
            int i11 = photoViewer.f33262c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33302g7.size() > 1)) && !photoViewer.f33291f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.u3();
            }
        }
    }
}
