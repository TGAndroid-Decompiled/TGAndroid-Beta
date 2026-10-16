package org.telegram.ui;

import j$.util.Objects;
public final class q7 extends pg.a {
    public w6 f39071c;
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
            int i10 = this.f42904a;
            if (i10 == q7Var.f42904a) {
                if (i10 == 1 && (w6Var = this.f39071c) != null && (w6Var2 = q7Var.f39071c) != null) {
                    if (w6Var.f40870a == w6Var2.f40870a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (bVar = this.d) != null && (bVar2 = q7Var.d) != null) {
                    return Objects.equals(bVar.f919a, bVar2.f919a);
                }
            }
        }
        return false;
    }
}
