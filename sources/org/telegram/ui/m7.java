package org.telegram.ui;

import j$.util.Objects;
public final class m7 extends og.a {
    public r6 f35494c;
    public zh.a d;

    public final boolean equals(Object obj) {
        zh.a aVar;
        zh.a aVar2;
        r6 r6Var;
        r6 r6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && m7.class == obj.getClass()) {
            m7 m7Var = (m7) obj;
            int i10 = this.f15715a;
            if (i10 == m7Var.f15715a) {
                if (i10 == 1 && (r6Var = this.f35494c) != null && (r6Var2 = m7Var.f35494c) != null) {
                    if (r6Var.f37187a == r6Var2.f37187a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = m7Var.d) != null) {
                    return Objects.equals(aVar.f49465a, aVar2.f49465a);
                }
            }
        }
        return false;
    }
}
