package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class ln implements Runnable {
    public final int f36856a;
    public final sn f36857b;

    public ln(sn snVar, int i7) {
        this.f36856a = i7;
        this.f36857b = snVar;
    }

    @Override
    public final void run() {
        switch (this.f36856a) {
            case 0:
                sn snVar = this.f36857b;
                AtomicReference atomicReference = snVar.f39363n;
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) atomicReference.get();
                if (j5Var != null) {
                    snVar.removeView(j5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                sn snVar2 = this.f36857b;
                AtomicReference atomicReference2 = snVar2.f39375w;
                org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
                if (j5Var2 != null) {
                    snVar2.removeView(j5Var2);
                    atomicReference2.set(null);
                    if (!snVar2.f39348b) {
                        snVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                sn snVar3 = this.f36857b;
                snVar3.f39361k0 = false;
                snVar3.f39359i0.c(false);
                if (snVar3.a()) {
                    snVar3.f();
                    return;
                }
                return;
        }
    }
}
