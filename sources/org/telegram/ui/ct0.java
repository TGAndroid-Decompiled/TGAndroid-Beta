package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ct0 extends AnimatorListenerAdapter {
    public final int f36397a;
    public final dt0 f36398b;

    public ct0(dt0 dt0Var, int i10) {
        this.f36398b = dt0Var;
        this.f36397a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f36398b.f36723b.f33643k8) {
            PhotoViewer photoViewer = this.f36398b.f36723b;
            if (photoViewer.f33696r1) {
                photoViewer.D3();
            }
        }
        if (this.f36397a == 3) {
            PhotoViewer photoViewer2 = this.f36398b.f36723b;
            photoViewer2.I2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f36398b.f36723b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.G3()) {
            photoViewer.f33660n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33619i2) {
            zt0 zt0Var = photoViewer.Q1;
            if (zt0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            zt0Var.setVisibility(i10);
        }
        if (!photoViewer.f33575d2 && !photoViewer.f33584e2) {
            int i11 = photoViewer.f33566c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33606g7.size() > 1)) && !photoViewer.f33595f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.u3();
            }
        }
    }
}
