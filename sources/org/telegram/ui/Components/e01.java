package org.telegram.ui.Components;
public final class e01 implements Runnable {
    public final int f25653a;
    public final Runnable f25654b;
    public final Runnable f25655c;

    public e01(Runnable runnable, Runnable runnable2, int i10) {
        this.f25653a = i10;
        this.f25654b = runnable;
        this.f25655c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f25653a) {
            case 0:
                i01.b(this.f25654b);
                Runnable runnable = this.f25655c;
                if (runnable != null) {
                    org.telegram.messenger.i0.g3(runnable);
                    return;
                }
                return;
            default:
                this.f25654b.run();
                this.f25655c.run();
                return;
        }
    }
}
