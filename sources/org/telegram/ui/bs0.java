package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class bs0 extends AnimatorListenerAdapter {
    public final int f35188a;
    public final View f35189b;
    public final PhotoViewer f35190c;

    public bs0(PhotoViewer photoViewer, View view, int i10) {
        this.f35188a = i10;
        this.f35190c = photoViewer;
        this.f35189b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35188a) {
            case 0:
                PhotoViewer photoViewer = this.f35190c;
                photoViewer.B3 = false;
                this.f35189b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f34066x3;
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
                PhotoViewer photoViewer2 = this.f35190c;
                photoViewer2.B3 = false;
                photoViewer2.f33933i4.run();
                AndroidUtilities.runOnUIThread(new wj0(18, this, this.f35189b), 100L);
                return;
        }
    }
}
