package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class ij extends AnimatorListenerAdapter {
    public final int f38925a = 1;
    public final boolean f38926b;
    public int f38927c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f38928e;

    public ij(org.telegram.ui.Components.hw0 hw0Var, boolean z10, int i10, org.telegram.ui.Components.av0 av0Var) {
        this.f38928e = hw0Var;
        this.f38926b = z10;
        this.f38927c = i10;
        this.d = av0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.i0 adapter;
        switch (this.f38925a) {
            case 0:
                eo eoVar = (eo) this.f38928e;
                eoVar.O5 = true;
                ((org.telegram.ui.ActionBar.m2) eoVar).fragmentBeginToShow = true;
                eoVar.V9 = null;
                if (this.f38926b) {
                    eoVar.f37329ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
                kVar.invalidate();
                eoVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new gj(this, 1), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f38927c;
                org.telegram.ui.Components.hw0 hw0Var = (org.telegram.ui.Components.hw0) this.f38928e;
                int[] iArr = hw0Var.f26936m1;
                org.telegram.ui.Components.av0[] av0VarArr = hw0Var.f26933k0;
                hw0Var.f26941o1 = false;
                boolean z10 = this.f38926b;
                if (z10) {
                    int i12 = hw0Var.f26945q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (hw0Var.c0(((org.telegram.ui.Components.av0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(hw0Var.f26945q1);
                    }
                }
                for (int i13 = 0; i13 < av0VarArr.length; i13++) {
                    org.telegram.ui.Components.av0 av0Var = av0VarArr[i13];
                    if (av0Var != null && av0Var.h != null && (((i10 = av0Var.F) == 0 || org.telegram.ui.Components.hw0.p0(i10)) && (adapter = av0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            hw0Var.f26953t1[0].g(false);
                        }
                        if (z10) {
                            av0VarArr[i13].f24491x.y1(iArr[i11]);
                            av0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(av0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        av0VarArr[i13].f24488r.setVisibility(8);
                    }
                }
                if (hw0Var.f26949s >= 0) {
                    for (int i14 = 0; i14 < av0VarArr.length; i14++) {
                        org.telegram.ui.Components.av0 av0Var2 = av0VarArr[i14];
                        if (av0Var2.F == hw0Var.f26943p1) {
                            if (z10 && (m10 = av0Var2.f24489s.m(hw0Var.f26949s)) != null) {
                                hw0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.av0 av0Var3 = av0VarArr[i14];
                            av0Var3.f24491x.h1(hw0Var.f26949s, (-av0Var3.h.getPaddingTop()) + hw0Var.v);
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
        switch (this.f38925a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.m2) ((eo) this.f38928e)).currentAccount;
                this.f38927c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f38927c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ij(eo eoVar, boolean z10, Runnable runnable) {
        this.f38928e = eoVar;
        this.f38926b = z10;
        this.d = runnable;
    }
}
