package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class ej extends AnimatorListenerAdapter {
    public final int f37269a = 1;
    public final boolean f37270b;
    public int f37271c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f37272e;

    public ej(org.telegram.ui.Components.bw0 bw0Var, boolean z10, int i10, org.telegram.ui.Components.uu0 uu0Var) {
        this.f37272e = bw0Var;
        this.f37270b = z10;
        this.f37271c = i10;
        this.d = uu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.i0 adapter;
        switch (this.f37269a) {
            case 0:
                zn znVar = (zn) this.f37272e;
                znVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) znVar).fragmentBeginToShow = true;
                znVar.V9 = null;
                if (this.f37270b) {
                    znVar.f44834ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar.invalidate();
                znVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new cj(this, 1), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f37271c;
                org.telegram.ui.Components.bw0 bw0Var = (org.telegram.ui.Components.bw0) this.f37272e;
                int[] iArr = bw0Var.f25145m1;
                org.telegram.ui.Components.uu0[] uu0VarArr = bw0Var.f25142k0;
                bw0Var.f25150o1 = false;
                boolean z10 = this.f37270b;
                if (z10) {
                    int i12 = bw0Var.f25154q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (bw0Var.c0(((org.telegram.ui.Components.uu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(bw0Var.f25154q1);
                    }
                }
                for (int i13 = 0; i13 < uu0VarArr.length; i13++) {
                    org.telegram.ui.Components.uu0 uu0Var = uu0VarArr[i13];
                    if (uu0Var != null && uu0Var.h != null && (((i10 = uu0Var.F) == 0 || org.telegram.ui.Components.bw0.p0(i10)) && (adapter = uu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            bw0Var.f25162t1[0].g(false);
                        }
                        if (z10) {
                            uu0VarArr[i13].f31628x.y1(iArr[i11]);
                            uu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(uu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        uu0VarArr[i13].f31625r.setVisibility(8);
                    }
                }
                if (bw0Var.f25158s >= 0) {
                    for (int i14 = 0; i14 < uu0VarArr.length; i14++) {
                        org.telegram.ui.Components.uu0 uu0Var2 = uu0VarArr[i14];
                        if (uu0Var2.F == bw0Var.f25152p1) {
                            if (z10 && (m10 = uu0Var2.f31626s.m(bw0Var.f25158s)) != null) {
                                bw0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.uu0 uu0Var3 = uu0VarArr[i14];
                            uu0Var3.f31628x.h1(bw0Var.f25158s, (-uu0Var3.h.getPaddingTop()) + bw0Var.v);
                        }
                    }
                } else {
                    bw0Var.X0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f37269a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((zn) this.f37272e)).currentAccount;
                this.f37271c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f37271c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ej(zn znVar, boolean z10, Runnable runnable) {
        this.f37272e = znVar;
        this.f37270b = z10;
        this.d = runnable;
    }
}
