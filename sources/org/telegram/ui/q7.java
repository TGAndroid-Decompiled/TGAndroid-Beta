package org.telegram.ui;

import j$.util.Objects;
public final class q7 extends pg.a {
    public w6 f39350c;
    public ai.b d;

    public final boolean equals(Object obj) {
        ai.b bVar;
        ai.b bVar2;
        w6 w6Var;
        w6 w6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && q7.class == obj.getClass()) {
            q7 q7Var = (q7) obj;
            int i10 = this.f43203a;
            if (i10 == q7Var.f43203a) {
                if (i10 == 1 && (w6Var = this.f39350c) != null && (w6Var2 = q7Var.f39350c) != null) {
                    if (w6Var.f41163a == w6Var2.f41163a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (bVar = this.d) != null && (bVar2 = q7Var.d) != null) {
                    return Objects.equals(bVar.f915a, bVar2.f915a);
                }
            }
        }
        return false;
    }
}
