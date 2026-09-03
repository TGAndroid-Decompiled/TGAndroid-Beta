package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kt0 extends AnimatorListenerAdapter {
    public final int f35583a;
    public final int f35584b;
    public final PhotoViewer f35585c;

    public kt0(PhotoViewer photoViewer, int i10, int i11) {
        this.f35583a = i11;
        this.f35585c = photoViewer;
        this.f35584b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35583a) {
            case 0:
                PhotoViewer photoViewer = this.f35585c;
                lt0 lt0Var = photoViewer.K1;
                lt0Var.e.setVisibility(0);
                FrameLayout frameLayout = lt0Var.f4738r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
                b.p(translationY, mrVar, 320L);
                lt0Var.f4740w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(mrVar).setDuration(320L).start();
                photoViewer.f31827r4 = this.f35584b;
                photoViewer.f31792n6 = null;
                photoViewer.f31774l6 = -1;
                return;
            default:
                int i10 = this.f35584b;
                PhotoViewer photoViewer2 = this.f35585c;
                photoViewer2.f31827r4 = i10;
                photoViewer2.f31792n6 = null;
                photoViewer2.f31774l6 = -1;
                return;
        }
    }
}
