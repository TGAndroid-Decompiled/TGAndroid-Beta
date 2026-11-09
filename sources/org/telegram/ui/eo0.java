package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
public final class eo0 extends AnimatorListenerAdapter {
    public final int f45479a;
    public final View f45480b;
    public final PhotoViewer f45481c;

    public eo0(PhotoViewer photoViewer, View view, int i7) {
        this.f45479a = i7;
        this.f45481c = photoViewer;
        this.f45480b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45479a) {
            case 0:
                PhotoViewer photoViewer = this.f45481c;
                photoViewer.A3 = false;
                this.f45480b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f41552w3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                qq0 qq0Var = photoViewer.E2;
                if (qq0Var != null) {
                    qq0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f45481c;
                photoViewer2.A3 = false;
                photoViewer2.f41423h4.run();
                org.telegram.messenger.g0.i3(new sn0(2, this, this.f45480b), 100L);
                return;
        }
    }
}
