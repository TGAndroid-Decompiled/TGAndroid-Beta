package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.Components.qp0;
public final class e1 extends d10 {
    public final int e = 0;
    public final ViewGroup f24024f;

    public e1(mp0 mp0Var, boolean z10) {
        super(z10);
        this.f24024f = mp0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.e) {
            case 1:
                lp0 lp0Var = ((mp0) this.f24024f).f30593x;
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
        switch (this.e) {
            case 1:
                int k02 = ((mp0) this.f24024f).f30593x.k0();
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
                s1 s1Var = (s1) this.f24024f;
                d1 d1Var = s1Var.G5;
                if (s1Var.f25367y7.isMusic()) {
                    f7 = d1Var.f29710b;
                    i10 = d1Var.f29712f;
                    i11 = jp0.E;
                } else if (s1Var.f25367y7.isVoice()) {
                    if (s1Var.F5) {
                        qp0 qp0Var = s1Var.H5;
                        return qp0Var.f31980a / qp0Var.f31984g;
                    }
                    f7 = d1Var.f29710b;
                    i10 = d1Var.f29712f;
                    i11 = jp0.E;
                } else if (s1Var.f25367y7.isRoundVideo()) {
                    return s1Var.f25367y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((mp0) this.f24024f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                s1 s1Var = (s1) this.f24024f;
                qp0 qp0Var = s1Var.H5;
                d1 d1Var = s1Var.G5;
                if (s1Var.f25367y7.isMusic()) {
                    d1Var.i(f7);
                } else if (s1Var.f25367y7.isVoice()) {
                    if (s1Var.F5) {
                        qp0Var.g(f7, false);
                    } else {
                        d1Var.i(f7);
                    }
                } else if (s1Var.f25367y7.isRoundVideo()) {
                    if (s1Var.F5) {
                        if (qp0Var != null) {
                            qp0Var.g(f7, false);
                        }
                    } else if (d1Var != null) {
                        d1Var.i(f7);
                    }
                    s1Var.f25367y7.audioProgress = f7;
                } else {
                    return;
                }
                s1Var.c(f7);
                s1Var.invalidate();
                return;
            default:
                mp0 mp0Var = (mp0) this.f24024f;
                mp0Var.f30592w = true;
                mp0Var.setProgress(f7);
                mp0Var.f(f7, true);
                mp0Var.f30592w = false;
                return;
        }
    }

    public e1(s1 s1Var) {
        super(false);
        this.f24024f = s1Var;
    }
}
