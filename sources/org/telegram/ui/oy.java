package org.telegram.ui;
public final class oy implements Runnable {
    public final int f48592a;
    public final jz f48593b;

    public oy(jz jzVar, int i7) {
        this.f48592a = i7;
        this.f48593b = jzVar;
    }

    @Override
    public final void run() {
        switch (this.f48592a) {
            case 0:
                jz.a0(this.f48593b);
                return;
            default:
                jz.b0(this.f48593b);
                return;
        }
    }
}
