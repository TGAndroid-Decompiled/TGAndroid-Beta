package org.telegram.ui.Wallet;
public final class a8 {
    public float f43482a;
    public float f43483b;
    public float f43484c;
    public float d;
    public float f43485e;

    public a8(float f10, float f11, float f12) {
        this.f43483b = f10;
        this.f43482a = f10;
        this.d = f11;
        this.f43485e = f12;
    }

    public final void a(float f10) {
        this.f43483b = f10;
        this.f43482a = f10;
        this.f43484c = 0.0f;
    }

    public final boolean b(float f10) {
        boolean z10;
        float sqrt = this.f43485e * 2.0f * ((float) Math.sqrt(this.d));
        while (f10 > 0.0f) {
            float min = Math.min(f10, 0.0020833334f);
            float f11 = this.f43484c;
            float f12 = this.f43482a;
            float f13 = ((((f12 - this.f43483b) * (-this.d)) - (sqrt * f11)) * min) + f11;
            this.f43484c = f13;
            this.f43482a = (f13 * min) + f12;
            f10 -= min;
        }
        if (Math.abs(this.f43482a - this.f43483b) <= 0.002f && Math.abs(this.f43484c) <= 0.02f) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            a(this.f43483b);
        }
        return z10;
    }
}
