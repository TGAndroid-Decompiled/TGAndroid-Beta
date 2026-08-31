package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class un implements Runnable {
    public final int f31693a;
    public final bo f31694b;

    public un(bo boVar, int i10) {
        this.f31693a = i10;
        this.f31694b = boVar;
    }

    @Override
    public final void run() {
        switch (this.f31693a) {
            case 0:
                bo boVar = this.f31694b;
                AtomicReference atomicReference = boVar.f25678n;
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) atomicReference.get();
                if (l5Var != null) {
                    boVar.removeView(l5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                bo boVar2 = this.f31694b;
                AtomicReference atomicReference2 = boVar2.v;
                org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) atomicReference2.get();
                if (l5Var2 != null) {
                    boVar2.removeView(l5Var2);
                    atomicReference2.set(null);
                    if (!boVar2.f25663b) {
                        boVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                bo boVar3 = this.f31694b;
                boVar3.f25672g0 = false;
                boVar3.f25669e0.c(false);
                if (boVar3.a()) {
                    boVar3.f();
                    return;
                }
                return;
        }
    }
}
