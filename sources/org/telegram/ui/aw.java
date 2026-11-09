package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
public final class aw extends AnimatorListenerAdapter {
    public final int f43797a;
    public final boolean f43798b;
    public final yw f43799c;

    public aw(yw ywVar, boolean z9, int i7) {
        this.f43797a = i7;
        this.f43799c = ywVar;
        this.f43798b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f43797a) {
            case 0:
                yw ywVar = this.f43799c;
                ywVar.f52291q3.e();
                if (ywVar.f52328x1 == animator) {
                    if (this.f43798b) {
                        ywVar.f52231e0[0].f51772a.c1();
                    } else {
                        uw uwVar = ywVar.f52231e0[0].f51772a;
                        if (uwVar.f37368g1) {
                            uwVar.f37368g1 = false;
                            uwVar.K0(false);
                        }
                    }
                    ywVar.f52328x1 = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i7;
        org.telegram.ui.ActionBar.r0 r0Var;
        switch (this.f43797a) {
            case 0:
                yw ywVar = this.f43799c;
                ywVar.f52291q3.e();
                if (ywVar.f52328x1 == animator) {
                    ywVar.M4(false, true);
                    boolean z9 = this.f43798b;
                    if (z9) {
                        ywVar.f52231e0[0].f51772a.c1();
                        rv rvVar = ywVar.E0;
                        if (rvVar != null) {
                            rvVar.setVisibility(8);
                        }
                        ywVar.f52303s3 = true;
                        Activity parentActivity = ywVar.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.f2) ywVar).classGuid;
                        org.telegram.messenger.g0.a3(parentActivity, i7);
                        ywVar.f52257j0.setVisibility(8);
                        uv uvVar = ywVar.G3;
                        if (uvVar != null) {
                            uvVar.setVisibility(8);
                        }
                    } else {
                        ywVar.f52308t3 = false;
                        hw hwVar = ywVar.C0;
                        if (hwVar != null) {
                            hwVar.setVisibility(8);
                        }
                        nw nwVar = ywVar.X;
                        if (nwVar != null) {
                            nwVar.c();
                        }
                        hw hwVar2 = ywVar.C0;
                        if (hwVar2 != null) {
                            hwVar2.C0.clear();
                            hwVar2.L();
                        }
                        uw uwVar = ywVar.f52231e0[0].f51772a;
                        if (uwVar.f37368g1) {
                            uwVar.f37368g1 = false;
                            uwVar.K0(false);
                        }
                        ywVar.f52303s3 = false;
                        uv uvVar2 = ywVar.G3;
                        if (uvVar2 != null) {
                            uvVar2.setVisibility(0);
                        }
                    }
                    View view = ywVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z9) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ywVar.P4(f10);
                    ywVar.f52231e0[0].f51772a.setVerticalScrollBarEnabled(true);
                    hw hwVar3 = ywVar.C0;
                    if (hwVar3 != null) {
                        hwVar3.setBackground(null);
                    }
                    ywVar.f52328x1 = null;
                    return;
                }
                return;
            case 1:
                yw ywVar2 = this.f43799c;
                ywVar2.P3 = null;
                if (!this.f43798b && (r0Var = ywVar2.m0) != null) {
                    r0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                yw ywVar3 = this.f43799c;
                ywVar3.I = null;
                boolean z10 = this.f43798b;
                ywVar3.K = z10;
                if (!z10 && !ywVar3.L) {
                    ywVar3.E0.setVisibility(8);
                }
                if (!z10) {
                    ywVar3.O4(0.0f);
                    ywVar3.f52340z3 = org.telegram.messenger.g0.L(81.0f);
                } else {
                    ywVar3.f52340z3 = -org.telegram.messenger.g0.L(81.0f);
                    ywVar3.O4(-ywVar3.g4());
                }
                int i10 = 0;
                while (true) {
                    xw[] xwVarArr = ywVar3.f52231e0;
                    if (i10 < xwVarArr.length) {
                        xw xwVar = xwVarArr[i10];
                        if (xwVar != null) {
                            xwVar.f51772a.requestLayout();
                        }
                        i10++;
                    } else {
                        View view2 = ywVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            return;
                        }
                        return;
                    }
                }
                break;
        }
    }
}
