package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class fj extends AnimatorListenerAdapter {
    public final int f33699a = 1;
    public final boolean f33700b;
    public int f33701c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public fj(org.telegram.ui.Components.zu0 zu0Var, boolean z10, int i10, org.telegram.ui.Components.st0 st0Var) {
        this.e = zu0Var;
        this.f33700b = z10;
        this.f33701c = i10;
        this.d = st0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.f33699a) {
            case 0:
                bo boVar = (bo) this.e;
                boVar.O5 = true;
                ((org.telegram.ui.ActionBar.o2) boVar).fragmentBeginToShow = true;
                boVar.V9 = null;
                if (this.f33700b) {
                    boVar.f32349ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                kVar.invalidate();
                boVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new ej(this, 0), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f33701c;
                org.telegram.ui.Components.zu0 zu0Var = (org.telegram.ui.Components.zu0) this.e;
                int[] iArr = zu0Var.f30635m1;
                org.telegram.ui.Components.st0[] st0VarArr = zu0Var.f30632k0;
                zu0Var.f30640o1 = false;
                boolean z10 = this.f33700b;
                if (z10) {
                    int i12 = zu0Var.f30644q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (zu0Var.c0(((org.telegram.ui.Components.st0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(zu0Var.f30644q1);
                    }
                }
                for (int i13 = 0; i13 < st0VarArr.length; i13++) {
                    org.telegram.ui.Components.st0 st0Var = st0VarArr[i13];
                    if (st0Var != null && st0Var.h != null && (((i10 = st0Var.F) == 0 || org.telegram.ui.Components.zu0.p0(i10)) && (adapter = st0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            zu0Var.f30652t1[0].g(false);
                        }
                        if (z10) {
                            st0VarArr[i13].f27925x.y1(iArr[i11]);
                            st0VarArr[i13].h.b0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(st0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        st0VarArr[i13].f27922r.setVisibility(8);
                    }
                }
                if (zu0Var.f30648s >= 0) {
                    for (int i14 = 0; i14 < st0VarArr.length; i14++) {
                        org.telegram.ui.Components.st0 st0Var2 = st0VarArr[i14];
                        if (st0Var2.F == zu0Var.f30642p1) {
                            if (z10 && (m10 = st0Var2.f27923s.m(zu0Var.f30648s)) != null) {
                                zu0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.st0 st0Var3 = st0VarArr[i14];
                            st0Var3.f27925x.h1(zu0Var.f30648s, (-st0Var3.h.getPaddingTop()) + zu0Var.v);
                        }
                    }
                } else {
                    zu0Var.X0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f33699a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.o2) ((bo) this.e)).currentAccount;
                this.f33701c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f33701c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public fj(bo boVar, boolean z10, Runnable runnable) {
        this.e = boVar;
        this.f33700b = z10;
        this.d = runnable;
    }
}
