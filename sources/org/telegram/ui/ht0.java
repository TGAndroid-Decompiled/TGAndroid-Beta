package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ht0 extends AnimatorListenerAdapter {
    public final int f37959a;
    public final int f37960b;
    public final PhotoViewer f37961c;

    public ht0(PhotoViewer photoViewer, int i10, int i11) {
        this.f37959a = i11;
        this.f37961c = photoViewer;
        this.f37960b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37959a) {
            case 0:
                PhotoViewer photoViewer = this.f37961c;
                it0 it0Var = photoViewer.N1;
                it0Var.e.setVisibility(0);
                FrameLayout frameLayout = it0Var.f46106r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
                org.telegram.messenger.sl.t(translationY, bsVar, 320L);
                it0Var.f46108w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(bsVar).setDuration(320L).start();
                photoViewer.f33725u4 = this.f37960b;
                photoViewer.q6 = null;
                photoViewer.f33673o6 = -1;
                return;
            default:
                int i10 = this.f37960b;
                PhotoViewer photoViewer2 = this.f37961c;
                photoViewer2.f33725u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f33673o6 = -1;
                return;
        }
    }
}
