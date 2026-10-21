package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class nr0 extends AnimatorListenerAdapter {
    public final int f39679a;
    public final View f39680b;
    public final PhotoViewer f39681c;

    public nr0(PhotoViewer photoViewer, View view, int i10) {
        this.f39679a = i10;
        this.f39681c = photoViewer;
        this.f39680b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39679a) {
            case 0:
                PhotoViewer photoViewer = this.f39681c;
                photoViewer.B3 = false;
                this.f39680b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f33452x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                au0 au0Var = photoViewer.E2;
                if (au0Var != null) {
                    au0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f39681c;
                photoViewer2.B3 = false;
                photoViewer2.f33318i4.run();
                AndroidUtilities.runOnUIThread(new xg0(23, this, this.f39680b), 100L);
                return;
        }
    }
}
