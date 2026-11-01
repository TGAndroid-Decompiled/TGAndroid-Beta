package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class ln implements Runnable {
    public final int f28208a;
    public final sn f28209b;

    public ln(sn snVar, int i10) {
        this.f28208a = i10;
        this.f28209b = snVar;
    }

    @Override
    public final void run() {
        switch (this.f28208a) {
            case 0:
                sn snVar = this.f28209b;
                AtomicReference atomicReference = snVar.f30361n;
                org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) atomicReference.get();
                if (u5Var != null) {
                    snVar.removeView(u5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                sn snVar2 = this.f28209b;
                AtomicReference atomicReference2 = snVar2.f30373w;
                org.telegram.ui.ActionBar.u5 u5Var2 = (org.telegram.ui.ActionBar.u5) atomicReference2.get();
                if (u5Var2 != null) {
                    snVar2.removeView(u5Var2);
                    atomicReference2.set(null);
                    if (!snVar2.f30347b) {
                        snVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                sn snVar3 = this.f28209b;
                snVar3.f30358j0 = false;
                snVar3.f30356h0.c(false);
                if (snVar3.a()) {
                    snVar3.f();
                    return;
                }
                return;
        }
    }
}
