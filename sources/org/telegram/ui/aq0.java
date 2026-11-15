package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
public final class aq0 implements ViewTreeObserver.OnPreDrawListener {
    public final sq0 f45484a;
    public final Integer f45485b;
    public final PhotoViewer f45486c;

    public aq0(PhotoViewer photoViewer, sq0 sq0Var, Integer num) {
        this.f45486c = photoViewer;
        this.f45484a = sq0Var;
        this.f45485b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f45486c;
        photoViewer.f42781h0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.G.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        ViewPropertyAnimator duration = photoViewer.G.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f34420f;
        duration.setInterpolator(erVar).start();
        photoViewer.O0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
        photoViewer.P0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.P0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
        photoViewer.Q0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.Q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
        photoViewer.T0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.T0.setAlpha(0.0f);
        photoViewer.T0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
        photoViewer.f42879s3.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.f42879s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
        photoViewer.f42763f0.setAlpha(0.0f);
        photoViewer.M0.setAlpha(0);
        photoViewer.f42834n4 = 4;
        photoViewer.f42763f0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        di.k4 k4Var = photoViewer.Q0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(k4Var, View.TRANSLATION_Y, k4Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(erVar);
        di.k4 k4Var2 = photoViewer.Q0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(k4Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(erVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f42763f0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f42805k0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new zp0(this));
        animatorSet.start();
        return true;
    }
}
