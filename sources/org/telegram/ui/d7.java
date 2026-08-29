package org.telegram.ui;

import java.util.ArrayList;
public abstract class d7 extends zf.b {
    public final int d;
    public final ArrayList f37378e = new ArrayList();

    public d7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override
    public final int h() {
        return this.f37378e.size();
    }

    @Override
    public final int j(int i10) {
        return ((k7) this.f37378e.get(i10)).f50845a;
    }
}
