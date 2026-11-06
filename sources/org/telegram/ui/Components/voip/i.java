package org.telegram.ui.Components.voip;
public final class i implements Runnable {
    public final int f39215a;
    public final k f39216b;

    public i(k kVar, int i7) {
        this.f39215a = i7;
        this.f39216b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f39215a) {
            case 0:
                k kVar = this.f39216b;
                kVar.f39254x = false;
                kVar.c();
                return;
            default:
                this.f39216b.f39245a.setVisibility(4);
                return;
        }
    }
}
