package org.telegram.ui;

import j$.util.Objects;
public final class o7 extends bg.b {
    public u6 f36801c;
    public mh.a d;

    public final boolean equals(Object obj) {
        mh.a aVar;
        mh.a aVar2;
        u6 u6Var;
        u6 u6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && o7.class == obj.getClass()) {
            o7 o7Var = (o7) obj;
            int i10 = this.f1808a;
            if (i10 == o7Var.f1808a) {
                if (i10 == 1 && (u6Var = this.f36801c) != null && (u6Var2 = o7Var.f36801c) != null) {
                    if (u6Var.f38849a == u6Var2.f38849a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = o7Var.d) != null) {
                    return Objects.equals(aVar.f14169a, aVar2.f14169a);
                }
            }
        }
        return false;
    }
}
