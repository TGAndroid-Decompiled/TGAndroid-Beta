package org.telegram.ui.Components;
public final class ms implements Runnable {
    public final int f26519a;
    public final rs f26520b;

    public ms(rs rsVar, int i10) {
        this.f26519a = i10;
        this.f26520b = rsVar;
    }

    @Override
    public final void run() {
        switch (this.f26519a) {
            case 0:
                this.f26520b.W(false);
                return;
            default:
                this.f26520b.N(true);
                return;
        }
    }
}
