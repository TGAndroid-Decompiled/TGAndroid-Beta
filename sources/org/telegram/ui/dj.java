package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class dj extends AnimatorListenerAdapter {
    public final int f33055a = 1;
    public final boolean f33056b;
    public int f33057c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public dj(org.telegram.ui.Components.jv0 jv0Var, boolean z10, int i10, org.telegram.ui.Components.cu0 cu0Var) {
        this.e = jv0Var;
        this.f33056b = z10;
        this.f33057c = i10;
        this.d = cu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.f33055a) {
            case 0:
                zn znVar = (zn) this.e;
                znVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) znVar).fragmentBeginToShow = true;
                znVar.V9 = null;
                if (this.f33056b) {
                    znVar.f40377ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar.invalidate();
                znVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new cj(this, 0), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f33057c;
                org.telegram.ui.Components.jv0 jv0Var = (org.telegram.ui.Components.jv0) this.e;
                int[] iArr = jv0Var.f25507m1;
                org.telegram.ui.Components.cu0[] cu0VarArr = jv0Var.f25504k0;
                jv0Var.f25512o1 = false;
                boolean z10 = this.f33056b;
                if (z10) {
                    int i12 = jv0Var.f25516q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (jv0Var.c0(((org.telegram.ui.Components.cu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(jv0Var.f25516q1);
                    }
                }
                for (int i13 = 0; i13 < cu0VarArr.length; i13++) {
                    org.telegram.ui.Components.cu0 cu0Var = cu0VarArr[i13];
                    if (cu0Var != null && cu0Var.h != null && (((i10 = cu0Var.F) == 0 || org.telegram.ui.Components.jv0.p0(i10)) && (adapter = cu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            jv0Var.f25524t1[0].g(false);
                        }
                        if (z10) {
                            cu0VarArr[i13].f23410x.y1(iArr[i11]);
                            cu0VarArr[i13].h.b0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(cu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        cu0VarArr[i13].f23407r.setVisibility(8);
                    }
                }
                if (jv0Var.f25520s >= 0) {
                    for (int i14 = 0; i14 < cu0VarArr.length; i14++) {
                        org.telegram.ui.Components.cu0 cu0Var2 = cu0VarArr[i14];
                        if (cu0Var2.F == jv0Var.f25514p1) {
                            if (z10 && (m10 = cu0Var2.f23408s.m(jv0Var.f25520s)) != null) {
                                jv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.cu0 cu0Var3 = cu0VarArr[i14];
                            cu0Var3.f23410x.h1(jv0Var.f25520s, (-cu0Var3.h.getPaddingTop()) + jv0Var.v);
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
        switch (this.f33055a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((zn) this.e)).currentAccount;
                this.f33057c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f33057c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public dj(zn znVar, boolean z10, Runnable runnable) {
        this.e = znVar;
        this.f33056b = z10;
        this.d = runnable;
    }
}
