package org.telegram.ui.Components.voip;
public final class i implements Runnable {
    public final int f41049a;
    public final k f41050b;

    public i(k kVar, int i7) {
        this.f41049a = i7;
        this.f41050b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f41049a) {
            case 0:
                k kVar = this.f41050b;
                kVar.f41104x = false;
                kVar.c();
                return;
            default:
                this.f41050b.f41095a.setVisibility(4);
                return;
        }
    }
}
