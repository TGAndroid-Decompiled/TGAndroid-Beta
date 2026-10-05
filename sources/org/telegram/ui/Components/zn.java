package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class zn implements Runnable {
    public final int f33587a;
    public final ho f33588b;

    public zn(ho hoVar, int i10) {
        this.f33587a = i10;
        this.f33588b = hoVar;
    }

    @Override
    public final void run() {
        switch (this.f33587a) {
            case 0:
                ho hoVar = this.f33588b;
                AtomicReference atomicReference = hoVar.f27288n;
                org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) atomicReference.get();
                if (i5Var != null) {
                    hoVar.removeView(i5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                ho hoVar2 = this.f33588b;
                AtomicReference atomicReference2 = hoVar2.v;
                org.telegram.ui.ActionBar.i5 i5Var2 = (org.telegram.ui.ActionBar.i5) atomicReference2.get();
                if (i5Var2 != null) {
                    hoVar2.removeView(i5Var2);
                    atomicReference2.set(null);
                    if (!hoVar2.f27273b) {
                        hoVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                ho hoVar3 = this.f33588b;
                hoVar3.f27285j0 = false;
                hoVar3.f27283h0.c(false);
                if (hoVar3.a()) {
                    hoVar3.f();
                    return;
                }
                return;
        }
    }
}
