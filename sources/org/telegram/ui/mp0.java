package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
public final class mp0 extends AnimatorListenerAdapter {
    public final int f39597a;
    public final View f39598b;
    public final PhotoViewer f39599c;

    public mp0(PhotoViewer photoViewer, View view, int i10) {
        this.f39597a = i10;
        this.f39599c = photoViewer;
        this.f39598b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39597a) {
            case 0:
                PhotoViewer photoViewer = this.f39599c;
                photoViewer.B3 = false;
                this.f39598b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f33650x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                yr0 yr0Var = photoViewer.E2;
                if (yr0Var != null) {
                    yr0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f39599c;
                photoViewer2.B3 = false;
                photoViewer2.f33516i4.run();
                org.telegram.messenger.i0.h3(new if0(25, this, this.f39598b), 100L);
                return;
        }
    }
}
