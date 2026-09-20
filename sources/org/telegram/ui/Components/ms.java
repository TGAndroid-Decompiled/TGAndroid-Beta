package org.telegram.ui.Components;
public final class ms implements Runnable {
    public final int f26489a;
    public final rs f26490b;

    public ms(rs rsVar, int i10) {
        this.f26489a = i10;
        this.f26490b = rsVar;
    }

    @Override
    public final void run() {
        switch (this.f26489a) {
            case 0:
                this.f26490b.W(false);
                return;
            default:
                this.f26490b.N(true);
                return;
        }
    }
}
