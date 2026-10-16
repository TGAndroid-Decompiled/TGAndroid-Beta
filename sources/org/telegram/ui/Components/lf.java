package org.telegram.ui.Components;
public final class lf implements o1.g {
    public boolean f26734a = false;
    public final float f26735b;
    public final ew0 f26736c;

    public lf(float f7, ew0 ew0Var) {
        this.f26735b = f7;
        this.f26736c = ew0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f26734a && f7 >= this.f26735b) {
            this.f26734a = true;
            try {
                this.f26736c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
