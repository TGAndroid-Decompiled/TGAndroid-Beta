package org.telegram.ui.Components;
public final class ur0 implements Runnable {
    public final int f31075a;
    public final lu0 f31076b;
    public final int f31077c;

    public ur0(lu0 lu0Var, int i10, int i11) {
        this.f31075a = i11;
        this.f31076b = lu0Var;
        this.f31077c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31075a) {
            case 0:
                this.f31076b.h.scrollBy(0, this.f31077c);
                return;
            default:
                this.f31076b.h.scrollBy(0, this.f31077c);
                return;
        }
    }
}
