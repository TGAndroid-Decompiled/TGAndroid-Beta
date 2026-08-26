package org.telegram.ui.Components;

import android.view.View;
import me.vkryl.android.animator.FactorAnimator;

public final class RadialProgress2$$ExternalSyntheticLambda0 implements FactorAnimator.Target, BetterRatingView.OnRatingChangeListener {
    public final View f$0;

    @Override
    public void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        this.f$0.invalidate();
    }
}
