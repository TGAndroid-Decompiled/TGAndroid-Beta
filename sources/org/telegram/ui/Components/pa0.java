package org.telegram.ui.Components;
public final class pa0 implements Runnable {
    public final int f36882a;
    public final qa0 f36883b;

    public pa0(qa0 qa0Var, int i7) {
        this.f36882a = i7;
        this.f36883b = qa0Var;
    }

    @Override
    public final void run() {
        switch (this.f36882a) {
            case 0:
                this.f36883b.y();
                return;
            default:
                this.f36883b.m(true);
                return;
        }
    }
}
