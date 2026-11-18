package org.telegram.ui;

import j$.util.Objects;
public final class l7 extends rg.a {
    public r6 f49468c;
    public ei.b d;

    public final boolean equals(Object obj) {
        ei.b bVar;
        ei.b bVar2;
        r6 r6Var;
        r6 r6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && l7.class == obj.getClass()) {
            l7 l7Var = (l7) obj;
            int i7 = this.f56589a;
            if (i7 == l7Var.f56589a) {
                if (i7 == 1 && (r6Var = this.f49468c) != null && (r6Var2 = l7Var.f49468c) != null) {
                    if (r6Var.f51471a == r6Var2.f51471a) {
                        return true;
                    }
                    return false;
                } else if (i7 == 2 && (bVar = this.d) != null && (bVar2 = l7Var.d) != null) {
                    return Objects.equals(bVar.f10963a, bVar2.f10963a);
                }
            }
        }
        return false;
    }
}
