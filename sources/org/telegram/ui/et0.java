package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class et0 extends AnimatorListenerAdapter {
    public final int f36794a;
    public final int f36795b;
    public final PhotoViewer f36796c;

    public et0(PhotoViewer photoViewer, int i10, int i11) {
        this.f36794a = i11;
        this.f36796c = photoViewer;
        this.f36795b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36794a) {
            case 0:
                PhotoViewer photoViewer = this.f36796c;
                ft0 ft0Var = photoViewer.N1;
                ft0Var.e.setVisibility(0);
                FrameLayout frameLayout = ft0Var.f45676r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
                org.telegram.messenger.kk.t(translationY, bsVar, 320L);
                ft0Var.f45678w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(bsVar).setDuration(320L).start();
                photoViewer.f33417u4 = this.f36795b;
                photoViewer.q6 = null;
                photoViewer.f33365o6 = -1;
                return;
            default:
                int i10 = this.f36795b;
                PhotoViewer photoViewer2 = this.f36796c;
                photoViewer2.f33417u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f33365o6 = -1;
                return;
        }
    }
}
