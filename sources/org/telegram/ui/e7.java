package org.telegram.ui;

import java.util.ArrayList;
public abstract class e7 extends og.b {
    public final int d;
    public final ArrayList f37219e = new ArrayList();

    public e7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override
    public final int h() {
        return this.f37219e.size();
    }

    @Override
    public final int j(int i10) {
        return ((l7) this.f37219e.get(i10)).f17129a;
    }
}
