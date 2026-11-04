package org.telegram.ui.Components;
public final class ys implements Runnable {
    public final int f40815a;
    public final bt f40816b;

    public ys(bt btVar, int i3) {
        this.f40815a = i3;
        this.f40816b = btVar;
    }

    @Override
    public final void run() {
        switch (this.f40815a) {
            case 0:
                bt btVar = this.f40816b;
                btVar.post(new ys(btVar, 1));
                return;
            default:
                bt btVar2 = this.f40816b;
                btVar2.h();
                btVar2.d();
                return;
        }
    }
}
