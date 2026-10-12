package org.telegram.ui;

import j$.util.Objects;
public final class o7 extends og.a {
    public u6 f40569c;
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
            int i10 = this.f16877a;
            if (i10 == o7Var.f16877a) {
                if (i10 == 1 && (u6Var = this.f40569c) != null && (u6Var2 = o7Var.f40569c) != null) {
                    if (u6Var.f42373a == u6Var2.f42373a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = o7Var.d) != null) {
                    return Objects.equals(aVar.f54926a, aVar2.f54926a);
                }
            }
        }
        return false;
    }
}
