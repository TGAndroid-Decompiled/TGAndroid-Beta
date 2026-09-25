package org.telegram.ui.Components;
public final class ns implements Runnable {
    public final int f26800a;
    public final ss f26801b;

    public ns(ss ssVar, int i10) {
        this.f26800a = i10;
        this.f26801b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f26800a) {
            case 0:
                this.f26801b.W(false);
                return;
            default:
                this.f26801b.N(true);
                return;
        }
    }
}
