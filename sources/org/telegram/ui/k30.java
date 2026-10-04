package org.telegram.ui;
public final class k30 extends g.p {
    public final h60 f37818c;

    public k30(h60 h60Var) {
        this.f37818c = h60Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f37818c.f36931o2.f38827e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
