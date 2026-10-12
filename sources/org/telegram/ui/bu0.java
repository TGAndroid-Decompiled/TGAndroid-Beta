package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bu0 extends AnimatorListenerAdapter {
    public final int f34629a;
    public final cu0 f34630b;

    public bu0(cu0 cu0Var, int i10) {
        this.f34630b = cu0Var;
        this.f34629a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f34630b.f35076b.f32287k8) {
            PhotoViewer photoViewer = this.f34630b.f35076b;
            if (photoViewer.f32340r1) {
                photoViewer.B3();
            }
        }
        if (this.f34629a == 3) {
            PhotoViewer photoViewer2 = this.f34630b.f35076b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f34630b.f35076b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f32304n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f32263i2) {
            yu0 yu0Var = photoViewer.Q1;
            if (yu0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            yu0Var.setVisibility(i10);
        }
        if (!photoViewer.f32219d2 && !photoViewer.f32228e2) {
            int i11 = photoViewer.f32210c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f32250g7.size() > 1)) && !photoViewer.f32239f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
