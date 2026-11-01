package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.dd;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.rn0;
public final class w0 extends a00 {
    public final int e;
    public final ViewGroup f21429f;

    public w0(ViewGroup viewGroup, int i10) {
        super(false);
        this.e = i10;
        this.f21429f = viewGroup;
    }

    @Override
    public CharSequence d() {
        int i10 = this.e;
        ViewGroup viewGroup = this.f21429f;
        switch (i10) {
            case 0:
                return jh.g.a(((x0) viewGroup).getSpeed()) + "x  " + dd.L0(2131754759, null);
            case 1:
            default:
                return super.d();
            case 2:
                nn0 nn0Var = ((on0) viewGroup).f29198y;
                if (nn0Var == null) {
                    return null;
                }
                return nn0Var.getContentDescription();
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
                int p02 = ((on0) this.f21429f).f29198y.p0();
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
                return ((x0) this.f21429f).getSpeed();
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f21429f;
                org.telegram.ui.Cells.i1 i1Var = q1Var.B4;
                if (q1Var.O5.I3()) {
                    f7 = i1Var.f28211b;
                    i10 = i1Var.f28213f;
                    i11 = ln0.E;
                } else if (kj.R4(q1Var.O5.f16690k)) {
                    if (q1Var.A4) {
                        rn0 rn0Var = q1Var.C4;
                        return rn0Var.f30027a / rn0Var.f30031g;
                    }
                    f7 = i1Var.f28211b;
                    i10 = i1Var.f28213f;
                    i11 = ln0.E;
                } else if (q1Var.O5.h4()) {
                    return q1Var.O5.f16652b0;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((on0) this.f21429f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                ((x0) this.f21429f).e(true, f7);
                return;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f21429f;
                rn0 rn0Var = q1Var.C4;
                org.telegram.ui.Cells.i1 i1Var = q1Var.B4;
                if (q1Var.O5.I3()) {
                    i1Var.h(f7);
                } else if (kj.R4(q1Var.O5.f16690k)) {
                    if (q1Var.A4) {
                        rn0Var.g(false, f7);
                    } else {
                        i1Var.h(f7);
                    }
                } else if (q1Var.O5.h4()) {
                    if (q1Var.A4) {
                        if (rn0Var != null) {
                            rn0Var.g(false, f7);
                        }
                    } else if (i1Var != null) {
                        i1Var.h(f7);
                    }
                    q1Var.O5.f16652b0 = f7;
                } else {
                    return;
                }
                q1Var.c(f7);
                q1Var.invalidate();
                return;
            default:
                on0 on0Var = (on0) this.f21429f;
                on0Var.f29197x = true;
                on0Var.setProgress(f7);
                on0Var.f(true, f7);
                on0Var.f29197x = false;
                return;
        }
    }

    public w0(on0 on0Var, boolean z10) {
        super(z10);
        this.e = 2;
        this.f21429f = on0Var;
    }
}
