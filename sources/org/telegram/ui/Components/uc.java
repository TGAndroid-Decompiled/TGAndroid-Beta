package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
public final class uc implements TimeInterpolator {
    public final int f40298a;

    @Override
    public final float getInterpolation(float f10) {
        switch (this.f40298a) {
            case 0:
                return ((((6.0f * f10) - 15.0f) * f10) + 10.0f) * f10 * f10 * f10;
            default:
                return f10;
        }
    }
}
