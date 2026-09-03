package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class la implements ValueAnimator.AnimatorUpdateListener {
    public final int f38595a;
    public final ma f38596b;

    public la(ma maVar, int i10) {
        this.f38595a = i10;
        this.f38596b = maVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38595a) {
            case 0:
                ma maVar = this.f38596b;
                maVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                maVar.f38901n = floatValue;
                maVar.f38900f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                maVar.d.setAlpha(maVar.f38901n);
                return;
            default:
                ma maVar2 = this.f38596b;
                maVar2.getClass();
                maVar2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.k6.f22055z6;
                org.telegram.ui.ActionBar.g6 g6Var = maVar2.f38897b;
                int d = i0.a.d(maVar2.B, org.telegram.ui.ActionBar.k6.v0(i10, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21841n6, g6Var));
                maVar2.f38899e.b(d);
                maVar2.f38900f.setTextColor(d);
                return;
        }
    }
}
