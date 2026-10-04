package org.telegram.ui.Components;
public final class ps implements Runnable {
    public final int f29741a;
    public final us f29742b;

    public ps(us usVar, int i10) {
        this.f29741a = i10;
        this.f29742b = usVar;
    }

    @Override
    public final void run() {
        switch (this.f29741a) {
            case 0:
                this.f29742b.W(false);
                return;
            default:
                this.f29742b.N(true);
                return;
        }
    }
}
