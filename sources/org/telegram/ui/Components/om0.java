package org.telegram.ui.Components;
public final class om0 {
    public float f31343a;
    public float f31344b;
    public float f31345c;
    public float d;
    public float e;
    public boolean f31346f;

    public final void a(float f7, float f10, float f11, float f12) {
        boolean z10;
        this.f31343a = f7;
        this.d = f11;
        this.f31344b = f7 - Math.max(0.0f, Math.min(f10, Math.max(0.0f, f11 - f12)));
        this.f31345c = Math.max(f7, f11);
        if (this.f31344b <= f12 + 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31346f = z10;
        this.e = 0.0f;
    }

    public final float b() {
        if (this.f31346f) {
            return this.f31345c;
        }
        float f7 = this.f31344b;
        return ((this.f31345c - f7) * this.e) + f7;
    }
}
