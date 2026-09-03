package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class tn implements Runnable {
    public final int f31375a;
    public final ao f31376b;

    public tn(ao aoVar, int i10) {
        this.f31375a = i10;
        this.f31376b = aoVar;
    }

    @Override
    public final void run() {
        switch (this.f31375a) {
            case 0:
                ao aoVar = this.f31376b;
                AtomicReference atomicReference = aoVar.f25319n;
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) atomicReference.get();
                if (l5Var != null) {
                    aoVar.removeView(l5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                ao aoVar2 = this.f31376b;
                AtomicReference atomicReference2 = aoVar2.v;
                org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) atomicReference2.get();
                if (l5Var2 != null) {
                    aoVar2.removeView(l5Var2);
                    atomicReference2.set(null);
                    if (!aoVar2.f25304b) {
                        aoVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                ao aoVar3 = this.f31376b;
                aoVar3.f25313g0 = false;
                aoVar3.f25310e0.c(false);
                if (aoVar3.a()) {
                    aoVar3.f();
                    return;
                }
                return;
        }
    }
}
