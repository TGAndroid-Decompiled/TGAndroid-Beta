package org.telegram.ui.Wallet;
public final class p8 {
    public float f44835a;
    public float f44836b;
    public float f44837c;
    public float d;
    public float f44838e;

    public p8(float f10, float f11, float f12) {
        this.f44836b = f10;
        this.f44835a = f10;
        this.d = f11;
        this.f44838e = f12;
    }

    public final void a(float f10) {
        this.f44836b = f10;
        this.f44835a = f10;
        this.f44837c = 0.0f;
    }

    public final boolean b(float f10) {
        boolean z10;
        float sqrt = this.f44838e * 2.0f * ((float) Math.sqrt(this.d));
        while (f10 > 0.0f) {
            float min = Math.min(f10, 0.0020833334f);
            float f11 = this.f44837c;
            float f12 = this.f44835a;
            float f13 = ((((f12 - this.f44836b) * (-this.d)) - (sqrt * f11)) * min) + f11;
            this.f44837c = f13;
            this.f44835a = (f13 * min) + f12;
            f10 -= min;
        }
        if (Math.abs(this.f44835a - this.f44836b) <= 0.002f && Math.abs(this.f44837c) <= 0.02f) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            a(this.f44836b);
        }
        return z10;
    }
}
