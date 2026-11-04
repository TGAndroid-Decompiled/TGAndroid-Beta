package org.telegram.ui.Components;
public final class uj0 {
    public float f38775a;
    public float f38776b;
    public float f38777c;
    public float d;
    public float f38778e;
    public boolean f38779f;

    public final void a(float f10, float f11, float f12, float f13) {
        boolean z10;
        this.f38775a = f10;
        this.d = f12;
        this.f38776b = f10 - Math.max(0.0f, Math.min(f11, Math.max(0.0f, f12 - f13)));
        this.f38777c = Math.max(f10, f12);
        if (this.f38776b <= f13 + 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38779f = z10;
        this.f38778e = 0.0f;
    }

    public final float b() {
        if (this.f38779f) {
            return this.f38777c;
        }
        float f10 = this.f38776b;
        return ((this.f38777c - f10) * this.f38778e) + f10;
    }
}
