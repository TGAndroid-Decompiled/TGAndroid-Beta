package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class ej extends AnimatorListenerAdapter {
    public final int f36121a = 1;
    public final boolean f36122b;
    public int f36123c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f36124e;

    public ej(org.telegram.ui.Components.xu0 xu0Var, boolean z10, int i10, org.telegram.ui.Components.qt0 qt0Var) {
        this.f36124e = xu0Var;
        this.f36122b = z10;
        this.f36123c = i10;
        this.d = qt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.f36121a) {
            case 0:
                co coVar = (co) this.f36124e;
                coVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow = true;
                coVar.V9 = null;
                if (this.f36122b) {
                    coVar.f35347ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                kVar.invalidate();
                coVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new dj(this, 0), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f36123c;
                org.telegram.ui.Components.xu0 xu0Var = (org.telegram.ui.Components.xu0) this.f36124e;
                int[] iArr = xu0Var.f32732m1;
                org.telegram.ui.Components.qt0[] qt0VarArr = xu0Var.f32729k0;
                xu0Var.f32737o1 = false;
                boolean z10 = this.f36122b;
                if (z10) {
                    int i12 = xu0Var.f32741q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (xu0Var.c0(((org.telegram.ui.Components.qt0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(xu0Var.f32741q1);
                    }
                }
                for (int i13 = 0; i13 < qt0VarArr.length; i13++) {
                    org.telegram.ui.Components.qt0 qt0Var = qt0VarArr[i13];
                    if (qt0Var != null && qt0Var.h != null && (((i10 = qt0Var.F) == 0 || org.telegram.ui.Components.xu0.p0(i10)) && (adapter = qt0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            xu0Var.f32749t1[0].g(false);
                        }
                        if (z10) {
                            qt0VarArr[i13].f29851x.y1(iArr[i11]);
                            qt0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(qt0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        qt0VarArr[i13].f29848r.setVisibility(8);
                    }
                }
                if (xu0Var.f32745s >= 0) {
                    for (int i14 = 0; i14 < qt0VarArr.length; i14++) {
                        org.telegram.ui.Components.qt0 qt0Var2 = qt0VarArr[i14];
                        if (qt0Var2.F == xu0Var.f32739p1) {
                            if (z10 && (m10 = qt0Var2.f29849s.m(xu0Var.f32745s)) != null) {
                                xu0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.qt0 qt0Var3 = qt0VarArr[i14];
                            qt0Var3.f29851x.h1(xu0Var.f32745s, (-qt0Var3.h.getPaddingTop()) + xu0Var.v);
                        }
                    }
                } else {
                    xu0Var.X0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f36121a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((co) this.f36124e)).currentAccount;
                this.f36123c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f36123c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ej(co coVar, boolean z10, Runnable runnable) {
        this.f36124e = coVar;
        this.f36122b = z10;
        this.d = runnable;
    }
}
