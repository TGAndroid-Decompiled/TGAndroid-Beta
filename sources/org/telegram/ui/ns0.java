package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class ns0 extends AnimatorListenerAdapter {
    public final int f38790a;
    public final View f38791b;
    public final PhotoViewer f38792c;

    public ns0(PhotoViewer photoViewer, View view, int i10) {
        this.f38790a = i10;
        this.f38792c = photoViewer;
        this.f38791b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38790a) {
            case 0:
                PhotoViewer photoViewer = this.f38792c;
                photoViewer.B3 = false;
                this.f38791b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f32399x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                bv0 bv0Var = photoViewer.E2;
                if (bv0Var != null) {
                    bv0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f38792c;
                photoViewer2.B3 = false;
                photoViewer2.f32265i4.run();
                AndroidUtilities.runOnUIThread(new on0(10, this, this.f38791b), 100L);
                return;
        }
    }
}
