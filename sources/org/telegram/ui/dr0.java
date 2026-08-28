package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class dr0 extends AnimatorListenerAdapter {
    public final int f37587a;
    public final View f37588b;
    public final PhotoViewer f37589c;

    public dr0(PhotoViewer photoViewer, View view, int i9) {
        this.f37587a = i9;
        this.f37589c = photoViewer;
        this.f37588b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37587a) {
            case 0:
                PhotoViewer photoViewer = this.f37589c;
                photoViewer.f35791x3 = false;
                this.f37588b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f35755t3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                st0 st0Var = photoViewer.A2;
                if (st0Var != null) {
                    st0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.f35800y2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f37589c;
                photoViewer2.f35791x3 = false;
                photoViewer2.f35621e4.run();
                AndroidUtilities.runOnUIThread(new cf0(27, this, this.f37588b), 100L);
                return;
        }
    }
}
