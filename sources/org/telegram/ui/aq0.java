package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
public final class aq0 implements ViewTreeObserver.OnPreDrawListener {
    public final tq0 f44056a;
    public final Integer f44057b;
    public final PhotoViewer f44058c;

    public aq0(PhotoViewer photoViewer, tq0 tq0Var, Integer num) {
        this.f44058c = photoViewer;
        this.f44056a = tq0Var;
        this.f44057b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f44058c;
        photoViewer.f41375g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40310f;
        duration.setInterpolator(xqVar).start();
        photoViewer.N0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
        photoViewer.O0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
        photoViewer.P0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
        photoViewer.S0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
        photoViewer.f41472r3.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.f41472r3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
        photoViewer.f41356e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.f41428m4 = 4;
        photoViewer.f41356e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        bi.m5 m5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(m5Var, View.TRANSLATION_Y, m5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(xqVar);
        bi.m5 m5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(m5Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(xqVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f41356e0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f41400j0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new zp0(this));
        animatorSet.start();
        return true;
    }
}
