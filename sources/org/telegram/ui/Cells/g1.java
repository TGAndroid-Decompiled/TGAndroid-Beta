package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.qo0;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.xo0;
public final class g1 extends u00 {
    public final int e = 0;
    public final ViewGroup f20339f;

    public g1(uo0 uo0Var, boolean z10) {
        super(z10);
        this.f20339f = uo0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.e) {
            case 1:
                to0 to0Var = ((uo0) this.f20339f).f28868w;
                if (to0Var != null) {
                    return to0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override
    public float h() {
        switch (this.e) {
            case 1:
                int l02 = ((uo0) this.f20339f).f28868w.l0();
                if (l02 > 0) {
                    return 1.0f / l02;
                }
                return 0.05f;
            default:
                return super.h();
        }
    }

    @Override
    public final float k() {
        float f7;
        int i10;
        int i11;
        switch (this.e) {
            case 0:
                u1 u1Var = (u1) this.f20339f;
                f1 f1Var = u1Var.G5;
                if (u1Var.f21590y7.isMusic()) {
                    f7 = f1Var.f27623b;
                    i10 = f1Var.f27625f;
                    i11 = qo0.E;
                } else if (u1Var.f21590y7.isVoice()) {
                    if (u1Var.F5) {
                        xo0 xo0Var = u1Var.H5;
                        return xo0Var.f30360a / xo0Var.f30364g;
                    }
                    f7 = f1Var.f27623b;
                    i10 = f1Var.f27625f;
                    i11 = qo0.E;
                } else if (u1Var.f21590y7.isRoundVideo()) {
                    return u1Var.f21590y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((uo0) this.f20339f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                u1 u1Var = (u1) this.f20339f;
                xo0 xo0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.f21590y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.f21590y7.isVoice()) {
                    if (u1Var.F5) {
                        xo0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.f21590y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (xo0Var != null) {
                            xo0Var.g(f7, false);
                        }
                    } else if (f1Var != null) {
                        f1Var.i(f7);
                    }
                    u1Var.f21590y7.audioProgress = f7;
                } else {
                    return;
                }
                u1Var.b(f7);
                u1Var.invalidate();
                return;
            default:
                uo0 uo0Var = (uo0) this.f20339f;
                uo0Var.v = true;
                uo0Var.setProgress(f7);
                uo0Var.f(f7, true);
                uo0Var.v = false;
                return;
        }
    }

    public g1(u1 u1Var) {
        super(false);
        this.f20339f = u1Var;
    }
}
