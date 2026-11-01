package org.telegram.ui.Components;
public final class vk0 {
    public float f31310a;
    public float f31311b;
    public float f31312c;
    public float d;
    public float e;
    public boolean f31313f;

    public final void a(float f7, float f10, float f11, float f12) {
        boolean z10;
        this.f31310a = f7;
        this.d = f11;
        this.f31311b = f7 - Math.max(0.0f, Math.min(f10, Math.max(0.0f, f11 - f12)));
        this.f31312c = Math.max(f7, f11);
        if (this.f31311b <= f12 + 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31313f = z10;
        this.e = 0.0f;
    }

    public final float b() {
        if (this.f31313f) {
            return this.f31312c;
        }
        float f7 = this.f31311b;
        return ((this.f31312c - f7) * this.e) + f7;
    }
}
