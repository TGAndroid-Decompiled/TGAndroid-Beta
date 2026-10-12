package org.telegram.ui.Components;
public final class dx implements Runnable {
    public final int f24499a;
    public final jz f24500b;

    public dx(jz jzVar, int i10) {
        this.f24499a = i10;
        this.f24500b = jzVar;
    }

    @Override
    public final void run() {
        switch (this.f24499a) {
            case 0:
            default:
                this.f24500b.e();
                return;
        }
    }
}
