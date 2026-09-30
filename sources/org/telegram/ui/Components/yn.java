package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class yn implements Runnable {
    public final int f30725a;
    public final go f30726b;

    public yn(go goVar, int i10) {
        this.f30725a = i10;
        this.f30726b = goVar;
    }

    @Override
    public final void run() {
        switch (this.f30725a) {
            case 0:
                go goVar = this.f30726b;
                AtomicReference atomicReference = goVar.f24596n;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get();
                if (h5Var != null) {
                    goVar.removeView(h5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                go goVar2 = this.f30726b;
                AtomicReference atomicReference2 = goVar2.v;
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
                if (h5Var2 != null) {
                    goVar2.removeView(h5Var2);
                    atomicReference2.set(null);
                    if (!goVar2.f24582b) {
                        goVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                go goVar3 = this.f30726b;
                goVar3.f24593j0 = false;
                goVar3.f24591h0.c(false);
                if (goVar3.a()) {
                    goVar3.f();
                    return;
                }
                return;
        }
    }
}
