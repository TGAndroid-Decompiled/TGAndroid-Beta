package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class hc0 implements z4.e {
    public final int f26753a;
    public final View f26754b;

    public hc0(int i10, View view) {
        this.f26753a = i10;
        this.f26754b = view;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        switch (this.f26753a) {
            case 0:
                jc0 jc0Var = (jc0) this.f26754b;
                z4.e eVar = jc0Var.f27372c;
                if (eVar != null) {
                    eVar.a(i10);
                }
                for (int i11 = 0; i11 < jc0Var.d.getChildCount(); i11++) {
                    View childAt = jc0Var.d.getChildAt(i11);
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
        switch (this.f26753a) {
            case 0:
                jc0 jc0Var = (jc0) this.f26754b;
                jc0Var.h = i10;
                jc0Var.f27374n = f7;
                if (jc0Var.d.getChildAt(i10) != null) {
                    jc0.a(jc0Var, i10, (int) (jc0Var.d.getChildAt(i10).getWidth() * f7));
                    jc0Var.invalidate();
                    z4.e eVar = jc0Var.f27372c;
                    if (eVar != null) {
                        eVar.b(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ng0 ng0Var = (ng0) this.f26754b;
                if (!ng0Var.f28816a && Math.abs(i10 - ng0Var.f28824x) == 1) {
                    int i12 = ng0Var.f28824x;
                    if (i10 > i12) {
                        ng0.a(ng0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        ng0.a(ng0Var, 1, 0, 0);
                        ng0.a(ng0Var, 2, 0, -1);
                    }
                }
                int i13 = ng0Var.f28824x;
                int i14 = ng0Var.f28825y;
                ng0Var.f28824x = i10;
                ng0Var.f28825y = i11;
                if (i13 != i10 || i14 != i11) {
                    ng0Var.H = true;
                    ng0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
            default:
                th.f4 f4Var = (th.f4) this.f26754b;
                if (f4Var.f48983x) {
                    th.z3 z3Var = f4Var.h;
                    z3Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = z3Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            z3Var.M = null;
                        }
                        int i15 = z3Var.f48971s;
                        float f11 = (i15 / 2.0f) + ((-z3Var.getMeasuredWidth()) / 2.0f) + ((i15 + z3Var.f48969n) * i10);
                        if (f7 > 0.0f) {
                            int i16 = z3Var.f48971s;
                            f10 = (i16 / 2.0f) + ((-z3Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i16 + z3Var.f48969n));
                        } else {
                            int i17 = z3Var.f48971s;
                            f10 = (i17 / 2.0f) + ((-z3Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i17 + z3Var.f48969n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            z3Var.e = f11;
                        } else {
                            z3Var.e = org.telegram.messenger.i0.T1(f11, f10, f7);
                        }
                        z3Var.L = false;
                        z3Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f26753a) {
            case 0:
                jc0 jc0Var = (jc0) this.f26754b;
                if (i10 == 0) {
                    jc0.a(jc0Var, jc0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = jc0Var.f27372c;
                if (eVar != null) {
                    eVar.c(i10);
                    return;
                }
                return;
            case 1:
                return;
            default:
                th.f4 f4Var = (th.f4) this.f26754b;
                if (i10 == 1) {
                    f4Var.f48983x = true;
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
