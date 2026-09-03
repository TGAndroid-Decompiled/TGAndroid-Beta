package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class gk extends org.telegram.ui.Components.l81 {
    public final int Q;
    public final Object R;

    public gk(Object obj, Context context, int i10) {
        super(context, null);
        this.Q = i10;
        this.R = obj;
    }

    @Override
    public boolean i(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gk.i(android.view.MotionEvent):boolean");
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
                oa1.Y((oa1) this.R);
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
                ph.e8 e8Var = (ph.e8) this.R;
                if (ph.e8.d0(e8Var)) {
                    e8Var.f1();
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
                oa1 oa1Var = (oa1) this.R;
                oa1Var.m0(oa1Var.f36720f0.getCurrentPosition(), true);
                oa1Var.n0(0.0f, false);
                oa1.W(oa1Var);
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
        o31 o31Var;
        switch (this.Q) {
            case 3:
                if ((getCurrentView() instanceof p31) && (o31Var = ((p31) getCurrentView()).f36933n) != null) {
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
                zn znVar = (zn) this.R;
                znVar.U0.getClass();
                znVar.U0.getClass();
                znVar.l7();
                znVar.q9(1);
                return;
            case 1:
                np0 np0Var = (np0) this.R;
                float positionAnimated = np0Var.F.getPositionAnimated();
                np0Var.J.setSelected(positionAnimated);
                np0Var.e.setProgressToGradient(1.0f - k7.n.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                np0Var.G0();
                hp0 C0 = np0Var.C0();
                ph.d dVar = np0Var.N;
                if (dVar != null && C0 != null && C0 != np0Var.O) {
                    np0Var.O = C0;
                    n7.qa qaVar = C0.e;
                    dVar.g((CharSequence) qaVar.f14687b, true, true);
                    np0Var.N.f((SpannableStringBuilder) qaVar.f14688c, true);
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
                oa1 oa1Var = (oa1) this.R;
                float positionAnimated2 = oa1Var.f36720f0.getPositionAnimated();
                oa1Var.n0(positionAnimated2, !z4);
                if (!z4) {
                    oa1Var.m0(Math.round(positionAnimated2), true);
                }
                oa1.W(oa1Var);
                oa1.Y(oa1Var);
                return;
            case 5:
                ((yd1) this.R).e();
                return;
            case 6:
                ph.y1 y1Var = (ph.y1) this.R;
                gk gkVar = y1Var.f42642f;
                ph.x1 x1Var = y1Var.h;
                if (x1Var != null) {
                    x1Var.C = gkVar.getPositionAnimated();
                    x1Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.g3) y1Var).containerView;
                viewGroup.invalidate();
                invalidate();
                ph.y1.D = gkVar.getCurrentPosition();
                return;
            case 7:
                ph.e8.c0((ph.e8) this.R).invalidate();
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
                    zn znVar = (zn) this.R;
                    if (znVar.f40699p1) {
                        znVar.f40699p1 = false;
                        znVar.f40675n1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public gk(Context context, org.telegram.ui.ActionBar.f6 f6Var, zn znVar) {
        super(context, f6Var);
        this.Q = 0;
        this.R = znVar;
    }
}
