package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class dj extends AnimatorListenerAdapter {
    public final int f36614a = 1;
    public final boolean f36615b;
    public int f36616c;
    public final Object d;
    public final org.telegram.messenger.vs e;

    public dj(org.telegram.ui.Components.au0 au0Var, boolean z10, int i10, org.telegram.ui.Components.ts0 ts0Var) {
        this.e = au0Var;
        this.f36615b = z10;
        this.f36616c = i10;
        this.d = ts0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        View m10;
        int i10;
        s4.g0 adapter;
        switch (this.f36614a) {
            case 0:
                un unVar = (un) this.e;
                unVar.f42049e6 = true;
                ((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow = true;
                unVar.f42175oa = null;
                if (this.f36615b) {
                    unVar.Da = false;
                }
                lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                lVar.invalidate();
                unVar.l1.invalidate();
                org.telegram.messenger.i0.h3(new rh(this, 2), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f36616c;
                org.telegram.ui.Components.au0 au0Var = (org.telegram.ui.Components.au0) this.e;
                int[] iArr = au0Var.f24542o1;
                org.telegram.ui.Components.ts0[] ts0VarArr = au0Var.m0;
                au0Var.f24548q1 = false;
                boolean z10 = this.f36615b;
                if (z10) {
                    int i12 = au0Var.f24556s1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        org.telegram.messenger.uz.B(i12);
                    } else if (au0Var.l0(((org.telegram.ui.Components.ts0) this.d).E) >= 5) {
                        org.telegram.messenger.uz.F(au0Var.f24556s1);
                    }
                }
                for (int i13 = 0; i13 < ts0VarArr.length; i13++) {
                    org.telegram.ui.Components.ts0 ts0Var = ts0VarArr[i13];
                    if (ts0Var != null && ts0Var.h != null && (((i10 = ts0Var.E) == 0 || org.telegram.ui.Components.au0.y0(i10)) && (adapter = ts0VarArr[i13].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i13 == 0) {
                            au0Var.f24562v1[0].g(false);
                        }
                        if (z10) {
                            ts0VarArr[i13].f30723x.y1(iArr[i11]);
                            ts0VarArr[i13].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.i0.a4(ts0VarArr[i13].h);
                            } else {
                                adapter.f();
                            }
                        }
                        ts0VarArr[i13].f30719n.setVisibility(8);
                    }
                }
                if (au0Var.f24554s >= 0) {
                    for (int i14 = 0; i14 < ts0VarArr.length; i14++) {
                        org.telegram.ui.Components.ts0 ts0Var2 = ts0VarArr[i14];
                        if (ts0Var2.E == au0Var.f24552r1) {
                            if (z10 && (m10 = ts0Var2.f30720r.m(au0Var.f24554s)) != null) {
                                au0Var.f24563w = m10.getTop();
                            }
                            org.telegram.ui.Components.ts0 ts0Var3 = ts0VarArr[i14];
                            ts0Var3.f30723x.h1(au0Var.f24554s, (-ts0Var3.h.getPaddingTop()) + au0Var.f24563w);
                        }
                    }
                } else {
                    au0Var.f1();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f36614a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.k2) ((un) this.e)).currentAccount;
                this.f36616c = org.telegram.messenger.at.f(i10).q(null, this.f36616c, true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public dj(un unVar, boolean z10, Runnable runnable) {
        this.e = unVar;
        this.f36615b = z10;
        this.d = runnable;
    }
}
