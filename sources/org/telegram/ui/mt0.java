package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mt0 extends AnimatorListenerAdapter {
    public final int f35670a;
    public final nt0 f35671b;

    public mt0(nt0 nt0Var, int i10) {
        this.f35671b = nt0Var;
        this.f35670a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f35671b.f35994b.f31285k8) {
            PhotoViewer photoViewer = this.f35671b.f35994b;
            if (photoViewer.f31338r1) {
                photoViewer.B3();
            }
        }
        if (this.f35670a == 3) {
            PhotoViewer photoViewer2 = this.f35671b.f35994b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f35671b.f35994b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f31302n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f31262i2) {
            ju0 ju0Var = photoViewer.Q1;
            if (ju0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ju0Var.setVisibility(i10);
        }
        if (!photoViewer.f31218d2 && !photoViewer.f31227e2) {
            int i11 = photoViewer.f31209c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f31249g7.size() > 1)) && !photoViewer.f31238f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
