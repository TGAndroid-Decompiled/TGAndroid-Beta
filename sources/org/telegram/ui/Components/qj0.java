package org.telegram.ui.Components;
public final class qj0 {
    public float f37315a;
    public float f37316b;
    public float f37317c;
    public float d;
    public float f37318e;
    public boolean f37319f;

    public final void a(float f10, float f11, float f12, float f13) {
        boolean z9;
        this.f37315a = f10;
        this.d = f12;
        this.f37316b = f10 - Math.max(0.0f, Math.min(f11, Math.max(0.0f, f12 - f13)));
        this.f37317c = Math.max(f10, f12);
        if (this.f37316b <= f13 + 0.5f) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f37319f = z9;
        this.f37318e = 0.0f;
    }

    public final float b() {
        if (this.f37319f) {
            return this.f37317c;
        }
        float f10 = this.f37316b;
        return ((this.f37317c - f10) * this.f37318e) + f10;
    }
}
