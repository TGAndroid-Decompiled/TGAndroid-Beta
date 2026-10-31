package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class sv0 extends sk0 {
    public int f30363c;
    public final bw0 d;

    public sv0(bw0 bw0Var) {
        this.d = bw0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int length;
        bw0 bw0Var = this.d;
        xv0[] xv0VarArr = bw0Var.f24889f3;
        if (xv0VarArr == null) {
            length = 0;
        } else {
            length = xv0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f30363c) {
            bi.t0 t0Var = bw0Var.f24902s3;
            if (t0Var != null) {
                t0Var.requestLayout();
            }
            this.f30363c = i10;
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
        bw0 bw0Var;
        xv0[] xv0VarArr;
        boolean z10 = true;
        if (c1Var.f47901f == 1 && (xv0VarArr = (bw0Var = this.d).f24889f3) != null) {
            int i11 = i10 - 1;
            xv0 xv0Var = xv0VarArr[i11];
            final wv0 wv0Var = (wv0) c1Var.f47898a;
            if (bw0Var.f24903t3 != i11) {
                z10 = false;
            }
            wv0Var.getClass();
            if (!TextUtils.isEmpty(xv0Var.d)) {
                wv0Var.setContentDescription(xv0Var.d);
            } else if (!TextUtils.isEmpty(xv0Var.f32548a)) {
                wv0Var.setContentDescription(xv0Var.f32548a);
            } else {
                wv0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = wv0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                wv0Var.G = null;
            }
            wv0Var.setImageResource(0);
            wv0Var.a();
            final boolean D1 = wv0Var.H.D1();
            wv0Var.f32263x = false;
            wv0Var.D = 1.0f;
            f5.g(org.telegram.messenger.d20.f15147s0).b(xv0Var.f32550c, new c5() {
                @Override
                public final void a(TLRPC.Document document) {
                    wv0 wv0Var2 = wv0.this;
                    wv0Var2.setOnlyLastFrame(!D1);
                    wv0Var2.g(24, 24, document);
                    wv0Var2.d();
                }
            });
            org.telegram.messenger.i0.h3(new uo0(wv0Var, 12), 60L);
            wv0Var.l(z10, false);
            wv0Var.setAlpha(bw0Var.f24905v3);
            wv0Var.setScaleX(bw0Var.f24905v3);
            wv0Var.setScaleY(bw0Var.f24905v3);
            wv0Var.j();
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        wv0 wv0Var;
        bw0 bw0Var = this.d;
        if (i10 == 0) {
            bi.t0 t0Var = new bi.t0(this, bw0Var.getContext(), 22);
            bw0Var.f24902s3 = t0Var;
            wv0Var = t0Var;
        } else {
            wv0Var = new wv0(bw0Var, bw0Var.getContext());
        }
        return new s4.c1(wv0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10 = true;
        if (c1Var.f47901f == 1) {
            wv0 wv0Var = (wv0) c1Var.f47898a;
            if (this.d.f24903t3 != c1Var.b() - 1) {
                z10 = false;
            }
            wv0Var.l(z10, false);
            wv0Var.j();
        }
    }
}
