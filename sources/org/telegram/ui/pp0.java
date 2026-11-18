package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pp0 extends AnimatorListenerAdapter {
    public final int f50875a;
    public final qp0 f50876b;

    public pp0(qp0 qp0Var, int i7) {
        this.f50876b = qp0Var;
        this.f50875a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f50876b.f51263b.f43258k8) {
            PhotoViewer photoViewer = this.f50876b.f51263b;
            if (photoViewer.f43322s1) {
                photoViewer.A3();
            }
        }
        if (this.f50875a == 3) {
            PhotoViewer photoViewer2 = this.f50876b.f51263b;
            photoViewer2.E2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i7;
        PhotoViewer photoViewer = this.f50876b.f51263b;
        photoViewer.Q0.setVisibility(0);
        if (photoViewer.D3()) {
            photoViewer.f43284o0.setVisibility(0);
        } else {
            photoViewer.T0.setVisibility(0);
        }
        photoViewer.G.setVisibility(0);
        if (photoViewer.f43244j2) {
            mq0 mq0Var = photoViewer.R1;
            if (mq0Var.getTag() != null) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            mq0Var.setVisibility(i7);
        }
        if (!photoViewer.f43200e2 && !photoViewer.f43210f2) {
            int i10 = photoViewer.d2;
            if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f43224g7.size() > 1)) && !photoViewer.f43212f4) {
                photoViewer.O0.setVisibility(0);
                photoViewer.P0.setVisibility(0);
                photoViewer.q3();
            }
        }
    }
}
