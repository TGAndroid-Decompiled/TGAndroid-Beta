package org.telegram.ui.Components;

import java.io.Serializable;
public final class uz {
    public long f40616a;
    public Object f40617b;
    public Serializable f40618c;
    public Object d;

    public void a(rh.b bVar, boolean z10) {
        org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
        if (((rh.b) this.f40618c) != bVar) {
            org.telegram.messenger.g0.r(z0Var);
            this.f40618c = bVar;
            if (z10) {
                ((hi.s6) this.f40617b).a(bVar);
            }
            if (bVar == rh.b.f56635b || bVar == rh.b.f56636c) {
                org.telegram.messenger.g0.h3(z0Var, this.f40616a);
            }
        }
    }
}
