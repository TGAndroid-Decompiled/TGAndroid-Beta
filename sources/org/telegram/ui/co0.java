package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
public final class co0 extends AnimatorListenerAdapter {
    public final int f44864a;
    public final View f44865b;
    public final PhotoViewer f44866c;

    public co0(PhotoViewer photoViewer, View view, int i7) {
        this.f44864a = i7;
        this.f44866c = photoViewer;
        this.f44865b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44864a) {
            case 0:
                PhotoViewer photoViewer = this.f44866c;
                photoViewer.A3 = false;
                this.f44865b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f41541w3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                oq0 oq0Var = photoViewer.E2;
                if (oq0Var != null) {
                    oq0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f44866c;
                photoViewer2.A3 = false;
                photoViewer2.f41412h4.run();
                org.telegram.messenger.g0.i3(new qn0(2, this, this.f44865b), 100L);
                return;
        }
    }
}
