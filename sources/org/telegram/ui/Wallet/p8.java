package org.telegram.ui.Wallet;
public final class p8 {
    public float f44795a;
    public float f44796b;
    public float f44797c;
    public float d;
    public float f44798e;

    public p8(float f10, float f11, float f12) {
        this.f44796b = f10;
        this.f44795a = f10;
        this.d = f11;
        this.f44798e = f12;
    }

    public final void a(float f10) {
        this.f44796b = f10;
        this.f44795a = f10;
        this.f44797c = 0.0f;
    }

    public final boolean b(float f10) {
        boolean z10;
        float sqrt = this.f44798e * 2.0f * ((float) Math.sqrt(this.d));
        while (f10 > 0.0f) {
            float min = Math.min(f10, 0.0020833334f);
            float f11 = this.f44797c;
            float f12 = this.f44795a;
            float f13 = ((((f12 - this.f44796b) * (-this.d)) - (sqrt * f11)) * min) + f11;
            this.f44797c = f13;
            this.f44795a = (f13 * min) + f12;
            f10 -= min;
        }
        if (Math.abs(this.f44795a - this.f44796b) <= 0.002f && Math.abs(this.f44797c) <= 0.02f) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            a(this.f44796b);
        }
        return z10;
    }
}
