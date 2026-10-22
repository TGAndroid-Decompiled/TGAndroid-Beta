package org.telegram.ui.Components;

import android.view.animation.Interpolator;
public final class gs0 implements Interpolator {
    public final int f26660a;

    @Override
    public final float getInterpolation(float f7) {
        switch (this.f26660a) {
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
