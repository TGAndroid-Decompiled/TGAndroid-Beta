package org.telegram.ui.Components;
public final class vj0 {
    public float f40447a;
    public float f40448b;
    public float f40449c;
    public float d;
    public float f40450e;
    public boolean f40451f;

    public final void a(float f10, float f11, float f12, float f13) {
        boolean z10;
        this.f40447a = f10;
        this.d = f12;
        this.f40448b = f10 - Math.max(0.0f, Math.min(f11, Math.max(0.0f, f12 - f13)));
        this.f40449c = Math.max(f10, f12);
        if (this.f40448b <= f13 + 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40451f = z10;
        this.f40450e = 0.0f;
    }

    public final float b() {
        if (this.f40451f) {
            return this.f40449c;
        }
        float f10 = this.f40448b;
        return ((this.f40449c - f10) * this.f40450e) + f10;
    }
}
