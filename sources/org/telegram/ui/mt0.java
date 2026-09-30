package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mt0 extends AnimatorListenerAdapter {
    public final int f35780a;
    public final nt0 f35781b;

    public mt0(nt0 nt0Var, int i10) {
        this.f35781b = nt0Var;
        this.f35780a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f35781b.f36138b.f31357k8) {
            PhotoViewer photoViewer = this.f35781b.f36138b;
            if (photoViewer.f31410r1) {
                photoViewer.B3();
            }
        }
        if (this.f35780a == 3) {
            PhotoViewer photoViewer2 = this.f35781b.f36138b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f35781b.f36138b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f31374n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f31334i2) {
            ju0 ju0Var = photoViewer.Q1;
            if (ju0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ju0Var.setVisibility(i10);
        }
        if (!photoViewer.f31290d2 && !photoViewer.f31299e2) {
            int i11 = photoViewer.f31281c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f31321g7.size() > 1)) && !photoViewer.f31310f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
