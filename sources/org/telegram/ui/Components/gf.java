package org.telegram.ui.Components;
public final class gf implements o1.g {
    public boolean f24202a = false;
    public final float f24203b;
    public final gv0 f24204c;

    public gf(float f7, gv0 gv0Var) {
        this.f24203b = f7;
        this.f24204c = gv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f24202a && f7 >= this.f24203b) {
            this.f24202a = true;
            try {
                this.f24204c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
