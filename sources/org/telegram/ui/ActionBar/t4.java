package org.telegram.ui.ActionBar;

import android.view.animation.Interpolator;
public final class t4 implements Interpolator {
    public final float f21378a = 1.0f / ((float) (1.0d - Math.pow(100, -1.0f)));

    @Override
    public final float getInterpolation(float f7) {
        return 1.0f - (((float) (1.0d - Math.pow(100, -(1.0f - f7)))) * this.f21378a);
    }
}
