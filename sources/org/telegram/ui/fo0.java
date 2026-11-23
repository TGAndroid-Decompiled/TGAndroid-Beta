package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
public final class fo0 extends AnimatorListenerAdapter {
    public final int f47807a;
    public final View f47808b;
    public final PhotoViewer f47809c;

    public fo0(PhotoViewer photoViewer, View view, int i7) {
        this.f47807a = i7;
        this.f47809c = photoViewer;
        this.f47808b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47807a) {
            case 0:
                PhotoViewer photoViewer = this.f47809c;
                photoViewer.B3 = false;
                this.f47808b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f43414x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                pq0 pq0Var = photoViewer.F2;
                if (pq0Var != null) {
                    pq0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.D2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f47809c;
                photoViewer2.B3 = false;
                photoViewer2.f43283i4.run();
                org.telegram.messenger.g0.h3(new fe0(25, this, this.f47808b), 100L);
                return;
        }
    }
}
