package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class gs0 extends AnimatorListenerAdapter {
    public final int f38098a;
    public final View f38099b;
    public final PhotoViewer f38100c;

    public gs0(PhotoViewer photoViewer, View view, int i10) {
        this.f38098a = i10;
        this.f38100c = photoViewer;
        this.f38099b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38098a) {
            case 0:
                PhotoViewer photoViewer = this.f38100c;
                photoViewer.B3 = false;
                this.f38099b.setOutlineProvider(null);
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
                PhotoViewer photoViewer2 = this.f38100c;
                photoViewer2.B3 = false;
                photoViewer2.f33943i4.run();
                AndroidUtilities.runOnUIThread(new tf0(29, this, this.f38099b), 100L);
                return;
        }
    }
}
