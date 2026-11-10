package org.telegram.ui.Components;

import java.io.Serializable;
public final class hz {
    public long f34484a;
    public Object f34485b;
    public Serializable f34486c;
    public Object d;

    public void a(rh.b bVar, boolean z9) {
        org.telegram.ui.ActionBar.p5 p5Var = (org.telegram.ui.ActionBar.p5) this.d;
        if (((rh.b) this.f34486c) != bVar) {
            org.telegram.messenger.g0.r(p5Var);
            this.f34486c = bVar;
            if (z9) {
                ((ii.c) this.f34485b).a(bVar);
            }
            if (bVar == rh.b.f54548b || bVar == rh.b.f54549c) {
                org.telegram.messenger.g0.i3(p5Var, this.f34484a);
            }
        }
    }
}
