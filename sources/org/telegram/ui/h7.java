package org.telegram.ui;

import java.util.ArrayList;
public abstract class h7 extends og.b {
    public final int d;
    public final ArrayList f36992e = new ArrayList();

    public h7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override
    public final int h() {
        return this.f36992e.size();
    }

    @Override
    public final int j(int i10) {
        return ((o7) this.f36992e.get(i10)).f17187a;
    }
}
