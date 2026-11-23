package org.telegram.ui.Components;
public final class fk0 {
    public float f35230a;
    public float f35231b;
    public float f35232c;
    public float d;
    public float f35233e;
    public boolean f35234f;

    public final void a(float f10, float f11, float f12, float f13) {
        boolean z10;
        this.f35230a = f10;
        this.d = f12;
        this.f35231b = f10 - Math.max(0.0f, Math.min(f11, Math.max(0.0f, f12 - f13)));
        this.f35232c = Math.max(f10, f12);
        if (this.f35231b <= f13 + 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35234f = z10;
        this.f35233e = 0.0f;
    }

    public final float b() {
        if (this.f35234f) {
            return this.f35232c;
        }
        float f10 = this.f35231b;
        return ((this.f35232c - f10) * this.f35233e) + f10;
    }
}
