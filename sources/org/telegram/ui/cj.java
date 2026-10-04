package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class cj extends AnimatorListenerAdapter {
    public final int f35491a = 1;
    public final boolean f35492b;
    public int f35493c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f35494e;

    public cj(org.telegram.ui.Components.pv0 pv0Var, boolean z10, int i10, org.telegram.ui.Components.iu0 iu0Var) {
        this.f35494e = pv0Var;
        this.f35492b = z10;
        this.f35493c = i10;
        this.d = iu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.f35491a) {
            case 0:
                yn ynVar = (yn) this.f35494e;
                ynVar.M5 = true;
                ((org.telegram.ui.ActionBar.n2) ynVar).fragmentBeginToShow = true;
                ynVar.T9 = null;
                if (this.f35492b) {
                    ynVar.f43381ia = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                kVar.invalidate();
                ynVar.V0.invalidate();
                AndroidUtilities.runOnUIThread(new bj(this, 0), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f35493c;
                org.telegram.ui.Components.pv0 pv0Var = (org.telegram.ui.Components.pv0) this.f35494e;
                int[] iArr = pv0Var.f29785m1;
                org.telegram.ui.Components.iu0[] iu0VarArr = pv0Var.f29782k0;
                pv0Var.f29790o1 = false;
                boolean z10 = this.f35492b;
                if (z10) {
                    int i12 = pv0Var.f29794q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (pv0Var.c0(((org.telegram.ui.Components.iu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(pv0Var.f29794q1);
                    }
                }
                for (int i13 = 0; i13 < iu0VarArr.length; i13++) {
                    org.telegram.ui.Components.iu0 iu0Var = iu0VarArr[i13];
                    if (iu0Var != null && iu0Var.h != null && (((i10 = iu0Var.F) == 0 || org.telegram.ui.Components.pv0.p0(i10)) && (adapter = iu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            pv0Var.f29802t1[0].g(false);
                        }
                        if (z10) {
                            iu0VarArr[i13].f27510x.y1(iArr[i11]);
                            iu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(iu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        iu0VarArr[i13].f27507r.setVisibility(8);
                    }
                }
                if (pv0Var.f29798s >= 0) {
                    for (int i14 = 0; i14 < iu0VarArr.length; i14++) {
                        org.telegram.ui.Components.iu0 iu0Var2 = iu0VarArr[i14];
                        if (iu0Var2.F == pv0Var.f29792p1) {
                            if (z10 && (m10 = iu0Var2.f27508s.m(pv0Var.f29798s)) != null) {
                                pv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.iu0 iu0Var3 = iu0VarArr[i14];
                            iu0Var3.f27510x.h1(pv0Var.f29798s, (-iu0Var3.h.getPaddingTop()) + pv0Var.v);
                        }
                    }
                } else {
                    pv0Var.X0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f35491a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((yn) this.f35494e)).currentAccount;
                this.f35493c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f35493c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public cj(yn ynVar, boolean z10, Runnable runnable) {
        this.f35494e = ynVar;
        this.f35492b = z10;
        this.d = runnable;
    }
}
