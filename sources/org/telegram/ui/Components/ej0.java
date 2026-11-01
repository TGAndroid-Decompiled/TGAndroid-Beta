package org.telegram.ui.Components;
public final class ej0 extends hg.b {
    public final sg.o0 f25852c;

    public ej0(int i10, sg.o0 o0Var) {
        super(i10, false);
        this.f25852c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ej0.class == obj.getClass()) {
            ej0 ej0Var = (ej0) obj;
            int i10 = this.f7681a;
            int i11 = ej0Var.f7681a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                sg.o0 o0Var = this.f25852c;
                if (o0Var != null && o0Var.equals(ej0Var.f25852c)) {
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
