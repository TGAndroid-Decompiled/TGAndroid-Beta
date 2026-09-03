package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kt0 extends AnimatorListenerAdapter {
    public final int f38422a;
    public final int f38423b;
    public final PhotoViewer f38424c;

    public kt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f38422a = i11;
        this.f38424c = photoViewer;
        this.f38423b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38422a) {
            case 0:
                PhotoViewer photoViewer = this.f38424c;
                lt0 lt0Var = photoViewer.K1;
                lt0Var.f5391e.setVisibility(0);
                FrameLayout frameLayout = lt0Var.f5394r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
                b.p(translationY, prVar, 320L);
                lt0Var.f5396w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(prVar).setDuration(320L).start();
                photoViewer.f34379r4 = this.f38423b;
                photoViewer.f34344n6 = null;
                photoViewer.f34326l6 = -1;
                return;
            default:
                int i10 = this.f38423b;
                PhotoViewer photoViewer2 = this.f38424c;
                photoViewer2.f34379r4 = i10;
                photoViewer2.f34344n6 = null;
                photoViewer2.f34326l6 = -1;
                return;
        }
    }
}
