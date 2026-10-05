package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class cu0 implements ViewTreeObserver.OnPreDrawListener {
    public final wu0 f35550a;
    public final Integer f35551b;
    public final PhotoViewer f35552c;

    public cu0(PhotoViewer photoViewer, wu0 wu0Var, Integer num) {
        this.f35552c = photoViewer;
        this.f35550a = wu0Var;
        this.f35551b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f35552c;
        photoViewer.f33931g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.f31215f;
        duration.setInterpolator(trVar).start();
        photoViewer.N0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(trVar).start();
        photoViewer.O0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(trVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(trVar).start();
        photoViewer.S0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(trVar).start();
        photoViewer.f34039s3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f34039s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(trVar).start();
        photoViewer.f33914e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.f33995n4 = 4;
        photoViewer.f33914e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        u5 u5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(u5Var, View.TRANSLATION_Y, u5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(trVar);
        u5 u5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(u5Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(trVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f33914e0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f33958j0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new bu0(this));
        animatorSet.start();
        return true;
    }
}
