package org.telegram.ui.Components;

import java.io.Serializable;
public final class hz {
    public long f34453a;
    public Object f34454b;
    public Serializable f34455c;
    public Object d;

    public void a(rh.b bVar, boolean z9) {
        org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) this.d;
        if (((rh.b) this.f34455c) != bVar) {
            org.telegram.messenger.g0.r(m5Var);
            this.f34455c = bVar;
            if (z9) {
                ((ii.c) this.f34454b).a(bVar);
            }
            if (bVar == rh.b.f54420b || bVar == rh.b.f54421c) {
                org.telegram.messenger.g0.i3(m5Var, this.f34453a);
            }
        }
    }
}
