package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class gu0 implements ViewTreeObserver.OnPreDrawListener {
    public final av0 f36788a;
    public final Integer f36789b;
    public final PhotoViewer f36790c;

    public gu0(PhotoViewer photoViewer, av0 av0Var, Integer num) {
        this.f36790c = photoViewer;
        this.f36788a = av0Var;
        this.f36789b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f36790c;
        photoViewer.f33566g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f29466f;
        duration.setInterpolator(prVar).start();
        photoViewer.N0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
        photoViewer.O0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
        photoViewer.S0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
        photoViewer.f33674s3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f33674s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
        photoViewer.f33549e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.f33630n4 = 4;
        photoViewer.f33549e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        t5 t5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(t5Var, View.TRANSLATION_Y, t5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(prVar);
        t5 t5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(t5Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(prVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f33549e0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f33593j0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new fu0(this));
        animatorSet.start();
        return true;
    }
}
