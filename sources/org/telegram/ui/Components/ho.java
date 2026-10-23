package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class ho implements Runnable {
    public final int f26991a;
    public final oo f26992b;

    public ho(oo ooVar, int i10) {
        this.f26991a = i10;
        this.f26992b = ooVar;
    }

    @Override
    public final void run() {
        switch (this.f26991a) {
            case 0:
                oo ooVar = this.f26992b;
                AtomicReference atomicReference = ooVar.f29264n;
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) atomicReference.get();
                if (n5Var != null) {
                    ooVar.removeView(n5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                oo ooVar2 = this.f26992b;
                AtomicReference atomicReference2 = ooVar2.v;
                org.telegram.ui.ActionBar.n5 n5Var2 = (org.telegram.ui.ActionBar.n5) atomicReference2.get();
                if (n5Var2 != null) {
                    ooVar2.removeView(n5Var2);
                    atomicReference2.set(null);
                    if (!ooVar2.f29250b) {
                        ooVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                oo ooVar3 = this.f26992b;
                ooVar3.f29261j0 = false;
                ooVar3.f29259h0.c(false);
                if (ooVar3.a()) {
                    ooVar3.f();
                    return;
                }
                return;
        }
    }
}
