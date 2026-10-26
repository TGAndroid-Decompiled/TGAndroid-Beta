package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.ip0;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.pp0;
public final class e1 extends d10 {
    public final int e = 0;
    public final ViewGroup f24022f;

    public e1(lp0 lp0Var, boolean z10) {
        super(z10);
        this.f24022f = lp0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.e) {
            case 1:
                kp0 kp0Var = ((lp0) this.f24022f).f30261x;
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
        switch (this.e) {
            case 1:
                int k02 = ((lp0) this.f24022f).f30261x.k0();
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
                s1 s1Var = (s1) this.f24022f;
                d1 d1Var = s1Var.G5;
                if (s1Var.f25365y7.isMusic()) {
                    f7 = d1Var.f29331b;
                    i10 = d1Var.f29333f;
                    i11 = ip0.E;
                } else if (s1Var.f25365y7.isVoice()) {
                    if (s1Var.F5) {
                        pp0 pp0Var = s1Var.H5;
                        return pp0Var.f31675a / pp0Var.f31679g;
                    }
                    f7 = d1Var.f29331b;
                    i10 = d1Var.f29333f;
                    i11 = ip0.E;
                } else if (s1Var.f25365y7.isRoundVideo()) {
                    return s1Var.f25365y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((lp0) this.f24022f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                s1 s1Var = (s1) this.f24022f;
                pp0 pp0Var = s1Var.H5;
                d1 d1Var = s1Var.G5;
                if (s1Var.f25365y7.isMusic()) {
                    d1Var.i(f7);
                } else if (s1Var.f25365y7.isVoice()) {
                    if (s1Var.F5) {
                        pp0Var.g(f7, false);
                    } else {
                        d1Var.i(f7);
                    }
                } else if (s1Var.f25365y7.isRoundVideo()) {
                    if (s1Var.F5) {
                        if (pp0Var != null) {
                            pp0Var.g(f7, false);
                        }
                    } else if (d1Var != null) {
                        d1Var.i(f7);
                    }
                    s1Var.f25365y7.audioProgress = f7;
                } else {
                    return;
                }
                s1Var.c(f7);
                s1Var.invalidate();
                return;
            default:
                lp0 lp0Var = (lp0) this.f24022f;
                lp0Var.f30260w = true;
                lp0Var.setProgress(f7);
                lp0Var.f(f7, true);
                lp0Var.f30260w = false;
                return;
        }
    }

    public e1(s1 s1Var) {
        super(false);
        this.f24022f = s1Var;
    }
}
