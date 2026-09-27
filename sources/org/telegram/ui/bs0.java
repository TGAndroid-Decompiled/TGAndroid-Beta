package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class bs0 extends AnimatorListenerAdapter {
    public final int f32432a;
    public final View f32433b;
    public final PhotoViewer f32434c;

    public bs0(PhotoViewer photoViewer, View view, int i10) {
        this.f32432a = i10;
        this.f32434c = photoViewer;
        this.f32433b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32432a) {
            case 0:
                PhotoViewer photoViewer = this.f32434c;
                photoViewer.B3 = false;
                this.f32433b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f31397x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                pu0 pu0Var = photoViewer.E2;
                if (pu0Var != null) {
                    pu0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f32434c;
                photoViewer2.B3 = false;
                photoViewer2.f31264i4.run();
                AndroidUtilities.runOnUIThread(new jl0(16, this, this.f32433b), 100L);
                return;
        }
    }
}
