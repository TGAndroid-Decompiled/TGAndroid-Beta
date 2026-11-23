package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
public final class go0 extends AnimatorListenerAdapter {
    public final int f48091a;
    public final View f48092b;
    public final PhotoViewer f48093c;

    public go0(PhotoViewer photoViewer, View view, int i7) {
        this.f48091a = i7;
        this.f48093c = photoViewer;
        this.f48092b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48091a) {
            case 0:
                PhotoViewer photoViewer = this.f48093c;
                photoViewer.B3 = false;
                this.f48092b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f43379x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                qq0 qq0Var = photoViewer.F2;
                if (qq0Var != null) {
                    qq0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.D2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f48093c;
                photoViewer2.B3 = false;
                photoViewer2.f43248i4.run();
                org.telegram.messenger.g0.h3(new ve0(23, this, this.f48092b), 100L);
                return;
        }
    }
}
