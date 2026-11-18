package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
public final class dw extends AnimatorListenerAdapter {
    public final int f46982a;
    public final boolean f46983b;
    public final cx f46984c;

    public dw(cx cxVar, boolean z10, int i7) {
        this.f46982a = i7;
        this.f46984c = cxVar;
        this.f46983b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f46982a) {
            case 0:
                cx cxVar = this.f46984c;
                cxVar.f46723r3.e();
                if (cxVar.f46760y1 == animator) {
                    if (this.f46983b) {
                        cxVar.f46663f0[0].f46298a.c1();
                    } else {
                        yw ywVar = cxVar.f46663f0[0].f46298a;
                        if (ywVar.f34061h1) {
                            ywVar.f34061h1 = false;
                            ywVar.K0(false);
                        }
                    }
                    cxVar.f46760y1 = null;
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
        switch (this.f46982a) {
            case 0:
                cx cxVar = this.f46984c;
                cxVar.f46723r3.e();
                if (cxVar.f46760y1 == animator) {
                    cxVar.U4(false, true);
                    boolean z10 = this.f46983b;
                    if (z10) {
                        cxVar.f46663f0[0].f46298a.c1();
                        tv tvVar = cxVar.F0;
                        if (tvVar != null) {
                            tvVar.setVisibility(8);
                        }
                        cxVar.f46734t3 = true;
                        Activity parentActivity = cxVar.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.h2) cxVar).classGuid;
                        org.telegram.messenger.g0.Z2(parentActivity, i7);
                        cxVar.f46687k0.setVisibility(8);
                        xv xvVar = cxVar.H3;
                        if (xvVar != null) {
                            xvVar.setVisibility(8);
                        }
                    } else {
                        cxVar.f46739u3 = false;
                        kw kwVar = cxVar.D0;
                        if (kwVar != null) {
                            kwVar.setVisibility(8);
                        }
                        qw qwVar = cxVar.Y;
                        if (qwVar != null) {
                            qwVar.c();
                        }
                        kw kwVar2 = cxVar.D0;
                        if (kwVar2 != null) {
                            kwVar2.D0.clear();
                            kwVar2.H();
                        }
                        yw ywVar = cxVar.f46663f0[0].f46298a;
                        if (ywVar.f34061h1) {
                            ywVar.f34061h1 = false;
                            ywVar.K0(false);
                        }
                        cxVar.f46734t3 = false;
                        xv xvVar2 = cxVar.H3;
                        if (xvVar2 != null) {
                            xvVar2.setVisibility(0);
                        }
                    }
                    View view = cxVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    cxVar.X4(f10);
                    cxVar.f46663f0[0].f46298a.setVerticalScrollBarEnabled(true);
                    kw kwVar3 = cxVar.D0;
                    if (kwVar3 != null) {
                        kwVar3.setBackground(null);
                    }
                    cxVar.f46760y1 = null;
                    return;
                }
                return;
            case 1:
                cx cxVar2 = this.f46984c;
                cxVar2.T3 = null;
                if (!this.f46983b && (r0Var = cxVar2.f46701n0) != null) {
                    r0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                cx cxVar3 = this.f46984c;
                cxVar3.J = null;
                boolean z11 = this.f46983b;
                cxVar3.L = z11;
                if (!z11 && !cxVar3.M) {
                    cxVar3.F0.setVisibility(8);
                }
                if (!z11) {
                    cxVar3.W4(0.0f);
                    cxVar3.A3 = org.telegram.messenger.g0.L(81.0f);
                } else {
                    cxVar3.A3 = -org.telegram.messenger.g0.L(81.0f);
                    cxVar3.W4(-cxVar3.g4());
                }
                int i10 = 0;
                while (true) {
                    bx[] bxVarArr = cxVar3.f46663f0;
                    if (i10 < bxVarArr.length) {
                        bx bxVar = bxVarArr[i10];
                        if (bxVar != null) {
                            bxVar.f46298a.requestLayout();
                        }
                        i10++;
                    } else {
                        View view2 = cxVar3.fragmentView;
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
