package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
public final class hd implements TimeInterpolator {
    public final int f26709a;

    @Override
    public final float getInterpolation(float f7) {
        switch (this.f26709a) {
            case 0:
                return ((((6.0f * f7) - 15.0f) * f7) + 10.0f) * f7 * f7 * f7;
            default:
                return f7;
        }
    }
}
