package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class fo implements Runnable {
    public final int f26398a;
    public final mo f26399b;

    public fo(mo moVar, int i10) {
        this.f26398a = i10;
        this.f26399b = moVar;
    }

    @Override
    public final void run() {
        switch (this.f26398a) {
            case 0:
                mo moVar = this.f26399b;
                AtomicReference atomicReference = moVar.f28646n;
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) atomicReference.get();
                if (n5Var != null) {
                    moVar.removeView(n5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                mo moVar2 = this.f26399b;
                AtomicReference atomicReference2 = moVar2.v;
                org.telegram.ui.ActionBar.n5 n5Var2 = (org.telegram.ui.ActionBar.n5) atomicReference2.get();
                if (n5Var2 != null) {
                    moVar2.removeView(n5Var2);
                    atomicReference2.set(null);
                    if (!moVar2.f28632b) {
                        moVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                mo moVar3 = this.f26399b;
                moVar3.f28643j0 = false;
                moVar3.f28641h0.c(false);
                if (moVar3.a()) {
                    moVar3.f();
                    return;
                }
                return;
        }
    }
}
