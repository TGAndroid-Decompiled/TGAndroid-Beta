package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class cj extends AnimatorListenerAdapter {
    public final int f35482a = 1;
    public final boolean f35483b;
    public int f35484c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f35485e;

    public cj(org.telegram.ui.Components.qv0 qv0Var, boolean z10, int i10, org.telegram.ui.Components.ju0 ju0Var) {
        this.f35485e = qv0Var;
        this.f35483b = z10;
        this.f35484c = i10;
        this.d = ju0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.f35482a) {
            case 0:
                yn ynVar = (yn) this.f35485e;
                ynVar.M5 = true;
                ((org.telegram.ui.ActionBar.n2) ynVar).fragmentBeginToShow = true;
                ynVar.T9 = null;
                if (this.f35483b) {
                    ynVar.f43374ia = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                kVar.invalidate();
                ynVar.V0.invalidate();
                AndroidUtilities.runOnUIThread(new bj(this, 0), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f35484c;
                org.telegram.ui.Components.qv0 qv0Var = (org.telegram.ui.Components.qv0) this.f35485e;
                int[] iArr = qv0Var.f30242m1;
                org.telegram.ui.Components.ju0[] ju0VarArr = qv0Var.f30239k0;
                qv0Var.f30247o1 = false;
                boolean z10 = this.f35483b;
                if (z10) {
                    int i12 = qv0Var.f30251q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (qv0Var.c0(((org.telegram.ui.Components.ju0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(qv0Var.f30251q1);
                    }
                }
                for (int i13 = 0; i13 < ju0VarArr.length; i13++) {
                    org.telegram.ui.Components.ju0 ju0Var = ju0VarArr[i13];
                    if (ju0Var != null && ju0Var.h != null && (((i10 = ju0Var.F) == 0 || org.telegram.ui.Components.qv0.p0(i10)) && (adapter = ju0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            qv0Var.f30259t1[0].g(false);
                        }
                        if (z10) {
                            ju0VarArr[i13].f27980x.y1(iArr[i11]);
                            ju0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(ju0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        ju0VarArr[i13].f27977r.setVisibility(8);
                    }
                }
                if (qv0Var.f30255s >= 0) {
                    for (int i14 = 0; i14 < ju0VarArr.length; i14++) {
                        org.telegram.ui.Components.ju0 ju0Var2 = ju0VarArr[i14];
                        if (ju0Var2.F == qv0Var.f30249p1) {
                            if (z10 && (m10 = ju0Var2.f27978s.m(qv0Var.f30255s)) != null) {
                                qv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.ju0 ju0Var3 = ju0VarArr[i14];
                            ju0Var3.f27980x.h1(qv0Var.f30255s, (-ju0Var3.h.getPaddingTop()) + qv0Var.v);
                        }
                    }
                } else {
                    qv0Var.X0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f35482a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((yn) this.f35485e)).currentAccount;
                this.f35484c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f35484c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public cj(yn ynVar, boolean z10, Runnable runnable) {
        this.f35485e = ynVar;
        this.f35483b = z10;
        this.d = runnable;
    }
}
