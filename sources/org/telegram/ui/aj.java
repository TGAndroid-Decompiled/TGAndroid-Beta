package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class aj extends AnimatorListenerAdapter {
    public final int f35197a = 1;
    public final boolean f35198b;
    public int f35199c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f35200e;

    public aj(org.telegram.ui.Components.yu0 yu0Var, boolean z4, int i10, org.telegram.ui.Components.qt0 qt0Var) {
        this.f35200e = yu0Var;
        this.f35198b = z4;
        this.f35199c = i10;
        this.d = qt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m9;
        int i10;
        f2.p0 adapter;
        switch (this.f35197a) {
            case 0:
                xn xnVar = (xn) this.f35200e;
                xnVar.L5 = true;
                ((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow = true;
                xnVar.S9 = null;
                if (this.f35198b) {
                    xnVar.f43191ha = false;
                }
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                kVar.invalidate();
                xnVar.U0.invalidate();
                AndroidUtilities.runOnUIThread(new zi(this, 0), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f35199c;
                org.telegram.ui.Components.yu0 yu0Var = (org.telegram.ui.Components.yu0) this.f35200e;
                int[] iArr = yu0Var.f33630j1;
                org.telegram.ui.Components.qt0[] qt0VarArr = yu0Var.f33625h0;
                yu0Var.l1 = false;
                boolean z4 = this.f35198b;
                if (z4) {
                    int i12 = yu0Var.f33637n1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (yu0Var.c0(((org.telegram.ui.Components.qt0) this.d).C) >= 5) {
                        SharedConfig.setStoriesColumnsCount(yu0Var.f33637n1);
                    }
                }
                for (int i13 = 0; i13 < qt0VarArr.length; i13++) {
                    org.telegram.ui.Components.qt0 qt0Var = qt0VarArr[i13];
                    if (qt0Var != null && qt0Var.h != null && (((i10 = qt0Var.C) == 0 || org.telegram.ui.Components.yu0.p0(i10)) && (adapter = qt0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            yu0Var.f33643q1[0].g(false);
                        }
                        if (z4) {
                            qt0VarArr[i13].f30525x.y1(iArr[i11]);
                            qt0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(qt0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        qt0VarArr[i13].f30522r.setVisibility(8);
                    }
                }
                if (yu0Var.f33647s >= 0) {
                    for (int i14 = 0; i14 < qt0VarArr.length; i14++) {
                        org.telegram.ui.Components.qt0 qt0Var2 = qt0VarArr[i14];
                        if (qt0Var2.C == yu0Var.f33634m1) {
                            if (z4 && (m9 = qt0Var2.f30523s.m(yu0Var.f33647s)) != null) {
                                yu0Var.v = m9.getTop();
                            }
                            org.telegram.ui.Components.qt0 qt0Var3 = qt0VarArr[i14];
                            qt0Var3.f30525x.h1(yu0Var.f33647s, (-qt0Var3.h.getPaddingTop()) + yu0Var.v);
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
        switch (this.f35197a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.p2) ((xn) this.f35200e)).currentAccount;
                this.f35199c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f35199c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public aj(xn xnVar, boolean z4, Runnable runnable) {
        this.f35200e = xnVar;
        this.f35198b = z4;
        this.d = runnable;
    }
}
