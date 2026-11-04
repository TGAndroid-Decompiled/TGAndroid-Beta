package org.telegram.ui.Components;
public final class q1 implements Runnable {
    public final int f37308a;
    public final org.telegram.messenger.ir f37309b;

    public q1(org.telegram.messenger.ir irVar, int i3) {
        this.f37308a = i3;
        this.f37309b = irVar;
    }

    @Override
    public final void run() {
        switch (this.f37308a) {
            case 0:
                org.telegram.messenger.ir irVar = this.f37309b;
                if (irVar != null) {
                    irVar.o(false);
                    return;
                }
                return;
            default:
                org.telegram.messenger.ir irVar2 = this.f37309b;
                if (irVar2 != null) {
                    irVar2.o(false);
                    return;
                }
                return;
        }
    }
}
