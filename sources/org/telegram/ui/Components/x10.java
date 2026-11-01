package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
public final class x10 extends AnimatorListenerAdapter {
    public final int f32356a;
    public final int f32357b;
    public final int f32358c;
    public final KeyEvent.Callback d;

    public x10(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f32356a = i12;
        this.d = callback;
        this.f32357b = i10;
        this.f32358c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.g0 adapter;
        switch (this.f32356a) {
            case 0:
                y10 y10Var = (y10) this.d;
                y10Var.L = this.f32357b;
                y10Var.M = this.f32358c;
                y10Var.F.setColorFilter(new PorterDuffColorFilter(y10Var.L, PorterDuff.Mode.MULTIPLY));
                y10Var.E.setColor(y10Var.L);
                y10Var.f32692r.setColor(y10Var.M);
                y10Var.J.d(i0.b.o(y10Var.M, 38));
                return;
            case 1:
                au0 au0Var = (au0) this.d;
                ts0[] ts0VarArr = au0Var.m0;
                au0Var.L1.e();
                au0Var.f24548q1 = false;
                int[] iArr = au0Var.f24542o1;
                int i11 = this.f32358c;
                int i12 = this.f32357b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < ts0VarArr.length; i13++) {
                    ts0 ts0Var = ts0VarArr[i13];
                    if (ts0Var != null && ts0Var.h != null && (((i10 = ts0Var.E) == 0 || au0.y0(i10)) && (adapter = ts0VarArr[i13].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i13 == 0) {
                            au0Var.f24562v1[0].g(false);
                        }
                        ts0VarArr[i13].f30723x.y1(iArr[i12]);
                        ts0VarArr[i13].h.a0();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.i0.a4(ts0VarArr[i13].h);
                        } else {
                            adapter.f();
                        }
                        ts0VarArr[i13].f30719n.setVisibility(8);
                    }
                }
                au0Var.f1();
                return;
            case 2:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.d;
                int i14 = this.f32357b;
                rVar.D0 = i14;
                rVar.E0 = i14;
                int i15 = this.f32358c;
                rVar.F0 = i15;
                rVar.T.setColor(i15);
                if (rVar.S > 0.0f) {
                    rVar.invalidate();
                    return;
                }
                return;
            default:
                xh.m2 m2Var = (xh.m2) this.d;
                m2Var.S = i0.b.f(1.0f, this.f32357b, this.f32358c);
                m2Var.l();
                return;
        }
    }
}
