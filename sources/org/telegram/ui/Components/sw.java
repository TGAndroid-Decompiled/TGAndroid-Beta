package org.telegram.ui.Components;
public final class sw implements Runnable {
    public final int f28215a;
    public final yy f28216b;

    public sw(yy yyVar, int i10) {
        this.f28215a = i10;
        this.f28216b = yyVar;
    }

    @Override
    public final void run() {
        switch (this.f28215a) {
            case 0:
            default:
                this.f28216b.d();
                return;
        }
    }
}
