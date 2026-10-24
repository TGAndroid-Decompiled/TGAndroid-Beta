package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class gt0 extends AnimatorListenerAdapter {
    public final int f37655a;
    public final int f37656b;
    public final PhotoViewer f37657c;

    public gt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f37655a = i11;
        this.f37657c = photoViewer;
        this.f37656b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37655a) {
            case 0:
                PhotoViewer photoViewer = this.f37657c;
                ht0 ht0Var = photoViewer.N1;
                ht0Var.e.setVisibility(0);
                FrameLayout frameLayout = ht0Var.f46105r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.h;
                org.telegram.messenger.tl.t(translationY, zrVar, 320L);
                ht0Var.f46107w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(zrVar).setDuration(320L).start();
                photoViewer.f33727u4 = this.f37656b;
                photoViewer.q6 = null;
                photoViewer.f33675o6 = -1;
                return;
            default:
                int i10 = this.f37656b;
                PhotoViewer photoViewer2 = this.f37657c;
                photoViewer2.f33727u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f33675o6 = -1;
                return;
        }
    }
}
