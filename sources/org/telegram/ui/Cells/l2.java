package org.telegram.ui.Cells;

import android.view.animation.Interpolator;
import org.telegram.messenger.wl;
public final class l2 implements Interpolator {
    public final int f22239a;

    public l2(int i10) {
        this.f22239a = i10;
    }

    @Override
    public final float getInterpolation(float f7) {
        switch (this.f22239a) {
            case 0:
                if (f7 < 0.33f) {
                    return (f7 / 0.33f) * 0.1f;
                }
                float f10 = f7 - 0.33f;
                if (f10 < 0.33f) {
                    return wl.c(f10, 0.34f, 0.15f, 0.1f);
                }
                return (((f10 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
            case 1:
                return f7 * f7 * f7 * f7 * f7;
            case 2:
            case 3:
            case 4:
                float f11 = f7 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            default:
                return (float) Math.pow(f7, 2.0d);
        }
    }
}
