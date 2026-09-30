package org.telegram.ui.Components;
public final class kk0 extends og.a {
    public final zg.o0 f25781c;

    public kk0(int i10, zg.o0 o0Var) {
        super(i10, false);
        this.f25781c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kk0.class == obj.getClass()) {
            kk0 kk0Var = (kk0) obj;
            int i10 = this.f15731a;
            int i11 = kk0Var.f15731a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.o0 o0Var = this.f25781c;
                if (o0Var != null && o0Var.equals(kk0Var.f25781c)) {
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
