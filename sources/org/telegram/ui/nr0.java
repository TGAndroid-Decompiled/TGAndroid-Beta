package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class nr0 extends AnimatorListenerAdapter {
    public final int f39509a;
    public final View f39510b;
    public final PhotoViewer f39511c;

    public nr0(PhotoViewer photoViewer, View view, int i10) {
        this.f39509a = i10;
        this.f39511c = photoViewer;
        this.f39510b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39509a) {
            case 0:
                PhotoViewer photoViewer = this.f39511c;
                photoViewer.f34443y3 = false;
                this.f39510b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f34404u3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                cu0 cu0Var = photoViewer.B2;
                if (cu0Var != null) {
                    cu0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.f34451z2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f39511c;
                photoViewer2.f34443y3 = false;
                photoViewer2.f34271f4.run();
                AndroidUtilities.runOnUIThread(new br0(2, this, this.f39510b), 100L);
                return;
        }
    }
}
