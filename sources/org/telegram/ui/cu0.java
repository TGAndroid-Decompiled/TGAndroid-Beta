package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class cu0 implements ViewTreeObserver.OnPreDrawListener {
    public final wu0 f32793a;
    public final Integer f32794b;
    public final PhotoViewer f32795c;

    public cu0(PhotoViewer photoViewer, wu0 wu0Var, Integer num) {
        this.f32795c = photoViewer;
        this.f32793a = wu0Var;
        this.f32794b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f32795c;
        photoViewer.f31242g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.f28359f;
        duration.setInterpolator(srVar).start();
        photoViewer.N0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(srVar).start();
        photoViewer.O0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(srVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(srVar).start();
        photoViewer.S0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(srVar).start();
        photoViewer.f31350s3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f31350s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(srVar).start();
        photoViewer.f31225e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.f31306n4 = 4;
        photoViewer.f31225e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        v5 v5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(v5Var, View.TRANSLATION_Y, v5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(srVar);
        v5 v5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(v5Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(srVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f31225e0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f31269j0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new bu0(this));
        animatorSet.start();
        return true;
    }
}
