package org.telegram.ui.Components;
public final class rw implements Runnable {
    public final int f27706a;
    public final yy f27707b;

    public rw(yy yyVar, int i10) {
        this.f27706a = i10;
        this.f27707b = yyVar;
    }

    @Override
    public final void run() {
        switch (this.f27706a) {
            case 0:
            default:
                this.f27707b.d();
                return;
        }
    }
}
