package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gt0 extends AnimatorListenerAdapter {
    public final int f37161a;
    public final ht0 f37162b;

    public gt0(ht0 ht0Var, int i10) {
        this.f37162b = ht0Var;
        this.f37161a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f37162b.f37476b.f34284g8) {
            PhotoViewer photoViewer = this.f37162b.f37476b;
            if (photoViewer.f34348o1) {
                photoViewer.B3();
            }
        }
        if (this.f37161a == 3) {
            PhotoViewer photoViewer2 = this.f37162b.f37476b;
            photoViewer2.G2(photoViewer2.M4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f37162b.f37476b;
        photoViewer.M0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f34312k0.setVisibility(0);
        } else {
            photoViewer.P0.setVisibility(0);
        }
        photoViewer.C.setVisibility(0);
        if (photoViewer.f34269f2) {
            du0 du0Var = photoViewer.N1;
            if (du0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            du0Var.setVisibility(i10);
        }
        if (!photoViewer.a2 && !photoViewer.f34232b2) {
            int i11 = photoViewer.Z1;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f34255d7.size() > 1)) && !photoViewer.f34243c4) {
                photoViewer.K0.setVisibility(0);
                photoViewer.L0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
