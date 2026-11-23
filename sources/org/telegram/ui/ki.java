package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ki extends AnimatorListenerAdapter {
    public final int f49325a = 1;
    public final boolean f49326b;
    public int f49327c;
    public final Object d;
    public final org.telegram.messenger.gs f49328e;

    public ki(org.telegram.ui.Components.jt0 jt0Var, boolean z10, int i7, org.telegram.ui.Components.ds0 ds0Var) {
        this.f49328e = jt0Var;
        this.f49326b = z10;
        this.f49327c = i7;
        this.d = ds0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i7;
        v4.i0 adapter;
        switch (this.f49325a) {
            case 0:
                bn bnVar = (bn) this.f49328e;
                bnVar.f46038g6 = true;
                ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow = true;
                bnVar.f46195sa = null;
                if (this.f49326b) {
                    bnVar.Ha = false;
                }
                kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                kVar.invalidate();
                bnVar.f46111m1.invalidate();
                org.telegram.messenger.g0.h3(new bh(this, 2), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i10 = this.f49327c;
                org.telegram.ui.Components.jt0 jt0Var = (org.telegram.ui.Components.jt0) this.f49328e;
                int[] iArr = jt0Var.f36656p1;
                org.telegram.ui.Components.ds0[] ds0VarArr = jt0Var.f36650n0;
                jt0Var.f36663r1 = false;
                boolean z10 = this.f49326b;
                if (z10) {
                    int i11 = jt0Var.f36670t1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.cz.B(i11);
                    } else if (jt0Var.m0(((org.telegram.ui.Components.ds0) this.d).F) >= 5) {
                        org.telegram.messenger.cz.F(jt0Var.f36670t1);
                    }
                }
                for (int i12 = 0; i12 < ds0VarArr.length; i12++) {
                    org.telegram.ui.Components.ds0 ds0Var = ds0VarArr[i12];
                    if (ds0Var != null && ds0Var.h != null && (((i7 = ds0Var.F) == 0 || org.telegram.ui.Components.jt0.z0(i7)) && (adapter = ds0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            jt0Var.f36677w1[0].g(false);
                        }
                        if (z10) {
                            ds0VarArr[i12].f34565x.y1(iArr[i10]);
                            ds0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.Z3(ds0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        ds0VarArr[i12].f34561n.setVisibility(8);
                    }
                }
                if (jt0Var.f36665s >= 0) {
                    for (int i13 = 0; i13 < ds0VarArr.length; i13++) {
                        org.telegram.ui.Components.ds0 ds0Var2 = ds0VarArr[i13];
                        if (ds0Var2.F == jt0Var.f36667s1) {
                            if (z10 && (m10 = ds0Var2.f34562r.m(jt0Var.f36665s)) != null) {
                                jt0Var.f36675w = m10.getTop();
                            }
                            org.telegram.ui.Components.ds0 ds0Var3 = ds0VarArr[i13];
                            ds0Var3.f34565x.h1(jt0Var.f36665s, (-ds0Var3.h.getPaddingTop()) + jt0Var.f36675w);
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
        switch (this.f49325a) {
            case 0:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.g2) ((bn) this.f49328e)).currentAccount;
                this.f49327c = org.telegram.messenger.ls.f(i7).q(null, this.f49327c, true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ki(bn bnVar, boolean z10, Runnable runnable) {
        this.f49328e = bnVar;
        this.f49326b = z10;
        this.d = runnable;
    }
}
