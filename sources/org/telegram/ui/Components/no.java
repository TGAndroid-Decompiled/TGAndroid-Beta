package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class no implements Runnable {
    public final int f29217a;
    public final uo f29218b;

    public no(uo uoVar, int i10) {
        this.f29217a = i10;
        this.f29218b = uoVar;
    }

    @Override
    public final void run() {
        switch (this.f29217a) {
            case 0:
                uo uoVar = this.f29218b;
                AtomicReference atomicReference = uoVar.f31571n;
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) atomicReference.get();
                if (j5Var != null) {
                    uoVar.removeView(j5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                uo uoVar2 = this.f29218b;
                AtomicReference atomicReference2 = uoVar2.v;
                org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
                if (j5Var2 != null) {
                    uoVar2.removeView(j5Var2);
                    atomicReference2.set(null);
                    if (!uoVar2.f31556b) {
                        uoVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                uo uoVar3 = this.f29218b;
                uoVar3.f31568j0 = false;
                uoVar3.f31566h0.c(false);
                if (uoVar3.a()) {
                    uoVar3.f();
                    return;
                }
                return;
        }
    }
}
