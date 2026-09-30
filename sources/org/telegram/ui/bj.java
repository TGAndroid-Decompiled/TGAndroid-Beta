package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class bj extends AnimatorListenerAdapter {
    public final int f32436a = 1;
    public final boolean f32437b;
    public int f32438c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public bj(org.telegram.ui.Components.lv0 lv0Var, boolean z10, int i10, org.telegram.ui.Components.eu0 eu0Var) {
        this.e = lv0Var;
        this.f32437b = z10;
        this.f32438c = i10;
        this.d = eu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.f32436a) {
            case 0:
                wn wnVar = (wn) this.e;
                wnVar.O5 = true;
                ((org.telegram.ui.ActionBar.m2) wnVar).fragmentBeginToShow = true;
                wnVar.V9 = null;
                if (this.f32437b) {
                    wnVar.f39542ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                kVar.invalidate();
                wnVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new aj(this, 0), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f32438c;
                org.telegram.ui.Components.lv0 lv0Var = (org.telegram.ui.Components.lv0) this.e;
                int[] iArr = lv0Var.f26133m1;
                org.telegram.ui.Components.eu0[] eu0VarArr = lv0Var.f26130k0;
                lv0Var.f26138o1 = false;
                boolean z10 = this.f32437b;
                if (z10) {
                    int i12 = lv0Var.f26142q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (lv0Var.c0(((org.telegram.ui.Components.eu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(lv0Var.f26142q1);
                    }
                }
                for (int i13 = 0; i13 < eu0VarArr.length; i13++) {
                    org.telegram.ui.Components.eu0 eu0Var = eu0VarArr[i13];
                    if (eu0Var != null && eu0Var.h != null && (((i10 = eu0Var.F) == 0 || org.telegram.ui.Components.lv0.p0(i10)) && (adapter = eu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            lv0Var.f26150t1[0].g(false);
                        }
                        if (z10) {
                            eu0VarArr[i13].f24070x.y1(iArr[i11]);
                            eu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(eu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        eu0VarArr[i13].f24067r.setVisibility(8);
                    }
                }
                if (lv0Var.f26146s >= 0) {
                    for (int i14 = 0; i14 < eu0VarArr.length; i14++) {
                        org.telegram.ui.Components.eu0 eu0Var2 = eu0VarArr[i14];
                        if (eu0Var2.F == lv0Var.f26140p1) {
                            if (z10 && (m10 = eu0Var2.f24068s.m(lv0Var.f26146s)) != null) {
                                lv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.eu0 eu0Var3 = eu0VarArr[i14];
                            eu0Var3.f24070x.h1(lv0Var.f26146s, (-eu0Var3.h.getPaddingTop()) + lv0Var.v);
                        }
                    }
                } else {
                    lv0Var.X0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f32436a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.m2) ((wn) this.e)).currentAccount;
                this.f32438c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f32438c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public bj(wn wnVar, boolean z10, Runnable runnable) {
        this.e = wnVar;
        this.f32437b = z10;
        this.d = runnable;
    }
}
