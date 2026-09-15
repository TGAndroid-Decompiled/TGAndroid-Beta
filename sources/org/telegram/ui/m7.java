package org.telegram.ui;

import j$.util.Objects;
public final class m7 extends og.a {
    public s6 f35644c;
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
            int i10 = this.f15533a;
            if (i10 == m7Var.f15533a) {
                if (i10 == 1 && (s6Var = this.f35644c) != null && (s6Var2 = m7Var.f35644c) != null) {
                    if (s6Var.f37257a == s6Var2.f37257a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = m7Var.d) != null) {
                    return Objects.equals(aVar.f49194a, aVar2.f49194a);
                }
            }
        }
        return false;
    }
}
