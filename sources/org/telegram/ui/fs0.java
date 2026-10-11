package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class fs0 extends AnimatorListenerAdapter {
    public final int f37796a;
    public final View f37797b;
    public final PhotoViewer f37798c;

    public fs0(PhotoViewer photoViewer, View view, int i10) {
        this.f37796a = i10;
        this.f37798c = photoViewer;
        this.f37797b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37796a) {
            case 0:
                PhotoViewer photoViewer = this.f37798c;
                photoViewer.B3 = false;
                this.f37797b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f34138x3;
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
                PhotoViewer photoViewer2 = this.f37798c;
                photoViewer2.B3 = false;
                photoViewer2.f34005i4.run();
                AndroidUtilities.runOnUIThread(new uf0(28, this, this.f37797b), 100L);
                return;
        }
    }
}
