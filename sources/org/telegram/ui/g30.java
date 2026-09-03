package org.telegram.ui;
public final class g30 extends f2.v {
    public final d60 f36973c;

    public g30(d60 d60Var) {
        this.f36973c = d60Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f36973c.f36037l2.f37847e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
