package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class mn implements Runnable {
    public final int f30894a;
    public final tn f30895b;

    public mn(tn tnVar, int i9) {
        this.f30894a = i9;
        this.f30895b = tnVar;
    }

    @Override
    public final void run() {
        switch (this.f30894a) {
            case 0:
                tn tnVar = this.f30895b;
                AtomicReference atomicReference = tnVar.f32741n;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get();
                if (h5Var != null) {
                    tnVar.removeView(h5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                tn tnVar2 = this.f30895b;
                AtomicReference atomicReference2 = tnVar2.v;
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
                if (h5Var2 != null) {
                    tnVar2.removeView(h5Var2);
                    atomicReference2.set(null);
                    if (!tnVar2.f32726b) {
                        tnVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                tn tnVar3 = this.f30895b;
                tnVar3.f32734f0 = false;
                tnVar3.f32730d0.c(false);
                if (tnVar3.a()) {
                    tnVar3.f();
                    return;
                }
                return;
        }
    }
}
