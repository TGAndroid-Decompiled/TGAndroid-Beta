package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
public final class eo0 extends AnimatorListenerAdapter {
    public final int f47598a;
    public final View f47599b;
    public final PhotoViewer f47600c;

    public eo0(PhotoViewer photoViewer, View view, int i7) {
        this.f47598a = i7;
        this.f47600c = photoViewer;
        this.f47599b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47598a) {
            case 0:
                PhotoViewer photoViewer = this.f47600c;
                photoViewer.B3 = false;
                this.f47599b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f43495x3;
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
                PhotoViewer photoViewer2 = this.f47600c;
                photoViewer2.B3 = false;
                photoViewer2.f43364i4.run();
                org.telegram.messenger.g0.h3(new bd0(29, this, this.f47599b), 100L);
                return;
        }
    }
}
