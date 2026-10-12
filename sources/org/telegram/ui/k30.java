package org.telegram.ui;
public final class k30 extends g.o {
    public final i60 f39352c;

    public k30(i60 i60Var) {
        this.f39352c = i60Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f39352c.f38739o2.f40239e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
