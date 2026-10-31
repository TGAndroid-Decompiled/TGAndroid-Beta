package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
public final class x10 extends AnimatorListenerAdapter {
    public final int f32297a;
    public final int f32298b;
    public final int f32299c;
    public final KeyEvent.Callback d;

    public x10(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f32297a = i12;
        this.d = callback;
        this.f32298b = i10;
        this.f32299c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.g0 adapter;
        switch (this.f32297a) {
            case 0:
                y10 y10Var = (y10) this.d;
                y10Var.L = this.f32298b;
                y10Var.M = this.f32299c;
                y10Var.F.setColorFilter(new PorterDuffColorFilter(y10Var.L, PorterDuff.Mode.MULTIPLY));
                y10Var.E.setColor(y10Var.L);
                y10Var.f32601r.setColor(y10Var.M);
                y10Var.J.d(i0.b.o(y10Var.M, 38));
                return;
            case 1:
                zt0 zt0Var = (zt0) this.d;
                ss0[] ss0VarArr = zt0Var.m0;
                zt0Var.L1.e();
                zt0Var.f33220q1 = false;
                int[] iArr = zt0Var.f33214o1;
                int i11 = this.f32299c;
                int i12 = this.f32298b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < ss0VarArr.length; i13++) {
                    ss0 ss0Var = ss0VarArr[i13];
                    if (ss0Var != null && ss0Var.h != null && (((i10 = ss0Var.E) == 0 || zt0.x0(i10)) && (adapter = ss0VarArr[i13].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i13 == 0) {
                            zt0Var.f33234v1[0].g(false);
                        }
                        ss0VarArr[i13].f30356x.y1(iArr[i12]);
                        ss0VarArr[i13].h.a0();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.i0.a4(ss0VarArr[i13].h);
                        } else {
                            adapter.f();
                        }
                        ss0VarArr[i13].f30352n.setVisibility(8);
                    }
                }
                zt0Var.e1();
                return;
            case 2:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.d;
                int i14 = this.f32298b;
                rVar.D0 = i14;
                rVar.E0 = i14;
                int i15 = this.f32299c;
                rVar.F0 = i15;
                rVar.T.setColor(i15);
                if (rVar.S > 0.0f) {
                    rVar.invalidate();
                    return;
                }
                return;
            default:
                xh.m2 m2Var = (xh.m2) this.d;
                m2Var.S = i0.b.f(1.0f, this.f32298b, this.f32299c);
                m2Var.l();
                return;
        }
    }
}
