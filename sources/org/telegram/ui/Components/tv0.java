package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class tv0 extends tk0 {
    public int f30726c;
    public final cw0 d;

    public tv0(cw0 cw0Var) {
        this.d = cw0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int length;
        cw0 cw0Var = this.d;
        yv0[] yv0VarArr = cw0Var.f25264f3;
        if (yv0VarArr == null) {
            length = 0;
        } else {
            length = yv0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f30726c) {
            bi.t0 t0Var = cw0Var.f25277s3;
            if (t0Var != null) {
                t0Var.requestLayout();
            }
            this.f30726c = i10;
        }
        return i10;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        cw0 cw0Var;
        yv0[] yv0VarArr;
        boolean z10 = true;
        if (c1Var.f47912f == 1 && (yv0VarArr = (cw0Var = this.d).f25264f3) != null) {
            int i11 = i10 - 1;
            yv0 yv0Var = yv0VarArr[i11];
            final xv0 xv0Var = (xv0) c1Var.f47909a;
            if (cw0Var.f25278t3 != i11) {
                z10 = false;
            }
            xv0Var.getClass();
            if (!TextUtils.isEmpty(yv0Var.d)) {
                xv0Var.setContentDescription(yv0Var.d);
            } else if (!TextUtils.isEmpty(yv0Var.f32916a)) {
                xv0Var.setContentDescription(yv0Var.f32916a);
            } else {
                xv0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = xv0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                xv0Var.G = null;
            }
            xv0Var.setImageResource(0);
            xv0Var.a();
            final boolean D1 = xv0Var.H.D1();
            xv0Var.f32643x = false;
            xv0Var.D = 1.0f;
            f5.g(org.telegram.messenger.e20.f15506s0).b(yv0Var.f32918c, new c5() {
                @Override
                public final void a(TLRPC.Document document) {
                    xv0 xv0Var2 = xv0.this;
                    xv0Var2.setOnlyLastFrame(!D1);
                    xv0Var2.g(24, 24, document);
                    xv0Var2.d();
                }
            });
            org.telegram.messenger.i0.h3(new vo0(xv0Var, 12), 60L);
            xv0Var.l(z10, false);
            xv0Var.setAlpha(cw0Var.f25280v3);
            xv0Var.setScaleX(cw0Var.f25280v3);
            xv0Var.setScaleY(cw0Var.f25280v3);
            xv0Var.j();
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        xv0 xv0Var;
        cw0 cw0Var = this.d;
        if (i10 == 0) {
            bi.t0 t0Var = new bi.t0(this, cw0Var.getContext(), 22);
            cw0Var.f25277s3 = t0Var;
            xv0Var = t0Var;
        } else {
            xv0Var = new xv0(cw0Var, cw0Var.getContext());
        }
        return new s4.c1(xv0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10 = true;
        if (c1Var.f47912f == 1) {
            xv0 xv0Var = (xv0) c1Var.f47909a;
            if (this.d.f25278t3 != c1Var.b() - 1) {
                z10 = false;
            }
            xv0Var.l(z10, false);
            xv0Var.j();
        }
    }
}
