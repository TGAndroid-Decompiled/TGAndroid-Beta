package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ki extends AnimatorListenerAdapter {
    public final int f49321a = 1;
    public final boolean f49322b;
    public int f49323c;
    public final Object d;
    public final org.telegram.messenger.fs f49324e;

    public ki(org.telegram.ui.Components.jt0 jt0Var, boolean z10, int i7, org.telegram.ui.Components.ds0 ds0Var) {
        this.f49324e = jt0Var;
        this.f49322b = z10;
        this.f49323c = i7;
        this.d = ds0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i7;
        v4.i0 adapter;
        switch (this.f49321a) {
            case 0:
                bn bnVar = (bn) this.f49324e;
                bnVar.f46034g6 = true;
                ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow = true;
                bnVar.f46191sa = null;
                if (this.f49322b) {
                    bnVar.Ha = false;
                }
                kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                kVar.invalidate();
                bnVar.f46107m1.invalidate();
                org.telegram.messenger.g0.h3(new bh(this, 2), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i10 = this.f49323c;
                org.telegram.ui.Components.jt0 jt0Var = (org.telegram.ui.Components.jt0) this.f49324e;
                int[] iArr = jt0Var.f36662p1;
                org.telegram.ui.Components.ds0[] ds0VarArr = jt0Var.f36656n0;
                jt0Var.f36669r1 = false;
                boolean z10 = this.f49322b;
                if (z10) {
                    int i11 = jt0Var.f36676t1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.bz.B(i11);
                    } else if (jt0Var.m0(((org.telegram.ui.Components.ds0) this.d).F) >= 5) {
                        org.telegram.messenger.bz.F(jt0Var.f36676t1);
                    }
                }
                for (int i12 = 0; i12 < ds0VarArr.length; i12++) {
                    org.telegram.ui.Components.ds0 ds0Var = ds0VarArr[i12];
                    if (ds0Var != null && ds0Var.h != null && (((i7 = ds0Var.F) == 0 || org.telegram.ui.Components.jt0.z0(i7)) && (adapter = ds0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            jt0Var.f36683w1[0].g(false);
                        }
                        if (z10) {
                            ds0VarArr[i12].f34570x.y1(iArr[i10]);
                            ds0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.Z3(ds0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        ds0VarArr[i12].f34566n.setVisibility(8);
                    }
                }
                if (jt0Var.f36671s >= 0) {
                    for (int i13 = 0; i13 < ds0VarArr.length; i13++) {
                        org.telegram.ui.Components.ds0 ds0Var2 = ds0VarArr[i13];
                        if (ds0Var2.F == jt0Var.f36673s1) {
                            if (z10 && (m10 = ds0Var2.f34567r.m(jt0Var.f36671s)) != null) {
                                jt0Var.f36681w = m10.getTop();
                            }
                            org.telegram.ui.Components.ds0 ds0Var3 = ds0VarArr[i13];
                            ds0Var3.f34570x.h1(jt0Var.f36671s, (-ds0Var3.h.getPaddingTop()) + jt0Var.f36681w);
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
        switch (this.f49321a) {
            case 0:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.g2) ((bn) this.f49324e)).currentAccount;
                this.f49323c = org.telegram.messenger.ks.f(i7).q(null, this.f49323c, true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ki(bn bnVar, boolean z10, Runnable runnable) {
        this.f49324e = bnVar;
        this.f49322b = z10;
        this.d = runnable;
    }
}
