package org.telegram.ui;

import j$.util.Objects;
public final class m7 extends pg.a {
    public s6 f38613c;
    public ai.b d;

    public final boolean equals(Object obj) {
        ai.b bVar;
        ai.b bVar2;
        s6 s6Var;
        s6 s6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && m7.class == obj.getClass()) {
            m7 m7Var = (m7) obj;
            int i10 = this.f44098a;
            if (i10 == m7Var.f44098a) {
                if (i10 == 1 && (s6Var = this.f38613c) != null && (s6Var2 = m7Var.f38613c) != null) {
                    if (s6Var.f40339a == s6Var2.f40339a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (bVar = this.d) != null && (bVar2 = m7Var.d) != null) {
                    return Objects.equals(bVar.f750a, bVar2.f750a);
                }
            }
        }
        return false;
    }
}
