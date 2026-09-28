package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class yn implements Runnable {
    public final int f30729a;
    public final go f30730b;

    public yn(go goVar, int i10) {
        this.f30729a = i10;
        this.f30730b = goVar;
    }

    @Override
    public final void run() {
        switch (this.f30729a) {
            case 0:
                go goVar = this.f30730b;
                AtomicReference atomicReference = goVar.f24594n;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get();
                if (h5Var != null) {
                    goVar.removeView(h5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                go goVar2 = this.f30730b;
                AtomicReference atomicReference2 = goVar2.v;
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
                if (h5Var2 != null) {
                    goVar2.removeView(h5Var2);
                    atomicReference2.set(null);
                    if (!goVar2.f24580b) {
                        goVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                go goVar3 = this.f30730b;
                goVar3.f24591j0 = false;
                goVar3.f24589h0.c(false);
                if (goVar3.a()) {
                    goVar3.f();
                    return;
                }
                return;
        }
    }
}
