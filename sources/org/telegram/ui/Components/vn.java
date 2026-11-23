package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class vn implements Runnable {
    public final int f40835a;
    public final co f40836b;

    public vn(co coVar, int i7) {
        this.f40835a = i7;
        this.f40836b = coVar;
    }

    @Override
    public final void run() {
        switch (this.f40835a) {
            case 0:
                co coVar = this.f40836b;
                AtomicReference atomicReference = coVar.f34212n;
                org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) atomicReference.get();
                if (m5Var != null) {
                    coVar.removeView(m5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                co coVar2 = this.f40836b;
                AtomicReference atomicReference2 = coVar2.f34224w;
                org.telegram.ui.ActionBar.m5 m5Var2 = (org.telegram.ui.ActionBar.m5) atomicReference2.get();
                if (m5Var2 != null) {
                    coVar2.removeView(m5Var2);
                    atomicReference2.set(null);
                    if (!coVar2.f34197b) {
                        coVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                co coVar3 = this.f40836b;
                coVar3.f34210k0 = false;
                coVar3.f34208i0.c(false);
                if (coVar3.a()) {
                    coVar3.f();
                    return;
                }
                return;
        }
    }
}
