package org.telegram.ui.Components;

public final class f7 implements Runnable {

    public final int f28288a;

    public final b8 f28289b;

    public f7(b8 b8Var, int i10) {
        this.f28288a = i10;
        this.f28289b = b8Var;
    }

    @Override
    public final void run() {
        switch (this.f28288a) {
            case 0:
                b8.n(this.f28289b);
                break;
            default:
                b8.G(this.f28289b);
                break;
        }
    }
}
