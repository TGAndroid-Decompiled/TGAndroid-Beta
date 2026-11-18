package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ki extends AnimatorListenerAdapter {
    public final int f49274a = 1;
    public final boolean f49275b;
    public int f49276c;
    public final Object d;
    public final org.telegram.messenger.fs f49277e;

    public ki(org.telegram.ui.Components.gt0 gt0Var, boolean z10, int i7, org.telegram.ui.Components.bs0 bs0Var) {
        this.f49277e = gt0Var;
        this.f49275b = z10;
        this.f49276c = i7;
        this.d = bs0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i7;
        v4.i0 adapter;
        switch (this.f49274a) {
            case 0:
                bn bnVar = (bn) this.f49277e;
                bnVar.f46020g6 = true;
                ((org.telegram.ui.ActionBar.h2) bnVar).fragmentBeginToShow = true;
                bnVar.f46177sa = null;
                if (this.f49275b) {
                    bnVar.Ha = false;
                }
                kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
                kVar.invalidate();
                bnVar.f46093m1.invalidate();
                org.telegram.messenger.g0.h3(new bh(this, 2), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i10 = this.f49276c;
                org.telegram.ui.Components.gt0 gt0Var = (org.telegram.ui.Components.gt0) this.f49277e;
                int[] iArr = gt0Var.f35615p1;
                org.telegram.ui.Components.bs0[] bs0VarArr = gt0Var.f35609n0;
                gt0Var.f35622r1 = false;
                boolean z10 = this.f49275b;
                if (z10) {
                    int i11 = gt0Var.f35629t1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.bz.B(i11);
                    } else if (gt0Var.m0(((org.telegram.ui.Components.bs0) this.d).F) >= 5) {
                        org.telegram.messenger.bz.F(gt0Var.f35629t1);
                    }
                }
                for (int i12 = 0; i12 < bs0VarArr.length; i12++) {
                    org.telegram.ui.Components.bs0 bs0Var = bs0VarArr[i12];
                    if (bs0Var != null && bs0Var.h != null && (((i7 = bs0Var.F) == 0 || org.telegram.ui.Components.gt0.z0(i7)) && (adapter = bs0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            gt0Var.f35636w1[0].g(false);
                        }
                        if (z10) {
                            bs0VarArr[i12].f33775x.y1(iArr[i10]);
                            bs0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.Z3(bs0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        bs0VarArr[i12].f33771n.setVisibility(8);
                    }
                }
                if (gt0Var.f35624s >= 0) {
                    for (int i13 = 0; i13 < bs0VarArr.length; i13++) {
                        org.telegram.ui.Components.bs0 bs0Var2 = bs0VarArr[i13];
                        if (bs0Var2.F == gt0Var.f35626s1) {
                            if (z10 && (m10 = bs0Var2.f33772r.m(gt0Var.f35624s)) != null) {
                                gt0Var.f35634w = m10.getTop();
                            }
                            org.telegram.ui.Components.bs0 bs0Var3 = bs0VarArr[i13];
                            bs0Var3.f33775x.h1(gt0Var.f35624s, (-bs0Var3.h.getPaddingTop()) + gt0Var.f35634w);
                        }
                    }
                } else {
                    gt0Var.j1();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i7;
        switch (this.f49274a) {
            case 0:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.h2) ((bn) this.f49277e)).currentAccount;
                this.f49276c = org.telegram.messenger.ks.f(i7).q(null, this.f49276c, true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ki(bn bnVar, boolean z10, Runnable runnable) {
        this.f49277e = bnVar;
        this.f49275b = z10;
        this.d = runnable;
    }
}
