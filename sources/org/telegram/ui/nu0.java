package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class nu0 implements ViewTreeObserver.OnPreDrawListener {
    public final hv0 f38476a;
    public final Integer f38477b;
    public final PhotoViewer f38478c;

    public nu0(PhotoViewer photoViewer, hv0 hv0Var, Integer num) {
        this.f38478c = photoViewer;
        this.f38476a = hv0Var;
        this.f38477b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f38478c;
        photoViewer.f31945g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24465f;
        duration.setInterpolator(esVar).start();
        photoViewer.N0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(esVar).start();
        photoViewer.O0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(esVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
        photoViewer.S0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(esVar).start();
        photoViewer.f32054s3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f32054s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(esVar).start();
        photoViewer.f31928e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.f32010n4 = 4;
        photoViewer.f31928e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        x5 x5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(x5Var, View.TRANSLATION_Y, x5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(esVar);
        x5 x5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(x5Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(esVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f31928e0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f31972j0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new mu0(this));
        animatorSet.start();
        return true;
    }
}
