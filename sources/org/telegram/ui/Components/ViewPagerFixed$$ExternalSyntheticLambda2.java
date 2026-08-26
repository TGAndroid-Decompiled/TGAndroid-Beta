package org.telegram.ui.Components;

import android.view.animation.Interpolator;

public final class ViewPagerFixed$$ExternalSyntheticLambda2 implements Interpolator {
    public final int $r8$classId;

    public ViewPagerFixed$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final float getInterpolation(float f) {
        switch (this.$r8$classId) {
            case 0:
                return ViewPagerFixed.lambda$static$0(f);
            default:
                return SharedMediaLayout.lambda$static$2(f);
        }
    }
}
