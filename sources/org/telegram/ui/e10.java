package org.telegram.ui;
public final class e10 extends g.p {
    public final x30 f44853c;

    public e10(x30 x30Var) {
        this.f44853c = x30Var;
    }

    @Override
    public final int i(int i3) {
        int size = this.f44853c.f51741g4.f43589e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i3 == 0 || i3 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
