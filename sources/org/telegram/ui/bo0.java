package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
public final class bo0 extends AnimatorListenerAdapter {
    public final int f44442a;
    public final View f44443b;
    public final PhotoViewer f44444c;

    public bo0(PhotoViewer photoViewer, View view, int i7) {
        this.f44442a = i7;
        this.f44444c = photoViewer;
        this.f44443b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44442a) {
            case 0:
                PhotoViewer photoViewer = this.f44444c;
                photoViewer.A3 = false;
                this.f44443b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f41517w3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                nq0 nq0Var = photoViewer.E2;
                if (nq0Var != null) {
                    nq0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f44444c;
                photoViewer2.A3 = false;
                photoViewer2.f41388h4.run();
                org.telegram.messenger.g0.i3(new qn0(2, this, this.f44443b), 100L);
                return;
        }
    }
}
