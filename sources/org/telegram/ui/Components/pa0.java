package org.telegram.ui.Components;
public final class pa0 implements Runnable {
    public final int f36849a;
    public final qa0 f36850b;

    public pa0(qa0 qa0Var, int i7) {
        this.f36849a = i7;
        this.f36850b = qa0Var;
    }

    @Override
    public final void run() {
        switch (this.f36849a) {
            case 0:
                this.f36850b.y();
                return;
            default:
                this.f36850b.m(true);
                return;
        }
    }
}
