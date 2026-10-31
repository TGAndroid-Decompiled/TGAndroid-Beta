package org.telegram.ui.Components;
public final class aw implements Runnable {
    public final int f24470a;
    public final jy f24471b;

    public aw(jy jyVar, int i10) {
        this.f24470a = i10;
        this.f24471b = jyVar;
    }

    @Override
    public final void run() {
        switch (this.f24470a) {
            case 0:
            default:
                this.f24471b.e();
                return;
        }
    }
}
