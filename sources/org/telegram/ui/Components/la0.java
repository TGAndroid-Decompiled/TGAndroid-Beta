package org.telegram.ui.Components;
public final class la0 implements Runnable {
    public final int f37109a;
    public final ma0 f37110b;

    public la0(ma0 ma0Var, int i7) {
        this.f37109a = i7;
        this.f37110b = ma0Var;
    }

    @Override
    public final void run() {
        switch (this.f37109a) {
            case 0:
                ma0 ma0Var = this.f37110b;
                if (ma0Var.W != -1) {
                    org.telegram.messenger.ls.f(ma0Var.Y.f38811d0.f41719x).j(ma0Var.W);
                    ma0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f37110b.Y.i();
                return;
            default:
                ma0 ma0Var2 = this.f37110b;
                if (ma0Var2.W != -1) {
                    org.telegram.messenger.ls.f(ma0Var2.Y.f38811d0.f41719x).j(ma0Var2.W);
                    ma0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
