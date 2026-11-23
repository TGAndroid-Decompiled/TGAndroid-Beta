package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
public final class cw extends AnimatorListenerAdapter {
    public final int f46885a;
    public final boolean f46886b;
    public final bx f46887c;

    public cw(bx bxVar, boolean z10, int i7) {
        this.f46885a = i7;
        this.f46887c = bxVar;
        this.f46886b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f46885a) {
            case 0:
                bx bxVar = this.f46887c;
                bxVar.f46609r3.e();
                if (bxVar.f46646y1 == animator) {
                    if (this.f46886b) {
                        bxVar.f46549f0[0].f45822a.c1();
                    } else {
                        xw xwVar = bxVar.f46549f0[0].f45822a;
                        if (xwVar.f34754h1) {
                            xwVar.f34754h1 = false;
                            xwVar.K0(false);
                        }
                    }
                    bxVar.f46646y1 = null;
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
        org.telegram.ui.ActionBar.q0 q0Var;
        switch (this.f46885a) {
            case 0:
                bx bxVar = this.f46887c;
                bxVar.f46609r3.e();
                if (bxVar.f46646y1 == animator) {
                    bxVar.U4(false, true);
                    boolean z10 = this.f46886b;
                    if (z10) {
                        bxVar.f46549f0[0].f45822a.c1();
                        sv svVar = bxVar.F0;
                        if (svVar != null) {
                            svVar.setVisibility(8);
                        }
                        bxVar.f46620t3 = true;
                        Activity parentActivity = bxVar.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.g2) bxVar).classGuid;
                        org.telegram.messenger.g0.Z2(parentActivity, i7);
                        bxVar.f46573k0.setVisibility(8);
                        wv wvVar = bxVar.H3;
                        if (wvVar != null) {
                            wvVar.setVisibility(8);
                        }
                    } else {
                        bxVar.f46625u3 = false;
                        jw jwVar = bxVar.D0;
                        if (jwVar != null) {
                            jwVar.setVisibility(8);
                        }
                        pw pwVar = bxVar.Y;
                        if (pwVar != null) {
                            pwVar.c();
                        }
                        jw jwVar2 = bxVar.D0;
                        if (jwVar2 != null) {
                            jwVar2.D0.clear();
                            jwVar2.J();
                        }
                        xw xwVar = bxVar.f46549f0[0].f45822a;
                        if (xwVar.f34754h1) {
                            xwVar.f34754h1 = false;
                            xwVar.K0(false);
                        }
                        bxVar.f46620t3 = false;
                        wv wvVar2 = bxVar.H3;
                        if (wvVar2 != null) {
                            wvVar2.setVisibility(0);
                        }
                    }
                    View view = bxVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    bxVar.X4(f10);
                    bxVar.f46549f0[0].f45822a.setVerticalScrollBarEnabled(true);
                    jw jwVar3 = bxVar.D0;
                    if (jwVar3 != null) {
                        jwVar3.setBackground(null);
                    }
                    bxVar.f46646y1 = null;
                    return;
                }
                return;
            case 1:
                bx bxVar2 = this.f46887c;
                bxVar2.T3 = null;
                if (!this.f46886b && (q0Var = bxVar2.f46587n0) != null) {
                    q0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                bx bxVar3 = this.f46887c;
                bxVar3.J = null;
                boolean z11 = this.f46886b;
                bxVar3.L = z11;
                if (!z11 && !bxVar3.M) {
                    bxVar3.F0.setVisibility(8);
                }
                if (!z11) {
                    bxVar3.W4(0.0f);
                    bxVar3.A3 = org.telegram.messenger.g0.L(81.0f);
                } else {
                    bxVar3.A3 = -org.telegram.messenger.g0.L(81.0f);
                    bxVar3.W4(-bxVar3.g4());
                }
                int i10 = 0;
                while (true) {
                    ax[] axVarArr = bxVar3.f46549f0;
                    if (i10 < axVarArr.length) {
                        ax axVar = axVarArr[i10];
                        if (axVar != null) {
                            axVar.f45822a.requestLayout();
                        }
                        i10++;
                    } else {
                        View view2 = bxVar3.fragmentView;
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
