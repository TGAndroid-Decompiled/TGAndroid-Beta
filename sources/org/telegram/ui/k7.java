package org.telegram.ui;

import j$.util.Objects;
public final class k7 extends zf.a {
    public q6 f39771c;
    public kh.a d;

    public final boolean equals(Object obj) {
        kh.a aVar;
        kh.a aVar2;
        q6 q6Var;
        q6 q6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && k7.class == obj.getClass()) {
            k7 k7Var = (k7) obj;
            int i10 = this.f50845a;
            if (i10 == k7Var.f50845a) {
                if (i10 == 1 && (q6Var = this.f39771c) != null && (q6Var2 = k7Var.f39771c) != null) {
                    if (q6Var.f41543a == q6Var2.f41543a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = k7Var.d) != null) {
                    return Objects.equals(aVar.f13889a, aVar2.f13889a);
                }
            }
        }
        return false;
    }
}
