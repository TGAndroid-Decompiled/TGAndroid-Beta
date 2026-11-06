package org.telegram.ui.Components;

import java.io.Serializable;
public final class hz {
    public long f34403a;
    public Object f34404b;
    public Serializable f34405c;
    public Object d;

    public void a(rh.b bVar, boolean z9) {
        org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) this.d;
        if (((rh.b) this.f34405c) != bVar) {
            org.telegram.messenger.g0.r(m5Var);
            this.f34405c = bVar;
            if (z9) {
                ((ii.c) this.f34404b).a(bVar);
            }
            if (bVar == rh.b.f54445b || bVar == rh.b.f54446c) {
                org.telegram.messenger.g0.i3(m5Var, this.f34403a);
            }
        }
    }
}
