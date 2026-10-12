package org.telegram.ui.Components;
public final class of implements o1.g {
    public boolean f29169a = false;
    public final float f29170b;
    public final ow0 f29171c;

    public of(float f7, ow0 ow0Var) {
        this.f29170b = f7;
        this.f29171c = ow0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f29169a && f7 >= this.f29170b) {
            this.f29169a = true;
            try {
                this.f29171c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
