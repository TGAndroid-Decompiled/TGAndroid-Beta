package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.qn0;
public final class w0 extends a00 {
    public final int e;
    public final ViewGroup f21428f;

    public w0(ViewGroup viewGroup, int i10) {
        super(false);
        this.e = i10;
        this.f21428f = viewGroup;
    }

    @Override
    public CharSequence d() {
        int i10 = this.e;
        ViewGroup viewGroup = this.f21428f;
        switch (i10) {
            case 0:
                return jh.g.a(((x0) viewGroup).getSpeed()) + "x  " + cd.L0(2131754759, null);
            case 1:
            default:
                return super.d();
            case 2:
                mn0 mn0Var = ((nn0) viewGroup).f28853y;
                if (mn0Var == null) {
                    return null;
                }
                return mn0Var.getContentDescription();
        }
    }

    @Override
    public float h() {
        switch (this.e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int p02 = ((nn0) this.f21428f).f28853y.p0();
                if (p02 > 0) {
                    return 1.0f / p02;
                }
                return 0.05f;
        }
    }

    @Override
    public float i() {
        switch (this.e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override
    public float j() {
        switch (this.e) {
            case 0:
                return 0.2f;
            default:
                return super.j();
        }
    }

    @Override
    public final float k() {
        float f7;
        int i10;
        int i11;
        switch (this.e) {
            case 0:
                return ((x0) this.f21428f).getSpeed();
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f21428f;
                org.telegram.ui.Cells.i1 i1Var = q1Var.B4;
                if (q1Var.O5.I3()) {
                    f7 = i1Var.f27832b;
                    i10 = i1Var.f27834f;
                    i11 = kn0.E;
                } else if (jj.R4(q1Var.O5.f16337k)) {
                    if (q1Var.A4) {
                        qn0 qn0Var = q1Var.C4;
                        return qn0Var.f29688a / qn0Var.f29692g;
                    }
                    f7 = i1Var.f27832b;
                    i10 = i1Var.f27834f;
                    i11 = kn0.E;
                } else if (q1Var.O5.h4()) {
                    return q1Var.O5.f16299b0;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((nn0) this.f21428f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                ((x0) this.f21428f).e(true, f7);
                return;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f21428f;
                qn0 qn0Var = q1Var.C4;
                org.telegram.ui.Cells.i1 i1Var = q1Var.B4;
                if (q1Var.O5.I3()) {
                    i1Var.h(f7);
                } else if (jj.R4(q1Var.O5.f16337k)) {
                    if (q1Var.A4) {
                        qn0Var.g(false, f7);
                    } else {
                        i1Var.h(f7);
                    }
                } else if (q1Var.O5.h4()) {
                    if (q1Var.A4) {
                        if (qn0Var != null) {
                            qn0Var.g(false, f7);
                        }
                    } else if (i1Var != null) {
                        i1Var.h(f7);
                    }
                    q1Var.O5.f16299b0 = f7;
                } else {
                    return;
                }
                q1Var.c(f7);
                q1Var.invalidate();
                return;
            default:
                nn0 nn0Var = (nn0) this.f21428f;
                nn0Var.f28852x = true;
                nn0Var.setProgress(f7);
                nn0Var.f(true, f7);
                nn0Var.f28852x = false;
                return;
        }
    }

    public w0(nn0 nn0Var, boolean z10) {
        super(z10);
        this.e = 2;
        this.f21428f = nn0Var;
    }
}
