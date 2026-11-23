package org.telegram.ui.Components;
public final class pt implements Runnable {
    public final int f38617a;
    public final rt f38618b;

    public pt(rt rtVar, int i7) {
        this.f38617a = i7;
        this.f38618b = rtVar;
    }

    @Override
    public final void run() {
        switch (this.f38617a) {
            case 0:
                rt rtVar = this.f38618b;
                rtVar.post(new pt(rtVar, 1));
                return;
            default:
                rt rtVar2 = this.f38618b;
                rtVar2.h();
                rtVar2.d();
                return;
        }
    }
}
