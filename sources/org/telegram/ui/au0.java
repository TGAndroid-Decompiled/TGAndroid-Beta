package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class au0 implements ViewTreeObserver.OnPreDrawListener {
    public final uu0 f31885a;
    public final Integer f31886b;
    public final PhotoViewer f31887c;

    public au0(PhotoViewer photoViewer, uu0 uu0Var, Integer num) {
        this.f31887c = photoViewer;
        this.f31885a = uu0Var;
        this.f31886b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f31887c;
        photoViewer.f30925g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f27701f;
        duration.setInterpolator(rrVar).start();
        photoViewer.N0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
        photoViewer.O0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
        photoViewer.S0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
        photoViewer.f31033s3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f31033s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
        photoViewer.f30908e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.f30989n4 = 4;
        photoViewer.f30908e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        u5 u5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(u5Var, View.TRANSLATION_Y, u5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(rrVar);
        u5 u5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(u5Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(rrVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f30908e0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f30952j0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new zt0(this));
        animatorSet.start();
        return true;
    }
}
