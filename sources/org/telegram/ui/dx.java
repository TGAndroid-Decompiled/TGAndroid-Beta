package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
public final class dx extends AnimatorListenerAdapter {
    public final int f36855a;
    public final boolean f36856b;
    public final ay f36857c;

    public dx(ay ayVar, boolean z10, int i10) {
        this.f36855a = i10;
        this.f36857c = ayVar;
        this.f36856b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36855a) {
            case 0:
                ay ayVar = this.f36857c;
                ayVar.f35851p3.e();
                if (ayVar.f35887w1 == animator) {
                    if (this.f36856b) {
                        ayVar.f35794e0[0].f44239a.c1();
                    } else {
                        wx wxVar = ayVar.f35794e0[0].f44239a;
                        if (wxVar.f30611g1) {
                            wxVar.f30611g1 = false;
                            wxVar.K0(false);
                        }
                    }
                    ayVar.f35887w1 = null;
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
        switch (this.f36855a) {
            case 0:
                ay ayVar = this.f36857c;
                ayVar.f35851p3.e();
                if (ayVar.f35887w1 == animator) {
                    ayVar.L4(false, true);
                    boolean z10 = this.f36856b;
                    if (z10) {
                        ayVar.f35794e0[0].f44239a.c1();
                        uw uwVar = ayVar.E0;
                        if (uwVar != null) {
                            uwVar.setVisibility(8);
                        }
                        ayVar.f35862r3 = true;
                        Activity parentActivity = ayVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.k2) ayVar).classGuid;
                        org.telegram.messenger.i0.Z2(parentActivity, i10);
                        ayVar.f35820j0.setVisibility(8);
                        xw xwVar = ayVar.F3;
                        if (xwVar != null) {
                            xwVar.setVisibility(8);
                        }
                    } else {
                        ayVar.f35868s3 = false;
                        kx kxVar = ayVar.C0;
                        if (kxVar != null) {
                            kxVar.setVisibility(8);
                        }
                        px pxVar = ayVar.X;
                        if (pxVar != null) {
                            pxVar.c();
                        }
                        kx kxVar2 = ayVar.C0;
                        if (kxVar2 != null) {
                            kxVar2.C0.clear();
                            kxVar2.L();
                        }
                        wx wxVar = ayVar.f35794e0[0].f44239a;
                        if (wxVar.f30611g1) {
                            wxVar.f30611g1 = false;
                            wxVar.K0(false);
                        }
                        ayVar.f35862r3 = false;
                        xw xwVar2 = ayVar.F3;
                        if (xwVar2 != null) {
                            xwVar2.setVisibility(0);
                        }
                    }
                    View view = ayVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ayVar.O4(f7);
                    ayVar.f35794e0[0].f44239a.setVerticalScrollBarEnabled(true);
                    kx kxVar3 = ayVar.C0;
                    if (kxVar3 != null) {
                        kxVar3.setBackground(null);
                    }
                    ayVar.f35887w1 = null;
                    return;
                }
                return;
            case 1:
                ay ayVar2 = this.f36857c;
                ayVar2.O3 = null;
                if (!this.f36856b && (t0Var = ayVar2.m0) != null) {
                    t0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                ay ayVar3 = this.f36857c;
                ayVar3.I = null;
                boolean z11 = this.f36856b;
                ayVar3.K = z11;
                if (!z11 && !ayVar3.L) {
                    ayVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    ayVar3.N4(0.0f);
                    ayVar3.y3 = org.telegram.messenger.i0.L(81.0f);
                } else {
                    ayVar3.y3 = -org.telegram.messenger.i0.L(81.0f);
                    ayVar3.N4(-ayVar3.f4());
                }
                int i11 = 0;
                while (true) {
                    zx[] zxVarArr = ayVar3.f35794e0;
                    if (i11 < zxVarArr.length) {
                        zx zxVar = zxVarArr[i11];
                        if (zxVar != null) {
                            zxVar.f44239a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = ayVar3.fragmentView;
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
