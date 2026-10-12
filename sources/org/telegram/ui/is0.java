package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class is0 extends AnimatorListenerAdapter {
    public final int f38992a;
    public final View f38993b;
    public final PhotoViewer f38994c;

    public is0(PhotoViewer photoViewer, View view, int i10) {
        this.f38992a = i10;
        this.f38994c = photoViewer;
        this.f38993b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38992a) {
            case 0:
                PhotoViewer photoViewer = this.f38994c;
                photoViewer.B3 = false;
                this.f38993b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f33915x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                xu0 xu0Var = photoViewer.E2;
                if (xu0Var != null) {
                    xu0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f38994c;
                photoViewer2.B3 = false;
                photoViewer2.f33782i4.run();
                AndroidUtilities.runOnUIThread(new cg0(27, this, this.f38993b), 100L);
                return;
        }
    }
}
