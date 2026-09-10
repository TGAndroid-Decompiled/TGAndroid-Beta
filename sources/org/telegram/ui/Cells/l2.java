package org.telegram.ui.Cells;

import android.view.animation.Interpolator;
import org.telegram.messenger.em;
public final class l2 implements Interpolator {
    public final int f19474a;

    public l2(int i10) {
        this.f19474a = i10;
    }

    @Override
    public final float getInterpolation(float f7) {
        switch (this.f19474a) {
            case 0:
                if (f7 < 0.33f) {
                    return (f7 / 0.33f) * 0.1f;
                }
                float f10 = f7 - 0.33f;
                if (f10 < 0.33f) {
                    return em.c(f10, 0.34f, 0.15f, 0.1f);
                }
                return (((f10 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
            case 1:
                return f7 * f7 * f7 * f7 * f7;
            case 2:
            case 3:
            default:
                float f11 = f7 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            case 4:
                return (float) Math.pow(f7, 2.0d);
        }
    }
}
