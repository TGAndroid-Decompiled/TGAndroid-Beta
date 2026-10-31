package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
public final class hk extends org.telegram.ui.Components.w71 {
    public final int V;
    public final Object W;

    public hk(Object obj, Context context, int i10) {
        super(context, null);
        this.V = i10;
        this.W = obj;
    }

    @Override
    public void A(int i10) {
        switch (this.V) {
            case 0:
                if (i10 == 0) {
                    un unVar = (un) this.W;
                    if (unVar.G1) {
                        unVar.G1 = false;
                        unVar.E1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public int H() {
        switch (this.V) {
            case 6:
                return 12;
            default:
                return super.H();
        }
    }

    @Override
    public boolean i(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hk.i(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean j(MotionEvent motionEvent) {
        switch (this.V) {
            case 9:
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
        switch (this.V) {
            case 3:
                return false;
            case 9:
                return false;
            default:
                return super.k(motionEvent);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.V) {
            case 0:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void t(View view, View view2, int i10, int i11) {
        switch (this.V) {
            case 8:
                vh.w6 w6Var = (vh.w6) this.W;
                if (w6Var.d) {
                    w6Var.M0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void u() {
        switch (this.V) {
            case 9:
                if (getCurrentPosition() == 1) {
                    ((yh.a0) this.W).f54449r1.d.f30819f3.O(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        zz0 zz0Var;
        switch (this.V) {
            case 3:
                if ((getCurrentView() instanceof b01) && (zz0Var = ((b01) getCurrentView()).f35923n) != null) {
                    org.telegram.messenger.i0.v1(zz0Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.V) {
            case 0:
                un unVar = (un) this.W;
                unVar.l1.getClass();
                unVar.l1.getClass();
                unVar.t7();
                return;
            case 1:
                tn0 tn0Var = (tn0) this.W;
                float positionAnimated = tn0Var.I.getPositionAnimated();
                tn0Var.M.setSelected(positionAnimated);
                tn0Var.e.setProgressToGradient(1.0f - w7.u.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                tn0Var.J0();
                nn0 G0 = tn0Var.G0();
                vh.d dVar = tn0Var.Q;
                if (dVar != null && G0 != null && G0 != tn0Var.R) {
                    tn0Var.R = G0;
                    m5.e eVar = G0.e;
                    dVar.i((CharSequence) eVar.f13013b, true, true);
                    tn0Var.Q.g((SpannableStringBuilder) eVar.f13014c, true);
                    return;
                }
                return;
            case 2:
                ((kt0) this.W).e();
                return;
            case 3:
                ((c01) this.W).f21586b.invalidate();
                return;
            case 4:
                ((x91) this.W).e();
                return;
            case 5:
                ((org.telegram.ui.Wallet.y2) this.W).f21586b.invalidate();
                return;
            case 6:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.W;
                b6Var.Y0();
                org.telegram.ui.Wallet.h8 h8Var = b6Var.f34251j0;
                if (h8Var != null && h8Var.f34645h1) {
                    h8Var.f0();
                    return;
                }
                return;
            case 7:
                vh.u1 u1Var = (vh.u1) this.W;
                hk hkVar = u1Var.f51997m1;
                vh.t1 t1Var = u1Var.f51998n1;
                if (t1Var != null) {
                    t1Var.F = hkVar.getPositionAnimated();
                    t1Var.invalidate();
                }
                u1Var.f21586b.invalidate();
                invalidate();
                vh.u1.f51993y1 = hkVar.getCurrentPosition();
                return;
            case 8:
                ((vh.w6) this.W).f21586b.invalidate();
                return;
            default:
                ((yh.a0) this.W).f21586b.invalidate();
                return;
        }
    }

    @Override
    public void y(int i10) {
        org.telegram.ui.Wallet.y8 y8Var;
        switch (this.V) {
            case 6:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.W;
                b6Var.f34245e0 = i10;
                if (i10 != 1 && (y8Var = b6Var.f34250i0) != null) {
                    y8Var.b(false);
                }
                if (i10 == 1) {
                    b6Var.f34257p0.post(new org.telegram.ui.Wallet.f4(b6Var, 13));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public hk(org.telegram.ui.ActionBar.k2 k2Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.V = i10;
        this.W = k2Var;
    }
}
