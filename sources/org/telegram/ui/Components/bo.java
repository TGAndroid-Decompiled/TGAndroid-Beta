package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class bo implements Runnable {
    public final int f21864a;
    public final jo f21865b;

    public bo(jo joVar, int i10) {
        this.f21864a = i10;
        this.f21865b = joVar;
    }

    @Override
    public final void run() {
        switch (this.f21864a) {
            case 0:
                jo joVar = this.f21865b;
                AtomicReference atomicReference = joVar.f24469n;
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) atomicReference.get();
                if (l5Var != null) {
                    joVar.removeView(l5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                jo joVar2 = this.f21865b;
                AtomicReference atomicReference2 = joVar2.v;
                org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) atomicReference2.get();
                if (l5Var2 != null) {
                    joVar2.removeView(l5Var2);
                    atomicReference2.set(null);
                    if (!joVar2.f24455b) {
                        joVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                jo joVar3 = this.f21865b;
                joVar3.f24466j0 = false;
                joVar3.f24464h0.c(false);
                if (joVar3.a()) {
                    joVar3.f();
                    return;
                }
                return;
        }
    }
}
