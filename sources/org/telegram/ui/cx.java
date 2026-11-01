package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
public final class cx extends AnimatorListenerAdapter {
    public final int f36432a;
    public final boolean f36433b;
    public final zx f36434c;

    public cx(zx zxVar, boolean z10, int i10) {
        this.f36432a = i10;
        this.f36434c = zxVar;
        this.f36433b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36432a) {
            case 0:
                zx zxVar = this.f36434c;
                zxVar.f44194p3.e();
                if (zxVar.f44230w1 == animator) {
                    if (this.f36433b) {
                        zxVar.f44137e0[0].f43733a.c1();
                    } else {
                        vx vxVar = zxVar.f44137e0[0].f43733a;
                        if (vxVar.f30994g1) {
                            vxVar.f30994g1 = false;
                            vxVar.K0(false);
                        }
                    }
                    zxVar.f44230w1 = null;
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
        float f7;
        int i10;
        org.telegram.ui.ActionBar.t0 t0Var;
        switch (this.f36432a) {
            case 0:
                zx zxVar = this.f36434c;
                zxVar.f44194p3.e();
                if (zxVar.f44230w1 == animator) {
                    zxVar.M4(false, true);
                    boolean z10 = this.f36433b;
                    if (z10) {
                        zxVar.f44137e0[0].f43733a.c1();
                        tw twVar = zxVar.E0;
                        if (twVar != null) {
                            twVar.setVisibility(8);
                        }
                        zxVar.f44205r3 = true;
                        Activity parentActivity = zxVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.k2) zxVar).classGuid;
                        org.telegram.messenger.i0.Z2(parentActivity, i10);
                        zxVar.f44163j0.setVisibility(8);
                        ww wwVar = zxVar.F3;
                        if (wwVar != null) {
                            wwVar.setVisibility(8);
                        }
                    } else {
                        zxVar.f44211s3 = false;
                        jx jxVar = zxVar.C0;
                        if (jxVar != null) {
                            jxVar.setVisibility(8);
                        }
                        ox oxVar = zxVar.X;
                        if (oxVar != null) {
                            oxVar.c();
                        }
                        jx jxVar2 = zxVar.C0;
                        if (jxVar2 != null) {
                            jxVar2.C0.clear();
                            jxVar2.L();
                        }
                        vx vxVar = zxVar.f44137e0[0].f43733a;
                        if (vxVar.f30994g1) {
                            vxVar.f30994g1 = false;
                            vxVar.K0(false);
                        }
                        zxVar.f44205r3 = false;
                        ww wwVar2 = zxVar.F3;
                        if (wwVar2 != null) {
                            wwVar2.setVisibility(0);
                        }
                    }
                    View view = zxVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    zxVar.P4(f7);
                    zxVar.f44137e0[0].f43733a.setVerticalScrollBarEnabled(true);
                    jx jxVar3 = zxVar.C0;
                    if (jxVar3 != null) {
                        jxVar3.setBackground(null);
                    }
                    zxVar.f44230w1 = null;
                    return;
                }
                return;
            case 1:
                zx zxVar2 = this.f36434c;
                zxVar2.O3 = null;
                if (!this.f36433b && (t0Var = zxVar2.m0) != null) {
                    t0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                zx zxVar3 = this.f36434c;
                zxVar3.I = null;
                boolean z11 = this.f36433b;
                zxVar3.K = z11;
                if (!z11 && !zxVar3.L) {
                    zxVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    zxVar3.O4(0.0f);
                    zxVar3.y3 = org.telegram.messenger.i0.L(81.0f);
                } else {
                    zxVar3.y3 = -org.telegram.messenger.i0.L(81.0f);
                    zxVar3.O4(-zxVar3.g4());
                }
                int i11 = 0;
                while (true) {
                    yx[] yxVarArr = zxVar3.f44137e0;
                    if (i11 < yxVarArr.length) {
                        yx yxVar = yxVarArr[i11];
                        if (yxVar != null) {
                            yxVar.f43733a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = zxVar3.fragmentView;
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
