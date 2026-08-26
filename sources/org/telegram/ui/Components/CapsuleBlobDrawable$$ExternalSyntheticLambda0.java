package org.telegram.ui.Components;

import android.animation.TimeInterpolator;

public final class CapsuleBlobDrawable$$ExternalSyntheticLambda0 implements TimeInterpolator {
    public final int $r8$classId;

    @Override
    public final float getInterpolation(float f) {
        switch (this.$r8$classId) {
            case 0:
                return ((((6.0f * f) - 15.0f) * f) + 10.0f) * f * f * f;
            default:
                return f;
        }
    }
}
