package org.telegram.ui.Components;
public final class jf0 implements Runnable {
    public final int f36428a;
    public final mf0 f36429b;

    public jf0(mf0 mf0Var, int i7) {
        this.f36428a = i7;
        this.f36429b = mf0Var;
    }

    @Override
    public final void run() {
        switch (this.f36428a) {
            case 0:
                this.f36429b.a(true);
                return;
            default:
                this.f36429b.d();
                return;
        }
    }
}
