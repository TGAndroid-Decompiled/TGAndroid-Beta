package org.telegram.ui.Components.voip;
public final class i implements Runnable {
    public final int f39250a;
    public final k f39251b;

    public i(k kVar, int i7) {
        this.f39250a = i7;
        this.f39251b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f39250a) {
            case 0:
                k kVar = this.f39251b;
                kVar.f39289x = false;
                kVar.c();
                return;
            default:
                this.f39251b.f39280a.setVisibility(4);
                return;
        }
    }
}
