package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class dn implements Runnable {
    public final int f33110a;
    public final kn f33111b;

    public dn(kn knVar, int i7) {
        this.f33110a = i7;
        this.f33111b = knVar;
    }

    @Override
    public final void run() {
        switch (this.f33110a) {
            case 0:
                kn knVar = this.f33111b;
                AtomicReference atomicReference = knVar.f35416n;
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) atomicReference.get();
                if (l5Var != null) {
                    knVar.removeView(l5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                kn knVar2 = this.f33111b;
                AtomicReference atomicReference2 = knVar2.f35428w;
                org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) atomicReference2.get();
                if (l5Var2 != null) {
                    knVar2.removeView(l5Var2);
                    atomicReference2.set(null);
                    if (!knVar2.f35401b) {
                        knVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                kn knVar3 = this.f33111b;
                knVar3.f35413j0 = false;
                knVar3.f35411h0.c(false);
                if (knVar3.a()) {
                    knVar3.f();
                    return;
                }
                return;
        }
    }
}
