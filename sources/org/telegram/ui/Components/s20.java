package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
public final class s20 extends AnimatorListenerAdapter {
    public final int f28652a;
    public final int f28653b;
    public final int f28654c;
    public final KeyEvent.Callback d;

    public s20(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f28652a = i12;
        this.d = callback;
        this.f28653b = i10;
        this.f28654c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        f2.o0 adapter;
        switch (this.f28652a) {
            case 0:
                t20 t20Var = (t20) this.d;
                t20Var.I = this.f28653b;
                t20Var.J = this.f28654c;
                t20Var.C.setColorFilter(new PorterDuffColorFilter(t20Var.I, PorterDuff.Mode.MULTIPLY));
                t20Var.B.setColor(t20Var.I);
                t20Var.f28877r.setColor(t20Var.J);
                t20Var.G.d(i0.a.k(t20Var.J, 38));
                return;
            case 1:
                yu0 yu0Var = (yu0) this.d;
                qt0[] qt0VarArr = yu0Var.f31131h0;
                yu0Var.F1.unlock();
                yu0Var.l1 = false;
                int[] iArr = yu0Var.f31136j1;
                int i11 = this.f28654c;
                int i12 = this.f28653b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < qt0VarArr.length; i13++) {
                    qt0 qt0Var = qt0VarArr[i13];
                    if (qt0Var != null && qt0Var.h != null && (((i10 = qt0Var.C) == 0 || yu0.p0(i10)) && (adapter = qt0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            yu0Var.f31149q1[0].g(false);
                        }
                        qt0VarArr[i13].f28264x.y1(iArr[i12]);
                        qt0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(qt0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        qt0VarArr[i13].f28261r.setVisibility(8);
                    }
                }
                yu0Var.X0();
                return;
            case 2:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                int i14 = this.f28653b;
                tVar.A0 = i14;
                tVar.B0 = i14;
                int i15 = this.f28654c;
                tVar.C0 = i15;
                tVar.Q.setColor(i15);
                if (tVar.P > 0.0f) {
                    tVar.invalidate();
                    return;
                }
                return;
            default:
                rh.p2 p2Var = (rh.p2) this.d;
                p2Var.O = i0.a.d(1.0f, this.f28653b, this.f28654c);
                p2Var.h();
                return;
        }
    }
}
