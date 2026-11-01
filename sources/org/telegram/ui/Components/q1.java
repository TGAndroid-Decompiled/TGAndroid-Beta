package org.telegram.ui.Components;
public final class q1 implements Runnable {
    public final int f29586a;
    public final org.telegram.messenger.as f29587b;

    public q1(org.telegram.messenger.as asVar, int i10) {
        this.f29586a = i10;
        this.f29587b = asVar;
    }

    @Override
    public final void run() {
        switch (this.f29586a) {
            case 0:
                org.telegram.messenger.as asVar = this.f29587b;
                if (asVar != null) {
                    asVar.i(false);
                    return;
                }
                return;
            default:
                org.telegram.messenger.as asVar2 = this.f29587b;
                if (asVar2 != null) {
                    asVar2.i(false);
                    return;
                }
                return;
        }
    }
}
