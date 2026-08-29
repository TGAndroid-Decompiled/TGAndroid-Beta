package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gx extends AnimatorListenerAdapter {
    public final int f38683a;
    public final boolean f38684b;
    public final fy f38685c;

    public gx(fy fyVar, boolean z10, int i10) {
        this.f38683a = i10;
        this.f38685c = fyVar;
        this.f38684b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38683a) {
            case 0:
                fy fyVar = this.f38685c;
                fyVar.f38311k3.unlock();
                if (fyVar.f38350s1 == animator) {
                    if (this.f38684b) {
                        fyVar.f38256a0[0].f37921a.c1();
                    } else {
                        ay ayVar = fyVar.f38256a0[0].f37921a;
                        if (ayVar.f29695e1) {
                            ayVar.f29695e1 = false;
                            ayVar.J0(false);
                        }
                    }
                    fyVar.f38350s1 = null;
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
        float f9;
        int i10;
        org.telegram.ui.ActionBar.w0 w0Var;
        switch (this.f38683a) {
            case 0:
                fy fyVar = this.f38685c;
                fyVar.f38311k3.unlock();
                if (fyVar.f38350s1 == animator) {
                    fyVar.A4(false, true);
                    boolean z10 = this.f38684b;
                    if (z10) {
                        fyVar.f38256a0[0].f37921a.c1();
                        xw xwVar = fyVar.A0;
                        if (xwVar != null) {
                            xwVar.setVisibility(8);
                        }
                        fyVar.f38319m3 = true;
                        Activity parentActivity = fyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.o2) fyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        fyVar.f38283f0.setVisibility(8);
                        ax axVar = fyVar.B3;
                        if (axVar != null) {
                            axVar.setVisibility(8);
                        }
                    } else {
                        fyVar.f38325n3 = false;
                        ox oxVar = fyVar.f38377y0;
                        if (oxVar != null) {
                            oxVar.setVisibility(8);
                        }
                        ux uxVar = fyVar.T;
                        if (uxVar != null) {
                            uxVar.c();
                        }
                        ox oxVar2 = fyVar.f38377y0;
                        if (oxVar2 != null) {
                            oxVar2.f33009w0.clear();
                            oxVar2.J();
                        }
                        ay ayVar = fyVar.f38256a0[0].f37921a;
                        if (ayVar.f29695e1) {
                            ayVar.f29695e1 = false;
                            ayVar.J0(false);
                        }
                        fyVar.f38319m3 = false;
                        ax axVar2 = fyVar.B3;
                        if (axVar2 != null) {
                            axVar2.setVisibility(0);
                        }
                    }
                    View view = fyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    fyVar.D4(f9);
                    fyVar.f38256a0[0].f37921a.setVerticalScrollBarEnabled(true);
                    ox oxVar3 = fyVar.f38377y0;
                    if (oxVar3 != null) {
                        oxVar3.setBackground(null);
                    }
                    fyVar.f38350s1 = null;
                    return;
                }
                return;
            case 1:
                fy fyVar2 = this.f38685c;
                fyVar2.L3 = null;
                if (!this.f38684b && (w0Var = fyVar2.f38298i0) != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                fy fyVar3 = this.f38685c;
                fyVar3.E = null;
                boolean z11 = this.f38684b;
                fyVar3.G = z11;
                if (!z11 && !fyVar3.H) {
                    fyVar3.A0.setVisibility(8);
                }
                if (!z11) {
                    fyVar3.C4(0.0f);
                    fyVar3.f38357t3 = AndroidUtilities.dp(81.0f);
                } else {
                    fyVar3.f38357t3 = -AndroidUtilities.dp(81.0f);
                    fyVar3.C4(-fyVar3.U3());
                }
                int i11 = 0;
                while (true) {
                    ey[] eyVarArr = fyVar3.f38256a0;
                    if (i11 < eyVarArr.length) {
                        ey eyVar = eyVarArr[i11];
                        if (eyVar != null) {
                            eyVar.f37921a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = fyVar3.fragmentView;
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
