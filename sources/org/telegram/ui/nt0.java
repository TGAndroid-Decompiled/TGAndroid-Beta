package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nt0 extends AnimatorListenerAdapter {
    public final int f35597a;
    public final ot0 f35598b;

    public nt0(ot0 ot0Var, int i10) {
        this.f35598b = ot0Var;
        this.f35597a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f35598b.f35957b.f30968k8) {
            PhotoViewer photoViewer = this.f35598b.f35957b;
            if (photoViewer.f31021r1) {
                photoViewer.A3();
            }
        }
        if (this.f35597a == 3) {
            PhotoViewer photoViewer2 = this.f35598b.f35957b;
            photoViewer2.F2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f35598b.f35957b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.D3()) {
            photoViewer.f30985n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f30945i2) {
            ku0 ku0Var = photoViewer.Q1;
            if (ku0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ku0Var.setVisibility(i10);
        }
        if (!photoViewer.f30901d2 && !photoViewer.f30910e2) {
            int i11 = photoViewer.f30892c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f30932g7.size() > 1)) && !photoViewer.f30921f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.r3();
            }
        }
    }
}
