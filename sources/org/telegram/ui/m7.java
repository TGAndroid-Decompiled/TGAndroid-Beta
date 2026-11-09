package org.telegram.ui;

import j$.util.Objects;
public final class m7 extends rg.a {
    public s6 f47784c;
    public ci.b d;

    public final boolean equals(Object obj) {
        ci.b bVar;
        ci.b bVar2;
        s6 s6Var;
        s6 s6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && m7.class == obj.getClass()) {
            m7 m7Var = (m7) obj;
            int i7 = this.f54544a;
            if (i7 == m7Var.f54544a) {
                if (i7 == 1 && (s6Var = this.f47784c) != null && (s6Var2 = m7Var.f47784c) != null) {
                    if (s6Var.f49776a == s6Var2.f49776a) {
                        return true;
                    }
                    return false;
                } else if (i7 == 2 && (bVar = this.d) != null && (bVar2 = m7Var.d) != null) {
                    return Objects.equals(bVar.f6415a, bVar2.f6415a);
                }
            }
        }
        return false;
    }
}
