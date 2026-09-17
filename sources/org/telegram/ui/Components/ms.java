package org.telegram.ui.Components;
public final class ms implements Runnable {
    public final int f26261a;
    public final rs f26262b;

    public ms(rs rsVar, int i10) {
        this.f26261a = i10;
        this.f26262b = rsVar;
    }

    @Override
    public final void run() {
        switch (this.f26261a) {
            case 0:
                this.f26262b.W(false);
                return;
            default:
                this.f26262b.N(true);
                return;
        }
    }
}
