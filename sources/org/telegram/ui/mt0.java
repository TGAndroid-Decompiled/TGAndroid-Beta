package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class mt0 implements ViewTreeObserver.OnPreDrawListener {
    public final hu0 f36380a;
    public final Integer f36381b;
    public final PhotoViewer f36382c;

    public mt0(PhotoViewer photoViewer, hu0 hu0Var, Integer num) {
        this.f36382c = photoViewer;
        this.f36380a = hu0Var;
        this.f36381b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f36382c;
        photoViewer.f31723d0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.C.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.C.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f27346f;
        duration.setInterpolator(nrVar).start();
        photoViewer.K0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.K0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar).start();
        photoViewer.L0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.L0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar).start();
        photoViewer.M0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.M0.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.setAlpha(0.0f);
        photoViewer.P0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar).start();
        photoViewer.f31833p3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f31833p3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar).start();
        photoViewer.f31705b0.setAlpha(0.0f);
        photoViewer.I0.setAlpha(0);
        photoViewer.f31790k4 = 4;
        photoViewer.f31705b0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        dg.s1 s1Var = photoViewer.M0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(s1Var, View.TRANSLATION_Y, s1Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(nrVar);
        dg.s1 s1Var2 = photoViewer.M0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(s1Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(nrVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f31705b0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f31750g0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new lt0(this));
        animatorSet.start();
        return true;
    }
}
