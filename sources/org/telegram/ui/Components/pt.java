package org.telegram.ui.Components;
public final class pt implements Runnable {
    public final int f38664a;
    public final rt f38665b;

    public pt(rt rtVar, int i7) {
        this.f38664a = i7;
        this.f38665b = rtVar;
    }

    @Override
    public final void run() {
        switch (this.f38664a) {
            case 0:
                rt rtVar = this.f38665b;
                rtVar.post(new pt(rtVar, 1));
                return;
            default:
                rt rtVar2 = this.f38665b;
                rtVar2.h();
                rtVar2.d();
                return;
        }
    }
}
