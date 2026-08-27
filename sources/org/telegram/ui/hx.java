package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class hx extends AnimatorListenerAdapter {

    public final int f38901a;

    public final boolean f38902b;

    public final gy f38903c;

    public hx(gy gyVar, boolean z10, int i10) {
        this.f38901a = i10;
        this.f38903c = gyVar;
        this.f38902b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38901a) {
            case 0:
                gy gyVar = this.f38903c;
                gyVar.f38553k3.unlock();
                if (gyVar.f38592s1 == animator) {
                    if (this.f38902b) {
                        gyVar.f38498a0[0].f38225a.c1();
                    } else {
                        cy cyVar = gyVar.f38498a0[0].f38225a;
                        if (cyVar.f35263e1) {
                            cyVar.f35263e1 = false;
                            cyVar.J0(false);
                        }
                    }
                    gyVar.f38592s1 = null;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.v0 v0Var;
        switch (this.f38901a) {
            case 0:
                gy gyVar = this.f38903c;
                gyVar.f38553k3.unlock();
                if (gyVar.f38592s1 == animator) {
                    gyVar.A4(false, true);
                    boolean z10 = this.f38902b;
                    if (z10) {
                        gyVar.f38498a0[0].f38225a.c1();
                        yw ywVar = gyVar.A0;
                        if (ywVar != null) {
                            ywVar.setVisibility(8);
                        }
                        gyVar.f38561m3 = true;
                        AndroidUtilities.requestAdjustResize(gyVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) gyVar).classGuid);
                        gyVar.f38525f0.setVisibility(8);
                        bx bxVar = gyVar.B3;
                        if (bxVar != null) {
                            bxVar.setVisibility(8);
                        }
                    } else {
                        gyVar.f38567n3 = false;
                        px pxVar = gyVar.f38619y0;
                        if (pxVar != null) {
                            pxVar.setVisibility(8);
                        }
                        vx vxVar = gyVar.T;
                        if (vxVar != null) {
                            vxVar.c();
                        }
                        px pxVar2 = gyVar.f38619y0;
                        if (pxVar2 != null) {
                            pxVar2.f29763w0.clear();
                            pxVar2.J();
                        }
                        cy cyVar = gyVar.f38498a0[0].f38225a;
                        if (cyVar.f35263e1) {
                            cyVar.f35263e1 = false;
                            cyVar.J0(false);
                        }
                        gyVar.f38561m3 = false;
                        bx bxVar2 = gyVar.B3;
                        if (bxVar2 != null) {
                            bxVar2.setVisibility(0);
                        }
                    }
                    View view = gyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    gyVar.D4(z10 ? 1.0f : 0.0f);
                    gyVar.f38498a0[0].f38225a.setVerticalScrollBarEnabled(true);
                    px pxVar3 = gyVar.f38619y0;
                    if (pxVar3 != null) {
                        pxVar3.setBackground(null);
                    }
                    gyVar.f38592s1 = null;
                    break;
                }
                break;
            case 1:
                gy gyVar2 = this.f38903c;
                gyVar2.L3 = null;
                if (!this.f38902b && (v0Var = gyVar2.f38540i0) != null) {
                    v0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                gy gyVar3 = this.f38903c;
                gyVar3.E = null;
                boolean z11 = this.f38902b;
                gyVar3.G = z11;
                if (!z11 && !gyVar3.H) {
                    gyVar3.A0.setVisibility(8);
                }
                if (z11) {
                    gyVar3.f38599t3 = -AndroidUtilities.dp(81.0f);
                    gyVar3.C4(-gyVar3.U3());
                } else {
                    gyVar3.C4(0.0f);
                    gyVar3.f38599t3 = AndroidUtilities.dp(81.0f);
                }
                int i10 = 0;
                while (true) {
                    fy[] fyVarArr = gyVar3.f38498a0;
                    if (i10 >= fyVarArr.length) {
                        View view2 = gyVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                        }
                    } else {
                        fy fyVar = fyVarArr[i10];
                        if (fyVar != null) {
                            fyVar.f38225a.requestLayout();
                        }
                        i10++;
                    }
                    break;
                }
                break;
        }
    }
}
