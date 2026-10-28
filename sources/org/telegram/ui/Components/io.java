package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class io implements Runnable {
    public final int f29399a;
    public final po f29400b;

    public io(po poVar, int i10) {
        this.f29399a = i10;
        this.f29400b = poVar;
    }

    @Override
    public final void run() {
        switch (this.f29399a) {
            case 0:
                po poVar = this.f29400b;
                AtomicReference atomicReference = poVar.f31665n;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) atomicReference.get();
                if (b6Var != null) {
                    poVar.removeView(b6Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                po poVar2 = this.f29400b;
                AtomicReference atomicReference2 = poVar2.v;
                org.telegram.ui.ActionBar.b6 b6Var2 = (org.telegram.ui.ActionBar.b6) atomicReference2.get();
                if (b6Var2 != null) {
                    poVar2.removeView(b6Var2);
                    atomicReference2.set(null);
                    if (!poVar2.f31651b) {
                        poVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                po poVar3 = this.f29400b;
                poVar3.f31662j0 = false;
                poVar3.f31660h0.c(false);
                if (poVar3.a()) {
                    poVar3.f();
                    return;
                }
                return;
        }
    }
}
