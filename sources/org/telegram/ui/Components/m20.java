package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
public final class m20 extends AnimatorListenerAdapter {
    public final int f30546a;
    public final int f30547b;
    public final int f30548c;
    public final KeyEvent.Callback d;

    public m20(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f30546a = i12;
        this.d = callback;
        this.f30547b = i10;
        this.f30548c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        f2.p0 adapter;
        switch (this.f30546a) {
            case 0:
                n20 n20Var = (n20) this.d;
                n20Var.H = this.f30547b;
                n20Var.I = this.f30548c;
                n20Var.B.setColorFilter(new PorterDuffColorFilter(n20Var.H, PorterDuff.Mode.MULTIPLY));
                n20Var.A.setColor(n20Var.H);
                n20Var.f30832r.setColor(n20Var.I);
                n20Var.F.d(i0.a.k(n20Var.I, 38));
                return;
            case 1:
                qu0 qu0Var = (qu0) this.d;
                it0[] it0VarArr = qu0Var.f32070g0;
                qu0Var.E1.unlock();
                qu0Var.f32079k1 = false;
                int[] iArr = qu0Var.f32075i1;
                int i11 = this.f30548c;
                int i12 = this.f30547b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < it0VarArr.length; i13++) {
                    it0 it0Var = it0VarArr[i13];
                    if (it0Var != null && it0Var.h != null && (((i10 = it0Var.B) == 0 || qu0.p0(i10)) && (adapter = it0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            qu0Var.f32088p1[0].g(false);
                        }
                        it0VarArr[i13].f29472x.y1(iArr[i12]);
                        it0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(it0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        it0VarArr[i13].f29469r.setVisibility(8);
                    }
                }
                qu0Var.X0();
                return;
            case 2:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.d;
                int i14 = this.f30547b;
                uVar.f34049z0 = i14;
                uVar.A0 = i14;
                int i15 = this.f30548c;
                uVar.B0 = i15;
                uVar.P.setColor(i15);
                if (uVar.O > 0.0f) {
                    uVar.invalidate();
                    return;
                }
                return;
            default:
                ph.p2 p2Var = (ph.p2) this.d;
                p2Var.N = i0.a.d(1.0f, this.f30547b, this.f30548c);
                p2Var.h();
                return;
        }
    }
}
