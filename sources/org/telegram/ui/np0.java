package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class np0 extends AnimatorListenerAdapter {
    public final int f49601a;
    public final op0 f49602b;

    public np0(op0 op0Var, int i7) {
        this.f49602b = op0Var;
        this.f49601a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f49602b.f50044b.f42813k8) {
            PhotoViewer photoViewer = this.f49602b.f50044b;
            if (photoViewer.f42877s1) {
                photoViewer.A3();
            }
        }
        if (this.f49601a == 3) {
            PhotoViewer photoViewer2 = this.f49602b.f50044b;
            photoViewer2.E2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i7;
        PhotoViewer photoViewer = this.f49602b.f50044b;
        photoViewer.Q0.setVisibility(0);
        if (photoViewer.D3()) {
            photoViewer.f42839o0.setVisibility(0);
        } else {
            photoViewer.T0.setVisibility(0);
        }
        photoViewer.G.setVisibility(0);
        if (photoViewer.f42799j2) {
            kq0 kq0Var = photoViewer.R1;
            if (kq0Var.getTag() != null) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            kq0Var.setVisibility(i7);
        }
        if (!photoViewer.f42755e2 && !photoViewer.f42765f2) {
            int i10 = photoViewer.d2;
            if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f42779g7.size() > 1)) && !photoViewer.f42767f4) {
                photoViewer.O0.setVisibility(0);
                photoViewer.P0.setVisibility(0);
                photoViewer.q3();
            }
        }
    }
}
