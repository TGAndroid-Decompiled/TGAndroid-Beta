package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class js0 extends AnimatorListenerAdapter {
    public final int f34927a;
    public final View f34928b;
    public final PhotoViewer f34929c;

    public js0(PhotoViewer photoViewer, View view, int i10) {
        this.f34927a = i10;
        this.f34929c = photoViewer;
        this.f34928b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34927a) {
            case 0:
                PhotoViewer photoViewer = this.f34929c;
                photoViewer.B3 = false;
                this.f34928b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f31122x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                wu0 wu0Var = photoViewer.E2;
                if (wu0Var != null) {
                    wu0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f34929c;
                photoViewer2.B3 = false;
                photoViewer2.f30989i4.run();
                AndroidUtilities.runOnUIThread(new pl0(15, this, this.f34928b), 100L);
                return;
        }
    }
}
