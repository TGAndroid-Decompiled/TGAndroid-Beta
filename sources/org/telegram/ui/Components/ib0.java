package org.telegram.ui.Components;
public final class ib0 implements Runnable {
    public final int f27064a;
    public final jb0 f27065b;

    public ib0(jb0 jb0Var, int i10) {
        this.f27064a = i10;
        this.f27065b = jb0Var;
    }

    @Override
    public final void run() {
        switch (this.f27064a) {
            case 0:
                this.f27065b.y();
                return;
            default:
                this.f27065b.m(true);
                return;
        }
    }
}
