package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class ms0 extends AnimatorListenerAdapter {
    public final int f38062a;
    public final View f38063b;
    public final PhotoViewer f38064c;

    public ms0(PhotoViewer photoViewer, View view, int i10) {
        this.f38062a = i10;
        this.f38064c = photoViewer;
        this.f38063b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38062a) {
            case 0:
                PhotoViewer photoViewer = this.f38064c;
                photoViewer.B3 = false;
                this.f38063b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f32101x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                av0 av0Var = photoViewer.E2;
                if (av0Var != null) {
                    av0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f38064c;
                photoViewer2.B3 = false;
                photoViewer2.f31967i4.run();
                AndroidUtilities.runOnUIThread(new rr0(5, this, this.f38063b), 100L);
                return;
        }
    }
}
