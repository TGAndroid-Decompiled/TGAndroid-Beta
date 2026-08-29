package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class dr0 extends AnimatorListenerAdapter {
    public final int f37622a;
    public final View f37623b;
    public final PhotoViewer f37624c;

    public dr0(PhotoViewer photoViewer, View view, int i10) {
        this.f37622a = i10;
        this.f37624c = photoViewer;
        this.f37623b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37622a) {
            case 0:
                PhotoViewer photoViewer = this.f37624c;
                photoViewer.f35859x3 = false;
                this.f37623b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f35821t3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                qt0 qt0Var = photoViewer.A2;
                if (qt0Var != null) {
                    qt0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.f35867y2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f37624c;
                photoViewer2.f35859x3 = false;
                photoViewer2.f35687e4.run();
                AndroidUtilities.runOnUIThread(new lf0(24, this, this.f37623b), 100L);
                return;
        }
    }
}
