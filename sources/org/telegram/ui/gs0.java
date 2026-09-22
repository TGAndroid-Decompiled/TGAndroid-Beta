package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class gs0 extends AnimatorListenerAdapter {
    public final int f33941a;
    public final View f33942b;
    public final PhotoViewer f33943c;

    public gs0(PhotoViewer photoViewer, View view, int i10) {
        this.f33941a = i10;
        this.f33943c = photoViewer;
        this.f33942b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33941a) {
            case 0:
                PhotoViewer photoViewer = this.f33943c;
                photoViewer.B3 = false;
                this.f33942b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f31106x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                uu0 uu0Var = photoViewer.E2;
                if (uu0Var != null) {
                    uu0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f33943c;
                photoViewer2.B3 = false;
                photoViewer2.f30973i4.run();
                AndroidUtilities.runOnUIThread(new ml0(15, this, this.f33942b), 100L);
                return;
        }
    }
}
