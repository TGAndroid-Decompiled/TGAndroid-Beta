package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
public final class lc implements TimeInterpolator {
    public final int f36749a;

    @Override
    public final float getInterpolation(float f10) {
        switch (this.f36749a) {
            case 0:
                return ((((6.0f * f10) - 15.0f) * f10) + 10.0f) * f10 * f10 * f10;
            default:
                return f10;
        }
    }
}
