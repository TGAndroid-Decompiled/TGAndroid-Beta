package org.telegram.ui.Components.voip;
public final class i implements Runnable {
    public final int f40925a;
    public final k f40926b;

    public i(k kVar, int i7) {
        this.f40925a = i7;
        this.f40926b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f40925a) {
            case 0:
                k kVar = this.f40926b;
                kVar.f40985x = false;
                kVar.c();
                return;
            default:
                this.f40926b.f40976a.setVisibility(4);
                return;
        }
    }
}
