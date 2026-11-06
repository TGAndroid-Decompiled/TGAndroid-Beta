package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class dn implements Runnable {
    public final int f33001a;
    public final kn f33002b;

    public dn(kn knVar, int i7) {
        this.f33001a = i7;
        this.f33002b = knVar;
    }

    @Override
    public final void run() {
        switch (this.f33001a) {
            case 0:
                kn knVar = this.f33002b;
                AtomicReference atomicReference = knVar.f35357n;
                org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) atomicReference.get();
                if (k5Var != null) {
                    knVar.removeView(k5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                kn knVar2 = this.f33002b;
                AtomicReference atomicReference2 = knVar2.f35369w;
                org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) atomicReference2.get();
                if (k5Var2 != null) {
                    knVar2.removeView(k5Var2);
                    atomicReference2.set(null);
                    if (!knVar2.f35342b) {
                        knVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                kn knVar3 = this.f33002b;
                knVar3.f35354j0 = false;
                knVar3.f35352h0.c(false);
                if (knVar3.a()) {
                    knVar3.f();
                    return;
                }
                return;
        }
    }
}
