package org.telegram.ui;

import j$.util.Objects;
public final class o7 extends og.a {
    public u6 f40566c;
    public zh.a d;

    public final boolean equals(Object obj) {
        zh.a aVar;
        zh.a aVar2;
        u6 u6Var;
        u6 u6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && o7.class == obj.getClass()) {
            o7 o7Var = (o7) obj;
            int i10 = this.f16876a;
            if (i10 == o7Var.f16876a) {
                if (i10 == 1 && (u6Var = this.f40566c) != null && (u6Var2 = o7Var.f40566c) != null) {
                    if (u6Var.f42371a == u6Var2.f42371a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = o7Var.d) != null) {
                    return Objects.equals(aVar.f54918a, aVar2.f54918a);
                }
            }
        }
        return false;
    }
}
