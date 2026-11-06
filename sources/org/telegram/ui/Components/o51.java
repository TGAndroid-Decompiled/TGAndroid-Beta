package org.telegram.ui.Components;
public final class o51 implements Runnable {
    public final int f36634a;
    public final Object f36635b;

    public o51(Object obj, int i7) {
        this.f36634a = i7;
        this.f36635b = obj;
    }

    @Override
    public final void run() {
        switch (this.f36634a) {
            case 0:
                ((q51) this.f36635b).f37256g = false;
                return;
            case 1:
                ((f71) ((w30) ((org.telegram.ui.ActionBar.h1) this.f36635b).f27502b).f39824b).f33534w.b();
                return;
            default:
                ((b71) this.f36635b).d(false, true);
                return;
        }
    }
}
