package org.telegram.ui;

import j$.util.Objects;
public final class o7 extends og.a {
    public u6 f39114c;
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
            int i10 = this.f17182a;
            if (i10 == o7Var.f17182a) {
                if (i10 == 1 && (u6Var = this.f39114c) != null && (u6Var2 = o7Var.f39114c) != null) {
                    if (u6Var.f41065a == u6Var2.f41065a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = o7Var.d) != null) {
                    return Objects.equals(aVar.f53550a, aVar2.f53550a);
                }
            }
        }
        return false;
    }
}
