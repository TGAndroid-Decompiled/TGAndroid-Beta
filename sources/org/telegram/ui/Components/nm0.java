package org.telegram.ui.Components;
public final class nm0 {
    public float f31042a;
    public float f31043b;
    public float f31044c;
    public float d;
    public float e;
    public boolean f31045f;

    public final void a(float f7, float f10, float f11, float f12) {
        boolean z10;
        this.f31042a = f7;
        this.d = f11;
        this.f31043b = f7 - Math.max(0.0f, Math.min(f10, Math.max(0.0f, f11 - f12)));
        this.f31044c = Math.max(f7, f11);
        if (this.f31043b <= f12 + 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31045f = z10;
        this.e = 0.0f;
    }

    public final float b() {
        if (this.f31045f) {
            return this.f31044c;
        }
        float f7 = this.f31043b;
        return ((this.f31044c - f7) * this.e) + f7;
    }
}
