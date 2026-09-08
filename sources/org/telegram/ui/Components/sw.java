package org.telegram.ui.Components;
public final class sw implements Runnable {
    public final int f30458a;
    public final yy f30459b;

    public sw(yy yyVar, int i10) {
        this.f30458a = i10;
        this.f30459b = yyVar;
    }

    @Override
    public final void run() {
        switch (this.f30458a) {
            case 0:
            default:
                this.f30459b.d();
                return;
        }
    }
}
