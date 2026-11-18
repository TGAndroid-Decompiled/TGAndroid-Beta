package org.telegram.ui.Components.voip;
public final class i implements Runnable {
    public final int f40914a;
    public final k f40915b;

    public i(k kVar, int i7) {
        this.f40914a = i7;
        this.f40915b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f40914a) {
            case 0:
                k kVar = this.f40915b;
                kVar.f40969x = false;
                kVar.c();
                return;
            default:
                this.f40915b.f40960a.setVisibility(4);
                return;
        }
    }
}
