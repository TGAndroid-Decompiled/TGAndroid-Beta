package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.za;
public final class z1 implements za {
    public final int f28813a;
    public final f2 f28814b;

    public z1(int i7, f2 f2Var) {
        this.f28813a = i7;
        this.f28814b = f2Var;
    }

    @Override
    public final boolean a() {
        switch (this.f28813a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void b(bc bcVar) {
        int i7 = this.f28813a;
    }

    @Override
    public final void c(float f10) {
        int i7 = this.f28813a;
    }

    @Override
    public final void d(bc bcVar) {
        int i7 = this.f28813a;
    }

    @Override
    public final boolean e() {
        switch (this.f28813a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i7) {
        switch (this.f28813a) {
            case 0:
                if (this.f28814b.isSupportEdgeToEdge()) {
                    return org.telegram.messenger.g0.f22562n;
                }
                return 0;
            default:
                return this.f28814b.getBottomInset();
        }
    }

    @Override
    public final boolean g(int i7) {
        switch (this.f28813a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f28813a) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }

    private final void i(float f10) {
    }

    private final void j(float f10) {
    }

    private final void k(bc bcVar) {
    }

    private final void l(bc bcVar) {
    }

    private final void m(bc bcVar) {
    }

    private final void n(bc bcVar) {
    }
}
