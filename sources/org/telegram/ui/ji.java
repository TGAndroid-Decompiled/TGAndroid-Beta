package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ji extends AnimatorListenerAdapter {
    public final int f46959a = 1;
    public final boolean f46960b;
    public int f46961c;
    public final Object d;
    public final org.telegram.messenger.ls f46962e;

    public ji(org.telegram.ui.Components.xs0 xs0Var, boolean z9, int i7, org.telegram.ui.Components.sr0 sr0Var) {
        this.f46962e = xs0Var;
        this.f46960b = z9;
        this.f46961c = i7;
        this.d = sr0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i7;
        v4.g0 adapter;
        switch (this.f46959a) {
            case 0:
                an anVar = (an) this.f46962e;
                anVar.f43754e6 = true;
                ((org.telegram.ui.ActionBar.f2) anVar).fragmentBeginToShow = true;
                anVar.f43881oa = null;
                if (this.f46960b) {
                    anVar.Da = false;
                }
                kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                kVar.invalidate();
                anVar.l1.invalidate();
                org.telegram.messenger.g0.i3(new bh(this, 2), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i10 = this.f46961c;
                org.telegram.ui.Components.xs0 xs0Var = (org.telegram.ui.Components.xs0) this.f46962e;
                int[] iArr = xs0Var.f40379o1;
                org.telegram.ui.Components.sr0[] sr0VarArr = xs0Var.m0;
                xs0Var.f40385q1 = false;
                boolean z9 = this.f46960b;
                if (z9) {
                    int i11 = xs0Var.f40393s1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.iz.B(i11);
                    } else if (xs0Var.m0(((org.telegram.ui.Components.sr0) this.d).E) >= 5) {
                        org.telegram.messenger.iz.F(xs0Var.f40393s1);
                    }
                }
                for (int i12 = 0; i12 < sr0VarArr.length; i12++) {
                    org.telegram.ui.Components.sr0 sr0Var = sr0VarArr[i12];
                    if (sr0Var != null && sr0Var.h != null && (((i7 = sr0Var.E) == 0 || org.telegram.ui.Components.xs0.z0(i7)) && (adapter = sr0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            xs0Var.f40399v1[0].g(false);
                        }
                        if (z9) {
                            sr0VarArr[i12].f38150x.y1(iArr[i10]);
                            sr0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.b4(sr0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        sr0VarArr[i12].f38146n.setVisibility(8);
                    }
                }
                if (xs0Var.f40391s >= 0) {
                    for (int i13 = 0; i13 < sr0VarArr.length; i13++) {
                        org.telegram.ui.Components.sr0 sr0Var2 = sr0VarArr[i13];
                        if (sr0Var2.E == xs0Var.f40389r1) {
                            if (z9 && (m10 = sr0Var2.f38147r.m(xs0Var.f40391s)) != null) {
                                xs0Var.f40400w = m10.getTop();
                            }
                            org.telegram.ui.Components.sr0 sr0Var3 = sr0VarArr[i13];
                            sr0Var3.f38150x.h1(xs0Var.f40391s, (-sr0Var3.h.getPaddingTop()) + xs0Var.f40400w);
                        }
                    }
                } else {
                    xs0Var.h1();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i7;
        switch (this.f46959a) {
            case 0:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.f2) ((an) this.f46962e)).currentAccount;
                this.f46961c = org.telegram.messenger.qs.f(i7).q(null, this.f46961c, true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ji(an anVar, boolean z9, Runnable runnable) {
        this.f46962e = anVar;
        this.f46960b = z9;
        this.d = runnable;
    }
}
