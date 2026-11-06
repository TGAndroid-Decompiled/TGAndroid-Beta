package org.telegram.ui.Components;
public final class pa0 implements Runnable {
    public final int f36833a;
    public final qa0 f36834b;

    public pa0(qa0 qa0Var, int i7) {
        this.f36833a = i7;
        this.f36834b = qa0Var;
    }

    @Override
    public final void run() {
        switch (this.f36833a) {
            case 0:
                this.f36834b.y();
                return;
            default:
                this.f36834b.m(true);
                return;
        }
    }
}
