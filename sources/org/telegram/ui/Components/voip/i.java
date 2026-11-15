package org.telegram.ui.Components.voip;
public final class i implements Runnable {
    public final int f40646a;
    public final k f40647b;

    public i(k kVar, int i7) {
        this.f40646a = i7;
        this.f40647b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f40646a) {
            case 0:
                k kVar = this.f40647b;
                kVar.f40706x = false;
                kVar.c();
                return;
            default:
                this.f40647b.f40697a.setVisibility(4);
                return;
        }
    }
}
