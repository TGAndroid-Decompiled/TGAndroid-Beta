package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class cn implements Runnable {
    public final int f32772a;
    public final jn f32773b;

    public cn(jn jnVar, int i3) {
        this.f32772a = i3;
        this.f32773b = jnVar;
    }

    @Override
    public final void run() {
        switch (this.f32772a) {
            case 0:
                jn jnVar = this.f32773b;
                AtomicReference atomicReference = jnVar.f35137n;
                org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) atomicReference.get();
                if (k5Var != null) {
                    jnVar.removeView(k5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                jn jnVar2 = this.f32773b;
                AtomicReference atomicReference2 = jnVar2.f35149w;
                org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) atomicReference2.get();
                if (k5Var2 != null) {
                    jnVar2.removeView(k5Var2);
                    atomicReference2.set(null);
                    if (!jnVar2.f35122b) {
                        jnVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                jn jnVar3 = this.f32773b;
                jnVar3.f35135k0 = false;
                jnVar3.f35133i0.c(false);
                if (jnVar3.a()) {
                    jnVar3.f();
                    return;
                }
                return;
        }
    }
}
