package org.telegram.ui;
public final class i30 extends g.o {
    public final g60 f38511c;

    public i30(g60 g60Var) {
        this.f38511c = g60Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f38511c.f37891o2.f39488e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
