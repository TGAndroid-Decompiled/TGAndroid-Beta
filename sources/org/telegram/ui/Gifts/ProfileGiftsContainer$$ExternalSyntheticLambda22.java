package org.telegram.ui.Gifts;

import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.Utilities;

public final class ProfileGiftsContainer$$ExternalSyntheticLambda22 implements FactorAnimator.Target, Utilities.Callback2Return {
    public final ProfileGiftsContainer f$0;

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        this.f$0.lambda$new$14(i, f, f2, factorAnimator);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        return this.f$0.lambda$new$1((Integer) obj, (Integer) obj2);
    }
}
