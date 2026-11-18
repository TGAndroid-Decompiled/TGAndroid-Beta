package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gc;
public final class b2 implements fb {
    public final int f28799a;
    public final h2 f28800b;

    public b2(int i7, h2 h2Var) {
        this.f28799a = i7;
        this.f28800b = h2Var;
    }

    @Override
    public final boolean a() {
        switch (this.f28799a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void b(gc gcVar) {
        int i7 = this.f28799a;
    }

    @Override
    public final void c(float f10) {
        int i7 = this.f28799a;
    }

    @Override
    public final void d(gc gcVar) {
        int i7 = this.f28799a;
    }

    @Override
    public final boolean e() {
        switch (this.f28799a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i7) {
        switch (this.f28799a) {
            case 0:
                if (this.f28800b.isSupportEdgeToEdge()) {
                    return org.telegram.messenger.g0.f24113n;
                }
                return 0;
            default:
                return this.f28800b.getBottomInset();
        }
    }

    @Override
    public final boolean g(int i7) {
        switch (this.f28799a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f28799a) {
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

    private final void k(gc gcVar) {
    }

    private final void l(gc gcVar) {
    }

    private final void m(gc gcVar) {
    }

    private final void n(gc gcVar) {
    }
}
