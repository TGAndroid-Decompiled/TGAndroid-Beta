package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class hu0 implements ViewTreeObserver.OnPreDrawListener {
    public final bv0 f34345a;
    public final Integer f34346b;
    public final PhotoViewer f34347c;

    public hu0(PhotoViewer photoViewer, bv0 bv0Var, Integer num) {
        this.f34347c = photoViewer;
        this.f34345a = bv0Var;
        this.f34346b = num;
    }

    @Override
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.f34347c;
        photoViewer.f30953g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27423f;
        duration.setInterpolator(qrVar).start();
        photoViewer.N0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(qrVar).start();
        photoViewer.O0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(qrVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
        photoViewer.S0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(qrVar).start();
        photoViewer.f31061s3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.f31061s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(qrVar).start();
        photoViewer.f30936e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.f31017n4 = 4;
        photoViewer.f30936e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        t5 t5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(t5Var, View.TRANSLATION_Y, t5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(qrVar);
        t5 t5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(t5Var2, property, 1.0f).setDuration(220L);
        duration3.setInterpolator(qrVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f30936e0, property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f30980j0, property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new gu0(this));
        animatorSet.start();
        return true;
    }
}
