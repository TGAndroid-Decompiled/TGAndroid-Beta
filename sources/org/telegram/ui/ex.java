package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ex extends AnimatorListenerAdapter {
    public final int f37031a;
    public final boolean f37032b;
    public final ey f37033c;

    public ex(ey eyVar, boolean z10, int i10) {
        this.f37031a = i10;
        this.f37033c = eyVar;
        this.f37032b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37031a) {
            case 0:
                ey eyVar = this.f37033c;
                eyVar.f37116p3.unlock();
                if (eyVar.f37152w1 == animator) {
                    if (this.f37032b) {
                        eyVar.f37059e0[0].f36750a.d1();
                    } else {
                        zx zxVar = eyVar.f37059e0[0].f36750a;
                        if (zxVar.f28691g1) {
                            zxVar.f28691g1 = false;
                            zxVar.K0(false);
                        }
                    }
                    eyVar.f37152w1 = null;
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
        org.telegram.ui.ActionBar.u0 u0Var;
        switch (this.f37031a) {
            case 0:
                ey eyVar = this.f37033c;
                eyVar.f37116p3.unlock();
                if (eyVar.f37152w1 == animator) {
                    eyVar.y4(false, true);
                    boolean z10 = this.f37032b;
                    if (z10) {
                        eyVar.f37059e0[0].f36750a.d1();
                        vw vwVar = eyVar.E0;
                        if (vwVar != null) {
                            vwVar.setVisibility(8);
                        }
                        eyVar.f37127r3 = true;
                        Activity parentActivity = eyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.o2) eyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        eyVar.f37085j0.setVisibility(8);
                        yw ywVar = eyVar.G3;
                        if (ywVar != null) {
                            ywVar.setVisibility(8);
                        }
                    } else {
                        eyVar.f37133s3 = false;
                        nx nxVar = eyVar.C0;
                        if (nxVar != null) {
                            nxVar.setVisibility(8);
                        }
                        tx txVar = eyVar.X;
                        if (txVar != null) {
                            txVar.c();
                        }
                        nx nxVar2 = eyVar.C0;
                        if (nxVar2 != null) {
                            nxVar2.A0.clear();
                            nxVar2.J();
                        }
                        zx zxVar = eyVar.f37059e0[0].f36750a;
                        if (zxVar.f28691g1) {
                            zxVar.f28691g1 = false;
                            zxVar.K0(false);
                        }
                        eyVar.f37127r3 = false;
                        yw ywVar2 = eyVar.G3;
                        if (ywVar2 != null) {
                            ywVar2.setVisibility(0);
                        }
                    }
                    View view = eyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    eyVar.B4(f7);
                    eyVar.f37059e0[0].f36750a.setVerticalScrollBarEnabled(true);
                    nx nxVar3 = eyVar.C0;
                    if (nxVar3 != null) {
                        nxVar3.setBackground(null);
                    }
                    eyVar.f37152w1 = null;
                    return;
                }
                return;
            case 1:
                ey eyVar2 = this.f37033c;
                eyVar2.P3 = null;
                if (!this.f37032b && (u0Var = eyVar2.m0) != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                ey eyVar3 = this.f37033c;
                eyVar3.I = null;
                boolean z11 = this.f37032b;
                eyVar3.K = z11;
                if (!z11 && !eyVar3.L) {
                    eyVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    eyVar3.A4(0.0f);
                    eyVar3.y3 = AndroidUtilities.dp(81.0f);
                } else {
                    eyVar3.y3 = -AndroidUtilities.dp(81.0f);
                    eyVar3.A4(-eyVar3.S3());
                }
                int i11 = 0;
                while (true) {
                    dy[] dyVarArr = eyVar3.f37059e0;
                    if (i11 < dyVarArr.length) {
                        dy dyVar = dyVarArr[i11];
                        if (dyVar != null) {
                            dyVar.f36750a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = eyVar3.fragmentView;
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
