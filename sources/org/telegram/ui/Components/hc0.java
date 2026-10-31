package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class hc0 implements z4.e {
    public final int f26695a;
    public final View f26696b;

    public hc0(int i10, View view) {
        this.f26695a = i10;
        this.f26696b = view;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        switch (this.f26695a) {
            case 0:
                jc0 jc0Var = (jc0) this.f26696b;
                z4.e eVar = jc0Var.f27317c;
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
        switch (this.f26695a) {
            case 0:
                jc0 jc0Var = (jc0) this.f26696b;
                jc0Var.h = i10;
                jc0Var.f27319n = f7;
                if (jc0Var.d.getChildAt(i10) != null) {
                    jc0.a(jc0Var, i10, (int) (jc0Var.d.getChildAt(i10).getWidth() * f7));
                    jc0Var.invalidate();
                    z4.e eVar = jc0Var.f27317c;
                    if (eVar != null) {
                        eVar.b(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                mg0 mg0Var = (mg0) this.f26696b;
                if (!mg0Var.f28436a && Math.abs(i10 - mg0Var.f28444x) == 1) {
                    int i12 = mg0Var.f28444x;
                    if (i10 > i12) {
                        mg0.a(mg0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        mg0.a(mg0Var, 1, 0, 0);
                        mg0.a(mg0Var, 2, 0, -1);
                    }
                }
                int i13 = mg0Var.f28444x;
                int i14 = mg0Var.f28445y;
                mg0Var.f28444x = i10;
                mg0Var.f28445y = i11;
                if (i13 != i10 || i14 != i11) {
                    mg0Var.H = true;
                    mg0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
            default:
                th.f4 f4Var = (th.f4) this.f26696b;
                if (f4Var.f48969x) {
                    th.z3 z3Var = f4Var.h;
                    z3Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = z3Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            z3Var.M = null;
                        }
                        int i15 = z3Var.f48957s;
                        float f11 = (i15 / 2.0f) + ((-z3Var.getMeasuredWidth()) / 2.0f) + ((i15 + z3Var.f48955n) * i10);
                        if (f7 > 0.0f) {
                            int i16 = z3Var.f48957s;
                            f10 = (i16 / 2.0f) + ((-z3Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i16 + z3Var.f48955n));
                        } else {
                            int i17 = z3Var.f48957s;
                            f10 = (i17 / 2.0f) + ((-z3Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i17 + z3Var.f48955n));
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
        switch (this.f26695a) {
            case 0:
                jc0 jc0Var = (jc0) this.f26696b;
                if (i10 == 0) {
                    jc0.a(jc0Var, jc0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = jc0Var.f27317c;
                if (eVar != null) {
                    eVar.c(i10);
                    return;
                }
                return;
            case 1:
                return;
            default:
                th.f4 f4Var = (th.f4) this.f26696b;
                if (i10 == 1) {
                    f4Var.f48969x = true;
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
