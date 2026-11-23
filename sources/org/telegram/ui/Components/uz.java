package org.telegram.ui.Components;

import java.io.Serializable;
public final class uz {
    public long f40560a;
    public Object f40561b;
    public Serializable f40562c;
    public Object d;

    public void a(rh.b bVar, boolean z10) {
        org.telegram.ui.web.i1 i1Var = (org.telegram.ui.web.i1) this.d;
        if (((rh.b) this.f40562c) != bVar) {
            org.telegram.messenger.g0.r(i1Var);
            this.f40562c = bVar;
            if (z10) {
                ((hi.t6) this.f40561b).a(bVar);
            }
            if (bVar == rh.b.f56604b || bVar == rh.b.f56605c) {
                org.telegram.messenger.g0.h3(i1Var, this.f40560a);
            }
        }
    }
}
