package org.telegram.ui.Wallet;
public final class y7 {
    public float f43389a;
    public float f43390b;
    public float f43391c;
    public float d;
    public float f43392e;

    public y7(float f10, float f11, float f12) {
        this.f43390b = f10;
        this.f43389a = f10;
        this.d = f11;
        this.f43392e = f12;
    }

    public final void a(float f10) {
        this.f43390b = f10;
        this.f43389a = f10;
        this.f43391c = 0.0f;
    }

    public final boolean b(float f10) {
        boolean z9;
        float sqrt = this.f43392e * 2.0f * ((float) Math.sqrt(this.d));
        while (f10 > 0.0f) {
            float min = Math.min(f10, 0.0020833334f);
            float f11 = this.f43391c;
            float f12 = this.f43389a;
            float f13 = ((((f12 - this.f43390b) * (-this.d)) - (sqrt * f11)) * min) + f11;
            this.f43391c = f13;
            this.f43389a = (f13 * min) + f12;
            f10 -= min;
        }
        if (Math.abs(this.f43389a - this.f43390b) <= 0.002f && Math.abs(this.f43391c) <= 0.02f) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            a(this.f43390b);
        }
        return z9;
    }
}
