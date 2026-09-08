package org.telegram.ui.Components;

import android.view.animation.Interpolator;
public final class ir0 implements Interpolator {
    public final int f27274a;

    @Override
    public final float getInterpolation(float f7) {
        switch (this.f27274a) {
            case 0:
            case 1:
            case 2:
            case 3:
            default:
                float f10 = f7 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }
}
