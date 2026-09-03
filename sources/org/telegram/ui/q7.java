package org.telegram.ui;

import j$.util.Objects;
public final class q7 extends bg.b {
    public w6 f37321c;
    public mh.a d;

    public final boolean equals(Object obj) {
        mh.a aVar;
        mh.a aVar2;
        w6 w6Var;
        w6 w6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && q7.class == obj.getClass()) {
            q7 q7Var = (q7) obj;
            int i10 = this.f1830a;
            if (i10 == q7Var.f1830a) {
                if (i10 == 1 && (w6Var = this.f37321c) != null && (w6Var2 = q7Var.f37321c) != null) {
                    if (w6Var.f39277a == w6Var2.f39277a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = q7Var.d) != null) {
                    return Objects.equals(aVar.f14157a, aVar2.f14157a);
                }
            }
        }
        return false;
    }
}
