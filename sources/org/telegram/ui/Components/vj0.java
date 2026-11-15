package org.telegram.ui.Components;
public final class vj0 {
    public float f40450a;
    public float f40451b;
    public float f40452c;
    public float d;
    public float f40453e;
    public boolean f40454f;

    public final void a(float f10, float f11, float f12, float f13) {
        boolean z10;
        this.f40450a = f10;
        this.d = f12;
        this.f40451b = f10 - Math.max(0.0f, Math.min(f11, Math.max(0.0f, f12 - f13)));
        this.f40452c = Math.max(f10, f12);
        if (this.f40451b <= f13 + 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40454f = z10;
        this.f40453e = 0.0f;
    }

    public final float b() {
        if (this.f40454f) {
            return this.f40452c;
        }
        float f10 = this.f40451b;
        return ((this.f40452c - f10) * this.f40453e) + f10;
    }
}
