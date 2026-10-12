package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class ij extends AnimatorListenerAdapter {
    public final int f37144a = 1;
    public final boolean f37145b;
    public int f37146c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public ij(org.telegram.ui.Components.xv0 xv0Var, boolean z10, int i10, org.telegram.ui.Components.qu0 qu0Var) {
        this.e = xv0Var;
        this.f37145b = z10;
        this.f37146c = i10;
        this.d = qu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.g0 adapter;
        switch (this.f37144a) {
            case 0:
                fo foVar = (fo) this.e;
                foVar.O5 = true;
                ((org.telegram.ui.ActionBar.m2) foVar).fragmentBeginToShow = true;
                foVar.V9 = null;
                if (this.f37145b) {
                    foVar.f36006ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                kVar.invalidate();
                foVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new gj(this, 1), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f37146c;
                org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) this.e;
                int[] iArr = xv0Var.f31367m1;
                org.telegram.ui.Components.qu0[] qu0VarArr = xv0Var.f31364k0;
                xv0Var.f31372o1 = false;
                boolean z10 = this.f37145b;
                if (z10) {
                    int i12 = xv0Var.f31376q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (xv0Var.c0(((org.telegram.ui.Components.qu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(xv0Var.f31376q1);
                    }
                }
                for (int i13 = 0; i13 < qu0VarArr.length; i13++) {
                    org.telegram.ui.Components.qu0 qu0Var = qu0VarArr[i13];
                    if (qu0Var != null && qu0Var.h != null && (((i10 = qu0Var.F) == 0 || org.telegram.ui.Components.xv0.p0(i10)) && (adapter = qu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            xv0Var.f31384t1[0].g(false);
                        }
                        if (z10) {
                            qu0VarArr[i13].f28683x.y1(iArr[i11]);
                            qu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(qu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        qu0VarArr[i13].f28680r.setVisibility(8);
                    }
                }
                if (xv0Var.f31380s >= 0) {
                    for (int i14 = 0; i14 < qu0VarArr.length; i14++) {
                        org.telegram.ui.Components.qu0 qu0Var2 = qu0VarArr[i14];
                        if (qu0Var2.F == xv0Var.f31374p1) {
                            if (z10 && (m10 = qu0Var2.f28681s.m(xv0Var.f31380s)) != null) {
                                xv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.qu0 qu0Var3 = qu0VarArr[i14];
                            qu0Var3.f28683x.h1(xv0Var.f31380s, (-qu0Var3.h.getPaddingTop()) + xv0Var.v);
                        }
                    }
                } else {
                    xv0Var.X0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f37144a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.m2) ((fo) this.e)).currentAccount;
                this.f37146c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f37146c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ij(fo foVar, boolean z10, Runnable runnable) {
        this.e = foVar;
        this.f37145b = z10;
        this.d = runnable;
    }
}
