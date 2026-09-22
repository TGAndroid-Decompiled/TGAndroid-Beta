package org.telegram.ui.Components;
public final class ms implements Runnable {
    public final int f26541a;
    public final rs f26542b;

    public ms(rs rsVar, int i10) {
        this.f26541a = i10;
        this.f26542b = rsVar;
    }

    @Override
    public final void run() {
        switch (this.f26541a) {
            case 0:
                this.f26542b.W(false);
                return;
            default:
                this.f26542b.N(true);
                return;
        }
    }
}
