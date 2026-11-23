package org.telegram.ui.Wallet;
public final class q8 {
    public float f44967a;
    public float f44968b;
    public float f44969c;
    public float d;
    public float f44970e;

    public q8(float f10, float f11, float f12) {
        this.f44968b = f10;
        this.f44967a = f10;
        this.d = f11;
        this.f44970e = f12;
    }

    public final void a(float f10) {
        this.f44968b = f10;
        this.f44967a = f10;
        this.f44969c = 0.0f;
    }

    public final boolean b(float f10) {
        boolean z10;
        float sqrt = this.f44970e * 2.0f * ((float) Math.sqrt(this.d));
        while (f10 > 0.0f) {
            float min = Math.min(f10, 0.0020833334f);
            float f11 = this.f44969c;
            float f12 = this.f44967a;
            float f13 = ((((f12 - this.f44968b) * (-this.d)) - (sqrt * f11)) * min) + f11;
            this.f44969c = f13;
            this.f44967a = (f13 * min) + f12;
            f10 -= min;
        }
        if (Math.abs(this.f44967a - this.f44968b) <= 0.002f && Math.abs(this.f44969c) <= 0.02f) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            a(this.f44968b);
        }
        return z10;
    }
}
