package org.telegram.ui.Wallet;
public final class z7 {
    public float f43511a;
    public float f43512b;
    public float f43513c;
    public float d;
    public float f43514e;

    public z7(float f10, float f11, float f12) {
        this.f43512b = f10;
        this.f43511a = f10;
        this.d = f11;
        this.f43514e = f12;
    }

    public final void a(float f10) {
        this.f43512b = f10;
        this.f43511a = f10;
        this.f43513c = 0.0f;
    }

    public final boolean b(float f10) {
        boolean z10;
        float sqrt = this.f43514e * 2.0f * ((float) Math.sqrt(this.d));
        while (f10 > 0.0f) {
            float min = Math.min(f10, 0.0020833334f);
            float f11 = this.f43513c;
            float f12 = this.f43511a;
            float f13 = ((((f12 - this.f43512b) * (-this.d)) - (sqrt * f11)) * min) + f11;
            this.f43513c = f13;
            this.f43511a = (f13 * min) + f12;
            f10 -= min;
        }
        if (Math.abs(this.f43511a - this.f43512b) <= 0.002f && Math.abs(this.f43513c) <= 0.02f) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            a(this.f43512b);
        }
        return z10;
    }
}
