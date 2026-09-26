package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class xn implements Runnable {
    public final int f30359a;
    public final fo f30360b;

    public xn(fo foVar, int i10) {
        this.f30359a = i10;
        this.f30360b = foVar;
    }

    @Override
    public final void run() {
        switch (this.f30359a) {
            case 0:
                fo foVar = this.f30360b;
                AtomicReference atomicReference = foVar.f24236n;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get();
                if (h5Var != null) {
                    foVar.removeView(h5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                fo foVar2 = this.f30360b;
                AtomicReference atomicReference2 = foVar2.v;
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
                if (h5Var2 != null) {
                    foVar2.removeView(h5Var2);
                    atomicReference2.set(null);
                    if (!foVar2.f24222b) {
                        foVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                fo foVar3 = this.f30360b;
                foVar3.f24233j0 = false;
                foVar3.f24231h0.c(false);
                if (foVar3.a()) {
                    foVar3.f();
                    return;
                }
                return;
        }
    }
}
