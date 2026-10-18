package org.telegram.ui.Components;
public final class ur0 implements Runnable {
    public final int f31082a;
    public final lu0 f31083b;
    public final int f31084c;

    public ur0(lu0 lu0Var, int i10, int i11) {
        this.f31082a = i11;
        this.f31083b = lu0Var;
        this.f31084c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31082a) {
            case 0:
                this.f31083b.h.scrollBy(0, this.f31084c);
                return;
            default:
                this.f31083b.h.scrollBy(0, this.f31084c);
                return;
        }
    }
}
