package org.telegram.ui.Components;
public final class pa0 implements Runnable {
    public final int f36954a;
    public final qa0 f36955b;

    public pa0(qa0 qa0Var, int i7) {
        this.f36954a = i7;
        this.f36955b = qa0Var;
    }

    @Override
    public final void run() {
        switch (this.f36954a) {
            case 0:
                this.f36955b.y();
                return;
            default:
                this.f36955b.m(true);
                return;
        }
    }
}
