package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class hs0 extends AnimatorListenerAdapter {
    public final int f34229a;
    public final View f34230b;
    public final PhotoViewer f34231c;

    public hs0(PhotoViewer photoViewer, View view, int i10) {
        this.f34229a = i10;
        this.f34231c = photoViewer;
        this.f34230b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34229a) {
            case 0:
                PhotoViewer photoViewer = this.f34231c;
                photoViewer.B3 = false;
                this.f34230b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f31353x3;
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
                PhotoViewer photoViewer2 = this.f34231c;
                photoViewer2.B3 = false;
                photoViewer2.f31220i4.run();
                AndroidUtilities.runOnUIThread(new ak0(19, this, this.f34230b), 100L);
                return;
        }
    }
}
