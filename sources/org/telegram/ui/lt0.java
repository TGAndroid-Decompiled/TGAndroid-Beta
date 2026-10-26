package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lt0 extends AnimatorListenerAdapter {
    public final int f41360a;
    public final int f41361b;
    public final PhotoViewer f41362c;

    public lt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f41360a = i11;
        this.f41362c = photoViewer;
        this.f41361b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41360a) {
            case 0:
                PhotoViewer photoViewer = this.f41362c;
                mt0 mt0Var = photoViewer.N1;
                mt0Var.e.setVisibility(0);
                FrameLayout frameLayout = mt0Var.f48558r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
                org.telegram.messenger.vh.q(translationY, dsVar, 320L);
                mt0Var.f48560w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(dsVar).setDuration(320L).start();
                photoViewer.f35791u4 = this.f41361b;
                photoViewer.f35756q6 = null;
                photoViewer.f35739o6 = -1;
                return;
            default:
                int i10 = this.f41361b;
                PhotoViewer photoViewer2 = this.f41362c;
                photoViewer2.f35791u4 = i10;
                photoViewer2.f35756q6 = null;
                photoViewer2.f35739o6 = -1;
                return;
        }
    }
}
