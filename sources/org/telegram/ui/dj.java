package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class dj extends AnimatorListenerAdapter {
    public final int f33034a = 1;
    public final boolean f33035b;
    public int f33036c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public dj(org.telegram.ui.Components.kv0 kv0Var, boolean z10, int i10, org.telegram.ui.Components.du0 du0Var) {
        this.e = kv0Var;
        this.f33035b = z10;
        this.f33036c = i10;
        this.d = du0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.f33034a) {
            case 0:
                zn znVar = (zn) this.e;
                znVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) znVar).fragmentBeginToShow = true;
                znVar.V9 = null;
                if (this.f33035b) {
                    znVar.f40335ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar.invalidate();
                znVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new cj(this, 0), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f33036c;
                org.telegram.ui.Components.kv0 kv0Var = (org.telegram.ui.Components.kv0) this.e;
                int[] iArr = kv0Var.f25827m1;
                org.telegram.ui.Components.du0[] du0VarArr = kv0Var.f25824k0;
                kv0Var.f25832o1 = false;
                boolean z10 = this.f33035b;
                if (z10) {
                    int i12 = kv0Var.f25836q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (kv0Var.c0(((org.telegram.ui.Components.du0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(kv0Var.f25836q1);
                    }
                }
                for (int i13 = 0; i13 < du0VarArr.length; i13++) {
                    org.telegram.ui.Components.du0 du0Var = du0VarArr[i13];
                    if (du0Var != null && du0Var.h != null && (((i10 = du0Var.F) == 0 || org.telegram.ui.Components.kv0.p0(i10)) && (adapter = du0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            kv0Var.f25844t1[0].g(false);
                        }
                        if (z10) {
                            du0VarArr[i13].f23688x.y1(iArr[i11]);
                            du0VarArr[i13].h.b0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(du0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        du0VarArr[i13].f23685r.setVisibility(8);
                    }
                }
                if (kv0Var.f25840s >= 0) {
                    for (int i14 = 0; i14 < du0VarArr.length; i14++) {
                        org.telegram.ui.Components.du0 du0Var2 = du0VarArr[i14];
                        if (du0Var2.F == kv0Var.f25834p1) {
                            if (z10 && (m10 = du0Var2.f23686s.m(kv0Var.f25840s)) != null) {
                                kv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.du0 du0Var3 = du0VarArr[i14];
                            du0Var3.f23688x.h1(kv0Var.f25840s, (-du0Var3.h.getPaddingTop()) + kv0Var.v);
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
        switch (this.f33034a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((zn) this.e)).currentAccount;
                this.f33036c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f33036c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public dj(zn znVar, boolean z10, Runnable runnable) {
        this.e = znVar;
        this.f33035b = z10;
        this.d = runnable;
    }
}
