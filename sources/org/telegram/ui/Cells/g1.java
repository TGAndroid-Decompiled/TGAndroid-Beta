package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.op0;
public final class g1 extends l10 {
    public final int f22112e = 0;
    public final ViewGroup f22113f;

    public g1(lp0 lp0Var, boolean z10) {
        super(z10);
        this.f22113f = lp0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.f22112e) {
            case 1:
                kp0 kp0Var = ((lp0) this.f22113f).f28500w;
                if (kp0Var != null) {
                    return kp0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override
    public float h() {
        switch (this.f22112e) {
            case 1:
                int i02 = ((lp0) this.f22113f).f28500w.i0();
                if (i02 > 0) {
                    return 1.0f / i02;
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
        switch (this.f22112e) {
            case 0:
                u1 u1Var = (u1) this.f22113f;
                f1 f1Var = u1Var.G5;
                if (u1Var.f23462y7.isMusic()) {
                    f7 = f1Var.f27101b;
                    i10 = f1Var.f27104f;
                    i11 = hp0.E;
                } else if (u1Var.f23462y7.isVoice()) {
                    if (u1Var.F5) {
                        op0 op0Var = u1Var.H5;
                        return op0Var.f29546a / op0Var.f29551g;
                    }
                    f7 = f1Var.f27101b;
                    i10 = f1Var.f27104f;
                    i11 = hp0.E;
                } else if (u1Var.f23462y7.isRoundVideo()) {
                    return u1Var.f23462y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((lp0) this.f22113f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.f22112e) {
            case 0:
                u1 u1Var = (u1) this.f22113f;
                op0 op0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.f23462y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.f23462y7.isVoice()) {
                    if (u1Var.F5) {
                        op0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.f23462y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (op0Var != null) {
                            op0Var.g(f7, false);
                        }
                    } else if (f1Var != null) {
                        f1Var.i(f7);
                    }
                    u1Var.f23462y7.audioProgress = f7;
                } else {
                    return;
                }
                u1Var.b(f7);
                u1Var.invalidate();
                return;
            default:
                lp0 lp0Var = (lp0) this.f22113f;
                lp0Var.v = true;
                lp0Var.setProgress(f7);
                lp0Var.f(f7, true);
                lp0Var.v = false;
                return;
        }
    }

    public g1(u1 u1Var) {
        super(false);
        this.f22113f = u1Var;
    }
}
