package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pp0 extends AnimatorListenerAdapter {
    public final int f51090a;
    public final qp0 f51091b;

    public pp0(qp0 qp0Var, int i7) {
        this.f51091b = qp0Var;
        this.f51090a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f51091b.f51503b.f43435q8) {
            PhotoViewer photoViewer = this.f51091b.f51503b;
            if (photoViewer.f43448s1) {
                photoViewer.C3();
            }
        }
        if (this.f51090a == 3) {
            PhotoViewer photoViewer2 = this.f51091b.f51503b;
            photoViewer2.F2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i7;
        PhotoViewer photoViewer = this.f51091b.f51503b;
        photoViewer.Q0.setVisibility(0);
        if (photoViewer.F3()) {
            photoViewer.f43410o0.setVisibility(0);
        } else {
            photoViewer.T0.setVisibility(0);
        }
        photoViewer.G.setVisibility(0);
        if (photoViewer.f43370j2) {
            mq0 mq0Var = photoViewer.R1;
            if (mq0Var.getTag() != null) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            mq0Var.setVisibility(i7);
        }
        if (!photoViewer.f43325e2 && !photoViewer.f43336f2) {
            int i10 = photoViewer.d2;
            if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f43350g7.size() > 1)) && !photoViewer.f43338f4) {
                photoViewer.O0.setVisibility(0);
                photoViewer.P0.setVisibility(0);
                photoViewer.r3();
            }
        }
    }
}
