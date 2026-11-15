package org.telegram.ui.Components;

import java.io.Serializable;
public final class lz {
    public long f37015a;
    public Object f37016b;
    public Serializable f37017c;
    public Object d;

    public void a(rh.b bVar, boolean z10) {
        q2.d dVar = (q2.d) this.d;
        if (((rh.b) this.f37017c) != bVar) {
            org.telegram.messenger.g0.r(dVar);
            this.f37017c = bVar;
            if (z10) {
                ((hi.g7) this.f37016b).a(bVar);
            }
            if (bVar == rh.b.f56020b || bVar == rh.b.f56021c) {
                org.telegram.messenger.g0.i3(dVar, this.f37015a);
            }
        }
    }
}
