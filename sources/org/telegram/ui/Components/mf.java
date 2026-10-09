package org.telegram.ui.Components;
public final class mf implements o1.g {
    public boolean f28825a = false;
    public final float f28826b;
    public final iw0 f28827c;

    public mf(float f7, iw0 iw0Var) {
        this.f28826b = f7;
        this.f28827c = iw0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f28825a && f7 >= this.f28826b) {
            this.f28825a = true;
            try {
                this.f28827c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
