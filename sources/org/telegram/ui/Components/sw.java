package org.telegram.ui.Components;
public final class sw implements Runnable {
    public final int f28326a;
    public final yy f28327b;

    public sw(yy yyVar, int i10) {
        this.f28326a = i10;
        this.f28327b = yyVar;
    }

    @Override
    public final void run() {
        switch (this.f28326a) {
            case 0:
            default:
                this.f28327b.d();
                return;
        }
    }
}
