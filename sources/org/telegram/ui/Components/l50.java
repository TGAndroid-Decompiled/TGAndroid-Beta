package org.telegram.ui.Components;

public abstract class l50 extends nn0 {
    @Override
    public final boolean a() {
        return j() > 0;
    }

    @Override
    public final boolean b() {
        return j() < i();
    }

    @Override
    public final void c(boolean z10) {
        int iH = h();
        if (z10) {
            iH *= -1;
        }
        k(Math.min(i(), Math.max(0, j() + iH)));
    }

    public int h() {
        return 1;
    }

    public abstract int i();

    public abstract int j();

    public abstract void k(int i10);
}
