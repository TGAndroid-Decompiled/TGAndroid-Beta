package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ji extends AnimatorListenerAdapter {
    public final int f48360a = 1;
    public final boolean f48361b;
    public int f48362c;
    public final Object d;
    public final org.telegram.messenger.is f48363e;

    public ji(org.telegram.ui.Components.ys0 ys0Var, boolean z10, int i7, org.telegram.ui.Components.tr0 tr0Var) {
        this.f48363e = ys0Var;
        this.f48361b = z10;
        this.f48362c = i7;
        this.d = tr0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i7;
        v4.h0 adapter;
        switch (this.f48360a) {
            case 0:
                an anVar = (an) this.f48363e;
                anVar.f45194f6 = true;
                ((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow = true;
                anVar.f45350ra = null;
                if (this.f48361b) {
                    anVar.Ga = false;
                }
                kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                kVar.invalidate();
                anVar.f45278m1.invalidate();
                org.telegram.messenger.g0.i3(new bh(this, 2), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i10 = this.f48362c;
                org.telegram.ui.Components.ys0 ys0Var = (org.telegram.ui.Components.ys0) this.f48363e;
                int[] iArr = ys0Var.f42123p1;
                org.telegram.ui.Components.tr0[] tr0VarArr = ys0Var.f42117n0;
                ys0Var.f42130r1 = false;
                boolean z10 = this.f48361b;
                if (z10) {
                    int i11 = ys0Var.f42137t1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.gz.B(i11);
                    } else if (ys0Var.m0(((org.telegram.ui.Components.tr0) this.d).F) >= 5) {
                        org.telegram.messenger.gz.F(ys0Var.f42137t1);
                    }
                }
                for (int i12 = 0; i12 < tr0VarArr.length; i12++) {
                    org.telegram.ui.Components.tr0 tr0Var = tr0VarArr[i12];
                    if (tr0Var != null && tr0Var.h != null && (((i7 = tr0Var.F) == 0 || org.telegram.ui.Components.ys0.z0(i7)) && (adapter = tr0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            ys0Var.f42144w1[0].g(false);
                        }
                        if (z10) {
                            tr0VarArr[i12].f39799x.y1(iArr[i10]);
                            tr0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.a4(tr0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        tr0VarArr[i12].f39795n.setVisibility(8);
                    }
                }
                if (ys0Var.f42132s >= 0) {
                    for (int i13 = 0; i13 < tr0VarArr.length; i13++) {
                        org.telegram.ui.Components.tr0 tr0Var2 = tr0VarArr[i13];
                        if (tr0Var2.F == ys0Var.f42134s1) {
                            if (z10 && (m10 = tr0Var2.f39796r.m(ys0Var.f42132s)) != null) {
                                ys0Var.f42142w = m10.getTop();
                            }
                            org.telegram.ui.Components.tr0 tr0Var3 = tr0VarArr[i13];
                            tr0Var3.f39799x.h1(ys0Var.f42132s, (-tr0Var3.h.getPaddingTop()) + ys0Var.f42142w);
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
        switch (this.f48360a) {
            case 0:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.e2) ((an) this.f48363e)).currentAccount;
                this.f48362c = org.telegram.messenger.ns.f(i7).q(null, this.f48362c, true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ji(an anVar, boolean z10, Runnable runnable) {
        this.f48363e = anVar;
        this.f48361b = z10;
        this.d = runnable;
    }
}
