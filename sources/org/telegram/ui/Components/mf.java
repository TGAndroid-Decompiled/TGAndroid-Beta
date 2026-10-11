package org.telegram.ui.Components;
public final class mf implements o1.g {
    public boolean f28663a = false;
    public final float f28664b;
    public final kw0 f28665c;

    public mf(float f7, kw0 kw0Var) {
        this.f28664b = f7;
        this.f28665c = kw0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f28663a && f7 >= this.f28664b) {
            this.f28663a = true;
            try {
                this.f28665c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
