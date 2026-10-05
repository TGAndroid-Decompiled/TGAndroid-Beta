package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.x00;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.Components.zo0;
public final class g1 extends x00 {
    public final int f22130e = 0;
    public final ViewGroup f22131f;

    public g1(zo0 zo0Var, boolean z10) {
        super(z10);
        this.f22131f = zo0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.f22130e) {
            case 1:
                yo0 yo0Var = ((zo0) this.f22131f).f33618w;
                if (yo0Var != null) {
                    return yo0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override
    public float h() {
        switch (this.f22130e) {
            case 1:
                int p02 = ((zo0) this.f22131f).f33618w.p0();
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
        switch (this.f22130e) {
            case 0:
                u1 u1Var = (u1) this.f22131f;
                f1 f1Var = u1Var.G5;
                if (u1Var.f23477y7.isMusic()) {
                    f7 = f1Var.f31470b;
                    i10 = f1Var.f31473f;
                    i11 = uo0.E;
                } else if (u1Var.f23477y7.isVoice()) {
                    if (u1Var.F5) {
                        cp0 cp0Var = u1Var.H5;
                        return cp0Var.f25478a / cp0Var.f25483g;
                    }
                    f7 = f1Var.f31470b;
                    i10 = f1Var.f31473f;
                    i11 = uo0.E;
                } else if (u1Var.f23477y7.isRoundVideo()) {
                    return u1Var.f23477y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((zo0) this.f22131f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.f22130e) {
            case 0:
                u1 u1Var = (u1) this.f22131f;
                cp0 cp0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.f23477y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.f23477y7.isVoice()) {
                    if (u1Var.F5) {
                        cp0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.f23477y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (cp0Var != null) {
                            cp0Var.g(f7, false);
                        }
                    } else if (f1Var != null) {
                        f1Var.i(f7);
                    }
                    u1Var.f23477y7.audioProgress = f7;
                } else {
                    return;
                }
                u1Var.b(f7);
                u1Var.invalidate();
                return;
            default:
                zo0 zo0Var = (zo0) this.f22131f;
                zo0Var.v = true;
                zo0Var.setProgress(f7);
                zo0Var.f(f7, true);
                zo0Var.v = false;
                return;
        }
    }

    public g1(u1 u1Var) {
        super(false);
        this.f22131f = u1Var;
    }
}
