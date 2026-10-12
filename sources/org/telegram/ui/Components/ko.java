package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class ko implements Runnable {
    public final int f26762a;
    public final ro f26763b;

    public ko(ro roVar, int i10) {
        this.f26762a = i10;
        this.f26763b = roVar;
    }

    @Override
    public final void run() {
        switch (this.f26762a) {
            case 0:
                ro roVar = this.f26763b;
                AtomicReference atomicReference = roVar.f28901n;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get();
                if (h5Var != null) {
                    roVar.removeView(h5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                ro roVar2 = this.f26763b;
                AtomicReference atomicReference2 = roVar2.v;
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
                if (h5Var2 != null) {
                    roVar2.removeView(h5Var2);
                    atomicReference2.set(null);
                    if (!roVar2.f28887b) {
                        roVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                ro roVar3 = this.f26763b;
                roVar3.f28898j0 = false;
                roVar3.f28896h0.c(false);
                if (roVar3.a()) {
                    roVar3.f();
                    return;
                }
                return;
        }
    }
}
