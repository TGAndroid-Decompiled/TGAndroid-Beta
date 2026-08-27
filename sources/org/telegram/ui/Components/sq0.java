package org.telegram.ui.Components;

import android.view.animation.Interpolator;

public final class sq0 implements Interpolator {

    public final int f32555a;

    @Override
    public final float getInterpolation(float f10) {
        switch (this.f32555a) {
        }
        float f11 = f10 - 1.0f;
        return (f11 * f11 * f11 * f11 * f11) + 1.0f;
    }
}
