package org.telegram.ui.Components;
public final class qj0 {
    public float f37320a;
    public float f37321b;
    public float f37322c;
    public float d;
    public float f37323e;
    public boolean f37324f;

    public final void a(float f10, float f11, float f12, float f13) {
        boolean z9;
        this.f37320a = f10;
        this.d = f12;
        this.f37321b = f10 - Math.max(0.0f, Math.min(f11, Math.max(0.0f, f12 - f13)));
        this.f37322c = Math.max(f10, f12);
        if (this.f37321b <= f13 + 0.5f) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f37324f = z9;
        this.f37323e = 0.0f;
    }

    public final float b() {
        if (this.f37324f) {
            return this.f37322c;
        }
        float f10 = this.f37321b;
        return ((this.f37322c - f10) * this.f37323e) + f10;
    }
}
