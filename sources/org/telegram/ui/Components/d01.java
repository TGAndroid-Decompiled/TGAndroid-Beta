package org.telegram.ui.Components;
public final class d01 implements Runnable {
    public final int f25240a;
    public final Runnable f25241b;
    public final Runnable f25242c;

    public d01(Runnable runnable, Runnable runnable2, int i10) {
        this.f25240a = i10;
        this.f25241b = runnable;
        this.f25242c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f25240a) {
            case 0:
                h01.b(this.f25241b);
                Runnable runnable = this.f25242c;
                if (runnable != null) {
                    org.telegram.messenger.i0.g3(runnable);
                    return;
                }
                return;
            default:
                this.f25241b.run();
                this.f25242c.run();
                return;
        }
    }
}
