package org.telegram.ui.Components.voip;
public final class i implements Runnable {
    public final int f39197a;
    public final k f39198b;

    public i(k kVar, int i7) {
        this.f39197a = i7;
        this.f39198b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f39197a) {
            case 0:
                k kVar = this.f39198b;
                kVar.f39236x = false;
                kVar.c();
                return;
            default:
                this.f39198b.f39227a.setVisibility(4);
                return;
        }
    }
}
