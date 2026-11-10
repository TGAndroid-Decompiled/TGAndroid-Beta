package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
public final class bw extends AnimatorListenerAdapter {
    public final int f44147a;
    public final boolean f44148b;
    public final zw f44149c;

    public bw(zw zwVar, boolean z9, int i7) {
        this.f44147a = i7;
        this.f44149c = zwVar;
        this.f44148b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f44147a) {
            case 0:
                zw zwVar = this.f44149c;
                zwVar.f52637q3.e();
                if (zwVar.f52674x1 == animator) {
                    if (this.f44148b) {
                        zwVar.f52577e0[0].f52125a.c1();
                    } else {
                        vw vwVar = zwVar.f52577e0[0].f52125a;
                        if (vwVar.f36967g1) {
                            vwVar.f36967g1 = false;
                            vwVar.K0(false);
                        }
                    }
                    zwVar.f52674x1 = null;
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
        switch (this.f44147a) {
            case 0:
                zw zwVar = this.f44149c;
                zwVar.f52637q3.e();
                if (zwVar.f52674x1 == animator) {
                    zwVar.M4(false, true);
                    boolean z9 = this.f44148b;
                    if (z9) {
                        zwVar.f52577e0[0].f52125a.c1();
                        sv svVar = zwVar.E0;
                        if (svVar != null) {
                            svVar.setVisibility(8);
                        }
                        zwVar.f52649s3 = true;
                        Activity parentActivity = zwVar.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.f2) zwVar).classGuid;
                        org.telegram.messenger.g0.a3(parentActivity, i7);
                        zwVar.f52603j0.setVisibility(8);
                        vv vvVar = zwVar.G3;
                        if (vvVar != null) {
                            vvVar.setVisibility(8);
                        }
                    } else {
                        zwVar.f52654t3 = false;
                        iw iwVar = zwVar.C0;
                        if (iwVar != null) {
                            iwVar.setVisibility(8);
                        }
                        ow owVar = zwVar.X;
                        if (owVar != null) {
                            owVar.c();
                        }
                        iw iwVar2 = zwVar.C0;
                        if (iwVar2 != null) {
                            iwVar2.C0.clear();
                            iwVar2.L();
                        }
                        vw vwVar = zwVar.f52577e0[0].f52125a;
                        if (vwVar.f36967g1) {
                            vwVar.f36967g1 = false;
                            vwVar.K0(false);
                        }
                        zwVar.f52649s3 = false;
                        vv vvVar2 = zwVar.G3;
                        if (vvVar2 != null) {
                            vvVar2.setVisibility(0);
                        }
                    }
                    View view = zwVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z9) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    zwVar.P4(f10);
                    zwVar.f52577e0[0].f52125a.setVerticalScrollBarEnabled(true);
                    iw iwVar3 = zwVar.C0;
                    if (iwVar3 != null) {
                        iwVar3.setBackground(null);
                    }
                    zwVar.f52674x1 = null;
                    return;
                }
                return;
            case 1:
                zw zwVar2 = this.f44149c;
                zwVar2.P3 = null;
                if (!this.f44148b && (r0Var = zwVar2.m0) != null) {
                    r0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                zw zwVar3 = this.f44149c;
                zwVar3.I = null;
                boolean z10 = this.f44148b;
                zwVar3.K = z10;
                if (!z10 && !zwVar3.L) {
                    zwVar3.E0.setVisibility(8);
                }
                if (!z10) {
                    zwVar3.O4(0.0f);
                    zwVar3.f52686z3 = org.telegram.messenger.g0.L(81.0f);
                } else {
                    zwVar3.f52686z3 = -org.telegram.messenger.g0.L(81.0f);
                    zwVar3.O4(-zwVar3.g4());
                }
                int i10 = 0;
                while (true) {
                    yw[] ywVarArr = zwVar3.f52577e0;
                    if (i10 < ywVarArr.length) {
                        yw ywVar = ywVarArr[i10];
                        if (ywVar != null) {
                            ywVar.f52125a.requestLayout();
                        }
                        i10++;
                    } else {
                        View view2 = zwVar3.fragmentView;
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
