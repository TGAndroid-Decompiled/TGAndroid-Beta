package org.telegram.ui.Components;
public final class jh0 implements Runnable {
    public final int f25450a;
    public final mh0 f25451b;

    public jh0(mh0 mh0Var, int i10) {
        this.f25450a = i10;
        this.f25451b = mh0Var;
    }

    @Override
    public final void run() {
        switch (this.f25450a) {
            case 0:
                this.f25451b.a(true);
                return;
            default:
                this.f25451b.d();
                return;
        }
    }
}
