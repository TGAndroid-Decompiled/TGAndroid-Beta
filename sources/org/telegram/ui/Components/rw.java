package org.telegram.ui.Components;
public final class rw implements Runnable {
    public final int f27709a;
    public final yy f27710b;

    public rw(yy yyVar, int i10) {
        this.f27709a = i10;
        this.f27710b = yyVar;
    }

    @Override
    public final void run() {
        switch (this.f27709a) {
            case 0:
            default:
                this.f27710b.d();
                return;
        }
    }
}
