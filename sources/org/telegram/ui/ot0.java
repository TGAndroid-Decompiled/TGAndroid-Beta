package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class ot0 implements ViewTreeObserver.OnPreDrawListener {
    public final ju0 f39839a;
    public final Integer f39840b;
    public final PhotoViewer f39841c;

    public ot0(PhotoViewer photoViewer, ju0 ju0Var, Integer num) {
        this.f39841c = photoViewer;
        this.f39839a = ju0Var;
        this.f39840b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f39841c;
        photoViewer.f34248d0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.C.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.C.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f30183f;
        duration.setInterpolator(prVar).start();
        photoViewer.K0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.K0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
        photoViewer.L0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.L0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
        photoViewer.M0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.M0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.setAlpha(0.0f);
        photoViewer.P0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
        photoViewer.f34359p3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f34359p3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
        photoViewer.f34230b0.setAlpha(0.0f);
        photoViewer.I0.setAlpha(0);
        photoViewer.f34316k4 = 4;
        photoViewer.f34230b0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        eg.q1 q1Var = photoViewer.M0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(q1Var, View.TRANSLATION_Y, q1Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(prVar);
        eg.q1 q1Var2 = photoViewer.M0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(q1Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(prVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f34230b0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f34276g0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new nt0(this));
        animatorSet.start();
        return true;
    }
}
