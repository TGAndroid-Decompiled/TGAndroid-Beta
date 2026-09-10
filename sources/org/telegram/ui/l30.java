package org.telegram.ui;
public final class l30 extends g.p {
    public final j60 f34528c;

    public l30(j60 j60Var) {
        this.f34528c = j60Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f34528c.f33993o2.e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
