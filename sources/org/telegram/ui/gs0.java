package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class gs0 extends AnimatorListenerAdapter {
    public final int f38100a;
    public final View f38101b;
    public final PhotoViewer f38102c;

    public gs0(PhotoViewer photoViewer, View view, int i10) {
        this.f38100a = i10;
        this.f38102c = photoViewer;
        this.f38101b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38100a) {
            case 0:
                PhotoViewer photoViewer = this.f38102c;
                photoViewer.B3 = false;
                this.f38101b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f34076x3;
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
                PhotoViewer photoViewer2 = this.f38102c;
                photoViewer2.B3 = false;
                photoViewer2.f33943i4.run();
                AndroidUtilities.runOnUIThread(new tf0(29, this, this.f38101b), 100L);
                return;
        }
    }
}
