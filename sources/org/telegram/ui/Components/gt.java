package org.telegram.ui.Components;
public final class gt implements Runnable {
    public final int f35052a;
    public final kt f35053b;

    public gt(kt ktVar, int i7) {
        this.f35052a = i7;
        this.f35053b = ktVar;
    }

    @Override
    public final void run() {
        switch (this.f35052a) {
            case 0:
                kt ktVar = this.f35053b;
                ktVar.post(new gt(ktVar, 1));
                return;
            default:
                kt ktVar2 = this.f35053b;
                ktVar2.h();
                ktVar2.d();
                return;
        }
    }
}
