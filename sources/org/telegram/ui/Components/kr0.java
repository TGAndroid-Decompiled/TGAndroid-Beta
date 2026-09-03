package org.telegram.ui.Components;

import android.view.animation.Interpolator;
public final class kr0 implements Interpolator {
    public final int f28487a;

    @Override
    public final float getInterpolation(float f10) {
        switch (this.f28487a) {
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
