package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class aj extends AnimatorListenerAdapter {
    public final int f32643a = 1;
    public final boolean f32644b;
    public int f32645c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public aj(org.telegram.ui.Components.yu0 yu0Var, boolean z4, int i10, org.telegram.ui.Components.qt0 qt0Var) {
        this.e = yu0Var;
        this.f32644b = z4;
        this.f32645c = i10;
        this.d = qt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m9;
        int i10;
        f2.o0 adapter;
        switch (this.f32643a) {
            case 0:
                xn xnVar = (xn) this.e;
                xnVar.L5 = true;
                ((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow = true;
                xnVar.S9 = null;
                if (this.f32644b) {
                    xnVar.f40044ha = false;
                }
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                kVar.invalidate();
                xnVar.U0.invalidate();
                AndroidUtilities.runOnUIThread(new zi(this, 0), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f32645c;
                org.telegram.ui.Components.yu0 yu0Var = (org.telegram.ui.Components.yu0) this.e;
                int[] iArr = yu0Var.f31125j1;
                org.telegram.ui.Components.qt0[] qt0VarArr = yu0Var.f31120h0;
                yu0Var.l1 = false;
                boolean z4 = this.f32644b;
                if (z4) {
                    int i12 = yu0Var.f31132n1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (yu0Var.c0(((org.telegram.ui.Components.qt0) this.d).C) >= 5) {
                        SharedConfig.setStoriesColumnsCount(yu0Var.f31132n1);
                    }
                }
                for (int i13 = 0; i13 < qt0VarArr.length; i13++) {
                    org.telegram.ui.Components.qt0 qt0Var = qt0VarArr[i13];
                    if (qt0Var != null && qt0Var.h != null && (((i10 = qt0Var.C) == 0 || org.telegram.ui.Components.yu0.p0(i10)) && (adapter = qt0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            yu0Var.f31138q1[0].g(false);
                        }
                        if (z4) {
                            qt0VarArr[i13].f28245x.y1(iArr[i11]);
                            qt0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(qt0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        qt0VarArr[i13].f28242r.setVisibility(8);
                    }
                }
                if (yu0Var.f31142s >= 0) {
                    for (int i14 = 0; i14 < qt0VarArr.length; i14++) {
                        org.telegram.ui.Components.qt0 qt0Var2 = qt0VarArr[i14];
                        if (qt0Var2.C == yu0Var.f31129m1) {
                            if (z4 && (m9 = qt0Var2.f28243s.m(yu0Var.f31142s)) != null) {
                                yu0Var.v = m9.getTop();
                            }
                            org.telegram.ui.Components.qt0 qt0Var3 = qt0VarArr[i14];
                            qt0Var3.f28245x.h1(yu0Var.f31142s, (-qt0Var3.h.getPaddingTop()) + yu0Var.v);
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
        switch (this.f32643a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.p2) ((xn) this.e)).currentAccount;
                this.f32645c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f32645c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public aj(xn xnVar, boolean z4, Runnable runnable) {
        this.e = xnVar;
        this.f32644b = z4;
        this.d = runnable;
    }
}
