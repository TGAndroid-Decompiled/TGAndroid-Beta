package org.telegram.ui.Components;
public final class uk0 {
    public float f30956a;
    public float f30957b;
    public float f30958c;
    public float d;
    public float e;
    public boolean f30959f;

    public final void a(float f7, float f10, float f11, float f12) {
        boolean z10;
        this.f30956a = f7;
        this.d = f11;
        this.f30957b = f7 - Math.max(0.0f, Math.min(f10, Math.max(0.0f, f11 - f12)));
        this.f30958c = Math.max(f7, f11);
        if (this.f30957b <= f12 + 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30959f = z10;
        this.e = 0.0f;
    }

    public final float b() {
        if (this.f30959f) {
            return this.f30958c;
        }
        float f7 = this.f30957b;
        return ((this.f30958c - f7) * this.e) + f7;
    }
}
