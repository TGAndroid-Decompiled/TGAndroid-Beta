package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class qn implements Runnable {
    public final int f32011a;
    public final xn f32012b;

    public qn(xn xnVar, int i10) {
        this.f32011a = i10;
        this.f32012b = xnVar;
    }

    @Override
    public final void run() {
        switch (this.f32011a) {
            case 0:
                xn xnVar = this.f32012b;
                AtomicReference atomicReference = xnVar.f34800n;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get();
                if (h5Var != null) {
                    xnVar.removeView(h5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                xn xnVar2 = this.f32012b;
                AtomicReference atomicReference2 = xnVar2.v;
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
                if (h5Var2 != null) {
                    xnVar2.removeView(h5Var2);
                    atomicReference2.set(null);
                    if (!xnVar2.f34785b) {
                        xnVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                xn xnVar3 = this.f32012b;
                xnVar3.f34793f0 = false;
                xnVar3.f34789d0.c(false);
                if (xnVar3.a()) {
                    xnVar3.f();
                    return;
                }
                return;
        }
    }
}
