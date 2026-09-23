package org.telegram.ui;

import j$.util.Objects;
public final class m7 extends og.a {
    public s6 f35165c;
    public zh.a d;

    public final boolean equals(Object obj) {
        zh.a aVar;
        zh.a aVar2;
        s6 s6Var;
        s6 s6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && m7.class == obj.getClass()) {
            m7 m7Var = (m7) obj;
            int i10 = this.f15508a;
            if (i10 == m7Var.f15508a) {
                if (i10 == 1 && (s6Var = this.f35165c) != null && (s6Var2 = m7Var.f35165c) != null) {
                    if (s6Var.f37130a == s6Var2.f37130a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = m7Var.d) != null) {
                    return Objects.equals(aVar.f49138a, aVar2.f49138a);
                }
            }
        }
        return false;
    }
}
