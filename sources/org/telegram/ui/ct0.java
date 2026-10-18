package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ct0 extends AnimatorListenerAdapter {
    public final int f35971a;
    public final dt0 f35972b;

    public ct0(dt0 dt0Var, int i10) {
        this.f35972b = dt0Var;
        this.f35971a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f35972b.f36288b.f33327k8) {
            PhotoViewer photoViewer = this.f35972b.f36288b;
            if (photoViewer.f33380r1) {
                photoViewer.B3();
            }
        }
        if (this.f35971a == 3) {
            PhotoViewer photoViewer2 = this.f35972b.f36288b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f35972b.f36288b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f33344n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33303i2) {
            zt0 zt0Var = photoViewer.Q1;
            if (zt0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            zt0Var.setVisibility(i10);
        }
        if (!photoViewer.f33259d2 && !photoViewer.f33268e2) {
            int i11 = photoViewer.f33250c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33290g7.size() > 1)) && !photoViewer.f33279f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
