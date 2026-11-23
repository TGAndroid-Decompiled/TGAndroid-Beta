package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class k2 implements c5.h {
    public final int f49176a;
    public final Object f49177b;

    public k2(Object obj, int i7) {
        this.f49176a = i7;
        this.f49177b = obj;
    }

    @Override
    public final void a(int i7) {
        switch (this.f49176a) {
            case 0:
                o2 o2Var = (o2) this.f49177b;
                o2Var.f50418x = i7;
                o2Var.d.invalidate();
                return;
            case 1:
                ((v50) this.f49177b).I = i7;
                return;
            default:
                ((x71) this.f49177b).f53724c0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        switch (this.f49176a) {
            case 0:
                o2 o2Var = (o2) this.f49177b;
                float measuredWidth = o2Var.f50410b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    o2Var.f50417w = com.google.android.gms.internal.vision.e2.w(o2Var.f50418x, measuredWidth, (i7 * measuredWidth) + i10, measuredWidth);
                    o2Var.d.invalidate();
                    return;
                }
                return;
            case 1:
                v50 v50Var = (v50) this.f49177b;
                org.telegram.ui.Components.ia iaVar = v50Var.f52725e;
                iaVar.f36227b = f10;
                iaVar.f36228c = i7;
                iaVar.invalidate();
                float measuredWidth2 = v50Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i7 * measuredWidth2) + i10) - (v50Var.I * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i7) {
        switch (this.f49176a) {
            case 0:
                return;
            case 1:
                v50 v50Var = (v50) this.f49177b;
                if (i7 == 1) {
                    v50Var.L = true;
                    v50Var.d.getCurrentItem();
                    v50Var.d.getMeasuredWidth();
                    return;
                } else if (i7 == 0 || i7 == 2) {
                    if (v50Var.L) {
                        v50Var.L = false;
                    }
                    if (v50Var.f52731x != v50Var.d.getCurrentItem()) {
                        v50Var.f52731x = v50Var.d.getCurrentItem();
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

    private final void d(int i7) {
    }

    private final void e(int i7) {
    }

    private final void f(float f10, int i7, int i10) {
    }
}
