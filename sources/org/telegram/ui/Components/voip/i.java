package org.telegram.ui.Components.voip;
public final class i implements Runnable {
    public final int f39259a;
    public final k f39260b;

    public i(k kVar, int i7) {
        this.f39259a = i7;
        this.f39260b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f39259a) {
            case 0:
                k kVar = this.f39260b;
                kVar.f39298x = false;
                kVar.c();
                return;
            default:
                this.f39260b.f39289a.setVisibility(4);
                return;
        }
    }
}
