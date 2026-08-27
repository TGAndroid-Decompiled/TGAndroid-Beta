package org.telegram.ui;

import j$.util.Objects;

public final class m7 extends xf.a {

    public s6 f40384c;
    public ih.a d;

    public final boolean equals(Object obj) {
        ih.a aVar;
        ih.a aVar2;
        s6 s6Var;
        s6 s6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && m7.class == obj.getClass()) {
            m7 m7Var = (m7) obj;
            int i10 = this.f49413a;
            if (i10 == m7Var.f49413a) {
                if (i10 == 1 && (s6Var = this.f40384c) != null && (s6Var2 = m7Var.f40384c) != null) {
                    return s6Var.f42522a == s6Var2.f42522a;
                }
                if (i10 == 2 && (aVar = this.d) != null && (aVar2 = m7Var.d) != null) {
                    return Objects.equals(aVar.f11476a, aVar2.f11476a);
                }
            }
        }
        return false;
    }
}
