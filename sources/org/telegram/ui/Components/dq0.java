package org.telegram.ui.Components;

import android.view.animation.Interpolator;
public final class dq0 implements Interpolator {
    public final int f34552a;

    @Override
    public final float getInterpolation(float f10) {
        switch (this.f34552a) {
            case 0:
            case 1:
            case 2:
            case 3:
            default:
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }
}
