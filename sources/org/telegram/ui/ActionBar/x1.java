package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.za;
public final class x1 implements za {
    public final int f28794a;
    public final d2 f28795b;

    public x1(int i3, d2 d2Var) {
        this.f28794a = i3;
        this.f28795b = d2Var;
    }

    @Override
    public final boolean a() {
        switch (this.f28794a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void b(ac acVar) {
        int i3 = this.f28794a;
    }

    @Override
    public final void c(float f10) {
        int i3 = this.f28794a;
    }

    @Override
    public final void d(ac acVar) {
        int i3 = this.f28794a;
    }

    @Override
    public final boolean e() {
        switch (this.f28794a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i3) {
        switch (this.f28794a) {
            case 0:
                if (this.f28795b.isSupportEdgeToEdge()) {
                    return org.telegram.messenger.g0.f22603n;
                }
                return 0;
            default:
                return this.f28795b.getBottomInset();
        }
    }

    @Override
    public final boolean g(int i3) {
        switch (this.f28794a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int h(int i3) {
        switch (this.f28794a) {
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

    private final void k(ac acVar) {
    }

    private final void l(ac acVar) {
    }

    private final void m(ac acVar) {
    }

    private final void n(ac acVar) {
    }
}
