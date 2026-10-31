package org.telegram.ui.Components;
public final class dq0 implements Runnable {
    public final int f25513a;
    public final ss0 f25514b;
    public final int f25515c;

    public dq0(ss0 ss0Var, int i10, int i11) {
        this.f25513a = i11;
        this.f25514b = ss0Var;
        this.f25515c = i10;
    }

    @Override
    public final void run() {
        switch (this.f25513a) {
            case 0:
                this.f25514b.h.scrollBy(0, this.f25515c);
                return;
            case 1:
                this.f25514b.h.scrollBy(0, this.f25515c);
                return;
            default:
                this.f25514b.h.scrollBy(0, this.f25515c);
                return;
        }
    }
}
