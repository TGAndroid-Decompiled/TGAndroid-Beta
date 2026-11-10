package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
public final class eq0 implements ViewTreeObserver.OnPreDrawListener {
    public final xq0 f45431a;
    public final Integer f45432b;
    public final PhotoViewer f45433c;

    public eq0(PhotoViewer photoViewer, xq0 xq0Var, Integer num) {
        this.f45433c = photoViewer;
        this.f45431a = xq0Var;
        this.f45432b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f45433c;
        photoViewer.f41401g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f40046f;
        duration.setInterpolator(wqVar).start();
        photoViewer.N0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wqVar).start();
        photoViewer.O0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wqVar).start();
        photoViewer.P0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(wqVar).start();
        photoViewer.S0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wqVar).start();
        photoViewer.f41498r3.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.f41498r3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wqVar).start();
        photoViewer.f41382e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.f41454m4 = 4;
        photoViewer.f41382e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        bi.m5 m5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(m5Var, View.TRANSLATION_Y, m5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(wqVar);
        bi.m5 m5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(m5Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(wqVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f41382e0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f41426j0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new dq0(this));
        animatorSet.start();
        return true;
    }
}
