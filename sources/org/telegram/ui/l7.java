package org.telegram.ui;

import j$.util.Objects;
public final class l7 extends og.a {
    public r6 f39492c;
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
            int i10 = this.f17129a;
            if (i10 == l7Var.f17129a) {
                if (i10 == 1 && (r6Var = this.f39492c) != null && (r6Var2 = l7Var.f39492c) != null) {
                    if (r6Var.f41325a == r6Var2.f41325a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = l7Var.d) != null) {
                    return Objects.equals(aVar.f54738a, aVar2.f54738a);
                }
            }
        }
        return false;
    }
}
