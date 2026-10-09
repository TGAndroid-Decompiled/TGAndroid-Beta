package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class iu0 implements ViewTreeObserver.OnPreDrawListener {
    public final cv0 f38756a;
    public final Integer f38757b;
    public final PhotoViewer f38758c;

    public iu0(PhotoViewer photoViewer, cv0 cv0Var, Integer num) {
        this.f38758c = photoViewer;
        this.f38756a = cv0Var;
        this.f38757b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f38758c;
        photoViewer.f33921g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.f27118f;
        duration.setInterpolator(hsVar).start();
        photoViewer.N0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(hsVar).start();
        photoViewer.O0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(hsVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(hsVar).start();
        photoViewer.S0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(hsVar).start();
        photoViewer.f34029s3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f34029s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(hsVar).start();
        photoViewer.f33904e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.f33985n4 = 4;
        photoViewer.f33904e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        t5 t5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(t5Var, View.TRANSLATION_Y, t5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(hsVar);
        t5 t5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(t5Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(hsVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f33904e0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f33948j0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new hu0(this));
        animatorSet.start();
        return true;
    }
}
