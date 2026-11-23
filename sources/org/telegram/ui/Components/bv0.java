package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class bv0 extends dk0 {
    public int f33829c;
    public final kv0 d;

    public bv0(kv0 kv0Var) {
        this.d = kv0Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59249f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int length;
        kv0 kv0Var = this.d;
        gv0[] gv0VarArr = kv0Var.f36899g3;
        if (gv0VarArr == null) {
            length = 0;
        } else {
            length = gv0VarArr.length;
        }
        int i7 = length + 1;
        if (i7 != this.f33829c) {
            bi.o3 o3Var = kv0Var.f36911t3;
            if (o3Var != null) {
                o3Var.requestLayout();
            }
            this.f33829c = i7;
        }
        return i7;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        kv0 kv0Var;
        gv0[] gv0VarArr;
        boolean z10 = true;
        if (f1Var.f59249f == 1 && (gv0VarArr = (kv0Var = this.d).f36899g3) != null) {
            int i10 = i7 - 1;
            gv0 gv0Var = gv0VarArr[i10];
            final fv0 fv0Var = (fv0) f1Var.f59245a;
            if (kv0Var.f36912u3 != i10) {
                z10 = false;
            }
            fv0Var.getClass();
            if (!TextUtils.isEmpty(gv0Var.d)) {
                fv0Var.setContentDescription(gv0Var.d);
            } else if (!TextUtils.isEmpty(gv0Var.f35560a)) {
                fv0Var.setContentDescription(gv0Var.f35560a);
            } else {
                fv0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = fv0Var.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                fv0Var.H = null;
            }
            fv0Var.setImageResource(0);
            fv0Var.a();
            final boolean D1 = fv0Var.I.D1();
            fv0Var.f35207x = false;
            fv0Var.E = 1.0f;
            o5.g(org.telegram.messenger.i10.f24637t0).b(gv0Var.f35562c, new l5() {
                @Override
                public final void a(TLRPC.Document document) {
                    fv0 fv0Var2 = fv0.this;
                    fv0Var2.setOnlyLastFrame(!D1);
                    fv0Var2.g(24, 24, document);
                    fv0Var2.d();
                }
            });
            org.telegram.messenger.g0.h3(new bp0(fv0Var, 10), 60L);
            fv0Var.l(z10, false);
            fv0Var.setAlpha(kv0Var.f36914w3);
            fv0Var.setScaleX(kv0Var.f36914w3);
            fv0Var.setScaleY(kv0Var.f36914w3);
            fv0Var.j();
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        fv0 fv0Var;
        kv0 kv0Var = this.d;
        if (i7 == 0) {
            bi.o3 o3Var = new bi.o3(28, kv0Var.getContext(), this);
            kv0Var.f36911t3 = o3Var;
            fv0Var = o3Var;
        } else {
            fv0Var = new fv0(kv0Var, kv0Var.getContext());
        }
        return new v4.f1(fv0Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        boolean z10 = true;
        if (f1Var.f59249f == 1) {
            fv0 fv0Var = (fv0) f1Var.f59245a;
            if (this.d.f36912u3 != f1Var.b() - 1) {
                z10 = false;
            }
            fv0Var.l(z10, false);
            fv0Var.j();
        }
    }
}
