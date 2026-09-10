package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class fs0 extends AnimatorListenerAdapter {
    public final int f32907a;
    public final View f32908b;
    public final PhotoViewer f32909c;

    public fs0(PhotoViewer photoViewer, View view, int i10) {
        this.f32907a = i10;
        this.f32909c = photoViewer;
        this.f32908b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32907a) {
            case 0:
                PhotoViewer photoViewer = this.f32909c;
                photoViewer.B3 = false;
                this.f32908b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f30221x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                vu0 vu0Var = photoViewer.E2;
                if (vu0Var != null) {
                    vu0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f32909c;
                photoViewer2.B3 = false;
                photoViewer2.f30088i4.run();
                AndroidUtilities.runOnUIThread(new ak0(18, this, this.f32908b), 100L);
                return;
        }
    }
}
