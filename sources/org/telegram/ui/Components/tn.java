package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class tn implements Runnable {
    public final int f40057a;
    public final ao f40058b;

    public tn(ao aoVar, int i7) {
        this.f40057a = i7;
        this.f40058b = aoVar;
    }

    @Override
    public final void run() {
        switch (this.f40057a) {
            case 0:
                ao aoVar = this.f40058b;
                AtomicReference atomicReference = aoVar.f33391n;
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) atomicReference.get();
                if (n5Var != null) {
                    aoVar.removeView(n5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                ao aoVar2 = this.f40058b;
                AtomicReference atomicReference2 = aoVar2.f33403w;
                org.telegram.ui.ActionBar.n5 n5Var2 = (org.telegram.ui.ActionBar.n5) atomicReference2.get();
                if (n5Var2 != null) {
                    aoVar2.removeView(n5Var2);
                    atomicReference2.set(null);
                    if (!aoVar2.f33376b) {
                        aoVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                ao aoVar3 = this.f40058b;
                aoVar3.f33389k0 = false;
                aoVar3.f33387i0.c(false);
                if (aoVar3.a()) {
                    aoVar3.f();
                    return;
                }
                return;
        }
    }
}
