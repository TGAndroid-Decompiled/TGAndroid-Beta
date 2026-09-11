package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class gs0 extends AnimatorListenerAdapter {
    public final int f36772a;
    public final View f36773b;
    public final PhotoViewer f36774c;

    public gs0(PhotoViewer photoViewer, View view, int i10) {
        this.f36772a = i10;
        this.f36774c = photoViewer;
        this.f36773b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36772a) {
            case 0:
                PhotoViewer photoViewer = this.f36774c;
                photoViewer.B3 = false;
                this.f36773b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f33721x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                tu0 tu0Var = photoViewer.E2;
                if (tu0Var != null) {
                    tu0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f36774c;
                photoViewer2.B3 = false;
                photoViewer2.f33588i4.run();
                AndroidUtilities.runOnUIThread(new ej0(21, this, this.f36773b), 100L);
                return;
        }
    }
}
