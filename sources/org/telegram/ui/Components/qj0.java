package org.telegram.ui.Components;
public final class qj0 {
    public float f37345a;
    public float f37346b;
    public float f37347c;
    public float d;
    public float f37348e;
    public boolean f37349f;

    public final void a(float f10, float f11, float f12, float f13) {
        boolean z9;
        this.f37345a = f10;
        this.d = f12;
        this.f37346b = f10 - Math.max(0.0f, Math.min(f11, Math.max(0.0f, f12 - f13)));
        this.f37347c = Math.max(f10, f12);
        if (this.f37346b <= f13 + 0.5f) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f37349f = z9;
        this.f37348e = 0.0f;
    }

    public final float b() {
        if (this.f37349f) {
            return this.f37347c;
        }
        float f10 = this.f37346b;
        return ((this.f37347c - f10) * this.f37348e) + f10;
    }
}
