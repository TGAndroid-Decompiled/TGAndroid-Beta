package org.telegram.ui.Components;
public final class ai0 extends rg.a {
    public final ch.o0 f31864c;

    public ai0(int i7, ch.o0 o0Var) {
        super(i7, false);
        this.f31864c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ai0.class == obj.getClass()) {
            ai0 ai0Var = (ai0) obj;
            int i7 = this.f54544a;
            int i10 = ai0Var.f54544a;
            if (i7 == i10 && (i7 == 0 || i7 == 3)) {
                ch.o0 o0Var = this.f31864c;
                if (o0Var != null && o0Var.equals(ai0Var.f31864c)) {
                    return true;
                }
                return false;
            } else if (i7 == i10) {
                return true;
            }
        }
        return false;
    }
}
