package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
public final class cq0 implements ViewTreeObserver.OnPreDrawListener {
    public final uq0 f46651a;
    public final Integer f46652b;
    public final PhotoViewer f46653c;

    public cq0(PhotoViewer photoViewer, uq0 uq0Var, Integer num) {
        this.f46653c = photoViewer;
        this.f46651a = uq0Var;
        this.f46652b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f46653c;
        photoViewer.f43267h0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.G.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        ViewPropertyAnimator duration = photoViewer.G.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f37956f;
        duration.setInterpolator(nrVar).start();
        photoViewer.O0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar).start();
        photoViewer.P0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.P0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar).start();
        photoViewer.Q0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.Q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
        photoViewer.T0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.T0.setAlpha(0.0f);
        photoViewer.T0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar).start();
        photoViewer.f43365s3.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.f43365s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar).start();
        photoViewer.f43249f0.setAlpha(0.0f);
        photoViewer.M0.setAlpha(0);
        photoViewer.f43320n4 = 4;
        photoViewer.f43249f0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        di.n4 n4Var = photoViewer.Q0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(n4Var, View.TRANSLATION_Y, n4Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(nrVar);
        di.n4 n4Var2 = photoViewer.Q0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(n4Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(nrVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f43249f0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f43291k0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new bq0(this));
        animatorSet.start();
        return true;
    }
}
