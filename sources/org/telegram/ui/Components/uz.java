package org.telegram.ui.Components;

import java.io.Serializable;
public final class uz {
    public long f40609a;
    public Object f40610b;
    public Serializable f40611c;
    public Object d;

    public void a(rh.b bVar, boolean z10) {
        org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
        if (((rh.b) this.f40611c) != bVar) {
            org.telegram.messenger.g0.r(z0Var);
            this.f40611c = bVar;
            if (z10) {
                ((hi.s6) this.f40610b).a(bVar);
            }
            if (bVar == rh.b.f56639b || bVar == rh.b.f56640c) {
                org.telegram.messenger.g0.h3(z0Var, this.f40609a);
            }
        }
    }
}
