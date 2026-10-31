package org.telegram.ui.Components;
public final class ib0 implements Runnable {
    public final int f26949a;
    public final jb0 f26950b;

    public ib0(jb0 jb0Var, int i10) {
        this.f26949a = i10;
        this.f26950b = jb0Var;
    }

    @Override
    public final void run() {
        switch (this.f26949a) {
            case 0:
                this.f26950b.y();
                return;
            default:
                this.f26950b.m(true);
                return;
        }
    }
}
