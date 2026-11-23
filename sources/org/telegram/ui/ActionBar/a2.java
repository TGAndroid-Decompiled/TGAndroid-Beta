package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gc;
public final class a2 implements fb {
    public final int f28785a;
    public final g2 f28786b;

    public a2(int i7, g2 g2Var) {
        this.f28785a = i7;
        this.f28786b = g2Var;
    }

    @Override
    public final boolean a() {
        switch (this.f28785a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void b(gc gcVar) {
        int i7 = this.f28785a;
    }

    @Override
    public final void c(float f10) {
        int i7 = this.f28785a;
    }

    @Override
    public final void d(gc gcVar) {
        int i7 = this.f28785a;
    }

    @Override
    public final boolean e() {
        switch (this.f28785a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i7) {
        switch (this.f28785a) {
            case 0:
                if (this.f28786b.isSupportEdgeToEdge()) {
                    return org.telegram.messenger.g0.f24041n;
                }
                return 0;
            default:
                return this.f28786b.getBottomInset();
        }
    }

    @Override
    public final boolean g(int i7) {
        switch (this.f28785a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f28785a) {
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
