package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.np0;
public final class g1 extends k10 {
    public final int f22108e = 0;
    public final ViewGroup f22109f;

    public g1(kp0 kp0Var, boolean z10) {
        super(z10);
        this.f22109f = kp0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.f22108e) {
            case 1:
                jp0 jp0Var = ((kp0) this.f22109f).f28139w;
                if (jp0Var != null) {
                    return jp0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override
    public float h() {
        switch (this.f22108e) {
            case 1:
                int i02 = ((kp0) this.f22109f).f28139w.i0();
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
        switch (this.f22108e) {
            case 0:
                u1 u1Var = (u1) this.f22109f;
                f1 f1Var = u1Var.G5;
                if (u1Var.f23458y7.isMusic()) {
                    f7 = f1Var.f26833b;
                    i10 = f1Var.f26836f;
                    i11 = gp0.E;
                } else if (u1Var.f23458y7.isVoice()) {
                    if (u1Var.F5) {
                        np0 np0Var = u1Var.H5;
                        return np0Var.f29232a / np0Var.f29237g;
                    }
                    f7 = f1Var.f26833b;
                    i10 = f1Var.f26836f;
                    i11 = gp0.E;
                } else if (u1Var.f23458y7.isRoundVideo()) {
                    return u1Var.f23458y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((kp0) this.f22109f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.f22108e) {
            case 0:
                u1 u1Var = (u1) this.f22109f;
                np0 np0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.f23458y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.f23458y7.isVoice()) {
                    if (u1Var.F5) {
                        np0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.f23458y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (np0Var != null) {
                            np0Var.g(f7, false);
                        }
                    } else if (f1Var != null) {
                        f1Var.i(f7);
                    }
                    u1Var.f23458y7.audioProgress = f7;
                } else {
                    return;
                }
                u1Var.b(f7);
                u1Var.invalidate();
                return;
            default:
                kp0 kp0Var = (kp0) this.f22109f;
                kp0Var.v = true;
                kp0Var.setProgress(f7);
                kp0Var.f(f7, true);
                kp0Var.v = false;
                return;
        }
    }

    public g1(u1 u1Var) {
        super(false);
        this.f22109f = u1Var;
    }
}
