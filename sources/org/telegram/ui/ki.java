package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ki extends AnimatorListenerAdapter {
    public final int f49431a = 1;
    public final boolean f49432b;
    public int f49433c;
    public final Object d;
    public final org.telegram.messenger.fs f49434e;

    public ki(org.telegram.ui.Components.it0 it0Var, boolean z10, int i7, org.telegram.ui.Components.ds0 ds0Var) {
        this.f49434e = it0Var;
        this.f49432b = z10;
        this.f49433c = i7;
        this.d = ds0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i7;
        v4.i0 adapter;
        switch (this.f49431a) {
            case 0:
                bn bnVar = (bn) this.f49434e;
                bnVar.f46206g6 = true;
                ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow = true;
                bnVar.f46363sa = null;
                if (this.f49432b) {
                    bnVar.Ha = false;
                }
                kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                kVar.invalidate();
                bnVar.f46279m1.invalidate();
                org.telegram.messenger.g0.h3(new ch(this, 2), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i10 = this.f49433c;
                org.telegram.ui.Components.it0 it0Var = (org.telegram.ui.Components.it0) this.f49434e;
                int[] iArr = it0Var.f36139p1;
                org.telegram.ui.Components.ds0[] ds0VarArr = it0Var.f36133n0;
                it0Var.f36146r1 = false;
                boolean z10 = this.f49432b;
                if (z10) {
                    int i11 = it0Var.f36153t1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.bz.B(i11);
                    } else if (it0Var.m0(((org.telegram.ui.Components.ds0) this.d).F) >= 5) {
                        org.telegram.messenger.bz.F(it0Var.f36153t1);
                    }
                }
                for (int i12 = 0; i12 < ds0VarArr.length; i12++) {
                    org.telegram.ui.Components.ds0 ds0Var = ds0VarArr[i12];
                    if (ds0Var != null && ds0Var.h != null && (((i7 = ds0Var.F) == 0 || org.telegram.ui.Components.it0.z0(i7)) && (adapter = ds0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            it0Var.f36160w1[0].g(false);
                        }
                        if (z10) {
                            ds0VarArr[i12].f34450x.y1(iArr[i10]);
                            ds0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.Z3(ds0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        ds0VarArr[i12].f34446n.setVisibility(8);
                    }
                }
                if (it0Var.f36148s >= 0) {
                    for (int i13 = 0; i13 < ds0VarArr.length; i13++) {
                        org.telegram.ui.Components.ds0 ds0Var2 = ds0VarArr[i13];
                        if (ds0Var2.F == it0Var.f36150s1) {
                            if (z10 && (m10 = ds0Var2.f34447r.m(it0Var.f36148s)) != null) {
                                it0Var.f36158w = m10.getTop();
                            }
                            org.telegram.ui.Components.ds0 ds0Var3 = ds0VarArr[i13];
                            ds0Var3.f34450x.h1(it0Var.f36148s, (-ds0Var3.h.getPaddingTop()) + it0Var.f36158w);
                        }
                    }
                } else {
                    it0Var.j1();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i7;
        switch (this.f49431a) {
            case 0:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.g2) ((bn) this.f49434e)).currentAccount;
                this.f49433c = org.telegram.messenger.ks.f(i7).q(null, this.f49433c, true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ki(bn bnVar, boolean z10, Runnable runnable) {
        this.f49434e = bnVar;
        this.f49432b = z10;
        this.d = runnable;
    }
}
