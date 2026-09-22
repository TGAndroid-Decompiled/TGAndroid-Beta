package org.telegram.ui.Components;
public final class gf implements o1.g {
    public boolean f24327a = false;
    public final float f24328b;
    public final fv0 f24329c;

    public gf(float f7, fv0 fv0Var) {
        this.f24328b = f7;
        this.f24329c = fv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f24327a && f7 >= this.f24328b) {
            this.f24327a = true;
            try {
                this.f24329c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
