package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class ft0 implements ViewTreeObserver.OnPreDrawListener {
    public final zt0 f38344a;
    public final Integer f38345b;
    public final PhotoViewer f38346c;

    public ft0(PhotoViewer photoViewer, zt0 zt0Var, Integer num) {
        this.f38346c = photoViewer;
        this.f38344a = zt0Var;
        this.f38345b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f38346c;
        photoViewer.f35598c0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.B.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.B.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f28844f;
        duration.setInterpolator(grVar).start();
        photoViewer.J0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.J0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
        photoViewer.K0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.K0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
        photoViewer.L0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.L0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
        photoViewer.O0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.O0.setAlpha(0.0f);
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
        photoViewer.f35710o3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f35710o3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
        photoViewer.f35580a0.setAlpha(0.0f);
        photoViewer.H0.setAlpha(0);
        photoViewer.f35667j4 = 4;
        photoViewer.f35580a0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        bh.g gVar = photoViewer.L0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(gVar, View.TRANSLATION_Y, gVar.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(grVar);
        bh.g gVar2 = photoViewer.L0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(gVar2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(grVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f35580a0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f35627f0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new et0(this));
        animatorSet.start();
        return true;
    }
}
