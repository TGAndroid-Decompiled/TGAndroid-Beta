package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class gt0 extends AnimatorListenerAdapter {
    public final int f37336a;
    public final int f37337b;
    public final PhotoViewer f37338c;

    public gt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f37336a = i11;
        this.f37338c = photoViewer;
        this.f37337b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37336a) {
            case 0:
                PhotoViewer photoViewer = this.f37338c;
                ht0 ht0Var = photoViewer.N1;
                ht0Var.e.setVisibility(0);
                FrameLayout frameLayout = ht0Var.f45702r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
                org.telegram.messenger.wh.t(translationY, bsVar, 320L);
                ht0Var.f45704w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(bsVar).setDuration(320L).start();
                photoViewer.f33411u4 = this.f37337b;
                photoViewer.q6 = null;
                photoViewer.f33359o6 = -1;
                return;
            default:
                int i10 = this.f37337b;
                PhotoViewer photoViewer2 = this.f37338c;
                photoViewer2.f33411u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f33359o6 = -1;
                return;
        }
    }
}
