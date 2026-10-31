package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wb;
public final class e2 implements ua {
    public final int f20282a;
    public final k2 f20283b;

    public e2(int i10, k2 k2Var) {
        this.f20282a = i10;
        this.f20283b = k2Var;
    }

    @Override
    public final boolean a() {
        switch (this.f20282a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void b(wb wbVar) {
        int i10 = this.f20282a;
    }

    @Override
    public final void c(float f7) {
        int i10 = this.f20282a;
    }

    @Override
    public final void d(wb wbVar) {
        int i10 = this.f20282a;
    }

    @Override
    public final boolean e() {
        switch (this.f20282a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i10) {
        switch (this.f20282a) {
            case 0:
                if (this.f20283b.isSupportEdgeToEdge()) {
                    return org.telegram.messenger.i0.f16021n;
                }
                return 0;
            default:
                return this.f20283b.getBottomInset();
        }
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f20282a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f20282a) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }

    private final void i(float f7) {
    }

    private final void j(float f7) {
    }

    private final void k(wb wbVar) {
    }

    private final void l(wb wbVar) {
    }

    private final void m(wb wbVar) {
    }

    private final void n(wb wbVar) {
    }
}
