package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dt0 extends AnimatorListenerAdapter {
    public final int f36730a;
    public final et0 f36731b;

    public dt0(et0 et0Var, int i10) {
        this.f36731b = et0Var;
        this.f36730a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f36731b.f37024b.f33641k8) {
            PhotoViewer photoViewer = this.f36731b.f37024b;
            if (photoViewer.f33694r1) {
                photoViewer.D3();
            }
        }
        if (this.f36730a == 3) {
            PhotoViewer photoViewer2 = this.f36731b.f37024b;
            photoViewer2.I2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f36731b.f37024b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.G3()) {
            photoViewer.f33658n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33617i2) {
            au0 au0Var = photoViewer.Q1;
            if (au0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            au0Var.setVisibility(i10);
        }
        if (!photoViewer.f33573d2 && !photoViewer.f33582e2) {
            int i11 = photoViewer.f33564c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33604g7.size() > 1)) && !photoViewer.f33593f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.u3();
            }
        }
    }
}
