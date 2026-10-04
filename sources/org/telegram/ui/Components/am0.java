package org.telegram.ui.Components;
public final class am0 {
    public float f24572a;
    public float f24573b;
    public float f24574c;
    public float d;
    public float f24575e;
    public boolean f24576f;

    public final void a(float f7, float f10, float f11, float f12) {
        boolean z10;
        this.f24572a = f7;
        this.d = f11;
        this.f24573b = f7 - Math.max(0.0f, Math.min(f10, Math.max(0.0f, f11 - f12)));
        this.f24574c = Math.max(f7, f11);
        if (this.f24573b <= f12 + 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24576f = z10;
        this.f24575e = 0.0f;
    }

    public final float b() {
        if (this.f24576f) {
            return this.f24574c;
        }
        float f7 = this.f24573b;
        return ((this.f24574c - f7) * this.f24575e) + f7;
    }
}
