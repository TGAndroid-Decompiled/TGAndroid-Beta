package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

public final class fr0 extends AnimatorListenerAdapter {

    public final int f38196a;

    public final View f38197b;

    public final PhotoViewer f38198c;

    public fr0(PhotoViewer photoViewer, View view, int i10) {
        this.f38196a = i10;
        this.f38198c = photoViewer;
        this.f38197b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38196a) {
            case 0:
                PhotoViewer photoViewer = this.f38198c;
                photoViewer.f35795x3 = false;
                this.f38197b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f35758t3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                tt0 tt0Var = photoViewer.A2;
                if (tt0Var != null) {
                    tt0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.f35803y2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                }
                break;
            default:
                PhotoViewer photoViewer2 = this.f38198c;
                photoViewer2.f35795x3 = false;
                photoViewer2.f35624e4.run();
                AndroidUtilities.runOnUIThread(new ff0(27, this, this.f38197b), 100L);
                break;
        }
    }
}
