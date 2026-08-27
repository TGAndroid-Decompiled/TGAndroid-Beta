package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

public final class kn implements Runnable {

    public final int f30151a;

    public final rn f30152b;

    public kn(rn rnVar, int i10) {
        this.f30151a = i10;
        this.f30152b = rnVar;
    }

    @Override
    public final void run() {
        switch (this.f30151a) {
            case 0:
                rn rnVar = this.f30152b;
                AtomicReference atomicReference = rnVar.f32227n;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get();
                if (h5Var != null) {
                    rnVar.removeView(h5Var);
                    atomicReference.set(null);
                }
                break;
            case 1:
                rn rnVar2 = this.f30152b;
                AtomicReference atomicReference2 = rnVar2.v;
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
                if (h5Var2 != null) {
                    rnVar2.removeView(h5Var2);
                    atomicReference2.set(null);
                    if (!rnVar2.f32212b) {
                        rnVar2.setClipChildren(true);
                    }
                }
                break;
            default:
                rn rnVar3 = this.f30152b;
                rnVar3.f32220f0 = false;
                rnVar3.f32216d0.c(false);
                if (rnVar3.a()) {
                    rnVar3.f();
                }
                break;
        }
    }
}
