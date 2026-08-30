package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
public final class r20 extends AnimatorListenerAdapter {
    public final int f28366a;
    public final int f28367b;
    public final int f28368c;
    public final KeyEvent.Callback d;

    public r20(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f28366a = i12;
        this.d = callback;
        this.f28367b = i10;
        this.f28368c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        f2.o0 adapter;
        switch (this.f28366a) {
            case 0:
                s20 s20Var = (s20) this.d;
                s20Var.I = this.f28367b;
                s20Var.J = this.f28368c;
                s20Var.C.setColorFilter(new PorterDuffColorFilter(s20Var.I, PorterDuff.Mode.MULTIPLY));
                s20Var.B.setColor(s20Var.I);
                s20Var.f28609r.setColor(s20Var.J);
                s20Var.G.d(i0.a.k(s20Var.J, 38));
                return;
            case 1:
                yu0 yu0Var = (yu0) this.d;
                qt0[] qt0VarArr = yu0Var.f31120h0;
                yu0Var.F1.unlock();
                yu0Var.l1 = false;
                int[] iArr = yu0Var.f31125j1;
                int i11 = this.f28368c;
                int i12 = this.f28367b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < qt0VarArr.length; i13++) {
                    qt0 qt0Var = qt0VarArr[i13];
                    if (qt0Var != null && qt0Var.h != null && (((i10 = qt0Var.C) == 0 || yu0.p0(i10)) && (adapter = qt0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            yu0Var.f31138q1[0].g(false);
                        }
                        qt0VarArr[i13].f28245x.y1(iArr[i12]);
                        qt0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(qt0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        qt0VarArr[i13].f28242r.setVisibility(8);
                    }
                }
                yu0Var.X0();
                return;
            case 2:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                int i14 = this.f28367b;
                tVar.A0 = i14;
                tVar.B0 = i14;
                int i15 = this.f28368c;
                tVar.C0 = i15;
                tVar.Q.setColor(i15);
                if (tVar.P > 0.0f) {
                    tVar.invalidate();
                    return;
                }
                return;
            default:
                rh.q2 q2Var = (rh.q2) this.d;
                q2Var.O = i0.a.d(1.0f, this.f28367b, this.f28368c);
                q2Var.h();
                return;
        }
    }
}
