package org.telegram.ui.Components;
public final class sw implements Runnable {
    public final int f30432a;
    public final yy f30433b;

    public sw(yy yyVar, int i10) {
        this.f30432a = i10;
        this.f30433b = yyVar;
    }

    @Override
    public final void run() {
        switch (this.f30432a) {
            case 0:
            default:
                this.f30433b.d();
                return;
        }
    }
}
