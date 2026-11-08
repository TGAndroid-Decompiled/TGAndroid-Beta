package org.telegram.ui.Components;
public final class pa0 implements Runnable {
    public final int f36875a;
    public final qa0 f36876b;

    public pa0(qa0 qa0Var, int i7) {
        this.f36875a = i7;
        this.f36876b = qa0Var;
    }

    @Override
    public final void run() {
        switch (this.f36875a) {
            case 0:
                this.f36876b.y();
                return;
            default:
                this.f36876b.m(true);
                return;
        }
    }
}
