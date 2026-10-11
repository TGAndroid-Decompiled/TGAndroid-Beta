package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class no implements Runnable {
    public final int f29197a;
    public final uo f29198b;

    public no(uo uoVar, int i10) {
        this.f29197a = i10;
        this.f29198b = uoVar;
    }

    @Override
    public final void run() {
        switch (this.f29197a) {
            case 0:
                uo uoVar = this.f29198b;
                AtomicReference atomicReference = uoVar.f31685n;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get();
                if (h5Var != null) {
                    uoVar.removeView(h5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                uo uoVar2 = this.f29198b;
                AtomicReference atomicReference2 = uoVar2.v;
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
                if (h5Var2 != null) {
                    uoVar2.removeView(h5Var2);
                    atomicReference2.set(null);
                    if (!uoVar2.f31670b) {
                        uoVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                uo uoVar3 = this.f29198b;
                uoVar3.f31682j0 = false;
                uoVar3.f31680h0.c(false);
                if (uoVar3.a()) {
                    uoVar3.f();
                    return;
                }
                return;
        }
    }
}
