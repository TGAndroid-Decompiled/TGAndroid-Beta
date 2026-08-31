package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class ek extends org.telegram.ui.Components.m81 {
    public final int Q;
    public final Object R;

    public ek(Object obj, Context context, int i10) {
        super(context, null);
        this.Q = i10;
        this.R = obj;
    }

    @Override
    public boolean i(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ek.i(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean j(MotionEvent motionEvent) {
        switch (this.Q) {
            case 8:
                if (getCurrentPosition() != 2) {
                    return true;
                }
                return false;
            default:
                return super.j(motionEvent);
        }
    }

    @Override
    public boolean k(MotionEvent motionEvent) {
        switch (this.Q) {
            case 3:
                return false;
            case 8:
                return false;
            default:
                return super.k(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.Q) {
            case 4:
                super.onLayout(z4, i10, i11, i12, i13);
                ha1.Y((ha1) this.R);
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.Q) {
            case 0:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void t(View view, View view2, int i10, int i11) {
        switch (this.Q) {
            case 7:
                qh.d8 d8Var = (qh.d8) this.R;
                if (qh.d8.d0(d8Var)) {
                    d8Var.f1();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void u() {
        switch (this.Q) {
            case 4:
                ha1 ha1Var = (ha1) this.R;
                ha1Var.m0(ha1Var.f37426f0.getCurrentPosition(), true);
                ha1Var.n0(0.0f, false);
                ha1.W(ha1Var);
                return;
            case 8:
                if (getCurrentPosition() == 1) {
                    ((th.i0) this.R).v.d.V2.N(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        j31 j31Var;
        switch (this.Q) {
            case 3:
                if ((getCurrentView() instanceof l31) && (j31Var = ((l31) getCurrentView()).f38576n) != null) {
                    AndroidUtilities.hideKeyboard(j31Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(boolean z4) {
        ViewGroup viewGroup;
        switch (this.Q) {
            case 0:
                xn xnVar = (xn) this.R;
                xnVar.U0.getClass();
                xnVar.U0.getClass();
                xnVar.l7();
                xnVar.q9(1);
                return;
            case 1:
                ip0 ip0Var = (ip0) this.R;
                ip0Var.E.setSelected(ip0Var.f37914y.getPositionAnimated());
                ip0Var.f37907e.setProgressToGradient(1.0f - ip0Var.f37914y.getPositionAnimated());
                return;
            case 2:
                ((tv0) this.R).e();
                return;
            case 3:
                m31.o((m31) this.R).invalidate();
                return;
            case 4:
                ha1 ha1Var = (ha1) this.R;
                float positionAnimated = ha1Var.f37426f0.getPositionAnimated();
                ha1Var.n0(positionAnimated, !z4);
                if (!z4) {
                    ha1Var.m0(Math.round(positionAnimated), true);
                }
                ha1.W(ha1Var);
                ha1.Y(ha1Var);
                return;
            case 5:
                ((ud1) this.R).e();
                return;
            case 6:
                qh.y1 y1Var = (qh.y1) this.R;
                ek ekVar = y1Var.f46345f;
                qh.x1 x1Var = y1Var.h;
                if (x1Var != null) {
                    x1Var.C = ekVar.getPositionAnimated();
                    x1Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.h3) y1Var).containerView;
                viewGroup.invalidate();
                invalidate();
                qh.y1.D = ekVar.getCurrentPosition();
                return;
            case 7:
                qh.d8.c0((qh.d8) this.R).invalidate();
                return;
            default:
                th.i0.s((th.i0) this.R).invalidate();
                return;
        }
    }

    @Override
    public void z(int i10) {
        switch (this.Q) {
            case 0:
                if (i10 == 0) {
                    xn xnVar = (xn) this.R;
                    if (xnVar.f43302p1) {
                        xnVar.f43302p1 = false;
                        xnVar.f43278n1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public ek(Context context, org.telegram.ui.ActionBar.g6 g6Var, xn xnVar) {
        super(context, g6Var);
        this.Q = 0;
        this.R = xnVar;
    }
}
