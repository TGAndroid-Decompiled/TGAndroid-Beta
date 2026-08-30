package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class lr0 extends AnimatorListenerAdapter {
    public final int f36128a;
    public final View f36129b;
    public final PhotoViewer f36130c;

    public lr0(PhotoViewer photoViewer, View view, int i10) {
        this.f36128a = i10;
        this.f36130c = photoViewer;
        this.f36129b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36128a) {
            case 0:
                PhotoViewer photoViewer = this.f36130c;
                photoViewer.f31917y3 = false;
                this.f36129b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f31878u3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                au0 au0Var = photoViewer.B2;
                if (au0Var != null) {
                    au0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.f31925z2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f36130c;
                photoViewer2.f31917y3 = false;
                photoViewer2.f31745f4.run();
                AndroidUtilities.runOnUIThread(new zq0(3, this, this.f36129b), 100L);
                return;
        }
    }
}
