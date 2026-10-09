package org.telegram.ui;

import java.util.ArrayList;
public abstract class e7 extends og.b {
    public final int d;
    public final ArrayList f37175e = new ArrayList();

    public e7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override
    public final int h() {
        return this.f37175e.size();
    }

    @Override
    public final int j(int i10) {
        return ((l7) this.f37175e.get(i10)).f17125a;
    }
}
