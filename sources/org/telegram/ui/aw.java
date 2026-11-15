package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
public final class aw extends AnimatorListenerAdapter {
    public final int f45515a;
    public final boolean f45516b;
    public final yw f45517c;

    public aw(yw ywVar, boolean z10, int i7) {
        this.f45515a = i7;
        this.f45517c = ywVar;
        this.f45516b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45515a) {
            case 0:
                yw ywVar = this.f45517c;
                ywVar.f53698r3.e();
                if (ywVar.f53735y1 == animator) {
                    if (this.f45516b) {
                        ywVar.f53638f0[0].f53335a.c1();
                    } else {
                        uw uwVar = ywVar.f53638f0[0].f53335a;
                        if (uwVar.f40056h1) {
                            uwVar.f40056h1 = false;
                            uwVar.K0(false);
                        }
                    }
                    ywVar.f53735y1 = null;
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
        switch (this.f45515a) {
            case 0:
                yw ywVar = this.f45517c;
                ywVar.f53698r3.e();
                if (ywVar.f53735y1 == animator) {
                    ywVar.M4(false, true);
                    boolean z10 = this.f45516b;
                    if (z10) {
                        ywVar.f53638f0[0].f53335a.c1();
                        qv qvVar = ywVar.F0;
                        if (qvVar != null) {
                            qvVar.setVisibility(8);
                        }
                        ywVar.f53709t3 = true;
                        Activity parentActivity = ywVar.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.e2) ywVar).classGuid;
                        org.telegram.messenger.g0.a3(parentActivity, i7);
                        ywVar.f53662k0.setVisibility(8);
                        uv uvVar = ywVar.H3;
                        if (uvVar != null) {
                            uvVar.setVisibility(8);
                        }
                    } else {
                        ywVar.f53714u3 = false;
                        hw hwVar = ywVar.D0;
                        if (hwVar != null) {
                            hwVar.setVisibility(8);
                        }
                        nw nwVar = ywVar.Y;
                        if (nwVar != null) {
                            nwVar.c();
                        }
                        hw hwVar2 = ywVar.D0;
                        if (hwVar2 != null) {
                            hwVar2.D0.clear();
                            hwVar2.J();
                        }
                        uw uwVar = ywVar.f53638f0[0].f53335a;
                        if (uwVar.f40056h1) {
                            uwVar.f40056h1 = false;
                            uwVar.K0(false);
                        }
                        ywVar.f53709t3 = false;
                        uv uvVar2 = ywVar.H3;
                        if (uvVar2 != null) {
                            uvVar2.setVisibility(0);
                        }
                    }
                    View view = ywVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ywVar.P4(f10);
                    ywVar.f53638f0[0].f53335a.setVerticalScrollBarEnabled(true);
                    hw hwVar3 = ywVar.D0;
                    if (hwVar3 != null) {
                        hwVar3.setBackground(null);
                    }
                    ywVar.f53735y1 = null;
                    return;
                }
                return;
            case 1:
                yw ywVar2 = this.f45517c;
                ywVar2.Q3 = null;
                if (!this.f45516b && (q0Var = ywVar2.f53676n0) != null) {
                    q0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                yw ywVar3 = this.f45517c;
                ywVar3.J = null;
                boolean z11 = this.f45516b;
                ywVar3.L = z11;
                if (!z11 && !ywVar3.M) {
                    ywVar3.F0.setVisibility(8);
                }
                if (!z11) {
                    ywVar3.O4(0.0f);
                    ywVar3.A3 = org.telegram.messenger.g0.L(81.0f);
                } else {
                    ywVar3.A3 = -org.telegram.messenger.g0.L(81.0f);
                    ywVar3.O4(-ywVar3.g4());
                }
                int i10 = 0;
                while (true) {
                    xw[] xwVarArr = ywVar3.f53638f0;
                    if (i10 < xwVarArr.length) {
                        xw xwVar = xwVarArr[i10];
                        if (xwVar != null) {
                            xwVar.f53335a.requestLayout();
                        }
                        i10++;
                    } else {
                        View view2 = ywVar3.fragmentView;
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
