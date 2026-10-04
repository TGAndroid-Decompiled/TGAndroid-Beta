package org.telegram.ui.Components;
public final class am0 {
    public float f24576a;
    public float f24577b;
    public float f24578c;
    public float d;
    public float f24579e;
    public boolean f24580f;

    public final void a(float f7, float f10, float f11, float f12) {
        boolean z10;
        this.f24576a = f7;
        this.d = f11;
        this.f24577b = f7 - Math.max(0.0f, Math.min(f10, Math.max(0.0f, f11 - f12)));
        this.f24578c = Math.max(f7, f11);
        if (this.f24577b <= f12 + 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24580f = z10;
        this.f24579e = 0.0f;
    }

    public final float b() {
        if (this.f24580f) {
            return this.f24578c;
        }
        float f7 = this.f24577b;
        return ((this.f24578c - f7) * this.f24579e) + f7;
    }
}
