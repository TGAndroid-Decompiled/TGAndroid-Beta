package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class yn implements Runnable {
    public final int f30734a;
    public final go f30735b;

    public yn(go goVar, int i10) {
        this.f30734a = i10;
        this.f30735b = goVar;
    }

    @Override
    public final void run() {
        switch (this.f30734a) {
            case 0:
                go goVar = this.f30735b;
                AtomicReference atomicReference = goVar.f24621n;
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) atomicReference.get();
                if (j5Var != null) {
                    goVar.removeView(j5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                go goVar2 = this.f30735b;
                AtomicReference atomicReference2 = goVar2.v;
                org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
                if (j5Var2 != null) {
                    goVar2.removeView(j5Var2);
                    atomicReference2.set(null);
                    if (!goVar2.f24607b) {
                        goVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                go goVar3 = this.f30735b;
                goVar3.f24618j0 = false;
                goVar3.f24616h0.c(false);
                if (goVar3.a()) {
                    goVar3.f();
                    return;
                }
                return;
        }
    }
}
