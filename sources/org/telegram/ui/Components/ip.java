package org.telegram.ui.Components;

public final class ip implements m2.e {

    public int f29457a;

    public final ch0 f29458b;

    public ip(ch0 ch0Var) {
        this.f29458b = ch0Var;
    }

    public final void a() {
        ch0 ch0Var = this.f29458b;
        if (ch0Var.f30163s0 != null) {
            int currentItem = ch0Var.getCurrentItem();
            int iK = ch0Var.f30163s0.k(currentItem) + ch0Var.f30163s0.j();
            if (currentItem != iK) {
                ch0Var.x(iK, false);
            }
        }
    }

    @Override
    public final void c(float f10, int i10, int i11) {
        if (i10 == this.f29458b.getCurrentItem() && f10 == 0.0f && this.f29457a == 1) {
            a();
        }
    }

    @Override
    public final void d(int i10) {
        if (i10 == 0) {
            a();
        }
        this.f29457a = i10;
    }

    @Override
    public final void b(int i10) {
    }
}
