package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class eu0 extends AnimatorListenerAdapter {
    public final int f35378a;
    public final int f35379b;
    public final PhotoViewer f35380c;

    public eu0(PhotoViewer photoViewer, int i10, int i11) {
        this.f35378a = i11;
        this.f35380c = photoViewer;
        this.f35379b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35378a) {
            case 0:
                PhotoViewer photoViewer = this.f35380c;
                fu0 fu0Var = photoViewer.N1;
                fu0Var.e.setVisibility(0);
                FrameLayout frameLayout = fu0Var.f44371r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
                org.telegram.messenger.sk.t(translationY, esVar, 320L);
                fu0Var.f44373w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(esVar).setDuration(320L).start();
                photoViewer.f32073u4 = this.f35379b;
                photoViewer.q6 = null;
                photoViewer.f32021o6 = -1;
                return;
            default:
                int i10 = this.f35379b;
                PhotoViewer photoViewer2 = this.f35380c;
                photoViewer2.f32073u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f32021o6 = -1;
                return;
        }
    }
}
