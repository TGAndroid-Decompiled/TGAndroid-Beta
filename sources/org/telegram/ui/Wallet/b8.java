package org.telegram.ui.Wallet;
public final class b8 {
    public float f42183a;
    public float f42184b;
    public float f42185c;
    public float d;
    public float f42186e;

    public b8(float f10, float f11, float f12) {
        this.f42184b = f10;
        this.f42183a = f10;
        this.d = f11;
        this.f42186e = f12;
    }

    public final void a(float f10) {
        this.f42184b = f10;
        this.f42183a = f10;
        this.f42185c = 0.0f;
    }

    public final boolean b(float f10) {
        boolean z9;
        float sqrt = this.f42186e * 2.0f * ((float) Math.sqrt(this.d));
        while (f10 > 0.0f) {
            float min = Math.min(f10, 0.0020833334f);
            float f11 = this.f42185c;
            float f12 = this.f42183a;
            float f13 = ((((f12 - this.f42184b) * (-this.d)) - (sqrt * f11)) * min) + f11;
            this.f42185c = f13;
            this.f42183a = (f13 * min) + f12;
            f10 -= min;
        }
        if (Math.abs(this.f42183a - this.f42184b) <= 0.002f && Math.abs(this.f42185c) <= 0.02f) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            a(this.f42184b);
        }
        return z9;
    }
}
