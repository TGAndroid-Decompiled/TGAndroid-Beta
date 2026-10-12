package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class ij extends AnimatorListenerAdapter {
    public final int f38923a = 1;
    public final boolean f38924b;
    public int f38925c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f38926e;

    public ij(org.telegram.ui.Components.hw0 hw0Var, boolean z10, int i10, org.telegram.ui.Components.av0 av0Var) {
        this.f38926e = hw0Var;
        this.f38924b = z10;
        this.f38925c = i10;
        this.d = av0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.i0 adapter;
        switch (this.f38923a) {
            case 0:
                eo eoVar = (eo) this.f38926e;
                eoVar.O5 = true;
                ((org.telegram.ui.ActionBar.m2) eoVar).fragmentBeginToShow = true;
                eoVar.V9 = null;
                if (this.f38924b) {
                    eoVar.f37324ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
                kVar.invalidate();
                eoVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new gj(this, 1), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f38925c;
                org.telegram.ui.Components.hw0 hw0Var = (org.telegram.ui.Components.hw0) this.f38926e;
                int[] iArr = hw0Var.f26951m1;
                org.telegram.ui.Components.av0[] av0VarArr = hw0Var.f26948k0;
                hw0Var.f26956o1 = false;
                boolean z10 = this.f38924b;
                if (z10) {
                    int i12 = hw0Var.f26960q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (hw0Var.c0(((org.telegram.ui.Components.av0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(hw0Var.f26960q1);
                    }
                }
                for (int i13 = 0; i13 < av0VarArr.length; i13++) {
                    org.telegram.ui.Components.av0 av0Var = av0VarArr[i13];
                    if (av0Var != null && av0Var.h != null && (((i10 = av0Var.F) == 0 || org.telegram.ui.Components.hw0.p0(i10)) && (adapter = av0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            hw0Var.f26968t1[0].g(false);
                        }
                        if (z10) {
                            av0VarArr[i13].f24503x.y1(iArr[i11]);
                            av0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(av0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        av0VarArr[i13].f24500r.setVisibility(8);
                    }
                }
                if (hw0Var.f26964s >= 0) {
                    for (int i14 = 0; i14 < av0VarArr.length; i14++) {
                        org.telegram.ui.Components.av0 av0Var2 = av0VarArr[i14];
                        if (av0Var2.F == hw0Var.f26958p1) {
                            if (z10 && (m10 = av0Var2.f24501s.m(hw0Var.f26964s)) != null) {
                                hw0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.av0 av0Var3 = av0VarArr[i14];
                            av0Var3.f24503x.h1(hw0Var.f26964s, (-av0Var3.h.getPaddingTop()) + hw0Var.v);
                        }
                    }
                } else {
                    hw0Var.X0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f38923a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.m2) ((eo) this.f38926e)).currentAccount;
                this.f38925c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f38925c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ij(eo eoVar, boolean z10, Runnable runnable) {
        this.f38926e = eoVar;
        this.f38924b = z10;
        this.d = runnable;
    }
}
