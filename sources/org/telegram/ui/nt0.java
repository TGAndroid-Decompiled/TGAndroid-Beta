package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nt0 extends AnimatorListenerAdapter {
    public final int f41883a;
    public final int f41884b;
    public final PhotoViewer f41885c;

    public nt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f41883a = i11;
        this.f41885c = photoViewer;
        this.f41884b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41883a) {
            case 0:
                PhotoViewer photoViewer = this.f41885c;
                ot0 ot0Var = photoViewer.N1;
                ot0Var.e.setVisibility(0);
                FrameLayout frameLayout = ot0Var.f48583r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
                org.telegram.messenger.wh.q(translationY, dsVar, 320L);
                ot0Var.f48585w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(dsVar).setDuration(320L).start();
                photoViewer.f35815u4 = this.f41884b;
                photoViewer.f35780q6 = null;
                photoViewer.f35763o6 = -1;
                return;
            default:
                int i10 = this.f41884b;
                PhotoViewer photoViewer2 = this.f41885c;
                photoViewer2.f35815u4 = i10;
                photoViewer2.f35780q6 = null;
                photoViewer2.f35763o6 = -1;
                return;
        }
    }
}
