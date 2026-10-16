package org.telegram.ui;
public final class o30 extends g.o {
    public final n60 f38538c;

    public o30(n60 n60Var) {
        this.f38538c = n60Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f38538c.f38215o2.e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
