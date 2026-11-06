package org.telegram.ui.Components;
public final class qj0 {
    public float f37430a;
    public float f37431b;
    public float f37432c;
    public float d;
    public float f37433e;
    public boolean f37434f;

    public final void a(float f10, float f11, float f12, float f13) {
        boolean z9;
        this.f37430a = f10;
        this.d = f12;
        this.f37431b = f10 - Math.max(0.0f, Math.min(f11, Math.max(0.0f, f12 - f13)));
        this.f37432c = Math.max(f10, f12);
        if (this.f37431b <= f13 + 0.5f) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f37434f = z9;
        this.f37433e = 0.0f;
    }

    public final float b() {
        if (this.f37434f) {
            return this.f37432c;
        }
        float f10 = this.f37431b;
        return ((this.f37432c - f10) * this.f37433e) + f10;
    }
}
