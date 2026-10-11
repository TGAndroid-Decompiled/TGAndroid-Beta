package org.telegram.ui.Components;
public final class mf implements o1.g {
    public boolean f28843a = false;
    public final float f28844b;
    public final jw0 f28845c;

    public mf(float f7, jw0 jw0Var) {
        this.f28844b = f7;
        this.f28845c = jw0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f28843a && f7 >= this.f28844b) {
            this.f28843a = true;
            try {
                this.f28845c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
