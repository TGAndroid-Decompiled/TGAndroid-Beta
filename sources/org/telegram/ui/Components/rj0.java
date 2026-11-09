package org.telegram.ui.Components;
public final class rj0 {
    public float f37719a;
    public float f37720b;
    public float f37721c;
    public float d;
    public float f37722e;
    public boolean f37723f;

    public final void a(float f10, float f11, float f12, float f13) {
        boolean z9;
        this.f37719a = f10;
        this.d = f12;
        this.f37720b = f10 - Math.max(0.0f, Math.min(f11, Math.max(0.0f, f12 - f13)));
        this.f37721c = Math.max(f10, f12);
        if (this.f37720b <= f13 + 0.5f) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f37723f = z9;
        this.f37722e = 0.0f;
    }

    public final float b() {
        if (this.f37723f) {
            return this.f37721c;
        }
        float f10 = this.f37720b;
        return ((this.f37721c - f10) * this.f37722e) + f10;
    }
}
