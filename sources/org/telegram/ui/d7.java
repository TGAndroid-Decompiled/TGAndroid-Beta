package org.telegram.ui;

import java.util.ArrayList;
public abstract class d7 extends og.b {
    public final int d;
    public final ArrayList f36962e = new ArrayList();

    public d7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override
    public final int h() {
        return this.f36962e.size();
    }

    @Override
    public final int j(int i10) {
        return ((k7) this.f36962e.get(i10)).f17211a;
    }
}
