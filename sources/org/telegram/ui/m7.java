package org.telegram.ui;

import j$.util.Objects;
public final class m7 extends rg.a {
    public s6 f49142c;
    public ei.b d;

    public final boolean equals(Object obj) {
        ei.b bVar;
        ei.b bVar2;
        s6 s6Var;
        s6 s6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && m7.class == obj.getClass()) {
            m7 m7Var = (m7) obj;
            int i7 = this.f56015a;
            if (i7 == m7Var.f56015a) {
                if (i7 == 1 && (s6Var = this.f49142c) != null && (s6Var2 = m7Var.f49142c) != null) {
                    if (s6Var.f51112a == s6Var2.f51112a) {
                        return true;
                    }
                    return false;
                } else if (i7 == 2 && (bVar = this.d) != null && (bVar2 = m7Var.d) != null) {
                    return Objects.equals(bVar.f10646a, bVar2.f10646a);
                }
            }
        }
        return false;
    }
}
