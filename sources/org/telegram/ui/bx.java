package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class bx extends AnimatorListenerAdapter {
    public final int f38117a;
    public final boolean f38118b;
    public final ey f38119c;

    public bx(ey eyVar, boolean z10, int i10) {
        this.f38117a = i10;
        this.f38119c = eyVar;
        this.f38118b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38117a) {
            case 0:
                ey eyVar = this.f38119c;
                eyVar.f39055p3.unlock();
                if (eyVar.f39091w1 == animator) {
                    if (this.f38118b) {
                        eyVar.f38998e0[0].f38702a.c1();
                    } else {
                        zx zxVar = eyVar.f38998e0[0].f38702a;
                        if (zxVar.f30974g1) {
                            zxVar.f30974g1 = false;
                            zxVar.K0(false);
                        }
                    }
                    eyVar.f39091w1 = null;
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
        org.telegram.ui.ActionBar.w0 w0Var;
        switch (this.f38117a) {
            case 0:
                ey eyVar = this.f38119c;
                eyVar.f39055p3.unlock();
                if (eyVar.f39091w1 == animator) {
                    eyVar.I4(false, true);
                    boolean z10 = this.f38118b;
                    if (z10) {
                        eyVar.f38998e0[0].f38702a.c1();
                        sw swVar = eyVar.E0;
                        if (swVar != null) {
                            swVar.setVisibility(8);
                        }
                        eyVar.f39066r3 = true;
                        Activity parentActivity = eyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.r2) eyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        eyVar.f39024j0.setVisibility(8);
                        vw vwVar = eyVar.G3;
                        if (vwVar != null) {
                            vwVar.setVisibility(8);
                        }
                    } else {
                        eyVar.f39072s3 = false;
                        mx mxVar = eyVar.C0;
                        if (mxVar != null) {
                            mxVar.setVisibility(8);
                        }
                        rx rxVar = eyVar.X;
                        if (rxVar != null) {
                            rxVar.c();
                        }
                        mx mxVar2 = eyVar.C0;
                        if (mxVar2 != null) {
                            mxVar2.C0.clear();
                            mxVar2.L();
                        }
                        zx zxVar = eyVar.f38998e0[0].f38702a;
                        if (zxVar.f30974g1) {
                            zxVar.f30974g1 = false;
                            zxVar.K0(false);
                        }
                        eyVar.f39066r3 = false;
                        vw vwVar2 = eyVar.G3;
                        if (vwVar2 != null) {
                            vwVar2.setVisibility(0);
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
                    eyVar.L4(f7);
                    eyVar.f38998e0[0].f38702a.setVerticalScrollBarEnabled(true);
                    mx mxVar3 = eyVar.C0;
                    if (mxVar3 != null) {
                        mxVar3.setBackground(null);
                    }
                    eyVar.f39091w1 = null;
                    return;
                }
                return;
            case 1:
                ey eyVar2 = this.f38119c;
                eyVar2.P3 = null;
                if (!this.f38118b && (w0Var = eyVar2.m0) != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                ey eyVar3 = this.f38119c;
                eyVar3.I = null;
                boolean z11 = this.f38118b;
                eyVar3.K = z11;
                if (!z11 && !eyVar3.L) {
                    eyVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    eyVar3.K4(0.0f);
                    eyVar3.y3 = AndroidUtilities.dp(81.0f);
                } else {
                    eyVar3.y3 = -AndroidUtilities.dp(81.0f);
                    eyVar3.K4(-eyVar3.c4());
                }
                int i11 = 0;
                while (true) {
                    dy[] dyVarArr = eyVar3.f38998e0;
                    if (i11 < dyVarArr.length) {
                        dy dyVar = dyVarArr[i11];
                        if (dyVar != null) {
                            dyVar.f38702a.requestLayout();
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
