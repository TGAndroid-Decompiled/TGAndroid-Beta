package org.telegram.ui;
public final class i10 extends g.p {
    public final c40 f46546c;

    public i10(c40 c40Var) {
        this.f46546c = c40Var;
    }

    @Override
    public final int i(int i7) {
        int size = this.f46546c.f44569f4.f45435e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i7 == 0 || i7 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
