package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class gu0 implements ViewTreeObserver.OnPreDrawListener {
    public final cv0 f33187a;
    public final Integer f33188b;
    public final PhotoViewer f33189c;

    public gu0(PhotoViewer photoViewer, cv0 cv0Var, Integer num) {
        this.f33189c = photoViewer;
        this.f33187a = cv0Var;
        this.f33188b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f33189c;
        photoViewer.f30066g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f28819f;
        duration.setInterpolator(wrVar).start();
        photoViewer.N0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wrVar).start();
        photoViewer.O0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wrVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(wrVar).start();
        photoViewer.S0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wrVar).start();
        photoViewer.f30174s3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f30174s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wrVar).start();
        photoViewer.f30049e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.f30130n4 = 4;
        photoViewer.f30049e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        u5 u5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(u5Var, View.TRANSLATION_Y, u5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(wrVar);
        u5 u5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(u5Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(wrVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f30049e0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f30093j0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new fu0(this));
        animatorSet.start();
        return true;
    }
}
