package org.telegram.ui.Components;
public final class mf implements o1.g {
    public boolean f28774a = false;
    public final float f28775b;
    public final jw0 f28776c;

    public mf(float f7, jw0 jw0Var) {
        this.f28775b = f7;
        this.f28776c = jw0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f28774a && f7 >= this.f28775b) {
            this.f28774a = true;
            try {
                this.f28776c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
