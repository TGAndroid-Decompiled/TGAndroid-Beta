package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class nt0 implements ViewTreeObserver.OnPreDrawListener {
    public final hu0 f39689a;
    public final Integer f39690b;
    public final PhotoViewer f39691c;

    public nt0(PhotoViewer photoViewer, hu0 hu0Var, Integer num) {
        this.f39691c = photoViewer;
        this.f39689a = hu0Var;
        this.f39690b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f39691c;
        photoViewer.f33300g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25025f;
        duration.setInterpolator(bsVar).start();
        photoViewer.N0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(bsVar).start();
        photoViewer.O0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(bsVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
        photoViewer.S0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(bsVar).start();
        photoViewer.f33409s3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f33409s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(bsVar).start();
        photoViewer.f33283e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.f33365n4 = 4;
        photoViewer.f33283e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        ai.o5 o5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(o5Var, View.TRANSLATION_Y, o5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(bsVar);
        ai.o5 o5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(o5Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(bsVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f33283e0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f33327j0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new mt0(this));
        animatorSet.start();
        return true;
    }
}
