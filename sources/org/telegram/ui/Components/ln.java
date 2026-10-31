package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class ln implements Runnable {
    public final int f28142a;
    public final sn f28143b;

    public ln(sn snVar, int i10) {
        this.f28142a = i10;
        this.f28143b = snVar;
    }

    @Override
    public final void run() {
        switch (this.f28142a) {
            case 0:
                sn snVar = this.f28143b;
                AtomicReference atomicReference = snVar.f30282n;
                org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) atomicReference.get();
                if (u5Var != null) {
                    snVar.removeView(u5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                sn snVar2 = this.f28143b;
                AtomicReference atomicReference2 = snVar2.f30294w;
                org.telegram.ui.ActionBar.u5 u5Var2 = (org.telegram.ui.ActionBar.u5) atomicReference2.get();
                if (u5Var2 != null) {
                    snVar2.removeView(u5Var2);
                    atomicReference2.set(null);
                    if (!snVar2.f30268b) {
                        snVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                sn snVar3 = this.f28143b;
                snVar3.f30279j0 = false;
                snVar3.f30277h0.c(false);
                if (snVar3.a()) {
                    snVar3.f();
                    return;
                }
                return;
        }
    }
}
