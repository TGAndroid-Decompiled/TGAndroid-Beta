package org.telegram.ui.Components;
public final class ms implements Runnable {
    public final int f26264a;
    public final rs f26265b;

    public ms(rs rsVar, int i10) {
        this.f26264a = i10;
        this.f26265b = rsVar;
    }

    @Override
    public final void run() {
        switch (this.f26264a) {
            case 0:
                this.f26265b.W(false);
                return;
            default:
                this.f26265b.N(true);
                return;
        }
    }
}
