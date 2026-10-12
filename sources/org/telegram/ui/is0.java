package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class is0 extends AnimatorListenerAdapter {
    public final int f38990a;
    public final View f38991b;
    public final PhotoViewer f38992c;

    public is0(PhotoViewer photoViewer, View view, int i10) {
        this.f38990a = i10;
        this.f38992c = photoViewer;
        this.f38991b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38990a) {
            case 0:
                PhotoViewer photoViewer = this.f38992c;
                photoViewer.B3 = false;
                this.f38991b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f33913x3;
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
                PhotoViewer photoViewer2 = this.f38992c;
                photoViewer2.B3 = false;
                photoViewer2.f33780i4.run();
                AndroidUtilities.runOnUIThread(new og0(26, this, this.f38991b), 100L);
                return;
        }
    }
}
