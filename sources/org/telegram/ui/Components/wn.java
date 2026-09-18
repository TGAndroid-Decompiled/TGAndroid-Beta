package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class wn implements Runnable {
    public final int f29707a;
    public final eo f29708b;

    public wn(eo eoVar, int i10) {
        this.f29707a = i10;
        this.f29708b = eoVar;
    }

    @Override
    public final void run() {
        switch (this.f29707a) {
            case 0:
                eo eoVar = this.f29708b;
                AtomicReference atomicReference = eoVar.f23626n;
                org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) atomicReference.get();
                if (k5Var != null) {
                    eoVar.removeView(k5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                eo eoVar2 = this.f29708b;
                AtomicReference atomicReference2 = eoVar2.v;
                org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) atomicReference2.get();
                if (k5Var2 != null) {
                    eoVar2.removeView(k5Var2);
                    atomicReference2.set(null);
                    if (!eoVar2.f23612b) {
                        eoVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                eo eoVar3 = this.f29708b;
                eoVar3.f23623j0 = false;
                eoVar3.f23621h0.c(false);
                if (eoVar3.a()) {
                    eoVar3.f();
                    return;
                }
                return;
        }
    }
}
