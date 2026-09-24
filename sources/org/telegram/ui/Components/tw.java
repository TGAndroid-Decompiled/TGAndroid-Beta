package org.telegram.ui.Components;
public final class tw implements Runnable {
    public final int f28620a;
    public final zy f28621b;

    public tw(zy zyVar, int i10) {
        this.f28620a = i10;
        this.f28621b = zyVar;
    }

    @Override
    public final void run() {
        switch (this.f28620a) {
            case 0:
            default:
                this.f28621b.d();
                return;
        }
    }
}
