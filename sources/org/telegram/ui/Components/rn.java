package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class rn implements Runnable {
    public final int f28541a;
    public final yn f28542b;

    public rn(yn ynVar, int i10) {
        this.f28541a = i10;
        this.f28542b = ynVar;
    }

    @Override
    public final void run() {
        switch (this.f28541a) {
            case 0:
                yn ynVar = this.f28542b;
                AtomicReference atomicReference = ynVar.f31071n;
                org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) atomicReference.get();
                if (k5Var != null) {
                    ynVar.removeView(k5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                yn ynVar2 = this.f28542b;
                AtomicReference atomicReference2 = ynVar2.v;
                org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) atomicReference2.get();
                if (k5Var2 != null) {
                    ynVar2.removeView(k5Var2);
                    atomicReference2.set(null);
                    if (!ynVar2.f31057b) {
                        ynVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                yn ynVar3 = this.f28542b;
                ynVar3.f31065g0 = false;
                ynVar3.f31062e0.c(false);
                if (ynVar3.a()) {
                    ynVar3.f();
                    return;
                }
                return;
        }
    }
}
