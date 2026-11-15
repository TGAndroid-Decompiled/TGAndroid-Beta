package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
public final class co0 extends AnimatorListenerAdapter {
    public final int f46224a;
    public final View f46225b;
    public final PhotoViewer f46226c;

    public co0(PhotoViewer photoViewer, View view, int i7) {
        this.f46224a = i7;
        this.f46226c = photoViewer;
        this.f46225b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46224a) {
            case 0:
                PhotoViewer photoViewer = this.f46226c;
                photoViewer.B3 = false;
                this.f46225b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f42924x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                nq0 nq0Var = photoViewer.F2;
                if (nq0Var != null) {
                    nq0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.D2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f46226c;
                photoViewer2.B3 = false;
                photoViewer2.f42793i4.run();
                org.telegram.messenger.g0.i3(new jd0(28, this, this.f46225b), 100L);
                return;
        }
    }
}
