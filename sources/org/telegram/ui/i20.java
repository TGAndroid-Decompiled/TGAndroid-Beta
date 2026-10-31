package org.telegram.ui;
public final class i20 extends g.o {
    public final b50 f38101c;

    public i20(b50 b50Var) {
        this.f38101c = b50Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f38101c.f36016f4.e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
