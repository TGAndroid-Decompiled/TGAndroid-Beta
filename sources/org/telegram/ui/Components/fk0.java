package org.telegram.ui.Components;
public final class fk0 {
    public float f35152a;
    public float f35153b;
    public float f35154c;
    public float d;
    public float f35155e;
    public boolean f35156f;

    public final void a(float f10, float f11, float f12, float f13) {
        boolean z10;
        this.f35152a = f10;
        this.d = f12;
        this.f35153b = f10 - Math.max(0.0f, Math.min(f11, Math.max(0.0f, f12 - f13)));
        this.f35154c = Math.max(f10, f12);
        if (this.f35153b <= f13 + 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35156f = z10;
        this.f35155e = 0.0f;
    }

    public final float b() {
        if (this.f35156f) {
            return this.f35154c;
        }
        float f10 = this.f35153b;
        return ((this.f35154c - f10) * this.f35155e) + f10;
    }
}
