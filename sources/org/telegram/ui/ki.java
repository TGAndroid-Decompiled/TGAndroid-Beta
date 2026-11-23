package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ki extends AnimatorListenerAdapter {
    public final int f49276a = 1;
    public final boolean f49277b;
    public int f49278c;
    public final Object d;
    public final org.telegram.messenger.gs f49279e;

    public ki(org.telegram.ui.Components.jt0 jt0Var, boolean z10, int i7, org.telegram.ui.Components.ds0 ds0Var) {
        this.f49279e = jt0Var;
        this.f49277b = z10;
        this.f49278c = i7;
        this.d = ds0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i7;
        v4.h0 adapter;
        switch (this.f49276a) {
            case 0:
                bn bnVar = (bn) this.f49279e;
                bnVar.f45991g6 = true;
                ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow = true;
                bnVar.f46148sa = null;
                if (this.f49277b) {
                    bnVar.Ha = false;
                }
                kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                kVar.invalidate();
                bnVar.f46064m1.invalidate();
                org.telegram.messenger.g0.h3(new bh(this, 2), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i10 = this.f49278c;
                org.telegram.ui.Components.jt0 jt0Var = (org.telegram.ui.Components.jt0) this.f49279e;
                int[] iArr = jt0Var.f36611p1;
                org.telegram.ui.Components.ds0[] ds0VarArr = jt0Var.f36605n0;
                jt0Var.f36618r1 = false;
                boolean z10 = this.f49277b;
                if (z10) {
                    int i11 = jt0Var.f36625t1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.cz.B(i11);
                    } else if (jt0Var.m0(((org.telegram.ui.Components.ds0) this.d).F) >= 5) {
                        org.telegram.messenger.cz.F(jt0Var.f36625t1);
                    }
                }
                for (int i12 = 0; i12 < ds0VarArr.length; i12++) {
                    org.telegram.ui.Components.ds0 ds0Var = ds0VarArr[i12];
                    if (ds0Var != null && ds0Var.h != null && (((i7 = ds0Var.F) == 0 || org.telegram.ui.Components.jt0.z0(i7)) && (adapter = ds0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            jt0Var.f36632w1[0].g(false);
                        }
                        if (z10) {
                            ds0VarArr[i12].f34544x.y1(iArr[i10]);
                            ds0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.Z3(ds0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        ds0VarArr[i12].f34540n.setVisibility(8);
                    }
                }
                if (jt0Var.f36620s >= 0) {
                    for (int i13 = 0; i13 < ds0VarArr.length; i13++) {
                        org.telegram.ui.Components.ds0 ds0Var2 = ds0VarArr[i13];
                        if (ds0Var2.F == jt0Var.f36622s1) {
                            if (z10 && (m10 = ds0Var2.f34541r.m(jt0Var.f36620s)) != null) {
                                jt0Var.f36630w = m10.getTop();
                            }
                            org.telegram.ui.Components.ds0 ds0Var3 = ds0VarArr[i13];
                            ds0Var3.f34544x.h1(jt0Var.f36620s, (-ds0Var3.h.getPaddingTop()) + jt0Var.f36630w);
                        }
                    }
                } else {
                    jt0Var.j1();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i7;
        switch (this.f49276a) {
            case 0:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.g2) ((bn) this.f49279e)).currentAccount;
                this.f49278c = org.telegram.messenger.ls.f(i7).q(null, this.f49278c, true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ki(bn bnVar, boolean z10, Runnable runnable) {
        this.f49279e = bnVar;
        this.f49277b = z10;
        this.d = runnable;
    }
}
