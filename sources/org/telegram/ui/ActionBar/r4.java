package org.telegram.ui.ActionBar;

import android.view.animation.Interpolator;
public final class r4 implements Interpolator {
    public final float f23774a = 1.0f / ((float) (1.0d - Math.pow(100, -1.0f)));

    @Override
    public final float getInterpolation(float f9) {
        return 1.0f - (((float) (1.0d - Math.pow(100, -(1.0f - f9)))) * this.f23774a);
    }
}
