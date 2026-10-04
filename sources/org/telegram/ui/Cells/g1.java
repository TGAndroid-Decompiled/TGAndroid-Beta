package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.x00;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.Components.yo0;
public final class g1 extends x00 {
    public final int f22122e = 0;
    public final ViewGroup f22123f;

    public g1(yo0 yo0Var, boolean z10) {
        super(z10);
        this.f22123f = yo0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.f22122e) {
            case 1:
                xo0 xo0Var = ((yo0) this.f22123f).f33204w;
                if (xo0Var != null) {
                    return xo0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override
    public float h() {
        switch (this.f22122e) {
            case 1:
                int p02 = ((yo0) this.f22123f).f33204w.p0();
                if (p02 > 0) {
                    return 1.0f / p02;
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
        switch (this.f22122e) {
            case 0:
                u1 u1Var = (u1) this.f22123f;
                f1 f1Var = u1Var.G5;
                if (u1Var.f23470y7.isMusic()) {
                    f7 = f1Var.f31109b;
                    i10 = f1Var.f31112f;
                    i11 = to0.E;
                } else if (u1Var.f23470y7.isVoice()) {
                    if (u1Var.F5) {
                        bp0 bp0Var = u1Var.H5;
                        return bp0Var.f25018a / bp0Var.f25023g;
                    }
                    f7 = f1Var.f31109b;
                    i10 = f1Var.f31112f;
                    i11 = to0.E;
                } else if (u1Var.f23470y7.isRoundVideo()) {
                    return u1Var.f23470y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((yo0) this.f22123f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.f22122e) {
            case 0:
                u1 u1Var = (u1) this.f22123f;
                bp0 bp0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.f23470y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.f23470y7.isVoice()) {
                    if (u1Var.F5) {
                        bp0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.f23470y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (bp0Var != null) {
                            bp0Var.g(f7, false);
                        }
                    } else if (f1Var != null) {
                        f1Var.i(f7);
                    }
                    u1Var.f23470y7.audioProgress = f7;
                } else {
                    return;
                }
                u1Var.b(f7);
                u1Var.invalidate();
                return;
            default:
                yo0 yo0Var = (yo0) this.f22123f;
                yo0Var.v = true;
                yo0Var.setProgress(f7);
                yo0Var.f(f7, true);
                yo0Var.v = false;
                return;
        }
    }

    public g1(u1 u1Var) {
        super(false);
        this.f22123f = u1Var;
    }
}
