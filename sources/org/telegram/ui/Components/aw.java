package org.telegram.ui.Components;
public final class aw implements Runnable {
    public final int f24578a;
    public final jy f24579b;

    public aw(jy jyVar, int i10) {
        this.f24578a = i10;
        this.f24579b = jyVar;
    }

    @Override
    public final void run() {
        switch (this.f24578a) {
            case 0:
            default:
                this.f24579b.e();
                return;
        }
    }
}
