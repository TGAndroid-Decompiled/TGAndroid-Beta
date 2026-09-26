package org.telegram.ui.Components;
public final class ns implements Runnable {
    public final int f26799a;
    public final ss f26800b;

    public ns(ss ssVar, int i10) {
        this.f26799a = i10;
        this.f26800b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f26799a) {
            case 0:
                this.f26800b.W(false);
                return;
            default:
                this.f26800b.N(true);
                return;
        }
    }
}
