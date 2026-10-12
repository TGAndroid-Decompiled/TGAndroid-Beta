package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class au0 extends AnimatorListenerAdapter {
    public final int f35980a;
    public final int f35981b;
    public final PhotoViewer f35982c;

    public au0(PhotoViewer photoViewer, int i10, int i11) {
        this.f35980a = i11;
        this.f35982c = photoViewer;
        this.f35981b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35980a) {
            case 0:
                PhotoViewer photoViewer = this.f35982c;
                bu0 bu0Var = photoViewer.N1;
                bu0Var.f46527e.setVisibility(0);
                FrameLayout frameLayout = bu0Var.f46530r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.h;
                org.telegram.messenger.am.t(translationY, jsVar, 320L);
                bu0Var.f46532w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(jsVar).setDuration(320L).start();
                photoViewer.f33885u4 = this.f35981b;
                photoViewer.q6 = null;
                photoViewer.f33833o6 = -1;
                return;
            default:
                int i10 = this.f35981b;
                PhotoViewer photoViewer2 = this.f35982c;
                photoViewer2.f33885u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f33833o6 = -1;
                return;
        }
    }
}
