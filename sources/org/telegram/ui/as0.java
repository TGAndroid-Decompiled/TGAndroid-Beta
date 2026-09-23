package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class as0 extends AnimatorListenerAdapter {
    public final int f31877a;
    public final View f31878b;
    public final PhotoViewer f31879c;

    public as0(PhotoViewer photoViewer, View view, int i10) {
        this.f31877a = i10;
        this.f31879c = photoViewer;
        this.f31878b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31877a) {
            case 0:
                PhotoViewer photoViewer = this.f31879c;
                photoViewer.B3 = false;
                this.f31878b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f31080x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                nu0 nu0Var = photoViewer.E2;
                if (nu0Var != null) {
                    nu0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f31879c;
                photoViewer2.B3 = false;
                photoViewer2.f30947i4.run();
                AndroidUtilities.runOnUIThread(new gl0(15, this, this.f31878b), 100L);
                return;
        }
    }
}
