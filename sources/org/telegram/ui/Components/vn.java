package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class vn implements Runnable {
    public final int f31374a;
    public final co f31375b;

    public vn(co coVar, int i10) {
        this.f31374a = i10;
        this.f31375b = coVar;
    }

    @Override
    public final void run() {
        switch (this.f31374a) {
            case 0:
                co coVar = this.f31375b;
                AtomicReference atomicReference = coVar.f25055n;
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) atomicReference.get();
                if (j5Var != null) {
                    coVar.removeView(j5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                co coVar2 = this.f31375b;
                AtomicReference atomicReference2 = coVar2.v;
                org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
                if (j5Var2 != null) {
                    coVar2.removeView(j5Var2);
                    atomicReference2.set(null);
                    if (!coVar2.f25040b) {
                        coVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                co coVar3 = this.f31375b;
                coVar3.f25052j0 = false;
                coVar3.f25050h0.c(false);
                if (coVar3.a()) {
                    coVar3.f();
                    return;
                }
                return;
        }
    }
}
