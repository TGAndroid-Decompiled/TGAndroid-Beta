package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class ek extends org.telegram.ui.Components.l81 {
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
                ga1.Y((ga1) this.R);
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
                ph.f8 f8Var = (ph.f8) this.R;
                if (ph.f8.d0(f8Var)) {
                    f8Var.f1();
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
                ga1 ga1Var = (ga1) this.R;
                ga1Var.m0(ga1Var.f34536f0.getCurrentPosition(), true);
                ga1Var.n0(0.0f, false);
                ga1.W(ga1Var);
                return;
            case 8:
                if (getCurrentPosition() == 1) {
                    ((sh.i0) this.R).v.d.V2.N(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        h31 h31Var;
        switch (this.Q) {
            case 3:
                if ((getCurrentView() instanceof j31) && (h31Var = ((j31) getCurrentView()).f35220n) != null) {
                    AndroidUtilities.hideKeyboard(h31Var);
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
                gp0 gp0Var = (gp0) this.R;
                gp0Var.E.setSelected(gp0Var.f34662y.getPositionAnimated());
                gp0Var.e.setProgressToGradient(1.0f - gp0Var.f34662y.getPositionAnimated());
                return;
            case 2:
                ((rv0) this.R).e();
                return;
            case 3:
                k31.o((k31) this.R).invalidate();
                return;
            case 4:
                ga1 ga1Var = (ga1) this.R;
                float positionAnimated = ga1Var.f34536f0.getPositionAnimated();
                ga1Var.n0(positionAnimated, !z4);
                if (!z4) {
                    ga1Var.m0(Math.round(positionAnimated), true);
                }
                ga1.W(ga1Var);
                ga1.Y(ga1Var);
                return;
            case 5:
                ((rd1) this.R).e();
                return;
            case 6:
                ph.y1 y1Var = (ph.y1) this.R;
                ek ekVar = y1Var.f42605f;
                ph.x1 x1Var = y1Var.h;
                if (x1Var != null) {
                    x1Var.C = ekVar.getPositionAnimated();
                    x1Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.g3) y1Var).containerView;
                viewGroup.invalidate();
                invalidate();
                ph.y1.D = ekVar.getCurrentPosition();
                return;
            case 7:
                ph.f8.c0((ph.f8) this.R).invalidate();
                return;
            default:
                sh.i0.s((sh.i0) this.R).invalidate();
                return;
        }
    }

    @Override
    public void z(int i10) {
        switch (this.Q) {
            case 0:
                if (i10 == 0) {
                    xn xnVar = (xn) this.R;
                    if (xnVar.f40133p1) {
                        xnVar.f40133p1 = false;
                        xnVar.f40109n1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public ek(Context context, org.telegram.ui.ActionBar.f6 f6Var, xn xnVar) {
        super(context, f6Var);
        this.Q = 0;
        this.R = xnVar;
    }
}
