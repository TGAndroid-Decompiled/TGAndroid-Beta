package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class sn implements Runnable {
    public final int f39654a;
    public final zn f39655b;

    public sn(zn znVar, int i7) {
        this.f39654a = i7;
        this.f39655b = znVar;
    }

    @Override
    public final void run() {
        switch (this.f39654a) {
            case 0:
                zn znVar = this.f39655b;
                AtomicReference atomicReference = znVar.f42944n;
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) atomicReference.get();
                if (n5Var != null) {
                    znVar.removeView(n5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f39655b;
                AtomicReference atomicReference2 = znVar2.f42956w;
                org.telegram.ui.ActionBar.n5 n5Var2 = (org.telegram.ui.ActionBar.n5) atomicReference2.get();
                if (n5Var2 != null) {
                    znVar2.removeView(n5Var2);
                    atomicReference2.set(null);
                    if (!znVar2.f42929b) {
                        znVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                zn znVar3 = this.f39655b;
                znVar3.f42942k0 = false;
                znVar3.f42940i0.c(false);
                if (znVar3.a()) {
                    znVar3.f();
                    return;
                }
                return;
        }
    }
}
