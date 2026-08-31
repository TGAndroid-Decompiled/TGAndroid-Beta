package org.telegram.ui.Components;
public abstract class a60 extends io0 {
    @Override
    public final boolean a() {
        if (j() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        if (j() < i()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z4) {
        int h = h();
        if (z4) {
            h *= -1;
        }
        k(Math.min(i(), Math.max(0, j() + h)));
    }

    public int h() {
        return 1;
    }

    public abstract int i();

    public abstract int j();

    public abstract void k(int i10);
}
