package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class pr0 extends AnimatorListenerAdapter {
    public final int f40231a;
    public final View f40232b;
    public final PhotoViewer f40233c;

    public pr0(PhotoViewer photoViewer, View view, int i10) {
        this.f40231a = i10;
        this.f40233c = photoViewer;
        this.f40232b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40231a) {
            case 0:
                PhotoViewer photoViewer = this.f40233c;
                photoViewer.B3 = false;
                this.f40232b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f33439x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                cu0 cu0Var = photoViewer.E2;
                if (cu0Var != null) {
                    cu0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f40233c;
                photoViewer2.B3 = false;
                photoViewer2.f33305i4.run();
                AndroidUtilities.runOnUIThread(new zg0(23, this, this.f40232b), 100L);
                return;
        }
    }
}
