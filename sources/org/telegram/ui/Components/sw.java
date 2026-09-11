package org.telegram.ui.Components;
public final class sw implements Runnable {
    public final int f30431a;
    public final yy f30432b;

    public sw(yy yyVar, int i10) {
        this.f30431a = i10;
        this.f30432b = yyVar;
    }

    @Override
    public final void run() {
        switch (this.f30431a) {
            case 0:
            default:
                this.f30432b.d();
                return;
        }
    }
}
