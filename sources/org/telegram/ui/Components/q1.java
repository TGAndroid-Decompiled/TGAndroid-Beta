package org.telegram.ui.Components;
public final class q1 implements Runnable {
    public final int f29487a;
    public final org.telegram.messenger.zr f29488b;

    public q1(org.telegram.messenger.zr zrVar, int i10) {
        this.f29487a = i10;
        this.f29488b = zrVar;
    }

    @Override
    public final void run() {
        switch (this.f29487a) {
            case 0:
                org.telegram.messenger.zr zrVar = this.f29488b;
                if (zrVar != null) {
                    zrVar.i(false);
                    return;
                }
                return;
            default:
                org.telegram.messenger.zr zrVar2 = this.f29488b;
                if (zrVar2 != null) {
                    zrVar2.i(false);
                    return;
                }
                return;
        }
    }
}
