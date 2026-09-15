package org.telegram.ui.Components;
public final class ms implements Runnable {
    public final int f26245a;
    public final rs f26246b;

    public ms(rs rsVar, int i10) {
        this.f26245a = i10;
        this.f26246b = rsVar;
    }

    @Override
    public final void run() {
        switch (this.f26245a) {
            case 0:
                this.f26246b.W(false);
                return;
            default:
                this.f26246b.N(true);
                return;
        }
    }
}
