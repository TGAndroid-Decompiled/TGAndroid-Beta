package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class xn implements Runnable {
    public final int f30024a;
    public final fo f30025b;

    public xn(fo foVar, int i10) {
        this.f30024a = i10;
        this.f30025b = foVar;
    }

    @Override
    public final void run() {
        switch (this.f30024a) {
            case 0:
                fo foVar = this.f30025b;
                AtomicReference atomicReference = foVar.f24032n;
                org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) atomicReference.get();
                if (i5Var != null) {
                    foVar.removeView(i5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                fo foVar2 = this.f30025b;
                AtomicReference atomicReference2 = foVar2.v;
                org.telegram.ui.ActionBar.i5 i5Var2 = (org.telegram.ui.ActionBar.i5) atomicReference2.get();
                if (i5Var2 != null) {
                    foVar2.removeView(i5Var2);
                    atomicReference2.set(null);
                    if (!foVar2.f24018b) {
                        foVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                fo foVar3 = this.f30025b;
                foVar3.f24029j0 = false;
                foVar3.f24027h0.c(false);
                if (foVar3.a()) {
                    foVar3.f();
                    return;
                }
                return;
        }
    }
}
