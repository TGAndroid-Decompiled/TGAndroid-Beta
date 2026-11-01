package org.telegram.messenger;

import android.view.animation.Interpolator;
public final class z implements Interpolator {
    public final double f19648a;
    public final double f19649b;
    public final double f19650c;
    public final double d;

    public z(double d, double d10, double d11, double d12) {
        this.f19648a = d;
        this.f19649b = d10;
        this.f19650c = d11;
        this.d = d12;
    }

    @Override
    public final float getInterpolation(float f7) {
        double exp;
        double d = this.f19648a;
        int i10 = (d > 1.0d ? 1 : (d == 1.0d ? 0 : -1));
        double d10 = this.d;
        double d11 = this.f19649b;
        if (i10 < 0) {
            double exp2 = Math.exp((-f7) * d * d11);
            double d12 = this.f19650c * f7;
            exp = 1.0d - (((Math.sin(d12) * d10) + (Math.cos(d12) * 1.0d)) * exp2);
        } else {
            exp = 1.0d - (Math.exp((-f7) * d11) * ((d10 * f7) + 1.0d));
        }
        return (float) exp;
    }
}
