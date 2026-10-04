package org.telegram.ui.Components;
public final class am0 {
    public float f24571a;
    public float f24572b;
    public float f24573c;
    public float d;
    public float f24574e;
    public boolean f24575f;

    public final void a(float f7, float f10, float f11, float f12) {
        boolean z10;
        this.f24571a = f7;
        this.d = f11;
        this.f24572b = f7 - Math.max(0.0f, Math.min(f10, Math.max(0.0f, f11 - f12)));
        this.f24573c = Math.max(f7, f11);
        if (this.f24572b <= f12 + 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24575f = z10;
        this.f24574e = 0.0f;
    }

    public final float b() {
        if (this.f24575f) {
            return this.f24573c;
        }
        float f7 = this.f24572b;
        return ((this.f24573c - f7) * this.f24574e) + f7;
    }
}
