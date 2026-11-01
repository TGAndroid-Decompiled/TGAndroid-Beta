package org.telegram.ui.Components;
public final class lm implements Runnable {
    public final int f28205a;
    public final jn f28206b;
    public final int f28207c;

    public lm(jn jnVar, int i10, int i11) {
        this.f28205a = i11;
        this.f28206b = jnVar;
        this.f28207c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28205a) {
            case 0:
                this.f28206b.h0(this.f28207c, null);
                return;
            case 1:
                this.f28206b.e0(this.f28207c);
                return;
            default:
                this.f28206b.h0(this.f28207c, null);
                return;
        }
    }
}
