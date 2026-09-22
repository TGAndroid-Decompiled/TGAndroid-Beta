package org.telegram.ui.Components;
public final class ms implements Runnable {
    public final int f26244a;
    public final rs f26245b;

    public ms(rs rsVar, int i10) {
        this.f26244a = i10;
        this.f26245b = rsVar;
    }

    @Override
    public final void run() {
        switch (this.f26244a) {
            case 0:
                this.f26245b.W(false);
                return;
            default:
                this.f26245b.N(true);
                return;
        }
    }
}
