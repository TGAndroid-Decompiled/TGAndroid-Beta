package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class et0 extends AnimatorListenerAdapter {
    public final int f36805a;
    public final int f36806b;
    public final PhotoViewer f36807c;

    public et0(PhotoViewer photoViewer, int i10, int i11) {
        this.f36805a = i11;
        this.f36807c = photoViewer;
        this.f36806b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36805a) {
            case 0:
                PhotoViewer photoViewer = this.f36807c;
                ft0 ft0Var = photoViewer.N1;
                ft0Var.e.setVisibility(0);
                FrameLayout frameLayout = ft0Var.f45688r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
                org.telegram.messenger.nk.t(translationY, bsVar, 320L);
                ft0Var.f45690w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(bsVar).setDuration(320L).start();
                photoViewer.f33428u4 = this.f36806b;
                photoViewer.q6 = null;
                photoViewer.f33376o6 = -1;
                return;
            default:
                int i10 = this.f36806b;
                PhotoViewer photoViewer2 = this.f36807c;
                photoViewer2.f33428u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f33376o6 = -1;
                return;
        }
    }
}
