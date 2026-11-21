package org.telegram.ui.Components;
public final class fk0 {
    public float f35249a;
    public float f35250b;
    public float f35251c;
    public float d;
    public float f35252e;
    public boolean f35253f;

    public final void a(float f10, float f11, float f12, float f13) {
        boolean z10;
        this.f35249a = f10;
        this.d = f12;
        this.f35250b = f10 - Math.max(0.0f, Math.min(f11, Math.max(0.0f, f12 - f13)));
        this.f35251c = Math.max(f10, f12);
        if (this.f35250b <= f13 + 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35253f = z10;
        this.f35252e = 0.0f;
    }

    public final float b() {
        if (this.f35253f) {
            return this.f35251c;
        }
        float f10 = this.f35250b;
        return ((this.f35251c - f10) * this.f35252e) + f10;
    }
}
