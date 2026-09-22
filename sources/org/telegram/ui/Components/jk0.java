package org.telegram.ui.Components;
public final class jk0 extends og.a {
    public final zg.p0 f25397c;

    public jk0(int i10, zg.p0 p0Var) {
        super(i10, false);
        this.f25397c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jk0.class == obj.getClass()) {
            jk0 jk0Var = (jk0) obj;
            int i10 = this.f15719a;
            int i11 = jk0Var.f15719a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.p0 p0Var = this.f25397c;
                if (p0Var != null && p0Var.equals(jk0Var.f25397c)) {
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
