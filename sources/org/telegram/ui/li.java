package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class li extends AnimatorListenerAdapter {
    public final int f47615a = 1;
    public final boolean f47616b;
    public int f47617c;
    public final Object d;
    public final org.telegram.messenger.ls f47618e;

    public li(org.telegram.ui.Components.ys0 ys0Var, boolean z9, int i7, org.telegram.ui.Components.tr0 tr0Var) {
        this.f47618e = ys0Var;
        this.f47616b = z9;
        this.f47617c = i7;
        this.d = tr0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        View m10;
        int i7;
        v4.g0 adapter;
        switch (this.f47615a) {
            case 0:
                cn cnVar = (cn) this.f47618e;
                cnVar.f44480e6 = true;
                ((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow = true;
                cnVar.f44635qa = null;
                if (this.f47616b) {
                    cnVar.Fa = false;
                }
                lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                lVar.invalidate();
                cnVar.l1.invalidate();
                org.telegram.messenger.g0.i3(new dh(this, 2), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i10 = this.f47617c;
                org.telegram.ui.Components.ys0 ys0Var = (org.telegram.ui.Components.ys0) this.f47618e;
                int[] iArr = ys0Var.f40693o1;
                org.telegram.ui.Components.tr0[] tr0VarArr = ys0Var.m0;
                ys0Var.f40699q1 = false;
                boolean z9 = this.f47616b;
                if (z9) {
                    int i11 = ys0Var.f40707s1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.iz.B(i11);
                    } else if (ys0Var.m0(((org.telegram.ui.Components.tr0) this.d).E) >= 5) {
                        org.telegram.messenger.iz.F(ys0Var.f40707s1);
                    }
                }
                for (int i12 = 0; i12 < tr0VarArr.length; i12++) {
                    org.telegram.ui.Components.tr0 tr0Var = tr0VarArr[i12];
                    if (tr0Var != null && tr0Var.h != null && (((i7 = tr0Var.E) == 0 || org.telegram.ui.Components.ys0.z0(i7)) && (adapter = tr0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            ys0Var.f40713v1[0].g(false);
                        }
                        if (z9) {
                            tr0VarArr[i12].f38390x.y1(iArr[i10]);
                            tr0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.b4(tr0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        tr0VarArr[i12].f38386n.setVisibility(8);
                    }
                }
                if (ys0Var.f40705s >= 0) {
                    for (int i13 = 0; i13 < tr0VarArr.length; i13++) {
                        org.telegram.ui.Components.tr0 tr0Var2 = tr0VarArr[i13];
                        if (tr0Var2.E == ys0Var.f40703r1) {
                            if (z9 && (m10 = tr0Var2.f38387r.m(ys0Var.f40705s)) != null) {
                                ys0Var.f40714w = m10.getTop();
                            }
                            org.telegram.ui.Components.tr0 tr0Var3 = tr0VarArr[i13];
                            tr0Var3.f38390x.h1(ys0Var.f40705s, (-tr0Var3.h.getPaddingTop()) + ys0Var.f40714w);
                        }
                    }
                } else {
                    ys0Var.j1();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i7;
        switch (this.f47615a) {
            case 0:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.f2) ((cn) this.f47618e)).currentAccount;
                this.f47617c = org.telegram.messenger.qs.f(i7).q(null, this.f47617c, true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public li(cn cnVar, boolean z9, Runnable runnable) {
        this.f47618e = cnVar;
        this.f47616b = z9;
        this.d = runnable;
    }
}
