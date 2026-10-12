package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class fu0 extends AnimatorListenerAdapter {
    public final int f36234a;
    public final int f36235b;
    public final PhotoViewer f36236c;

    public fu0(PhotoViewer photoViewer, int i10, int i11) {
        this.f36234a = i11;
        this.f36236c = photoViewer;
        this.f36235b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36234a) {
            case 0:
                PhotoViewer photoViewer = this.f36236c;
                gu0 gu0Var = photoViewer.N1;
                gu0Var.e.setVisibility(0);
                FrameLayout frameLayout = gu0Var.f44612r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
                org.telegram.messenger.yh.s(translationY, esVar, 320L);
                gu0Var.f44614w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(esVar).setDuration(320L).start();
                photoViewer.f32371u4 = this.f36235b;
                photoViewer.q6 = null;
                photoViewer.f32319o6 = -1;
                return;
            default:
                int i10 = this.f36235b;
                PhotoViewer photoViewer2 = this.f36236c;
                photoViewer2.f32371u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f32319o6 = -1;
                return;
        }
    }
}
