package org.telegram.ui.Components;
public final class ps implements Runnable {
    public final int f29839a;
    public final us f29840b;

    public ps(us usVar, int i10) {
        this.f29839a = i10;
        this.f29840b = usVar;
    }

    @Override
    public final void run() {
        switch (this.f29839a) {
            case 0:
                this.f29840b.W(false);
                return;
            default:
                this.f29840b.N(true);
                return;
        }
    }
}
