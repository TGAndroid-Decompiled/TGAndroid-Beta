package org.telegram.ui.Components;

import java.io.Serializable;
public final class iz {
    public long f34844a;
    public Object f34845b;
    public Serializable f34846c;
    public Object d;

    public void a(rh.b bVar, boolean z9) {
        org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) this.d;
        if (((rh.b) this.f34846c) != bVar) {
            org.telegram.messenger.g0.r(m5Var);
            this.f34846c = bVar;
            if (z9) {
                ((ii.c) this.f34845b).a(bVar);
            }
            if (bVar == rh.b.f54537b || bVar == rh.b.f54538c) {
                org.telegram.messenger.g0.i3(m5Var, this.f34844a);
            }
        }
    }
}
