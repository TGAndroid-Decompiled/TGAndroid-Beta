package org.telegram.ui.Components;
public final class gf implements o1.g {
    public boolean f24199a = false;
    public final float f24200b;
    public final gv0 f24201c;

    public gf(float f7, gv0 gv0Var) {
        this.f24200b = f7;
        this.f24201c = gv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f24199a && f7 >= this.f24200b) {
            this.f24199a = true;
            try {
                this.f24201c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
