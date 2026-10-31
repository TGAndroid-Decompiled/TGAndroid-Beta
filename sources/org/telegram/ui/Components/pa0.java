package org.telegram.ui.Components;
public final class pa0 implements Runnable {
    public final int f29328a;
    public final qa0 f29329b;

    public pa0(qa0 qa0Var, int i10) {
        this.f29328a = i10;
        this.f29329b = qa0Var;
    }

    @Override
    public final void run() {
        switch (this.f29328a) {
            case 0:
                qa0 qa0Var = this.f29329b;
                if (qa0Var.W != -1) {
                    org.telegram.messenger.zs.f(qa0Var.Y.f30881c0.f24360x).j(qa0Var.W);
                    qa0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f29329b.Y.i();
                return;
            default:
                qa0 qa0Var2 = this.f29329b;
                if (qa0Var2.W != -1) {
                    org.telegram.messenger.zs.f(qa0Var2.Y.f30881c0.f24360x).j(qa0Var2.W);
                    qa0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
