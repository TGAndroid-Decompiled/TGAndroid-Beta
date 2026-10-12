package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.tp0;
public final class g1 extends n10 {
    public final int f21880e = 0;
    public final ViewGroup f21881f;

    public g1(qp0 qp0Var, boolean z10) {
        super(z10);
        this.f21881f = qp0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.f21880e) {
            case 1:
                pp0 pp0Var = ((qp0) this.f21881f).f29897w;
                if (pp0Var != null) {
                    return pp0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override
    public float h() {
        switch (this.f21880e) {
            case 1:
                int m0 = ((qp0) this.f21881f).f29897w.m0();
                if (m0 > 0) {
                    return 1.0f / m0;
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
        switch (this.f21880e) {
            case 0:
                u1 u1Var = (u1) this.f21881f;
                f1 f1Var = u1Var.G5;
                if (u1Var.f23230y7.isMusic()) {
                    f7 = f1Var.f28618b;
                    i10 = f1Var.f28621f;
                    i11 = mp0.E;
                } else if (u1Var.f23230y7.isVoice()) {
                    if (u1Var.F5) {
                        tp0 tp0Var = u1Var.H5;
                        return tp0Var.f30921a / tp0Var.f30926g;
                    }
                    f7 = f1Var.f28618b;
                    i10 = f1Var.f28621f;
                    i11 = mp0.E;
                } else if (u1Var.f23230y7.isRoundVideo()) {
                    return u1Var.f23230y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((qp0) this.f21881f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.f21880e) {
            case 0:
                u1 u1Var = (u1) this.f21881f;
                tp0 tp0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.f23230y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.f23230y7.isVoice()) {
                    if (u1Var.F5) {
                        tp0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.f23230y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (tp0Var != null) {
                            tp0Var.g(f7, false);
                        }
                    } else if (f1Var != null) {
                        f1Var.i(f7);
                    }
                    u1Var.f23230y7.audioProgress = f7;
                } else {
                    return;
                }
                u1Var.b(f7);
                u1Var.invalidate();
                return;
            default:
                qp0 qp0Var = (qp0) this.f21881f;
                qp0Var.v = true;
                qp0Var.setProgress(f7);
                qp0Var.f(f7, true);
                qp0Var.v = false;
                return;
        }
    }

    public g1(u1 u1Var) {
        super(false);
        this.f21881f = u1Var;
    }
}
