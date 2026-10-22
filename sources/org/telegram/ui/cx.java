package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class cx extends AnimatorListenerAdapter {
    public final int f36066a;
    public final boolean f36067b;
    public final cy f36068c;

    public cx(cy cyVar, boolean z10, int i10) {
        this.f36066a = i10;
        this.f36068c = cyVar;
        this.f36067b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36066a) {
            case 0:
                cy cyVar = this.f36068c;
                cyVar.f36152p3.unlock();
                if (cyVar.f36188w1 == animator) {
                    if (this.f36067b) {
                        cyVar.f36095e0[0].f35446a.c1();
                    } else {
                        xx xxVar = cyVar.f36095e0[0].f35446a;
                        if (xxVar.f27568g1) {
                            xxVar.f27568g1 = false;
                            xxVar.K0(false);
                        }
                    }
                    cyVar.f36188w1 = null;
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
        switch (this.f36066a) {
            case 0:
                cy cyVar = this.f36068c;
                cyVar.f36152p3.unlock();
                if (cyVar.f36188w1 == animator) {
                    cyVar.y4(false, true);
                    boolean z10 = this.f36067b;
                    if (z10) {
                        cyVar.f36095e0[0].f35446a.c1();
                        tw twVar = cyVar.E0;
                        if (twVar != null) {
                            twVar.setVisibility(8);
                        }
                        cyVar.f36163r3 = true;
                        Activity parentActivity = cyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) cyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        cyVar.f36121j0.setVisibility(8);
                        ww wwVar = cyVar.G3;
                        if (wwVar != null) {
                            wwVar.setVisibility(8);
                        }
                    } else {
                        cyVar.f36169s3 = false;
                        lx lxVar = cyVar.C0;
                        if (lxVar != null) {
                            lxVar.setVisibility(8);
                        }
                        rx rxVar = cyVar.X;
                        if (rxVar != null) {
                            rxVar.c();
                        }
                        lx lxVar2 = cyVar.C0;
                        if (lxVar2 != null) {
                            lxVar2.A0.clear();
                            lxVar2.J();
                        }
                        xx xxVar = cyVar.f36095e0[0].f35446a;
                        if (xxVar.f27568g1) {
                            xxVar.f27568g1 = false;
                            xxVar.K0(false);
                        }
                        cyVar.f36163r3 = false;
                        ww wwVar2 = cyVar.G3;
                        if (wwVar2 != null) {
                            wwVar2.setVisibility(0);
                        }
                    }
                    View view = cyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    cyVar.B4(f7);
                    cyVar.f36095e0[0].f35446a.setVerticalScrollBarEnabled(true);
                    lx lxVar3 = cyVar.C0;
                    if (lxVar3 != null) {
                        lxVar3.setBackground(null);
                    }
                    cyVar.f36188w1 = null;
                    return;
                }
                return;
            case 1:
                cy cyVar2 = this.f36068c;
                cyVar2.P3 = null;
                if (!this.f36067b && (u0Var = cyVar2.m0) != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                cy cyVar3 = this.f36068c;
                cyVar3.I = null;
                boolean z11 = this.f36067b;
                cyVar3.K = z11;
                if (!z11 && !cyVar3.L) {
                    cyVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    cyVar3.A4(0.0f);
                    cyVar3.y3 = AndroidUtilities.dp(81.0f);
                } else {
                    cyVar3.y3 = -AndroidUtilities.dp(81.0f);
                    cyVar3.A4(-cyVar3.S3());
                }
                int i11 = 0;
                while (true) {
                    ay[] ayVarArr = cyVar3.f36095e0;
                    if (i11 < ayVarArr.length) {
                        ay ayVar = ayVarArr[i11];
                        if (ayVar != null) {
                            ayVar.f35446a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = cyVar3.fragmentView;
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
