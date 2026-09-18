package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class wn implements Runnable {
    public final int f30116a;
    public final eo f30117b;

    public wn(eo eoVar, int i10) {
        this.f30116a = i10;
        this.f30117b = eoVar;
    }

    @Override
    public final void run() {
        switch (this.f30116a) {
            case 0:
                eo eoVar = this.f30117b;
                AtomicReference atomicReference = eoVar.f23929n;
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) atomicReference.get();
                if (j5Var != null) {
                    eoVar.removeView(j5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                eo eoVar2 = this.f30117b;
                AtomicReference atomicReference2 = eoVar2.v;
                org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
                if (j5Var2 != null) {
                    eoVar2.removeView(j5Var2);
                    atomicReference2.set(null);
                    if (!eoVar2.f23915b) {
                        eoVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                eo eoVar3 = this.f30117b;
                eoVar3.f23926j0 = false;
                eoVar3.f23924h0.c(false);
                if (eoVar3.a()) {
                    eoVar3.f();
                    return;
                }
                return;
        }
    }
}
