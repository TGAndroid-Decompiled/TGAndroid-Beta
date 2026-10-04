package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class bs0 extends AnimatorListenerAdapter {
    public final int f35194a;
    public final View f35195b;
    public final PhotoViewer f35196c;

    public bs0(PhotoViewer photoViewer, View view, int i10) {
        this.f35194a = i10;
        this.f35196c = photoViewer;
        this.f35195b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35194a) {
            case 0:
                PhotoViewer photoViewer = this.f35196c;
                photoViewer.B3 = false;
                this.f35195b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f34073x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                pu0 pu0Var = photoViewer.E2;
                if (pu0Var != null) {
                    pu0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f35196c;
                photoViewer2.B3 = false;
                photoViewer2.f33940i4.run();
                AndroidUtilities.runOnUIThread(new wj0(18, this, this.f35195b), 100L);
                return;
        }
    }
}
