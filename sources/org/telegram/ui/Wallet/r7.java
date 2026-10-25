package org.telegram.ui.Wallet;
public final class r7 {
    public float f37188a;
    public float f37189b;
    public float f37190c;
    public float d;
    public float e;

    public r7(float f7, float f10, float f11) {
        this.f37189b = f7;
        this.f37188a = f7;
        this.d = f10;
        this.e = f11;
    }

    public final void a(float f7) {
        this.f37189b = f7;
        this.f37188a = f7;
        this.f37190c = 0.0f;
    }

    public final boolean b(float f7) {
        boolean z10;
        float sqrt = this.e * 2.0f * ((float) Math.sqrt(this.d));
        while (f7 > 0.0f) {
            float min = Math.min(f7, 0.0020833334f);
            float f10 = this.f37190c;
            float f11 = this.f37188a;
            float f12 = ((((f11 - this.f37189b) * (-this.d)) - (sqrt * f10)) * min) + f10;
            this.f37190c = f12;
            this.f37188a = (f12 * min) + f11;
            f7 -= min;
        }
        if (Math.abs(this.f37188a - this.f37189b) <= 0.002f && Math.abs(this.f37190c) <= 0.02f) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            a(this.f37189b);
        }
        return z10;
    }
}
