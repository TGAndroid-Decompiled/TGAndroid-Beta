package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class bj extends AnimatorListenerAdapter {
    public final int f32508a = 1;
    public final boolean f32509b;
    public int f32510c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public bj(org.telegram.ui.Components.mv0 mv0Var, boolean z10, int i10, org.telegram.ui.Components.fu0 fu0Var) {
        this.e = mv0Var;
        this.f32509b = z10;
        this.f32510c = i10;
        this.d = fu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.f32508a) {
            case 0:
                wn wnVar = (wn) this.e;
                wnVar.O5 = true;
                ((org.telegram.ui.ActionBar.m2) wnVar).fragmentBeginToShow = true;
                wnVar.V9 = null;
                if (this.f32509b) {
                    wnVar.f39635ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                kVar.invalidate();
                wnVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new aj(this, 0), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f32510c;
                org.telegram.ui.Components.mv0 mv0Var = (org.telegram.ui.Components.mv0) this.e;
                int[] iArr = mv0Var.f26428m1;
                org.telegram.ui.Components.fu0[] fu0VarArr = mv0Var.f26425k0;
                mv0Var.f26433o1 = false;
                boolean z10 = this.f32509b;
                if (z10) {
                    int i12 = mv0Var.f26437q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (mv0Var.c0(((org.telegram.ui.Components.fu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(mv0Var.f26437q1);
                    }
                }
                for (int i13 = 0; i13 < fu0VarArr.length; i13++) {
                    org.telegram.ui.Components.fu0 fu0Var = fu0VarArr[i13];
                    if (fu0Var != null && fu0Var.h != null && (((i10 = fu0Var.F) == 0 || org.telegram.ui.Components.mv0.p0(i10)) && (adapter = fu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            mv0Var.f26445t1[0].g(false);
                        }
                        if (z10) {
                            fu0VarArr[i13].f24359x.y1(iArr[i11]);
                            fu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(fu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        fu0VarArr[i13].f24356r.setVisibility(8);
                    }
                }
                if (mv0Var.f26441s >= 0) {
                    for (int i14 = 0; i14 < fu0VarArr.length; i14++) {
                        org.telegram.ui.Components.fu0 fu0Var2 = fu0VarArr[i14];
                        if (fu0Var2.F == mv0Var.f26435p1) {
                            if (z10 && (m10 = fu0Var2.f24357s.m(mv0Var.f26441s)) != null) {
                                mv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.fu0 fu0Var3 = fu0VarArr[i14];
                            fu0Var3.f24359x.h1(mv0Var.f26441s, (-fu0Var3.h.getPaddingTop()) + mv0Var.v);
                        }
                    }
                } else {
                    mv0Var.X0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f32508a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.m2) ((wn) this.e)).currentAccount;
                this.f32510c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f32510c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public bj(wn wnVar, boolean z10, Runnable runnable) {
        this.e = wnVar;
        this.f32509b = z10;
        this.d = runnable;
    }
}
