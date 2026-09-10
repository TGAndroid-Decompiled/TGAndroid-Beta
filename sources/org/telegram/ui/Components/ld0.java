package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ld0 implements z4.e {
    public final int f24965a;
    public final View f24966b;

    public ld0(int i10, View view) {
        this.f24965a = i10;
        this.f24966b = view;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        switch (this.f24965a) {
            case 0:
                nd0 nd0Var = (nd0) this.f24966b;
                z4.e eVar = nd0Var.f25494c;
                if (eVar != null) {
                    eVar.a(i10);
                }
                for (int i11 = 0; i11 < nd0Var.d.getChildCount(); i11++) {
                    View childAt = nd0Var.d.getChildAt(i11);
                    if (i11 == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    childAt.setSelected(z10);
                }
                return;
            case 1:
            default:
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        float f10;
        switch (this.f24965a) {
            case 0:
                nd0 nd0Var = (nd0) this.f24966b;
                nd0Var.h = i10;
                nd0Var.f25496n = f7;
                if (nd0Var.d.getChildAt(i10) != null) {
                    nd0.a(nd0Var, i10, (int) (nd0Var.d.getChildAt(i10).getWidth() * f7));
                    nd0Var.invalidate();
                    z4.e eVar = nd0Var.f25494c;
                    if (eVar != null) {
                        eVar.b(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ph0 ph0Var = (ph0) this.f24966b;
                if (!ph0Var.f26125a && Math.abs(i10 - ph0Var.f26132w) == 1) {
                    int i12 = ph0Var.f26132w;
                    if (i10 > i12) {
                        ph0.a(ph0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        ph0.a(ph0Var, 1, 0, 0);
                        ph0.a(ph0Var, 2, 0, -1);
                    }
                }
                int i13 = ph0Var.f26132w;
                int i14 = ph0Var.f26133x;
                ph0Var.f26132w = i10;
                ph0Var.f26133x = i11;
                if (i13 != i10 || i14 != i11) {
                    ph0Var.H = true;
                    ph0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
            default:
                zh.g4 g4Var = (zh.g4) this.f24966b;
                if (g4Var.f48447w) {
                    zh.a4 a4Var = g4Var.h;
                    a4Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = a4Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            a4Var.M = null;
                        }
                        int i15 = a4Var.f48436s;
                        float f11 = (i15 / 2.0f) + ((-a4Var.getMeasuredWidth()) / 2.0f) + ((i15 + a4Var.f48434n) * i10);
                        if (f7 > 0.0f) {
                            int i16 = a4Var.f48436s;
                            f10 = (i16 / 2.0f) + ((-a4Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i16 + a4Var.f48434n));
                        } else {
                            int i17 = a4Var.f48436s;
                            f10 = (i17 / 2.0f) + ((-a4Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i17 + a4Var.f48434n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            a4Var.e = f11;
                        } else {
                            a4Var.e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        a4Var.L = false;
                        a4Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f24965a) {
            case 0:
                nd0 nd0Var = (nd0) this.f24966b;
                if (i10 == 0) {
                    nd0.a(nd0Var, nd0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = nd0Var.f25494c;
                if (eVar != null) {
                    eVar.c(i10);
                    return;
                }
                return;
            case 1:
                return;
            default:
                zh.g4 g4Var = (zh.g4) this.f24966b;
                if (i10 == 1) {
                    g4Var.f48447w = true;
                    return;
                }
                return;
        }
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(int i10) {
    }
}
