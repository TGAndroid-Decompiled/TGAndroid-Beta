package org.telegram.ui.Components;
public final class at implements Runnable {
    public final int f31965a;
    public final dt f31966b;

    public at(dt dtVar, int i7) {
        this.f31965a = i7;
        this.f31966b = dtVar;
    }

    @Override
    public final void run() {
        switch (this.f31965a) {
            case 0:
                dt dtVar = this.f31966b;
                dtVar.post(new at(dtVar, 1));
                return;
            default:
                dt dtVar2 = this.f31966b;
                dtVar2.h();
                dtVar2.d();
                return;
        }
    }
}
