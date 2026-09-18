package org.telegram.ui;

import java.util.ArrayList;
public abstract class g7 extends og.b {
    public final int d;
    public final ArrayList e = new ArrayList();

    public g7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override
    public final int h() {
        return this.e.size();
    }

    @Override
    public final int j(int i10) {
        return ((n7) this.e.get(i10)).f15672a;
    }
}
