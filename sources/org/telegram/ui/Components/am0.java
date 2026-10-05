package org.telegram.ui.Components;
public final class am0 {
    public float f24642a;
    public float f24643b;
    public float f24644c;
    public float d;
    public float f24645e;
    public boolean f24646f;

    public final void a(float f7, float f10, float f11, float f12) {
        boolean z10;
        this.f24642a = f7;
        this.d = f11;
        this.f24643b = f7 - Math.max(0.0f, Math.min(f10, Math.max(0.0f, f11 - f12)));
        this.f24644c = Math.max(f7, f11);
        if (this.f24643b <= f12 + 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24646f = z10;
        this.f24645e = 0.0f;
    }

    public final float b() {
        if (this.f24646f) {
            return this.f24644c;
        }
        float f7 = this.f24643b;
        return ((this.f24644c - f7) * this.f24645e) + f7;
    }
}
