package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class vn implements Runnable {
    public final int f31375a;
    public final co f31376b;

    public vn(co coVar, int i10) {
        this.f31375a = i10;
        this.f31376b = coVar;
    }

    @Override
    public final void run() {
        switch (this.f31375a) {
            case 0:
                co coVar = this.f31376b;
                AtomicReference atomicReference = coVar.f25056n;
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) atomicReference.get();
                if (j5Var != null) {
                    coVar.removeView(j5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                co coVar2 = this.f31376b;
                AtomicReference atomicReference2 = coVar2.v;
                org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
                if (j5Var2 != null) {
                    coVar2.removeView(j5Var2);
                    atomicReference2.set(null);
                    if (!coVar2.f25041b) {
                        coVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                co coVar3 = this.f31376b;
                coVar3.f25053j0 = false;
                coVar3.f25051h0.c(false);
                if (coVar3.a()) {
                    coVar3.f();
                    return;
                }
                return;
        }
    }
}
