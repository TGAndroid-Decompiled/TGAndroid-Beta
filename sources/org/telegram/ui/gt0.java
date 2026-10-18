package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class gt0 extends AnimatorListenerAdapter {
    public final int f37355a;
    public final int f37356b;
    public final PhotoViewer f37357c;

    public gt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f37355a = i11;
        this.f37357c = photoViewer;
        this.f37356b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37355a) {
            case 0:
                PhotoViewer photoViewer = this.f37357c;
                ht0 ht0Var = photoViewer.N1;
                ht0Var.e.setVisibility(0);
                FrameLayout frameLayout = ht0Var.f45722r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
                org.telegram.messenger.kk.t(translationY, bsVar, 320L);
                ht0Var.f45724w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(bsVar).setDuration(320L).start();
                photoViewer.f33418u4 = this.f37356b;
                photoViewer.q6 = null;
                photoViewer.f33366o6 = -1;
                return;
            default:
                int i10 = this.f37356b;
                PhotoViewer photoViewer2 = this.f37357c;
                photoViewer2.f33418u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f33366o6 = -1;
                return;
        }
    }
}
