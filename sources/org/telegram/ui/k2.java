package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class k2 implements z4.e {
    public final int f38634a;
    public final Object f38635b;

    public k2(Object obj, int i10) {
        this.f38634a = i10;
        this.f38635b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f38634a) {
            case 0:
                o2 o2Var = (o2) this.f38635b;
                o2Var.f40026x = i10;
                o2Var.d.invalidate();
                return;
            case 1:
                ((r60) this.f38635b).H = i10;
                return;
            default:
                ((k91) this.f38635b).f38716b0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        switch (this.f38634a) {
            case 0:
                o2 o2Var = (o2) this.f38635b;
                float measuredWidth = o2Var.f40019b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    o2Var.f40025w = c3.i0.g(o2Var.f40026x, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    o2Var.d.invalidate();
                    return;
                }
                return;
            case 1:
                r60 r60Var = (r60) this.f38635b;
                org.telegram.ui.Components.y9 y9Var = r60Var.e;
                y9Var.f32775b = f7;
                y9Var.f32776c = i10;
                y9Var.invalidate();
                float measuredWidth2 = r60Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (r60Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f38634a) {
            case 0:
                return;
            case 1:
                r60 r60Var = (r60) this.f38635b;
                if (i10 == 1) {
                    r60Var.K = true;
                    r60Var.d.getCurrentItem();
                    r60Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (r60Var.K) {
                        r60Var.K = false;
                    }
                    if (r60Var.f40988x != r60Var.d.getCurrentItem()) {
                        r60Var.f40988x = r60Var.d.getCurrentItem();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(float f7, int i10, int i11) {
    }
}
