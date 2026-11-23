package org.telegram.ui.Components;
public final class fk0 {
    public float f35251a;
    public float f35252b;
    public float f35253c;
    public float d;
    public float f35254e;
    public boolean f35255f;

    public final void a(float f10, float f11, float f12, float f13) {
        boolean z10;
        this.f35251a = f10;
        this.d = f12;
        this.f35252b = f10 - Math.max(0.0f, Math.min(f11, Math.max(0.0f, f12 - f13)));
        this.f35253c = Math.max(f10, f12);
        if (this.f35252b <= f13 + 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35255f = z10;
        this.f35254e = 0.0f;
    }

    public final float b() {
        if (this.f35255f) {
            return this.f35253c;
        }
        float f10 = this.f35252b;
        return ((this.f35253c - f10) * this.f35254e) + f10;
    }
}
