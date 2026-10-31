package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
public final class op0 extends AnimatorListenerAdapter {
    public final int f40362a;
    public final View f40363b;
    public final PhotoViewer f40364c;

    public op0(PhotoViewer photoViewer, View view, int i10) {
        this.f40362a = i10;
        this.f40364c = photoViewer;
        this.f40363b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40362a) {
            case 0:
                PhotoViewer photoViewer = this.f40364c;
                photoViewer.B3 = false;
                this.f40363b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f33643x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                zr0 zr0Var = photoViewer.E2;
                if (zr0Var != null) {
                    zr0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f40364c;
                photoViewer2.B3 = false;
                photoViewer2.f33509i4.run();
                org.telegram.messenger.i0.h3(new uf0(24, this, this.f40363b), 100L);
                return;
        }
    }
}
