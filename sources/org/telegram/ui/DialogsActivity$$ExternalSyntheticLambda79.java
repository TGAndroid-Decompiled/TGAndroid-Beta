package org.telegram.ui;

import android.view.animation.Interpolator;

public final class DialogsActivity$$ExternalSyntheticLambda79 implements Interpolator {
    public final int $r8$classId;

    @Override
    public final float getInterpolation(float f) {
        switch (this.$r8$classId) {
            case 0:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            case 1:
                float f3 = f - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            case 2:
                float f4 = f - 1.0f;
                return (f4 * f4 * f4 * f4 * f4) + 1.0f;
            case 3:
                float f5 = f - 1.0f;
                return (f5 * f5 * f5 * f5 * f5) + 1.0f;
            default:
                float f6 = f - 1.0f;
                return (f6 * f6 * f6 * f6 * f6) + 1.0f;
        }
    }
}
