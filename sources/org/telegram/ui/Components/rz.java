package org.telegram.ui.Components;

import java.io.Serializable;
public final class rz {
    public long f39437a;
    public Object f39438b;
    public Serializable f39439c;
    public Object d;

    public void a(rh.b bVar, boolean z10) {
        org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
        if (((rh.b) this.f39439c) != bVar) {
            org.telegram.messenger.g0.r(z0Var);
            this.f39439c = bVar;
            if (z10) {
                ((hi.c7) this.f39438b).a(bVar);
            }
            if (bVar == rh.b.f56717b || bVar == rh.b.f56718c) {
                org.telegram.messenger.g0.h3(z0Var, this.f39437a);
            }
        }
    }
}
