package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
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
                na1.Y((na1) this.R);
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
                qh.c8 c8Var = (qh.c8) this.R;
                if (qh.c8.d0(c8Var)) {
                    c8Var.f1();
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
                na1 na1Var = (na1) this.R;
                na1Var.m0(na1Var.f39258f0.getCurrentPosition(), true);
                na1Var.n0(0.0f, false);
                na1.W(na1Var);
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
        o31 o31Var;
        switch (this.Q) {
            case 3:
                if ((getCurrentView() instanceof p31) && (o31Var = ((p31) getCurrentView()).f39877n) != null) {
                    AndroidUtilities.hideKeyboard(o31Var);
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
                np0 np0Var = (np0) this.R;
                float positionAnimated = np0Var.F.getPositionAnimated();
                np0Var.J.setSelected(positionAnimated);
                np0Var.f39429e.setProgressToGradient(1.0f - k7.o.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                np0Var.G0();
                hp0 C0 = np0Var.C0();
                qh.d dVar = np0Var.N;
                if (dVar != null && C0 != null && C0 != np0Var.O) {
                    np0Var.O = C0;
                    n7.qa qaVar = C0.f37448e;
                    dVar.g((CharSequence) qaVar.f15701b, true, true);
                    np0Var.N.f((SpannableStringBuilder) qaVar.f15702c, true);
                }
                np0Var.D0(1);
                return;
            case 2:
                ((yv0) this.R).e();
                return;
            case 3:
                q31.o((q31) this.R).invalidate();
                return;
            case 4:
                na1 na1Var = (na1) this.R;
                float positionAnimated2 = na1Var.f39258f0.getPositionAnimated();
                na1Var.n0(positionAnimated2, !z4);
                if (!z4) {
                    na1Var.m0(Math.round(positionAnimated2), true);
                }
                na1.W(na1Var);
                na1.Y(na1Var);
                return;
            case 5:
                ((zd1) this.R).e();
                return;
            case 6:
                qh.x1 x1Var = (qh.x1) this.R;
                ek ekVar = x1Var.f46301f;
                qh.w1 w1Var = x1Var.h;
                if (w1Var != null) {
                    w1Var.C = ekVar.getPositionAnimated();
                    w1Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.h3) x1Var).containerView;
                viewGroup.invalidate();
                invalidate();
                qh.x1.D = ekVar.getCurrentPosition();
                return;
            case 7:
                qh.c8.c0((qh.c8) this.R).invalidate();
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
                    if (xnVar.f43280p1) {
                        xnVar.f43280p1 = false;
                        xnVar.f43256n1.h.clear();
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
