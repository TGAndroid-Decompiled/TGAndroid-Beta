package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class nr0 extends AnimatorListenerAdapter {
    public final int f39674a;
    public final View f39675b;
    public final PhotoViewer f39676c;

    public nr0(PhotoViewer photoViewer, View view, int i10) {
        this.f39674a = i10;
        this.f39676c = photoViewer;
        this.f39675b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39674a) {
            case 0:
                PhotoViewer photoViewer = this.f39676c;
                photoViewer.B3 = false;
                this.f39675b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f33445x3;
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
                PhotoViewer photoViewer2 = this.f39676c;
                photoViewer2.B3 = false;
                photoViewer2.f33311i4.run();
                AndroidUtilities.runOnUIThread(new wg0(23, this, this.f39675b), 100L);
                return;
        }
    }
}
