package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class ho implements Runnable {
    public final int f26909a;
    public final oo f26910b;

    public ho(oo ooVar, int i10) {
        this.f26909a = i10;
        this.f26910b = ooVar;
    }

    @Override
    public final void run() {
        switch (this.f26909a) {
            case 0:
                oo ooVar = this.f26910b;
                AtomicReference atomicReference = ooVar.f29028n;
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) atomicReference.get();
                if (j5Var != null) {
                    ooVar.removeView(j5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                oo ooVar2 = this.f26910b;
                AtomicReference atomicReference2 = ooVar2.v;
                org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
                if (j5Var2 != null) {
                    ooVar2.removeView(j5Var2);
                    atomicReference2.set(null);
                    if (!ooVar2.f29014b) {
                        ooVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                oo ooVar3 = this.f26910b;
                ooVar3.f29025j0 = false;
                ooVar3.f29023h0.c(false);
                if (ooVar3.a()) {
                    ooVar3.f();
                    return;
                }
                return;
        }
    }
}
