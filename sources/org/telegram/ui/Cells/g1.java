package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.ip0;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.Components.pp0;
public final class g1 extends l10 {
    public final int f22100e = 0;
    public final ViewGroup f22101f;

    public g1(mp0 mp0Var, boolean z10) {
        super(z10);
        this.f22101f = mp0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.f22100e) {
            case 1:
                lp0 lp0Var = ((mp0) this.f22101f).f28834w;
                if (lp0Var != null) {
                    return lp0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override
    public float h() {
        switch (this.f22100e) {
            case 1:
                int i02 = ((mp0) this.f22101f).f28834w.i0();
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
        switch (this.f22100e) {
            case 0:
                u1 u1Var = (u1) this.f22101f;
                f1 f1Var = u1Var.G5;
                if (u1Var.f23450y7.isMusic()) {
                    f7 = f1Var.f27417b;
                    i10 = f1Var.f27420f;
                    i11 = ip0.E;
                } else if (u1Var.f23450y7.isVoice()) {
                    if (u1Var.F5) {
                        pp0 pp0Var = u1Var.H5;
                        return pp0Var.f29794a / pp0Var.f29799g;
                    }
                    f7 = f1Var.f27417b;
                    i10 = f1Var.f27420f;
                    i11 = ip0.E;
                } else if (u1Var.f23450y7.isRoundVideo()) {
                    return u1Var.f23450y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((mp0) this.f22101f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.f22100e) {
            case 0:
                u1 u1Var = (u1) this.f22101f;
                pp0 pp0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.f23450y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.f23450y7.isVoice()) {
                    if (u1Var.F5) {
                        pp0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.f23450y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (pp0Var != null) {
                            pp0Var.g(f7, false);
                        }
                    } else if (f1Var != null) {
                        f1Var.i(f7);
                    }
                    u1Var.f23450y7.audioProgress = f7;
                } else {
                    return;
                }
                u1Var.b(f7);
                u1Var.invalidate();
                return;
            default:
                mp0 mp0Var = (mp0) this.f22101f;
                mp0Var.v = true;
                mp0Var.setProgress(f7);
                mp0Var.f(f7, true);
                mp0Var.v = false;
                return;
        }
    }

    public g1(u1 u1Var) {
        super(false);
        this.f22101f = u1Var;
    }
}
