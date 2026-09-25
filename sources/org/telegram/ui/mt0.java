package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mt0 extends AnimatorListenerAdapter {
    public final int f35667a;
    public final nt0 f35668b;

    public mt0(nt0 nt0Var, int i10) {
        this.f35668b = nt0Var;
        this.f35667a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f35668b.f36001b.f31284k8) {
            PhotoViewer photoViewer = this.f35668b.f36001b;
            if (photoViewer.f31337r1) {
                photoViewer.A3();
            }
        }
        if (this.f35667a == 3) {
            PhotoViewer photoViewer2 = this.f35668b.f36001b;
            photoViewer2.F2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f35668b.f36001b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.D3()) {
            photoViewer.f31301n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f31261i2) {
            ju0 ju0Var = photoViewer.Q1;
            if (ju0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ju0Var.setVisibility(i10);
        }
        if (!photoViewer.f31217d2 && !photoViewer.f31226e2) {
            int i11 = photoViewer.f31208c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f31248g7.size() > 1)) && !photoViewer.f31237f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.r3();
            }
        }
    }
}
