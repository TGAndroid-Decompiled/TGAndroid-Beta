package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class ej extends AnimatorListenerAdapter {
    public final int f33354a = 1;
    public final boolean f33355b;
    public int f33356c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public ej(org.telegram.ui.Components.yu0 yu0Var, boolean z10, int i10, org.telegram.ui.Components.rt0 rt0Var) {
        this.e = yu0Var;
        this.f33355b = z10;
        this.f33356c = i10;
        this.d = rt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.f33354a) {
            case 0:
                bo boVar = (bo) this.e;
                boVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) boVar).fragmentBeginToShow = true;
                boVar.V9 = null;
                if (this.f33355b) {
                    boVar.f32371ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                kVar.invalidate();
                boVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new dj(this, 0), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f33356c;
                org.telegram.ui.Components.yu0 yu0Var = (org.telegram.ui.Components.yu0) this.e;
                int[] iArr = yu0Var.f30371m1;
                org.telegram.ui.Components.rt0[] rt0VarArr = yu0Var.f30368k0;
                yu0Var.f30376o1 = false;
                boolean z10 = this.f33355b;
                if (z10) {
                    int i12 = yu0Var.f30380q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (yu0Var.c0(((org.telegram.ui.Components.rt0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(yu0Var.f30380q1);
                    }
                }
                for (int i13 = 0; i13 < rt0VarArr.length; i13++) {
                    org.telegram.ui.Components.rt0 rt0Var = rt0VarArr[i13];
                    if (rt0Var != null && rt0Var.h != null && (((i10 = rt0Var.F) == 0 || org.telegram.ui.Components.yu0.p0(i10)) && (adapter = rt0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            yu0Var.f30388t1[0].g(false);
                        }
                        if (z10) {
                            rt0VarArr[i13].f27691x.y1(iArr[i11]);
                            rt0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(rt0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        rt0VarArr[i13].f27688r.setVisibility(8);
                    }
                }
                if (yu0Var.f30384s >= 0) {
                    for (int i14 = 0; i14 < rt0VarArr.length; i14++) {
                        org.telegram.ui.Components.rt0 rt0Var2 = rt0VarArr[i14];
                        if (rt0Var2.F == yu0Var.f30378p1) {
                            if (z10 && (m10 = rt0Var2.f27689s.m(yu0Var.f30384s)) != null) {
                                yu0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.rt0 rt0Var3 = rt0VarArr[i14];
                            rt0Var3.f27691x.h1(yu0Var.f30384s, (-rt0Var3.h.getPaddingTop()) + yu0Var.v);
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
        switch (this.f33354a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((bo) this.e)).currentAccount;
                this.f33356c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f33356c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ej(bo boVar, boolean z10, Runnable runnable) {
        this.e = boVar;
        this.f33355b = z10;
        this.d = runnable;
    }
}
