package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
public final class fo0 extends AnimatorListenerAdapter {
    public final int f45815a;
    public final View f45816b;
    public final PhotoViewer f45817c;

    public fo0(PhotoViewer photoViewer, View view, int i7) {
        this.f45815a = i7;
        this.f45817c = photoViewer;
        this.f45816b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45815a) {
            case 0:
                PhotoViewer photoViewer = this.f45817c;
                photoViewer.A3 = false;
                this.f45816b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f41543w3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                rq0 rq0Var = photoViewer.E2;
                if (rq0Var != null) {
                    rq0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f45817c;
                photoViewer2.A3 = false;
                photoViewer2.f41414h4.run();
                org.telegram.messenger.g0.i3(new tn0(3, this, this.f45816b), 100L);
                return;
        }
    }
}
