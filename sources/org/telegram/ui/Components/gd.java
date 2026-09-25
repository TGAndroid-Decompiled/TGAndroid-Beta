package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
public final class gd implements TimeInterpolator {
    public final int f24435a;

    @Override
    public final float getInterpolation(float f7) {
        switch (this.f24435a) {
            case 0:
                return ((((6.0f * f7) - 15.0f) * f7) + 10.0f) * f7 * f7 * f7;
            default:
                return f7;
        }
    }
}
