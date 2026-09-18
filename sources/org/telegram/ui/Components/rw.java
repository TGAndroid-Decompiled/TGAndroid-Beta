package org.telegram.ui.Components;
public final class rw implements Runnable {
    public final int f27979a;
    public final yy f27980b;

    public rw(yy yyVar, int i10) {
        this.f27979a = i10;
        this.f27980b = yyVar;
    }

    @Override
    public final void run() {
        switch (this.f27979a) {
            case 0:
            default:
                this.f27980b.d();
                return;
        }
    }
}
