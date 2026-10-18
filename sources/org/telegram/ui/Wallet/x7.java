package org.telegram.ui.Wallet;
public final class x7 {
    public float f35096a;
    public float f35097b;
    public float f35098c;
    public float d;
    public float e;

    public x7(float f7, float f10, float f11) {
        this.f35097b = f7;
        this.f35096a = f7;
        this.d = f10;
        this.e = f11;
    }

    public final void a(float f7) {
        this.f35097b = f7;
        this.f35096a = f7;
        this.f35098c = 0.0f;
    }

    public final boolean b(float f7) {
        boolean z10;
        float sqrt = this.e * 2.0f * ((float) Math.sqrt(this.d));
        while (f7 > 0.0f) {
            float min = Math.min(f7, 0.0020833334f);
            float f10 = this.f35098c;
            float f11 = this.f35096a;
            float f12 = ((((f11 - this.f35097b) * (-this.d)) - (sqrt * f10)) * min) + f10;
            this.f35098c = f12;
            this.f35096a = (f12 * min) + f11;
            f7 -= min;
        }
        if (Math.abs(this.f35096a - this.f35097b) <= 0.002f && Math.abs(this.f35098c) <= 0.02f) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            a(this.f35097b);
        }
        return z10;
    }
}
