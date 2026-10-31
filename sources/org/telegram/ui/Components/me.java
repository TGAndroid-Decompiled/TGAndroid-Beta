package org.telegram.ui.Components;
public final class me implements o1.g {
    public boolean f28423a = false;
    public final float f28424b;
    public final lu0 f28425c;

    public me(float f7, lu0 lu0Var) {
        this.f28424b = f7;
        this.f28425c = lu0Var;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        if (!this.f28423a && f7 >= this.f28424b) {
            this.f28423a = true;
            try {
                this.f28425c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
