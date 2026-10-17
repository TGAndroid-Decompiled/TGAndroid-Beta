package org.telegram.ui;

import j$.util.Objects;
public final class p7 extends pg.a {
    public v6 f39980c;
    public bi.b d;

    public final boolean equals(Object obj) {
        bi.b bVar;
        bi.b bVar2;
        v6 v6Var;
        v6 v6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && p7.class == obj.getClass()) {
            p7 p7Var = (p7) obj;
            int i10 = this.f44314a;
            if (i10 == p7Var.f44314a) {
                if (i10 == 1 && (v6Var = this.f39980c) != null && (v6Var2 = p7Var.f39980c) != null) {
                    if (v6Var.f42133a == v6Var2.f42133a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (bVar = this.d) != null && (bVar2 = p7Var.d) != null) {
                    return Objects.equals(bVar.f4427a, bVar2.f4427a);
                }
            }
        }
        return false;
    }
}
