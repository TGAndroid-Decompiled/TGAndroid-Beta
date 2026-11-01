package org.telegram.ui.Components;
public final class pa0 implements Runnable {
    public final int f29393a;
    public final qa0 f29394b;

    public pa0(qa0 qa0Var, int i10) {
        this.f29393a = i10;
        this.f29394b = qa0Var;
    }

    @Override
    public final void run() {
        switch (this.f29393a) {
            case 0:
                qa0 qa0Var = this.f29394b;
                if (qa0Var.W != -1) {
                    org.telegram.messenger.at.f(qa0Var.Y.f30915c0.f24344x).j(qa0Var.W);
                    qa0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f29394b.Y.i();
                return;
            default:
                qa0 qa0Var2 = this.f29394b;
                if (qa0Var2.W != -1) {
                    org.telegram.messenger.at.f(qa0Var2.Y.f30915c0.f24344x).j(qa0Var2.W);
                    qa0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
