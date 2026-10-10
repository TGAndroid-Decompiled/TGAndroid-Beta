package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class gs0 extends AnimatorListenerAdapter {
    public final int f38144a;
    public final View f38145b;
    public final PhotoViewer f38146c;

    public gs0(PhotoViewer photoViewer, View view, int i10) {
        this.f38144a = i10;
        this.f38146c = photoViewer;
        this.f38145b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38144a) {
            case 0:
                PhotoViewer photoViewer = this.f38146c;
                photoViewer.B3 = false;
                this.f38145b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f34114x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                vu0 vu0Var = photoViewer.E2;
                if (vu0Var != null) {
                    vu0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f38146c;
                photoViewer2.B3 = false;
                photoViewer2.f33981i4.run();
                AndroidUtilities.runOnUIThread(new tf0(29, this, this.f38145b), 100L);
                return;
        }
    }
}
