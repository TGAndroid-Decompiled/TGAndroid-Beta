package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gc;
public final class b2 implements fb {
    public final int f28801a;
    public final h2 f28802b;

    public b2(int i7, h2 h2Var) {
        this.f28801a = i7;
        this.f28802b = h2Var;
    }

    @Override
    public final boolean a() {
        switch (this.f28801a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void b(gc gcVar) {
        int i7 = this.f28801a;
    }

    @Override
    public final void c(float f10) {
        int i7 = this.f28801a;
    }

    @Override
    public final void d(gc gcVar) {
        int i7 = this.f28801a;
    }

    @Override
    public final boolean e() {
        switch (this.f28801a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i7) {
        switch (this.f28801a) {
            case 0:
                if (this.f28802b.isSupportEdgeToEdge()) {
                    return org.telegram.messenger.g0.f24116n;
                }
                return 0;
            default:
                return this.f28802b.getBottomInset();
        }
    }

    @Override
    public final boolean g(int i7) {
        switch (this.f28801a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f28801a) {
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
