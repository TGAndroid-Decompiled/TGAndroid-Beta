package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class bj extends AnimatorListenerAdapter {
    public final int f32432a = 1;
    public final boolean f32433b;
    public int f32434c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public bj(org.telegram.ui.Components.kv0 kv0Var, boolean z10, int i10, org.telegram.ui.Components.du0 du0Var) {
        this.e = kv0Var;
        this.f32433b = z10;
        this.f32434c = i10;
        this.d = du0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.f32432a) {
            case 0:
                wn wnVar = (wn) this.e;
                wnVar.O5 = true;
                ((org.telegram.ui.ActionBar.m2) wnVar).fragmentBeginToShow = true;
                wnVar.V9 = null;
                if (this.f32433b) {
                    wnVar.f39541ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                kVar.invalidate();
                wnVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new aj(this, 0), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f32434c;
                org.telegram.ui.Components.kv0 kv0Var = (org.telegram.ui.Components.kv0) this.e;
                int[] iArr = kv0Var.f25845m1;
                org.telegram.ui.Components.du0[] du0VarArr = kv0Var.f25842k0;
                kv0Var.f25850o1 = false;
                boolean z10 = this.f32433b;
                if (z10) {
                    int i12 = kv0Var.f25854q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (kv0Var.c0(((org.telegram.ui.Components.du0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(kv0Var.f25854q1);
                    }
                }
                for (int i13 = 0; i13 < du0VarArr.length; i13++) {
                    org.telegram.ui.Components.du0 du0Var = du0VarArr[i13];
                    if (du0Var != null && du0Var.h != null && (((i10 = du0Var.F) == 0 || org.telegram.ui.Components.kv0.p0(i10)) && (adapter = du0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            kv0Var.f25862t1[0].g(false);
                        }
                        if (z10) {
                            du0VarArr[i13].f23760x.y1(iArr[i11]);
                            du0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(du0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        du0VarArr[i13].f23757r.setVisibility(8);
                    }
                }
                if (kv0Var.f25858s >= 0) {
                    for (int i14 = 0; i14 < du0VarArr.length; i14++) {
                        org.telegram.ui.Components.du0 du0Var2 = du0VarArr[i14];
                        if (du0Var2.F == kv0Var.f25852p1) {
                            if (z10 && (m10 = du0Var2.f23758s.m(kv0Var.f25858s)) != null) {
                                kv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.du0 du0Var3 = du0VarArr[i14];
                            du0Var3.f23760x.h1(kv0Var.f25858s, (-du0Var3.h.getPaddingTop()) + kv0Var.v);
                        }
                    }
                } else {
                    kv0Var.X0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f32432a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.m2) ((wn) this.e)).currentAccount;
                this.f32434c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f32434c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public bj(wn wnVar, boolean z10, Runnable runnable) {
        this.e = wnVar;
        this.f32433b = z10;
        this.d = runnable;
    }
}
