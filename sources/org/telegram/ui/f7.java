package org.telegram.ui;

import java.util.ArrayList;
public abstract class f7 extends pg.b {
    public final int d;
    public final ArrayList f36304e = new ArrayList();

    public f7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override
    public final int h() {
        return this.f36304e.size();
    }

    @Override
    public final int j(int i10) {
        return ((m7) this.f36304e.get(i10)).f44098a;
    }
}
