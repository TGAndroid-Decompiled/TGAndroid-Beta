package org.telegram.ui.Wallet;
public final class a8 {
    public float f42104a;
    public float f42105b;
    public float f42106c;
    public float d;
    public float f42107e;

    public a8(float f10, float f11, float f12) {
        this.f42105b = f10;
        this.f42104a = f10;
        this.d = f11;
        this.f42107e = f12;
    }

    public final void a(float f10) {
        this.f42105b = f10;
        this.f42104a = f10;
        this.f42106c = 0.0f;
    }

    public final boolean b(float f10) {
        boolean z9;
        float sqrt = this.f42107e * 2.0f * ((float) Math.sqrt(this.d));
        while (f10 > 0.0f) {
            float min = Math.min(f10, 0.0020833334f);
            float f11 = this.f42106c;
            float f12 = this.f42104a;
            float f13 = ((((f12 - this.f42105b) * (-this.d)) - (sqrt * f11)) * min) + f11;
            this.f42106c = f13;
            this.f42104a = (f13 * min) + f12;
            f10 -= min;
        }
        if (Math.abs(this.f42104a - this.f42105b) <= 0.002f && Math.abs(this.f42106c) <= 0.02f) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            a(this.f42105b);
        }
        return z9;
    }
}
