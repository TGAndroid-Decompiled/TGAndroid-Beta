package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class dt0 extends AnimatorListenerAdapter {
    public final int f33799a;
    public final int f33800b;
    public final PhotoViewer f33801c;

    public dt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f33799a = i11;
        this.f33801c = photoViewer;
        this.f33800b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33799a) {
            case 0:
                PhotoViewer photoViewer = this.f33801c;
                et0 et0Var = photoViewer.K1;
                et0Var.e.setVisibility(0);
                FrameLayout frameLayout = et0Var.f4732r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
                b.p(translationY, nrVar, 320L);
                et0Var.f4734w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(nrVar).setDuration(320L).start();
                photoViewer.f31853r4 = this.f33800b;
                photoViewer.f31818n6 = null;
                photoViewer.f31800l6 = -1;
                return;
            default:
                int i10 = this.f33800b;
                PhotoViewer photoViewer2 = this.f33801c;
                photoViewer2.f31853r4 = i10;
                photoViewer2.f31818n6 = null;
                photoViewer2.f31800l6 = -1;
                return;
        }
    }
}
