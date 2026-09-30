package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.Components.x00;
import org.telegram.ui.Components.yo0;
public final class g1 extends x00 {
    public final int e = 0;
    public final ViewGroup f20340f;

    public g1(vo0 vo0Var, boolean z10) {
        super(z10);
        this.f20340f = vo0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.e) {
            case 1:
                uo0 uo0Var = ((vo0) this.f20340f).f29168w;
                if (uo0Var != null) {
                    return uo0Var.getContentDescription();
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
                int m0 = ((vo0) this.f20340f).f29168w.m0();
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
                u1 u1Var = (u1) this.f20340f;
                f1 f1Var = u1Var.G5;
                if (u1Var.f21629y7.isMusic()) {
                    f7 = f1Var.f28096b;
                    i10 = f1Var.f28098f;
                    i11 = ro0.E;
                } else if (u1Var.f21629y7.isVoice()) {
                    if (u1Var.F5) {
                        yo0 yo0Var = u1Var.H5;
                        return yo0Var.f30751a / yo0Var.f30755g;
                    }
                    f7 = f1Var.f28096b;
                    i10 = f1Var.f28098f;
                    i11 = ro0.E;
                } else if (u1Var.f21629y7.isRoundVideo()) {
                    return u1Var.f21629y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((vo0) this.f20340f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                u1 u1Var = (u1) this.f20340f;
                yo0 yo0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.f21629y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.f21629y7.isVoice()) {
                    if (u1Var.F5) {
                        yo0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.f21629y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (yo0Var != null) {
                            yo0Var.g(f7, false);
                        }
                    } else if (f1Var != null) {
                        f1Var.i(f7);
                    }
                    u1Var.f21629y7.audioProgress = f7;
                } else {
                    return;
                }
                u1Var.b(f7);
                u1Var.invalidate();
                return;
            default:
                vo0 vo0Var = (vo0) this.f20340f;
                vo0Var.v = true;
                vo0Var.setProgress(f7);
                vo0Var.f(f7, true);
                vo0Var.v = false;
                return;
        }
    }

    public g1(u1 u1Var) {
        super(false);
        this.f20340f = u1Var;
    }
}
