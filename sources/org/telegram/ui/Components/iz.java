package org.telegram.ui.Components;

import java.io.Serializable;
public final class iz {
    public long f34883a;
    public Object f34884b;
    public Serializable f34885c;
    public Object d;

    public void a(rh.b bVar, boolean z9) {
        org.telegram.ui.ActionBar.o5 o5Var = (org.telegram.ui.ActionBar.o5) this.d;
        if (((rh.b) this.f34885c) != bVar) {
            org.telegram.messenger.g0.r(o5Var);
            this.f34885c = bVar;
            if (z9) {
                ((ii.c) this.f34884b).a(bVar);
            }
            if (bVar == rh.b.f54549b || bVar == rh.b.f54550c) {
                org.telegram.messenger.g0.i3(o5Var, this.f34883a);
            }
        }
    }
}
