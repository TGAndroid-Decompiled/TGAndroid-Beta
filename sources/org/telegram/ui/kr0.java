package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
public final class kr0 implements ViewTreeObserver.OnPreDrawListener {
    public final ds0 f38964a;
    public final Integer f38965b;
    public final PhotoViewer f38966c;

    public kr0(PhotoViewer photoViewer, ds0 ds0Var, Integer num) {
        this.f38966c = photoViewer;
        this.f38964a = ds0Var;
        this.f38965b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f38966c;
        photoViewer.f33494g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-org.telegram.messenger.i0.L(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26523f;
        duration.setInterpolator(grVar).start();
        photoViewer.N0.setTranslationY(-org.telegram.messenger.i0.L(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
        photoViewer.O0.setTranslationY(-org.telegram.messenger.i0.L(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
        photoViewer.P0.setTranslationY(org.telegram.messenger.i0.L(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
        photoViewer.S0.setTranslationY(org.telegram.messenger.i0.L(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
        photoViewer.f33603s3.setTranslationY(org.telegram.messenger.i0.L(32.0f));
        photoViewer.f33603s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
        photoViewer.f33477e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.f33559n4 = 4;
        photoViewer.f33477e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        jg.b1 b1Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(b1Var, View.TRANSLATION_Y, b1Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(grVar);
        jg.b1 b1Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(b1Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(grVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f33477e0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f33521j0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new jr0(this));
        animatorSet.start();
        return true;
    }
}
