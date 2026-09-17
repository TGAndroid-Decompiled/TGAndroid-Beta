package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class wn implements Runnable {
    public final int f29704a;
    public final eo f29705b;

    public wn(eo eoVar, int i10) {
        this.f29704a = i10;
        this.f29705b = eoVar;
    }

    @Override
    public final void run() {
        switch (this.f29704a) {
            case 0:
                eo eoVar = this.f29705b;
                AtomicReference atomicReference = eoVar.f23623n;
                org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) atomicReference.get();
                if (k5Var != null) {
                    eoVar.removeView(k5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                eo eoVar2 = this.f29705b;
                AtomicReference atomicReference2 = eoVar2.v;
                org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) atomicReference2.get();
                if (k5Var2 != null) {
                    eoVar2.removeView(k5Var2);
                    atomicReference2.set(null);
                    if (!eoVar2.f23609b) {
                        eoVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                eo eoVar3 = this.f29705b;
                eoVar3.f23620j0 = false;
                eoVar3.f23618h0.c(false);
                if (eoVar3.a()) {
                    eoVar3.f();
                    return;
                }
                return;
        }
    }
}
