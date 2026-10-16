package org.telegram.ui.Components;
public final class dx implements Runnable {
    public final int f24193a;
    public final jz f24194b;

    public dx(jz jzVar, int i10) {
        this.f24193a = i10;
        this.f24194b = jzVar;
    }

    @Override
    public final void run() {
        switch (this.f24193a) {
            case 0:
            default:
                this.f24194b.e();
                return;
        }
    }
}
