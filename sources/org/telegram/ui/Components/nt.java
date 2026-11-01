package org.telegram.ui.Components;
public final class nt implements Runnable {
    public final int f28961a;
    public final qt f28962b;

    public nt(qt qtVar, int i10) {
        this.f28961a = i10;
        this.f28962b = qtVar;
    }

    @Override
    public final void run() {
        switch (this.f28961a) {
            case 0:
                qt qtVar = this.f28962b;
                qtVar.post(new nt(qtVar, 1));
                return;
            default:
                qt qtVar2 = this.f28962b;
                qtVar2.h();
                qtVar2.d();
                return;
        }
    }
}
