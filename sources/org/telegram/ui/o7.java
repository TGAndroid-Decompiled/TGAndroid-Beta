package org.telegram.ui;

import j$.util.Objects;
public final class o7 extends cg.b {
    public u6 f39552c;
    public nh.a d;

    public final boolean equals(Object obj) {
        nh.a aVar;
        nh.a aVar2;
        u6 u6Var;
        u6 u6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && o7.class == obj.getClass()) {
            o7 o7Var = (o7) obj;
            int i10 = this.f2505a;
            if (i10 == o7Var.f2505a) {
                if (i10 == 1 && (u6Var = this.f39552c) != null && (u6Var2 = o7Var.f39552c) != null) {
                    if (u6Var.f41727a == u6Var2.f41727a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = o7Var.d) != null) {
                    return Objects.equals(aVar.f16245a, aVar2.f16245a);
                }
            }
        }
        return false;
    }
}
