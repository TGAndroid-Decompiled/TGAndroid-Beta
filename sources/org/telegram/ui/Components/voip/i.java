package org.telegram.ui.Components.voip;
public final class i implements Runnable {
    public final int f41012a;
    public final k f41013b;

    public i(k kVar, int i7) {
        this.f41012a = i7;
        this.f41013b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f41012a) {
            case 0:
                k kVar = this.f41013b;
                kVar.f41067x = false;
                kVar.c();
                return;
            default:
                this.f41013b.f41058a.setVisibility(4);
                return;
        }
    }
}
