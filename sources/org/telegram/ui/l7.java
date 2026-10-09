package org.telegram.ui;

import j$.util.Objects;
public final class l7 extends og.a {
    public r6 f39448c;
    public zh.a d;

    public final boolean equals(Object obj) {
        zh.a aVar;
        zh.a aVar2;
        r6 r6Var;
        r6 r6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && l7.class == obj.getClass()) {
            l7 l7Var = (l7) obj;
            int i10 = this.f17125a;
            if (i10 == l7Var.f17125a) {
                if (i10 == 1 && (r6Var = this.f39448c) != null && (r6Var2 = l7Var.f39448c) != null) {
                    if (r6Var.f41281a == r6Var2.f41281a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = l7Var.d) != null) {
                    return Objects.equals(aVar.f54694a, aVar2.f54694a);
                }
            }
        }
        return false;
    }
}
