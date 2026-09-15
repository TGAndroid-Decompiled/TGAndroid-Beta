package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.bo0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.u00;
public final class f1 extends u00 {
    public final int e = 0;
    public final ViewGroup f20059f;

    public f1(fo0 fo0Var, boolean z10) {
        super(z10);
        this.f20059f = fo0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.e) {
            case 1:
                eo0 eo0Var = ((fo0) this.f20059f).f24046w;
                if (eo0Var != null) {
                    return eo0Var.getContentDescription();
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
                int m0 = ((fo0) this.f20059f).f24046w.m0();
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
                t1 t1Var = (t1) this.f20059f;
                e1 e1Var = t1Var.G5;
                if (t1Var.f21322y7.isMusic()) {
                    f7 = e1Var.f22832b;
                    i10 = e1Var.f22834f;
                    i11 = bo0.E;
                } else if (t1Var.f21322y7.isVoice()) {
                    if (t1Var.F5) {
                        io0 io0Var = t1Var.H5;
                        return io0Var.f25093a / io0Var.f25097g;
                    }
                    f7 = e1Var.f22832b;
                    i10 = e1Var.f22834f;
                    i11 = bo0.E;
                } else if (t1Var.f21322y7.isRoundVideo()) {
                    return t1Var.f21322y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((fo0) this.f20059f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                t1 t1Var = (t1) this.f20059f;
                io0 io0Var = t1Var.H5;
                e1 e1Var = t1Var.G5;
                if (t1Var.f21322y7.isMusic()) {
                    e1Var.i(f7);
                } else if (t1Var.f21322y7.isVoice()) {
                    if (t1Var.F5) {
                        io0Var.g(f7, false);
                    } else {
                        e1Var.i(f7);
                    }
                } else if (t1Var.f21322y7.isRoundVideo()) {
                    if (t1Var.F5) {
                        if (io0Var != null) {
                            io0Var.g(f7, false);
                        }
                    } else if (e1Var != null) {
                        e1Var.i(f7);
                    }
                    t1Var.f21322y7.audioProgress = f7;
                } else {
                    return;
                }
                t1Var.b(f7);
                t1Var.invalidate();
                return;
            default:
                fo0 fo0Var = (fo0) this.f20059f;
                fo0Var.v = true;
                fo0Var.setProgress(f7);
                fo0Var.f(f7, true);
                fo0Var.v = false;
                return;
        }
    }

    public f1(t1 t1Var) {
        super(false);
        this.f20059f = t1Var;
    }
}
