package org.telegram.ui.Components;
public final class jk0 extends og.a {
    public final zg.o0 f27803c;

    public jk0(int i10, zg.o0 o0Var) {
        super(i10, false);
        this.f27803c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jk0.class == obj.getClass()) {
            jk0 jk0Var = (jk0) obj;
            int i10 = this.f17183a;
            int i11 = jk0Var.f17183a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.o0 o0Var = this.f27803c;
                if (o0Var != null && o0Var.equals(jk0Var.f27803c)) {
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
