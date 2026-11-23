package org.telegram.ui.Components;
public final class pt implements Runnable {
    public final int f38662a;
    public final rt f38663b;

    public pt(rt rtVar, int i7) {
        this.f38662a = i7;
        this.f38663b = rtVar;
    }

    @Override
    public final void run() {
        switch (this.f38662a) {
            case 0:
                rt rtVar = this.f38663b;
                rtVar.post(new pt(rtVar, 1));
                return;
            default:
                rt rtVar2 = this.f38663b;
                rtVar2.h();
                rtVar2.d();
                return;
        }
    }
}
