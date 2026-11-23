package org.telegram.ui;
public final class l10 extends g.p {
    public final f40 f49448c;

    public l10(f40 f40Var) {
        this.f49448c = f40Var;
    }

    @Override
    public final int i(int i7) {
        int size = this.f49448c.f47524n4.f48573e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i7 == 0 || i7 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
