package org.telegram.ui.Components.voip;
public final class i implements Runnable {
    public final int f41051a;
    public final k f41052b;

    public i(k kVar, int i7) {
        this.f41051a = i7;
        this.f41052b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f41051a) {
            case 0:
                k kVar = this.f41052b;
                kVar.f41106x = false;
                kVar.c();
                return;
            default:
                this.f41052b.f41097a.setVisibility(4);
                return;
        }
    }
}
