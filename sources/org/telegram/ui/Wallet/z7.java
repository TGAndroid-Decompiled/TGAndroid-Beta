package org.telegram.ui.Wallet;
public final class z7 {
    public float f43471a;
    public float f43472b;
    public float f43473c;
    public float d;
    public float f43474e;

    public z7(float f10, float f11, float f12) {
        this.f43472b = f10;
        this.f43471a = f10;
        this.d = f11;
        this.f43474e = f12;
    }

    public final void a(float f10) {
        this.f43472b = f10;
        this.f43471a = f10;
        this.f43473c = 0.0f;
    }

    public final boolean b(float f10) {
        boolean z9;
        float sqrt = this.f43474e * 2.0f * ((float) Math.sqrt(this.d));
        while (f10 > 0.0f) {
            float min = Math.min(f10, 0.0020833334f);
            float f11 = this.f43473c;
            float f12 = this.f43471a;
            float f13 = ((((f12 - this.f43472b) * (-this.d)) - (sqrt * f11)) * min) + f11;
            this.f43473c = f13;
            this.f43471a = (f13 * min) + f12;
            f10 -= min;
        }
        if (Math.abs(this.f43471a - this.f43472b) <= 0.002f && Math.abs(this.f43473c) <= 0.02f) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            a(this.f43472b);
        }
        return z9;
    }
}
