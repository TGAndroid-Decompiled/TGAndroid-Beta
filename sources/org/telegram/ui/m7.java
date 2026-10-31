package org.telegram.ui;

import j$.util.Objects;
public final class m7 extends hg.b {
    public s6 f39493c;
    public sh.a d;

    public final boolean equals(Object obj) {
        sh.a aVar;
        sh.a aVar2;
        s6 s6Var;
        s6 s6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && m7.class == obj.getClass()) {
            m7 m7Var = (m7) obj;
            int i10 = this.f7680a;
            if (i10 == m7Var.f7680a) {
                if (i10 == 1 && (s6Var = this.f39493c) != null && (s6Var2 = m7Var.f39493c) != null) {
                    if (s6Var.f41380a == s6Var2.f41380a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = m7Var.d) != null) {
                    return Objects.equals(aVar.f48492a, aVar2.f48492a);
                }
            }
        }
        return false;
    }
}
