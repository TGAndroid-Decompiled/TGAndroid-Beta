package org.telegram.ui.Components;

import java.io.Serializable;
public final class sz {
    public long f39866a;
    public Object f39867b;
    public Serializable f39868c;
    public Object d;

    public void a(rh.b bVar, boolean z10) {
        org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
        if (((rh.b) this.f39868c) != bVar) {
            org.telegram.messenger.g0.r(z0Var);
            this.f39868c = bVar;
            if (z10) {
                ((hi.t6) this.f39867b).a(bVar);
            }
            if (bVar == rh.b.f56594b || bVar == rh.b.f56595c) {
                org.telegram.messenger.g0.h3(z0Var, this.f39866a);
            }
        }
    }
}
