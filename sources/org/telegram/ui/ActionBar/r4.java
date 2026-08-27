package org.telegram.ui.ActionBar;

import android.view.animation.Interpolator;

public final class r4 implements Interpolator {

    public final float f23752a = 1.0f / ((float) (1.0d - Math.pow(100, -1.0f)));

    @Override
    public final float getInterpolation(float f10) {
        return 1.0f - (((float) (1.0d - Math.pow(100, -(1.0f - f10)))) * this.f23752a);
    }
}
