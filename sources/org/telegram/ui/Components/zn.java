package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class zn implements Runnable {
    public final int f31040a;
    public final ho f31041b;

    public zn(ho hoVar, int i10) {
        this.f31040a = i10;
        this.f31041b = hoVar;
    }

    @Override
    public final void run() {
        switch (this.f31040a) {
            case 0:
                ho hoVar = this.f31041b;
                AtomicReference atomicReference = hoVar.f24910n;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get();
                if (h5Var != null) {
                    hoVar.removeView(h5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                ho hoVar2 = this.f31041b;
                AtomicReference atomicReference2 = hoVar2.v;
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
                if (h5Var2 != null) {
                    hoVar2.removeView(h5Var2);
                    atomicReference2.set(null);
                    if (!hoVar2.f24896b) {
                        hoVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                ho hoVar3 = this.f31041b;
                hoVar3.f24907j0 = false;
                hoVar3.f24905h0.c(false);
                if (hoVar3.a()) {
                    hoVar3.f();
                    return;
                }
                return;
        }
    }
}
