package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class ej extends AnimatorListenerAdapter {
    public final int f37376a = 1;
    public final boolean f37377b;
    public int f37378c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f37379e;

    public ej(org.telegram.ui.Components.dw0 dw0Var, boolean z10, int i10, org.telegram.ui.Components.wu0 wu0Var) {
        this.f37379e = dw0Var;
        this.f37377b = z10;
        this.f37378c = i10;
        this.d = wu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.i0 adapter;
        switch (this.f37376a) {
            case 0:
                zn znVar = (zn) this.f37379e;
                znVar.O5 = true;
                ((org.telegram.ui.ActionBar.m2) znVar).fragmentBeginToShow = true;
                znVar.V9 = null;
                if (this.f37377b) {
                    znVar.f44835ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.m2) znVar).actionBar;
                kVar.invalidate();
                znVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new cj(this, 1), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f37378c;
                org.telegram.ui.Components.dw0 dw0Var = (org.telegram.ui.Components.dw0) this.f37379e;
                int[] iArr = dw0Var.f25714m1;
                org.telegram.ui.Components.wu0[] wu0VarArr = dw0Var.f25711k0;
                dw0Var.f25719o1 = false;
                boolean z10 = this.f37377b;
                if (z10) {
                    int i12 = dw0Var.f25723q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (dw0Var.c0(((org.telegram.ui.Components.wu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(dw0Var.f25723q1);
                    }
                }
                for (int i13 = 0; i13 < wu0VarArr.length; i13++) {
                    org.telegram.ui.Components.wu0 wu0Var = wu0VarArr[i13];
                    if (wu0Var != null && wu0Var.h != null && (((i10 = wu0Var.F) == 0 || org.telegram.ui.Components.dw0.p0(i10)) && (adapter = wu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            dw0Var.f25731t1[0].g(false);
                        }
                        if (z10) {
                            wu0VarArr[i13].f32747x.y1(iArr[i11]);
                            wu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(wu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        wu0VarArr[i13].f32744r.setVisibility(8);
                    }
                }
                if (dw0Var.f25727s >= 0) {
                    for (int i14 = 0; i14 < wu0VarArr.length; i14++) {
                        org.telegram.ui.Components.wu0 wu0Var2 = wu0VarArr[i14];
                        if (wu0Var2.F == dw0Var.f25721p1) {
                            if (z10 && (m10 = wu0Var2.f32745s.m(dw0Var.f25727s)) != null) {
                                dw0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.wu0 wu0Var3 = wu0VarArr[i14];
                            wu0Var3.f32747x.h1(dw0Var.f25727s, (-wu0Var3.h.getPaddingTop()) + dw0Var.v);
                        }
                    }
                } else {
                    dw0Var.X0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f37376a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.m2) ((zn) this.f37379e)).currentAccount;
                this.f37378c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f37378c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ej(zn znVar, boolean z10, Runnable runnable) {
        this.f37379e = znVar;
        this.f37377b = z10;
        this.d = runnable;
    }
}
