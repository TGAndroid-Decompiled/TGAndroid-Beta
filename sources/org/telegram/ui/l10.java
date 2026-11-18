package org.telegram.ui;
public final class l10 extends g.p {
    public final f40 f49398c;

    public l10(f40 f40Var) {
        this.f49398c = f40Var;
    }

    @Override
    public final int i(int i7) {
        int size = this.f49398c.f47496n4.f48575e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i7 == 0 || i7 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
