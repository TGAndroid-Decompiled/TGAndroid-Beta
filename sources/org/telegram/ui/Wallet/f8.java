package org.telegram.ui.Wallet;
public final class f8 {
    public float f34506a;
    public float f34507b;
    public float f34508c;
    public float d;
    public float e;

    public f8(float f7, float f10, float f11) {
        this.f34507b = f7;
        this.f34506a = f7;
        this.d = f10;
        this.e = f11;
    }

    public final void a(float f7) {
        this.f34507b = f7;
        this.f34506a = f7;
        this.f34508c = 0.0f;
    }

    public final boolean b(float f7) {
        boolean z10;
        float sqrt = this.e * 2.0f * ((float) Math.sqrt(this.d));
        while (f7 > 0.0f) {
            float min = Math.min(f7, 0.0020833334f);
            float f10 = this.f34508c;
            float f11 = this.f34506a;
            float f12 = ((((f11 - this.f34507b) * (-this.d)) - (sqrt * f10)) * min) + f10;
            this.f34508c = f12;
            this.f34506a = (f12 * min) + f11;
            f7 -= min;
        }
        if (Math.abs(this.f34506a - this.f34507b) <= 0.002f && Math.abs(this.f34508c) <= 0.02f) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            a(this.f34507b);
        }
        return z10;
    }
}
