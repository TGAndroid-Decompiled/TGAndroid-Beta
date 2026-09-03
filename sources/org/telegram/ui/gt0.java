package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gt0 extends AnimatorListenerAdapter {
    public final int f34507a;
    public final ht0 f34508b;

    public gt0(ht0 ht0Var, int i10) {
        this.f34508b = ht0Var;
        this.f34507a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f34508b.f34751b.f31732g8) {
            PhotoViewer photoViewer = this.f34508b.f34751b;
            if (photoViewer.f31796o1) {
                photoViewer.B3();
            }
        }
        if (this.f34507a == 3) {
            PhotoViewer photoViewer2 = this.f34508b.f34751b;
            photoViewer2.G2(photoViewer2.M4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f34508b.f34751b;
        photoViewer.M0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f31760k0.setVisibility(0);
        } else {
            photoViewer.P0.setVisibility(0);
        }
        photoViewer.C.setVisibility(0);
        if (photoViewer.f31717f2) {
            du0 du0Var = photoViewer.N1;
            if (du0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            du0Var.setVisibility(i10);
        }
        if (!photoViewer.a2 && !photoViewer.f31681b2) {
            int i11 = photoViewer.Z1;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f31704d7.size() > 1)) && !photoViewer.f31692c4) {
                photoViewer.K0.setVisibility(0);
                photoViewer.L0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
