package org.telegram.ui.Components;
public final class nt implements Runnable {
    public final int f37907a;
    public final pt f37908b;

    public nt(pt ptVar, int i7) {
        this.f37907a = i7;
        this.f37908b = ptVar;
    }

    @Override
    public final void run() {
        switch (this.f37907a) {
            case 0:
                pt ptVar = this.f37908b;
                ptVar.post(new nt(ptVar, 1));
                return;
            default:
                pt ptVar2 = this.f37908b;
                ptVar2.h();
                ptVar2.d();
                return;
        }
    }
}
