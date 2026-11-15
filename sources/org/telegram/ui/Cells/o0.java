package org.telegram.ui.Cells;

import org.telegram.ui.Components.ch0;
public final class o0 implements Runnable {
    public final int f30784a;
    public final ch0 f30785b;

    public o0(ch0 ch0Var, int i7) {
        this.f30784a = i7;
        this.f30785b = ch0Var;
    }

    @Override
    public final void run() {
        switch (this.f30784a) {
            case 0:
                this.f30785b.H(false);
                return;
            default:
                this.f30785b.start();
                return;
        }
    }
}
