package org.telegram.ui.Components;
public final class jk0 extends og.a {
    public final zg.m0 f27875c;

    public jk0(int i10, zg.m0 m0Var) {
        super(i10, false);
        this.f27875c = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jk0.class == obj.getClass()) {
            jk0 jk0Var = (jk0) obj;
            int i10 = this.f17192a;
            int i11 = jk0Var.f17192a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.m0 m0Var = this.f27875c;
                if (m0Var != null && m0Var.equals(jk0Var.f27875c)) {
                    return true;
                }
                return false;
            } else if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
