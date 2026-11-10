package org.telegram.ui.Components;
public final class qj0 {
    public float f37307a;
    public float f37308b;
    public float f37309c;
    public float d;
    public float f37310e;
    public boolean f37311f;

    public final void a(float f10, float f11, float f12, float f13) {
        boolean z9;
        this.f37307a = f10;
        this.d = f12;
        this.f37308b = f10 - Math.max(0.0f, Math.min(f11, Math.max(0.0f, f12 - f13)));
        this.f37309c = Math.max(f10, f12);
        if (this.f37308b <= f13 + 0.5f) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f37311f = z9;
        this.f37310e = 0.0f;
    }

    public final float b() {
        if (this.f37311f) {
            return this.f37309c;
        }
        float f10 = this.f37308b;
        return ((this.f37309c - f10) * this.f37310e) + f10;
    }
}
