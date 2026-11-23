package org.telegram.ui.Components.voip;
public final class i implements Runnable {
    public final int f41050a;
    public final k f41051b;

    public i(k kVar, int i7) {
        this.f41050a = i7;
        this.f41051b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f41050a) {
            case 0:
                k kVar = this.f41051b;
                kVar.f41105x = false;
                kVar.c();
                return;
            default:
                this.f41051b.f41096a.setVisibility(4);
                return;
        }
    }
}
