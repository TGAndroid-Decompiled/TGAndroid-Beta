package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.vo0;
public final class g1 extends u00 {
    public final int e = 0;
    public final ViewGroup f20324f;

    public g1(so0 so0Var, boolean z10) {
        super(z10);
        this.f20324f = so0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.e) {
            case 1:
                ro0 ro0Var = ((so0) this.f20324f).f28188w;
                if (ro0Var != null) {
                    return ro0Var.getContentDescription();
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
                int l02 = ((so0) this.f20324f).f28188w.l0();
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
                u1 u1Var = (u1) this.f20324f;
                f1 f1Var = u1Var.G5;
                if (u1Var.f21575y7.isMusic()) {
                    f7 = f1Var.f27006b;
                    i10 = f1Var.f27008f;
                    i11 = oo0.E;
                } else if (u1Var.f21575y7.isVoice()) {
                    if (u1Var.F5) {
                        vo0 vo0Var = u1Var.H5;
                        return vo0Var.f29242a / vo0Var.f29246g;
                    }
                    f7 = f1Var.f27006b;
                    i10 = f1Var.f27008f;
                    i11 = oo0.E;
                } else if (u1Var.f21575y7.isRoundVideo()) {
                    return u1Var.f21575y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((so0) this.f20324f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                u1 u1Var = (u1) this.f20324f;
                vo0 vo0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.f21575y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.f21575y7.isVoice()) {
                    if (u1Var.F5) {
                        vo0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.f21575y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (vo0Var != null) {
                            vo0Var.g(f7, false);
                        }
                    } else if (f1Var != null) {
                        f1Var.i(f7);
                    }
                    u1Var.f21575y7.audioProgress = f7;
                } else {
                    return;
                }
                u1Var.b(f7);
                u1Var.invalidate();
                return;
            default:
                so0 so0Var = (so0) this.f20324f;
                so0Var.v = true;
                so0Var.setProgress(f7);
                so0Var.f(f7, true);
                so0Var.v = false;
                return;
        }
    }

    public g1(u1 u1Var) {
        super(false);
        this.f20324f = u1Var;
    }
}
