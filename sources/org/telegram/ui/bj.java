package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class bj extends AnimatorListenerAdapter {
    public final int f32127a = 1;
    public final boolean f32128b;
    public int f32129c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public bj(org.telegram.ui.Components.yu0 yu0Var, boolean z10, int i10, org.telegram.ui.Components.rt0 rt0Var) {
        this.e = yu0Var;
        this.f32128b = z10;
        this.f32129c = i10;
        this.d = rt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.f32127a) {
            case 0:
                xn xnVar = (xn) this.e;
                xnVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) xnVar).fragmentBeginToShow = true;
                xnVar.V9 = null;
                if (this.f32128b) {
                    xnVar.f39443ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                kVar.invalidate();
                xnVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new aj(this, 0), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f32129c;
                org.telegram.ui.Components.yu0 yu0Var = (org.telegram.ui.Components.yu0) this.e;
                int[] iArr = yu0Var.f30429m1;
                org.telegram.ui.Components.rt0[] rt0VarArr = yu0Var.f30426k0;
                yu0Var.f30434o1 = false;
                boolean z10 = this.f32128b;
                if (z10) {
                    int i12 = yu0Var.f30438q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (yu0Var.c0(((org.telegram.ui.Components.rt0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(yu0Var.f30438q1);
                    }
                }
                for (int i13 = 0; i13 < rt0VarArr.length; i13++) {
                    org.telegram.ui.Components.rt0 rt0Var = rt0VarArr[i13];
                    if (rt0Var != null && rt0Var.h != null && (((i10 = rt0Var.F) == 0 || org.telegram.ui.Components.yu0.p0(i10)) && (adapter = rt0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            yu0Var.f30446t1[0].g(false);
                        }
                        if (z10) {
                            rt0VarArr[i13].f27731x.y1(iArr[i11]);
                            rt0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(rt0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        rt0VarArr[i13].f27728r.setVisibility(8);
                    }
                }
                if (yu0Var.f30442s >= 0) {
                    for (int i14 = 0; i14 < rt0VarArr.length; i14++) {
                        org.telegram.ui.Components.rt0 rt0Var2 = rt0VarArr[i14];
                        if (rt0Var2.F == yu0Var.f30436p1) {
                            if (z10 && (m10 = rt0Var2.f27729s.m(yu0Var.f30442s)) != null) {
                                yu0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.rt0 rt0Var3 = rt0VarArr[i14];
                            rt0Var3.f27731x.h1(yu0Var.f30442s, (-rt0Var3.h.getPaddingTop()) + yu0Var.v);
                        }
                    }
                } else {
                    yu0Var.X0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f32127a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((xn) this.e)).currentAccount;
                this.f32129c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f32129c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public bj(xn xnVar, boolean z10, Runnable runnable) {
        this.e = xnVar;
        this.f32128b = z10;
        this.d = runnable;
    }
}
