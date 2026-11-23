package org.telegram.ui.Components;
public final class la0 implements Runnable {
    public final int f37152a;
    public final ma0 f37153b;

    public la0(ma0 ma0Var, int i7) {
        this.f37152a = i7;
        this.f37153b = ma0Var;
    }

    @Override
    public final void run() {
        switch (this.f37152a) {
            case 0:
                ma0 ma0Var = this.f37153b;
                if (ma0Var.W != -1) {
                    org.telegram.messenger.ls.f(ma0Var.Y.f38857d0.f41745x).j(ma0Var.W);
                    ma0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f37153b.Y.i();
                return;
            default:
                ma0 ma0Var2 = this.f37153b;
                if (ma0Var2.W != -1) {
                    org.telegram.messenger.ls.f(ma0Var2.Y.f38857d0.f41745x).j(ma0Var2.W);
                    ma0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
