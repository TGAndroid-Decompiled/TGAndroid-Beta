package org.telegram.ui.Components;
public final class rw implements Runnable {
    public final int f27691a;
    public final yy f27692b;

    public rw(yy yyVar, int i10) {
        this.f27691a = i10;
        this.f27692b = yyVar;
    }

    @Override
    public final void run() {
        switch (this.f27691a) {
            case 0:
            default:
                this.f27692b.d();
                return;
        }
    }
}
