package org.telegram.ui;

import j$.util.Objects;
public final class q7 extends qg.a {
    public w6 f42625c;
    public ci.a d;

    public final boolean equals(Object obj) {
        ci.a aVar;
        ci.a aVar2;
        w6 w6Var;
        w6 w6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && q7.class == obj.getClass()) {
            q7 q7Var = (q7) obj;
            int i10 = this.f47075a;
            if (i10 == q7Var.f47075a) {
                if (i10 == 1 && (w6Var = this.f42625c) != null && (w6Var2 = q7Var.f42625c) != null) {
                    if (w6Var.f44525a == w6Var2.f44525a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = q7Var.d) != null) {
                    return Objects.equals(aVar.f6364a, aVar2.f6364a);
                }
            }
        }
        return false;
    }
}
