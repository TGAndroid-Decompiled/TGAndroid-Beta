package org.telegram.ui.Components;
public final class rw implements Runnable {
    public final int f27694a;
    public final yy f27695b;

    public rw(yy yyVar, int i10) {
        this.f27694a = i10;
        this.f27695b = yyVar;
    }

    @Override
    public final void run() {
        switch (this.f27694a) {
            case 0:
            default:
                this.f27695b.d();
                return;
        }
    }
}
