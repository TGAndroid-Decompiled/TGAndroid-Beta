package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ht0 extends AnimatorListenerAdapter {
    public final int f40067a;
    public final it0 f40068b;

    public ht0(it0 it0Var, int i10) {
        this.f40068b = it0Var;
        this.f40067a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f40068b.f40351b.f35707k8) {
            PhotoViewer photoViewer = this.f40068b.f40351b;
            if (photoViewer.f35761r1) {
                photoViewer.D3();
            }
        }
        if (this.f40067a == 3) {
            PhotoViewer photoViewer2 = this.f40068b.f40351b;
            photoViewer2.I2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f40068b.f40351b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.G3()) {
            photoViewer.f35724n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f35683i2) {
            eu0 eu0Var = photoViewer.Q1;
            if (eu0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            eu0Var.setVisibility(i10);
        }
        if (!photoViewer.f35639d2 && !photoViewer.f35648e2) {
            int i11 = photoViewer.f35630c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.g7.size() > 1)) && !photoViewer.f35660f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.u3();
            }
        }
    }
}
