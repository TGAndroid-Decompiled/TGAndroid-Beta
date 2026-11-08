package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class dn implements Runnable {
    public final int f33051a;
    public final kn f33052b;

    public dn(kn knVar, int i7) {
        this.f33051a = i7;
        this.f33052b = knVar;
    }

    @Override
    public final void run() {
        switch (this.f33051a) {
            case 0:
                kn knVar = this.f33052b;
                AtomicReference atomicReference = knVar.f35377n;
                org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) atomicReference.get();
                if (k5Var != null) {
                    knVar.removeView(k5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                kn knVar2 = this.f33052b;
                AtomicReference atomicReference2 = knVar2.f35389w;
                org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) atomicReference2.get();
                if (k5Var2 != null) {
                    knVar2.removeView(k5Var2);
                    atomicReference2.set(null);
                    if (!knVar2.f35362b) {
                        knVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                kn knVar3 = this.f33052b;
                knVar3.f35374j0 = false;
                knVar3.f35372h0.c(false);
                if (knVar3.a()) {
                    knVar3.f();
                    return;
                }
                return;
        }
    }
}
