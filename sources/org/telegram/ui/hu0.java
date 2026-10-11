package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class hu0 implements ViewTreeObserver.OnPreDrawListener {
    public final bv0 f38508a;
    public final Integer f38509b;
    public final PhotoViewer f38510c;

    public hu0(PhotoViewer photoViewer, bv0 bv0Var, Integer num) {
        this.f38510c = photoViewer;
        this.f38508a = bv0Var;
        this.f38509b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f38510c;
        photoViewer.f33949g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.f27451f;
        duration.setInterpolator(isVar).start();
        photoViewer.N0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(isVar).start();
        photoViewer.O0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(isVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(isVar).start();
        photoViewer.S0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(isVar).start();
        photoViewer.f34057s3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f34057s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(isVar).start();
        photoViewer.f33932e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.f34013n4 = 4;
        photoViewer.f33932e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        s5 s5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(s5Var, View.TRANSLATION_Y, s5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(isVar);
        s5 s5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(s5Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(isVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f33932e0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f33976j0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new gu0(this));
        animatorSet.start();
        return true;
    }
}
