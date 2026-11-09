package org.telegram.ui;
public final class k10 extends g.p {
    public final e40 f47156c;

    public k10(e40 e40Var) {
        this.f47156c = e40Var;
    }

    @Override
    public final int i(int i7) {
        int size = this.f47156c.f45209f4.f46140e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i7 == 0 || i7 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
