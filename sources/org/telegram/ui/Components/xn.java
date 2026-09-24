package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class xn implements Runnable {
    public final int f30352a;
    public final fo f30353b;

    public xn(fo foVar, int i10) {
        this.f30352a = i10;
        this.f30353b = foVar;
    }

    @Override
    public final void run() {
        switch (this.f30352a) {
            case 0:
                fo foVar = this.f30353b;
                AtomicReference atomicReference = foVar.f24220n;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get();
                if (h5Var != null) {
                    foVar.removeView(h5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                fo foVar2 = this.f30353b;
                AtomicReference atomicReference2 = foVar2.v;
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
                if (h5Var2 != null) {
                    foVar2.removeView(h5Var2);
                    atomicReference2.set(null);
                    if (!foVar2.f24206b) {
                        foVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                fo foVar3 = this.f30353b;
                foVar3.f24217j0 = false;
                foVar3.f24215h0.c(false);
                if (foVar3.a()) {
                    foVar3.f();
                    return;
                }
                return;
        }
    }
}
