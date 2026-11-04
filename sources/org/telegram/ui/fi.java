package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class fi extends AnimatorListenerAdapter {
    public final int f45284a = 1;
    public final boolean f45285b;
    public int f45286c;
    public final Object d;
    public final org.telegram.messenger.cs f45287e;

    public fi(org.telegram.ui.Components.ws0 ws0Var, boolean z10, int i3, org.telegram.ui.Components.rr0 rr0Var) {
        this.f45287e = ws0Var;
        this.f45285b = z10;
        this.f45286c = i3;
        this.d = rr0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i3;
        u4.h0 adapter;
        switch (this.f45284a) {
            case 0:
                wm wmVar = (wm) this.f45287e;
                wmVar.f51313f6 = true;
                ((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow = true;
                wmVar.f51442pa = null;
                if (this.f45285b) {
                    wmVar.Ea = false;
                }
                kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                kVar.invalidate();
                wmVar.m1.invalidate();
                org.telegram.messenger.g0.i3(new xg(this, 2), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i10 = this.f45286c;
                org.telegram.ui.Components.ws0 ws0Var = (org.telegram.ui.Components.ws0) this.f45287e;
                int[] iArr = ws0Var.f40115p1;
                org.telegram.ui.Components.rr0[] rr0VarArr = ws0Var.f40108n0;
                ws0Var.f40122r1 = false;
                boolean z10 = this.f45285b;
                if (z10) {
                    int i11 = ws0Var.f40129t1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.az.B(i11);
                    } else if (ws0Var.m0(((org.telegram.ui.Components.rr0) this.d).F) >= 5) {
                        org.telegram.messenger.az.F(ws0Var.f40129t1);
                    }
                }
                for (int i12 = 0; i12 < rr0VarArr.length; i12++) {
                    org.telegram.ui.Components.rr0 rr0Var = rr0VarArr[i12];
                    if (rr0Var != null && rr0Var.h != null && (((i3 = rr0Var.F) == 0 || org.telegram.ui.Components.ws0.z0(i3)) && (adapter = rr0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            ws0Var.f40136w1[0].g(false);
                        }
                        if (z10) {
                            rr0VarArr[i12].f37791x.y1(iArr[i10]);
                            rr0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.b4(rr0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        rr0VarArr[i12].f37787n.setVisibility(8);
                    }
                }
                if (ws0Var.f40124s >= 0) {
                    for (int i13 = 0; i13 < rr0VarArr.length; i13++) {
                        org.telegram.ui.Components.rr0 rr0Var2 = rr0VarArr[i13];
                        if (rr0Var2.F == ws0Var.f40126s1) {
                            if (z10 && (m10 = rr0Var2.f37788r.m(ws0Var.f40124s)) != null) {
                                ws0Var.f40134w = m10.getTop();
                            }
                            org.telegram.ui.Components.rr0 rr0Var3 = rr0VarArr[i13];
                            rr0Var3.f37791x.h1(ws0Var.f40124s, (-rr0Var3.h.getPaddingTop()) + ws0Var.f40134w);
                        }
                    }
                } else {
                    ws0Var.h1();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i3;
        switch (this.f45284a) {
            case 0:
                super.onAnimationStart(animator);
                i3 = ((org.telegram.ui.ActionBar.d2) ((wm) this.f45287e)).currentAccount;
                this.f45286c = org.telegram.messenger.hs.f(i3).q(null, this.f45286c, true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public fi(wm wmVar, boolean z10, Runnable runnable) {
        this.f45287e = wmVar;
        this.f45285b = z10;
        this.d = runnable;
    }
}
