package org.telegram.ui.Components;

import java.io.Serializable;
public final class hz {
    public long f34443a;
    public Object f34444b;
    public Serializable f34445c;
    public Object d;

    public void a(rh.b bVar, boolean z9) {
        org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) this.d;
        if (((rh.b) this.f34445c) != bVar) {
            org.telegram.messenger.g0.r(m5Var);
            this.f34445c = bVar;
            if (z9) {
                ((ii.c) this.f34444b).a(bVar);
            }
            if (bVar == rh.b.f54444b || bVar == rh.b.f54445c) {
                org.telegram.messenger.g0.i3(m5Var, this.f34443a);
            }
        }
    }
}
