package org.telegram.ui;

import j$.util.Objects;
public final class p7 extends pg.a {
    public v6 f40380c;
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
            int i10 = this.f44712a;
            if (i10 == p7Var.f44712a) {
                if (i10 == 1 && (v6Var = this.f40380c) != null && (v6Var2 = p7Var.f40380c) != null) {
                    if (v6Var.f42584a == v6Var2.f42584a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (bVar = this.d) != null && (bVar2 = p7Var.d) != null) {
                    return Objects.equals(bVar.f4428a, bVar2.f4428a);
                }
            }
        }
        return false;
    }
}
