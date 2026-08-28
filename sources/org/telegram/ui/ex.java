package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ex extends AnimatorListenerAdapter {
    public final int f38035a;
    public final boolean f38036b;
    public final dy f38037c;

    public ex(dy dyVar, boolean z10, int i9) {
        this.f38035a = i9;
        this.f38037c = dyVar;
        this.f38036b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38035a) {
            case 0:
                dy dyVar = this.f38037c;
                dyVar.f37684k3.unlock();
                if (dyVar.f37723s1 == animator) {
                    if (this.f38036b) {
                        dyVar.f37629a0[0].f37350a.c1();
                    } else {
                        yx yxVar = dyVar.f37629a0[0].f37350a;
                        if (yxVar.f34246e1) {
                            yxVar.f34246e1 = false;
                            yxVar.J0(false);
                        }
                    }
                    dyVar.f37723s1 = null;
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
        int i9;
        org.telegram.ui.ActionBar.w0 w0Var;
        switch (this.f38035a) {
            case 0:
                dy dyVar = this.f38037c;
                dyVar.f37684k3.unlock();
                if (dyVar.f37723s1 == animator) {
                    dyVar.A4(false, true);
                    boolean z10 = this.f38036b;
                    if (z10) {
                        dyVar.f37629a0[0].f37350a.c1();
                        vw vwVar = dyVar.A0;
                        if (vwVar != null) {
                            vwVar.setVisibility(8);
                        }
                        dyVar.f37692m3 = true;
                        Activity parentActivity = dyVar.getParentActivity();
                        i9 = ((org.telegram.ui.ActionBar.o2) dyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i9);
                        dyVar.f37656f0.setVisibility(8);
                        yw ywVar = dyVar.B3;
                        if (ywVar != null) {
                            ywVar.setVisibility(8);
                        }
                    } else {
                        dyVar.f37698n3 = false;
                        mx mxVar = dyVar.f37750y0;
                        if (mxVar != null) {
                            mxVar.setVisibility(8);
                        }
                        sx sxVar = dyVar.T;
                        if (sxVar != null) {
                            sxVar.c();
                        }
                        mx mxVar2 = dyVar.f37750y0;
                        if (mxVar2 != null) {
                            mxVar2.f29156w0.clear();
                            mxVar2.J();
                        }
                        yx yxVar = dyVar.f37629a0[0].f37350a;
                        if (yxVar.f34246e1) {
                            yxVar.f34246e1 = false;
                            yxVar.J0(false);
                        }
                        dyVar.f37692m3 = false;
                        yw ywVar2 = dyVar.B3;
                        if (ywVar2 != null) {
                            ywVar2.setVisibility(0);
                        }
                    }
                    View view = dyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    dyVar.D4(f10);
                    dyVar.f37629a0[0].f37350a.setVerticalScrollBarEnabled(true);
                    mx mxVar3 = dyVar.f37750y0;
                    if (mxVar3 != null) {
                        mxVar3.setBackground(null);
                    }
                    dyVar.f37723s1 = null;
                    return;
                }
                return;
            case 1:
                dy dyVar2 = this.f38037c;
                dyVar2.L3 = null;
                if (!this.f38036b && (w0Var = dyVar2.f37671i0) != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                dy dyVar3 = this.f38037c;
                dyVar3.E = null;
                boolean z11 = this.f38036b;
                dyVar3.G = z11;
                if (!z11 && !dyVar3.H) {
                    dyVar3.A0.setVisibility(8);
                }
                if (!z11) {
                    dyVar3.C4(0.0f);
                    dyVar3.f37730t3 = AndroidUtilities.dp(81.0f);
                } else {
                    dyVar3.f37730t3 = -AndroidUtilities.dp(81.0f);
                    dyVar3.C4(-dyVar3.U3());
                }
                int i10 = 0;
                while (true) {
                    cy[] cyVarArr = dyVar3.f37629a0;
                    if (i10 < cyVarArr.length) {
                        cy cyVar = cyVarArr[i10];
                        if (cyVar != null) {
                            cyVar.f37350a.requestLayout();
                        }
                        i10++;
                    } else {
                        View view2 = dyVar3.fragmentView;
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
