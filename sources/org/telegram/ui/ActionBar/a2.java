package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.fc;
public final class a2 implements eb {
    public final int f28843a;
    public final g2 f28844b;

    public a2(int i7, g2 g2Var) {
        this.f28843a = i7;
        this.f28844b = g2Var;
    }

    @Override
    public final boolean a() {
        switch (this.f28843a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void b(fc fcVar) {
        int i7 = this.f28843a;
    }

    @Override
    public final void c(float f10) {
        int i7 = this.f28843a;
    }

    @Override
    public final void d(fc fcVar) {
        int i7 = this.f28843a;
    }

    @Override
    public final boolean e() {
        switch (this.f28843a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i7) {
        switch (this.f28843a) {
            case 0:
                if (this.f28844b.isSupportEdgeToEdge()) {
                    return org.telegram.messenger.g0.f24221n;
                }
                return 0;
            default:
                return this.f28844b.getBottomInset();
        }
    }

    @Override
    public final boolean g(int i7) {
        switch (this.f28843a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f28843a) {
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

    private final void k(fc fcVar) {
    }

    private final void l(fc fcVar) {
    }

    private final void m(fc fcVar) {
    }

    private final void n(fc fcVar) {
    }
}
