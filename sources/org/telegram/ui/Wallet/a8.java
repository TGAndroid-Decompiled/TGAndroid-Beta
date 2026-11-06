package org.telegram.ui.Wallet;
public final class a8 {
    public float f42080a;
    public float f42081b;
    public float f42082c;
    public float d;
    public float f42083e;

    public a8(float f10, float f11, float f12) {
        this.f42081b = f10;
        this.f42080a = f10;
        this.d = f11;
        this.f42083e = f12;
    }

    public final void a(float f10) {
        this.f42081b = f10;
        this.f42080a = f10;
        this.f42082c = 0.0f;
    }

    public final boolean b(float f10) {
        boolean z9;
        float sqrt = this.f42083e * 2.0f * ((float) Math.sqrt(this.d));
        while (f10 > 0.0f) {
            float min = Math.min(f10, 0.0020833334f);
            float f11 = this.f42082c;
            float f12 = this.f42080a;
            float f13 = ((((f12 - this.f42081b) * (-this.d)) - (sqrt * f11)) * min) + f11;
            this.f42082c = f13;
            this.f42080a = (f13 * min) + f12;
            f10 -= min;
        }
        if (Math.abs(this.f42080a - this.f42081b) <= 0.002f && Math.abs(this.f42082c) <= 0.02f) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            a(this.f42081b);
        }
        return z9;
    }
}
