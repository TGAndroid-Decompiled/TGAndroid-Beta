package org.telegram.ui.Components;

import android.view.animation.Interpolator;
public final class cr0 implements Interpolator {
    public final int f27560a;

    @Override
    public final float getInterpolation(float f9) {
        switch (this.f27560a) {
            case 0:
            case 1:
            case 2:
            case 3:
            default:
                float f10 = f9 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }
}
