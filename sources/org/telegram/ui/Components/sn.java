package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class sn implements Runnable {
    public final int f28780a;
    public final zn f28781b;

    public sn(zn znVar, int i10) {
        this.f28780a = i10;
        this.f28781b = znVar;
    }

    @Override
    public final void run() {
        switch (this.f28780a) {
            case 0:
                zn znVar = this.f28781b;
                AtomicReference atomicReference = znVar.f31400n;
                org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) atomicReference.get();
                if (k5Var != null) {
                    znVar.removeView(k5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f28781b;
                AtomicReference atomicReference2 = znVar2.v;
                org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) atomicReference2.get();
                if (k5Var2 != null) {
                    znVar2.removeView(k5Var2);
                    atomicReference2.set(null);
                    if (!znVar2.f31386b) {
                        znVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                zn znVar3 = this.f28781b;
                znVar3.f31394g0 = false;
                znVar3.f31391e0.c(false);
                if (znVar3.a()) {
                    znVar3.f();
                    return;
                }
                return;
        }
    }
}
