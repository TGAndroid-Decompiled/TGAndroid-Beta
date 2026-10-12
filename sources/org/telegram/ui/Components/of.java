package org.telegram.ui.Components;
public final class of implements o1.g {
    public boolean f29173a = false;
    public final float f29174b;
    public final ow0 f29175c;

    public of(float f7, ow0 ow0Var) {
        this.f29174b = f7;
        this.f29175c = ow0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f29173a && f7 >= this.f29174b) {
            this.f29173a = true;
            try {
                this.f29175c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
