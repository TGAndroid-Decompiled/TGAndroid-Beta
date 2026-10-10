package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class ej extends AnimatorListenerAdapter {
    public final int f37315a = 1;
    public final boolean f37316b;
    public int f37317c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f37318e;

    public ej(org.telegram.ui.Components.cw0 cw0Var, boolean z10, int i10, org.telegram.ui.Components.vu0 vu0Var) {
        this.f37318e = cw0Var;
        this.f37316b = z10;
        this.f37317c = i10;
        this.d = vu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.i0 adapter;
        switch (this.f37315a) {
            case 0:
                zn znVar = (zn) this.f37318e;
                znVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) znVar).fragmentBeginToShow = true;
                znVar.V9 = null;
                if (this.f37316b) {
                    znVar.f44880ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar.invalidate();
                znVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new cj(this, 1), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f37317c;
                org.telegram.ui.Components.cw0 cw0Var = (org.telegram.ui.Components.cw0) this.f37318e;
                int[] iArr = cw0Var.f25453m1;
                org.telegram.ui.Components.vu0[] vu0VarArr = cw0Var.f25450k0;
                cw0Var.f25458o1 = false;
                boolean z10 = this.f37316b;
                if (z10) {
                    int i12 = cw0Var.f25462q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (cw0Var.c0(((org.telegram.ui.Components.vu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(cw0Var.f25462q1);
                    }
                }
                for (int i13 = 0; i13 < vu0VarArr.length; i13++) {
                    org.telegram.ui.Components.vu0 vu0Var = vu0VarArr[i13];
                    if (vu0Var != null && vu0Var.h != null && (((i10 = vu0Var.F) == 0 || org.telegram.ui.Components.cw0.p0(i10)) && (adapter = vu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            cw0Var.f25470t1[0].g(false);
                        }
                        if (z10) {
                            vu0VarArr[i13].f32522x.y1(iArr[i11]);
                            vu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(vu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        vu0VarArr[i13].f32519r.setVisibility(8);
                    }
                }
                if (cw0Var.f25466s >= 0) {
                    for (int i14 = 0; i14 < vu0VarArr.length; i14++) {
                        org.telegram.ui.Components.vu0 vu0Var2 = vu0VarArr[i14];
                        if (vu0Var2.F == cw0Var.f25460p1) {
                            if (z10 && (m10 = vu0Var2.f32520s.m(cw0Var.f25466s)) != null) {
                                cw0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.vu0 vu0Var3 = vu0VarArr[i14];
                            vu0Var3.f32522x.h1(cw0Var.f25466s, (-vu0Var3.h.getPaddingTop()) + cw0Var.v);
                        }
                    }
                } else {
                    cw0Var.X0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f37315a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((zn) this.f37318e)).currentAccount;
                this.f37317c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f37317c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ej(zn znVar, boolean z10, Runnable runnable) {
        this.f37318e = znVar;
        this.f37316b = z10;
        this.d = runnable;
    }
}
