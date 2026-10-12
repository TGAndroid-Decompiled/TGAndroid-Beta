package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class po implements Runnable {
    public final int f29536a;
    public final wo f29537b;

    public po(wo woVar, int i10) {
        this.f29536a = i10;
        this.f29537b = woVar;
    }

    @Override
    public final void run() {
        switch (this.f29536a) {
            case 0:
                wo woVar = this.f29537b;
                AtomicReference atomicReference = woVar.f32514n;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get();
                if (h5Var != null) {
                    woVar.removeView(h5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                wo woVar2 = this.f29537b;
                AtomicReference atomicReference2 = woVar2.v;
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
                if (h5Var2 != null) {
                    woVar2.removeView(h5Var2);
                    atomicReference2.set(null);
                    if (!woVar2.f32499b) {
                        woVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                wo woVar3 = this.f29537b;
                woVar3.f32511j0 = false;
                woVar3.f32509h0.c(false);
                if (woVar3.a()) {
                    woVar3.f();
                    return;
                }
                return;
        }
    }
}
