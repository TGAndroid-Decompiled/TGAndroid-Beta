package org.telegram.ui.Components;
public final class jf implements o1.g {
    public boolean f29667a = false;
    public final float f29668b;
    public final nw0 f29669c;

    public jf(float f7, nw0 nw0Var) {
        this.f29668b = f7;
        this.f29669c = nw0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f29667a && f7 >= this.f29668b) {
            this.f29667a = true;
            try {
                this.f29669c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
