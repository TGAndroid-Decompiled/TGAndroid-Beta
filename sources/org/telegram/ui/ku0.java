package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class ku0 implements ViewTreeObserver.OnPreDrawListener {
    public final ev0 f39580a;
    public final Integer f39581b;
    public final PhotoViewer f39582c;

    public ku0(PhotoViewer photoViewer, ev0 ev0Var, Integer num) {
        this.f39582c = photoViewer;
        this.f39580a = ev0Var;
        this.f39581b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f39582c;
        photoViewer.f33760g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.f27634f;
        duration.setInterpolator(jsVar).start();
        photoViewer.N0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jsVar).start();
        photoViewer.O0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jsVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(jsVar).start();
        photoViewer.S0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jsVar).start();
        photoViewer.f33868s3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f33868s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jsVar).start();
        photoViewer.f33743e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.f33824n4 = 4;
        photoViewer.f33743e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        w5 w5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(w5Var, View.TRANSLATION_Y, w5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(jsVar);
        w5 w5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(w5Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(jsVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f33743e0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f33787j0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new ju0(this));
        animatorSet.start();
        return true;
    }
}
