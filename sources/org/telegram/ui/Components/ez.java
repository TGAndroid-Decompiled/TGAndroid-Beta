package org.telegram.ui.Components;

import java.io.Serializable;
public final class ez {
    public long f33609a;
    public Object f33610b;
    public Serializable f33611c;
    public Object d;

    public void a(sh.b bVar, boolean z10) {
        r4.u uVar = (r4.u) this.d;
        if (((sh.b) this.f33611c) != bVar) {
            org.telegram.messenger.g0.r(uVar);
            this.f33611c = bVar;
            if (z10) {
                ((gi.j8) this.f33610b).a(bVar);
            }
            if (bVar == sh.b.f54720b || bVar == sh.b.f54721c) {
                org.telegram.messenger.g0.i3(uVar, this.f33609a);
            }
        }
    }
}
