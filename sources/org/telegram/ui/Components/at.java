package org.telegram.ui.Components;
public final class at implements Runnable {
    public final int f31902a;
    public final dt f31903b;

    public at(dt dtVar, int i7) {
        this.f31902a = i7;
        this.f31903b = dtVar;
    }

    @Override
    public final void run() {
        switch (this.f31902a) {
            case 0:
                dt dtVar = this.f31903b;
                dtVar.post(new at(dtVar, 1));
                return;
            default:
                dt dtVar2 = this.f31903b;
                dtVar2.h();
                dtVar2.d();
                return;
        }
    }
}
