package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
public final class cn implements Runnable {
    public final int f32711a;
    public final jn f32712b;

    public cn(jn jnVar, int i7) {
        this.f32711a = i7;
        this.f32712b = jnVar;
    }

    @Override
    public final void run() {
        switch (this.f32711a) {
            case 0:
                jn jnVar = this.f32712b;
                AtomicReference atomicReference = jnVar.f35007n;
                org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) atomicReference.get();
                if (m5Var != null) {
                    jnVar.removeView(m5Var);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                jn jnVar2 = this.f32712b;
                AtomicReference atomicReference2 = jnVar2.f35019w;
                org.telegram.ui.ActionBar.m5 m5Var2 = (org.telegram.ui.ActionBar.m5) atomicReference2.get();
                if (m5Var2 != null) {
                    jnVar2.removeView(m5Var2);
                    atomicReference2.set(null);
                    if (!jnVar2.f34992b) {
                        jnVar2.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                jn jnVar3 = this.f32712b;
                jnVar3.f35004j0 = false;
                jnVar3.f35002h0.c(false);
                if (jnVar3.a()) {
                    jnVar3.f();
                    return;
                }
                return;
        }
    }
}
