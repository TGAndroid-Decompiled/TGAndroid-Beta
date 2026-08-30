package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class px extends AnimatorListenerAdapter {
    public final int f37548a;
    public final boolean f37549b;
    public final oy f37550c;

    public px(oy oyVar, boolean z4, int i10) {
        this.f37548a = i10;
        this.f37550c = oyVar;
        this.f37549b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37548a) {
            case 0:
                oy oyVar = this.f37550c;
                oyVar.f37062l3.unlock();
                if (oyVar.f37102t1 == animator) {
                    if (this.f37549b) {
                        oyVar.f37009b0[0].f36741a.c1();
                    } else {
                        ky kyVar = oyVar.f37009b0[0].f36741a;
                        if (kyVar.f28736f1) {
                            kyVar.f28736f1 = false;
                            kyVar.J0(false);
                        }
                    }
                    oyVar.f37102t1 = null;
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
        int i10;
        org.telegram.ui.ActionBar.w0 w0Var;
        switch (this.f37548a) {
            case 0:
                oy oyVar = this.f37550c;
                oyVar.f37062l3.unlock();
                if (oyVar.f37102t1 == animator) {
                    oyVar.A4(false, true);
                    boolean z4 = this.f37549b;
                    if (z4) {
                        oyVar.f37009b0[0].f36741a.c1();
                        gx gxVar = oyVar.B0;
                        if (gxVar != null) {
                            gxVar.setVisibility(8);
                        }
                        oyVar.f37072n3 = true;
                        Activity parentActivity = oyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.p2) oyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        oyVar.f37035g0.setVisibility(8);
                        jx jxVar = oyVar.C3;
                        if (jxVar != null) {
                            jxVar.setVisibility(8);
                        }
                    } else {
                        oyVar.f37077o3 = false;
                        xx xxVar = oyVar.f37129z0;
                        if (xxVar != null) {
                            xxVar.setVisibility(8);
                        }
                        ey eyVar = oyVar.U;
                        if (eyVar != null) {
                            eyVar.c();
                        }
                        xx xxVar2 = oyVar.f37129z0;
                        if (xxVar2 != null) {
                            xxVar2.f24339x0.clear();
                            xxVar2.J();
                        }
                        ky kyVar = oyVar.f37009b0[0].f36741a;
                        if (kyVar.f28736f1) {
                            kyVar.f28736f1 = false;
                            kyVar.J0(false);
                        }
                        oyVar.f37072n3 = false;
                        jx jxVar2 = oyVar.C3;
                        if (jxVar2 != null) {
                            jxVar2.setVisibility(0);
                        }
                    }
                    View view = oyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z4) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    oyVar.D4(f10);
                    oyVar.f37009b0[0].f36741a.setVerticalScrollBarEnabled(true);
                    xx xxVar3 = oyVar.f37129z0;
                    if (xxVar3 != null) {
                        xxVar3.setBackground(null);
                    }
                    oyVar.f37102t1 = null;
                    return;
                }
                return;
            case 1:
                oy oyVar2 = this.f37550c;
                oyVar2.M3 = null;
                if (!this.f37549b && (w0Var = oyVar2.f37050j0) != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                oy oyVar3 = this.f37550c;
                oyVar3.F = null;
                boolean z10 = this.f37549b;
                oyVar3.H = z10;
                if (!z10 && !oyVar3.I) {
                    oyVar3.B0.setVisibility(8);
                }
                if (!z10) {
                    oyVar3.C4(0.0f);
                    oyVar3.f37109u3 = AndroidUtilities.dp(81.0f);
                } else {
                    oyVar3.f37109u3 = -AndroidUtilities.dp(81.0f);
                    oyVar3.C4(-oyVar3.U3());
                }
                int i11 = 0;
                while (true) {
                    ny[] nyVarArr = oyVar3.f37009b0;
                    if (i11 < nyVarArr.length) {
                        ny nyVar = nyVarArr[i11];
                        if (nyVar != null) {
                            nyVar.f36741a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = oyVar3.fragmentView;
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
