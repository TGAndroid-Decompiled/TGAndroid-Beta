package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.wo0;
public final class g1 extends w00 {
    public final int e = 0;
    public final ViewGroup f20323f;

    public g1(to0 to0Var, boolean z10) {
        super(z10);
        this.f20323f = to0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.e) {
            case 1:
                so0 so0Var = ((to0) this.f20323f).f28583w;
                if (so0Var != null) {
                    return so0Var.getContentDescription();
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
                int m0 = ((to0) this.f20323f).f28583w.m0();
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
        switch (this.e) {
            case 0:
                u1 u1Var = (u1) this.f20323f;
                f1 f1Var = u1Var.G5;
                if (u1Var.f21607y7.isMusic()) {
                    f7 = f1Var.f27451b;
                    i10 = f1Var.f27453f;
                    i11 = po0.E;
                } else if (u1Var.f21607y7.isVoice()) {
                    if (u1Var.F5) {
                        wo0 wo0Var = u1Var.H5;
                        return wo0Var.f30154a / wo0Var.f30158g;
                    }
                    f7 = f1Var.f27451b;
                    i10 = f1Var.f27453f;
                    i11 = po0.E;
                } else if (u1Var.f21607y7.isRoundVideo()) {
                    return u1Var.f21607y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((to0) this.f20323f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                u1 u1Var = (u1) this.f20323f;
                wo0 wo0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.f21607y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.f21607y7.isVoice()) {
                    if (u1Var.F5) {
                        wo0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.f21607y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (wo0Var != null) {
                            wo0Var.g(f7, false);
                        }
                    } else if (f1Var != null) {
                        f1Var.i(f7);
                    }
                    u1Var.f21607y7.audioProgress = f7;
                } else {
                    return;
                }
                u1Var.b(f7);
                u1Var.invalidate();
                return;
            default:
                to0 to0Var = (to0) this.f20323f;
                to0Var.v = true;
                to0Var.setProgress(f7);
                to0Var.f(f7, true);
                to0Var.v = false;
                return;
        }
    }

    public g1(u1 u1Var) {
        super(false);
        this.f20323f = u1Var;
    }
}
