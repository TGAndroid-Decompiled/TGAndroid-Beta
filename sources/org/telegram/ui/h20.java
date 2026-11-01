package org.telegram.ui;
public final class h20 extends g.o {
    public final a50 f37639c;

    public h20(a50 a50Var) {
        this.f37639c = a50Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f37639c.f35600f4.e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
