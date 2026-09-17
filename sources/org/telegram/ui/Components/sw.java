package org.telegram.ui.Components;
public final class sw implements Runnable {
    public final int f30459a;
    public final yy f30460b;

    public sw(yy yyVar, int i10) {
        this.f30459a = i10;
        this.f30460b = yyVar;
    }

    @Override
    public final void run() {
        switch (this.f30459a) {
            case 0:
            default:
                this.f30460b.d();
                return;
        }
    }
}
