package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ji extends AnimatorListenerAdapter {
    public final int f46982a = 1;
    public final boolean f46983b;
    public int f46984c;
    public final Object d;
    public final org.telegram.messenger.ls f46985e;

    public ji(org.telegram.ui.Components.xs0 xs0Var, boolean z9, int i7, org.telegram.ui.Components.sr0 sr0Var) {
        this.f46985e = xs0Var;
        this.f46983b = z9;
        this.f46984c = i7;
        this.d = sr0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i7;
        v4.g0 adapter;
        switch (this.f46982a) {
            case 0:
                an anVar = (an) this.f46985e;
                anVar.f43778e6 = true;
                ((org.telegram.ui.ActionBar.f2) anVar).fragmentBeginToShow = true;
                anVar.f43905oa = null;
                if (this.f46983b) {
                    anVar.Da = false;
                }
                kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                kVar.invalidate();
                anVar.l1.invalidate();
                org.telegram.messenger.g0.i3(new bh(this, 2), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i10 = this.f46984c;
                org.telegram.ui.Components.xs0 xs0Var = (org.telegram.ui.Components.xs0) this.f46985e;
                int[] iArr = xs0Var.f40414o1;
                org.telegram.ui.Components.sr0[] sr0VarArr = xs0Var.m0;
                xs0Var.f40420q1 = false;
                boolean z9 = this.f46983b;
                if (z9) {
                    int i11 = xs0Var.f40428s1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.iz.B(i11);
                    } else if (xs0Var.m0(((org.telegram.ui.Components.sr0) this.d).E) >= 5) {
                        org.telegram.messenger.iz.F(xs0Var.f40428s1);
                    }
                }
                for (int i12 = 0; i12 < sr0VarArr.length; i12++) {
                    org.telegram.ui.Components.sr0 sr0Var = sr0VarArr[i12];
                    if (sr0Var != null && sr0Var.h != null && (((i7 = sr0Var.E) == 0 || org.telegram.ui.Components.xs0.z0(i7)) && (adapter = sr0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            xs0Var.f40434v1[0].g(false);
                        }
                        if (z9) {
                            sr0VarArr[i12].f38114x.y1(iArr[i10]);
                            sr0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.b4(sr0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        sr0VarArr[i12].f38110n.setVisibility(8);
                    }
                }
                if (xs0Var.f40426s >= 0) {
                    for (int i13 = 0; i13 < sr0VarArr.length; i13++) {
                        org.telegram.ui.Components.sr0 sr0Var2 = sr0VarArr[i13];
                        if (sr0Var2.E == xs0Var.f40424r1) {
                            if (z9 && (m10 = sr0Var2.f38111r.m(xs0Var.f40426s)) != null) {
                                xs0Var.f40435w = m10.getTop();
                            }
                            org.telegram.ui.Components.sr0 sr0Var3 = sr0VarArr[i13];
                            sr0Var3.f38114x.h1(xs0Var.f40426s, (-sr0Var3.h.getPaddingTop()) + xs0Var.f40435w);
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
        switch (this.f46982a) {
            case 0:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.f2) ((an) this.f46985e)).currentAccount;
                this.f46984c = org.telegram.messenger.qs.f(i7).q(null, this.f46984c, true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ji(an anVar, boolean z9, Runnable runnable) {
        this.f46985e = anVar;
        this.f46983b = z9;
        this.d = runnable;
    }
}
