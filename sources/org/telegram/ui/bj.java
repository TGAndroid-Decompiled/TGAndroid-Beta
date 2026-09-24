package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class bj extends AnimatorListenerAdapter {
    public final int f32420a = 1;
    public final boolean f32421b;
    public int f32422c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public bj(org.telegram.ui.Components.jv0 jv0Var, boolean z10, int i10, org.telegram.ui.Components.cu0 cu0Var) {
        this.e = jv0Var;
        this.f32421b = z10;
        this.f32422c = i10;
        this.d = cu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.f32420a) {
            case 0:
                wn wnVar = (wn) this.e;
                wnVar.O5 = true;
                ((org.telegram.ui.ActionBar.m2) wnVar).fragmentBeginToShow = true;
                wnVar.V9 = null;
                if (this.f32421b) {
                    wnVar.f39527ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                kVar.invalidate();
                wnVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new aj(this, 0), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f32422c;
                org.telegram.ui.Components.jv0 jv0Var = (org.telegram.ui.Components.jv0) this.e;
                int[] iArr = jv0Var.f25522m1;
                org.telegram.ui.Components.cu0[] cu0VarArr = jv0Var.f25519k0;
                jv0Var.f25527o1 = false;
                boolean z10 = this.f32421b;
                if (z10) {
                    int i12 = jv0Var.f25531q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (jv0Var.c0(((org.telegram.ui.Components.cu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(jv0Var.f25531q1);
                    }
                }
                for (int i13 = 0; i13 < cu0VarArr.length; i13++) {
                    org.telegram.ui.Components.cu0 cu0Var = cu0VarArr[i13];
                    if (cu0Var != null && cu0Var.h != null && (((i10 = cu0Var.F) == 0 || org.telegram.ui.Components.jv0.p0(i10)) && (adapter = cu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            jv0Var.f25539t1[0].g(false);
                        }
                        if (z10) {
                            cu0VarArr[i13].f23392x.y1(iArr[i11]);
                            cu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(cu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        cu0VarArr[i13].f23389r.setVisibility(8);
                    }
                }
                if (jv0Var.f25535s >= 0) {
                    for (int i14 = 0; i14 < cu0VarArr.length; i14++) {
                        org.telegram.ui.Components.cu0 cu0Var2 = cu0VarArr[i14];
                        if (cu0Var2.F == jv0Var.f25529p1) {
                            if (z10 && (m10 = cu0Var2.f23390s.m(jv0Var.f25535s)) != null) {
                                jv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.cu0 cu0Var3 = cu0VarArr[i14];
                            cu0Var3.f23392x.h1(jv0Var.f25535s, (-cu0Var3.h.getPaddingTop()) + jv0Var.v);
                        }
                    }
                } else {
                    jv0Var.X0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f32420a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.m2) ((wn) this.e)).currentAccount;
                this.f32422c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f32422c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public bj(wn wnVar, boolean z10, Runnable runnable) {
        this.e = wnVar;
        this.f32421b = z10;
        this.d = runnable;
    }
}
