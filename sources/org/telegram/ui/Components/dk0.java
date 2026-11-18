package org.telegram.ui.Components;
public final class dk0 {
    public float f34457a;
    public float f34458b;
    public float f34459c;
    public float d;
    public float f34460e;
    public boolean f34461f;

    public final void a(float f10, float f11, float f12, float f13) {
        boolean z10;
        this.f34457a = f10;
        this.d = f12;
        this.f34458b = f10 - Math.max(0.0f, Math.min(f11, Math.max(0.0f, f12 - f13)));
        this.f34459c = Math.max(f10, f12);
        if (this.f34458b <= f13 + 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34461f = z10;
        this.f34460e = 0.0f;
    }

    public final float b() {
        if (this.f34461f) {
            return this.f34459c;
        }
        float f10 = this.f34458b;
        return ((this.f34459c - f10) * this.f34460e) + f10;
    }
}
