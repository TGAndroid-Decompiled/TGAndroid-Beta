package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class li extends AnimatorListenerAdapter {
    public final int f47623a = 1;
    public final boolean f47624b;
    public int f47625c;
    public final Object d;
    public final org.telegram.messenger.ls f47626e;

    public li(org.telegram.ui.Components.zs0 zs0Var, boolean z9, int i7, org.telegram.ui.Components.ur0 ur0Var) {
        this.f47626e = zs0Var;
        this.f47624b = z9;
        this.f47625c = i7;
        this.d = ur0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i7;
        v4.g0 adapter;
        switch (this.f47623a) {
            case 0:
                cn cnVar = (cn) this.f47626e;
                cnVar.f44439e6 = true;
                ((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow = true;
                cnVar.f44594qa = null;
                if (this.f47624b) {
                    cnVar.Fa = false;
                }
                kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                kVar.invalidate();
                cnVar.l1.invalidate();
                org.telegram.messenger.g0.i3(new dh(this, 2), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i10 = this.f47625c;
                org.telegram.ui.Components.zs0 zs0Var = (org.telegram.ui.Components.zs0) this.f47626e;
                int[] iArr = zs0Var.f41101o1;
                org.telegram.ui.Components.ur0[] ur0VarArr = zs0Var.m0;
                zs0Var.f41107q1 = false;
                boolean z9 = this.f47624b;
                if (z9) {
                    int i11 = zs0Var.f41115s1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.iz.B(i11);
                    } else if (zs0Var.m0(((org.telegram.ui.Components.ur0) this.d).E) >= 5) {
                        org.telegram.messenger.iz.F(zs0Var.f41115s1);
                    }
                }
                for (int i12 = 0; i12 < ur0VarArr.length; i12++) {
                    org.telegram.ui.Components.ur0 ur0Var = ur0VarArr[i12];
                    if (ur0Var != null && ur0Var.h != null && (((i7 = ur0Var.E) == 0 || org.telegram.ui.Components.zs0.z0(i7)) && (adapter = ur0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            zs0Var.f41121v1[0].g(false);
                        }
                        if (z9) {
                            ur0VarArr[i12].f38796x.y1(iArr[i10]);
                            ur0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.b4(ur0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        ur0VarArr[i12].f38792n.setVisibility(8);
                    }
                }
                if (zs0Var.f41113s >= 0) {
                    for (int i13 = 0; i13 < ur0VarArr.length; i13++) {
                        org.telegram.ui.Components.ur0 ur0Var2 = ur0VarArr[i13];
                        if (ur0Var2.E == zs0Var.f41111r1) {
                            if (z9 && (m10 = ur0Var2.f38793r.m(zs0Var.f41113s)) != null) {
                                zs0Var.f41122w = m10.getTop();
                            }
                            org.telegram.ui.Components.ur0 ur0Var3 = ur0VarArr[i13];
                            ur0Var3.f38796x.h1(zs0Var.f41113s, (-ur0Var3.h.getPaddingTop()) + zs0Var.f41122w);
                        }
                    }
                } else {
                    zs0Var.j1();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i7;
        switch (this.f47623a) {
            case 0:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.f2) ((cn) this.f47626e)).currentAccount;
                this.f47625c = org.telegram.messenger.qs.f(i7).q(null, this.f47625c, true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public li(cn cnVar, boolean z9, Runnable runnable) {
        this.f47626e = cnVar;
        this.f47624b = z9;
        this.d = runnable;
    }
}
