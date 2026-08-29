package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class dt0 implements ViewTreeObserver.OnPreDrawListener {
    public final xt0 f37630a;
    public final Integer f37631b;
    public final PhotoViewer f37632c;

    public dt0(PhotoViewer photoViewer, xt0 xt0Var, Integer num) {
        this.f37632c = photoViewer;
        this.f37630a = xt0Var;
        this.f37631b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f37632c;
        photoViewer.f35666c0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.B.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.B.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f29800f;
        duration.setInterpolator(jrVar).start();
        photoViewer.J0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.J0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar).start();
        photoViewer.K0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.K0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar).start();
        photoViewer.L0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.L0.animate().alpha(1.0f).setDuration(150L).setInterpolator(jrVar).start();
        photoViewer.O0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.O0.setAlpha(0.0f);
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar).start();
        photoViewer.f35776o3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f35776o3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar).start();
        photoViewer.f35647a0.setAlpha(0.0f);
        photoViewer.H0.setAlpha(0);
        photoViewer.f35733j4 = 4;
        photoViewer.f35647a0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        bg.u1 u1Var = photoViewer.L0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(u1Var, View.TRANSLATION_Y, u1Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(jrVar);
        bg.u1 u1Var2 = photoViewer.L0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(u1Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(jrVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f35647a0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f35693f0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new ct0(this));
        animatorSet.start();
        return true;
    }
}
