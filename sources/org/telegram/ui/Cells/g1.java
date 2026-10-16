package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.jp0;
public final class g1 extends g10 {
    public final int e = 0;
    public final ViewGroup f20900f;

    public g1(gp0 gp0Var, boolean z10) {
        super(z10);
        this.f20900f = gp0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.e) {
            case 1:
                fp0 fp0Var = ((gp0) this.f20900f).f25081w;
                if (fp0Var != null) {
                    return fp0Var.getContentDescription();
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
                int k02 = ((gp0) this.f20900f).f25081w.k0();
                if (k02 > 0) {
                    return 1.0f / k02;
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
                u1 u1Var = (u1) this.f20900f;
                f1 f1Var = u1Var.G5;
                if (u1Var.f22197y7.isMusic()) {
                    f7 = f1Var.f23851b;
                    i10 = f1Var.f23853f;
                    i11 = cp0.E;
                } else if (u1Var.f22197y7.isVoice()) {
                    if (u1Var.F5) {
                        jp0 jp0Var = u1Var.H5;
                        return jp0Var.f26098a / jp0Var.f26102g;
                    }
                    f7 = f1Var.f23851b;
                    i10 = f1Var.f23853f;
                    i11 = cp0.E;
                } else if (u1Var.f22197y7.isRoundVideo()) {
                    return u1Var.f22197y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((gp0) this.f20900f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                u1 u1Var = (u1) this.f20900f;
                jp0 jp0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.f22197y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.f22197y7.isVoice()) {
                    if (u1Var.F5) {
                        jp0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.f22197y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (jp0Var != null) {
                            jp0Var.g(f7, false);
                        }
                    } else if (f1Var != null) {
                        f1Var.i(f7);
                    }
                    u1Var.f22197y7.audioProgress = f7;
                } else {
                    return;
                }
                u1Var.b(f7);
                u1Var.invalidate();
                return;
            default:
                gp0 gp0Var = (gp0) this.f20900f;
                gp0Var.v = true;
                gp0Var.setProgress(f7);
                gp0Var.f(f7, true);
                gp0Var.v = false;
                return;
        }
    }

    public g1(u1 u1Var) {
        super(false);
        this.f20900f = u1Var;
    }
}
