package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.bo0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.u00;
public final class f1 extends u00 {
    public final int f21921e = 0;
    public final ViewGroup f21922f;

    public f1(fo0 fo0Var, boolean z10) {
        super(z10);
        this.f21922f = fo0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.f21921e) {
            case 1:
                eo0 eo0Var = ((fo0) this.f21922f).f26185w;
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
        switch (this.f21921e) {
            case 1:
                int l02 = ((fo0) this.f21922f).f26185w.l0();
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
        switch (this.f21921e) {
            case 0:
                t1 t1Var = (t1) this.f21922f;
                e1 e1Var = t1Var.G5;
                if (t1Var.f23232y7.isMusic()) {
                    f7 = e1Var.f24782b;
                    i10 = e1Var.f24785f;
                    i11 = bo0.E;
                } else if (t1Var.f23232y7.isVoice()) {
                    if (t1Var.F5) {
                        io0 io0Var = t1Var.H5;
                        return io0Var.f27235a / io0Var.f27240g;
                    }
                    f7 = e1Var.f24782b;
                    i10 = e1Var.f24785f;
                    i11 = bo0.E;
                } else if (t1Var.f23232y7.isRoundVideo()) {
                    return t1Var.f23232y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((fo0) this.f21922f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.f21921e) {
            case 0:
                t1 t1Var = (t1) this.f21922f;
                io0 io0Var = t1Var.H5;
                e1 e1Var = t1Var.G5;
                if (t1Var.f23232y7.isMusic()) {
                    e1Var.i(f7);
                } else if (t1Var.f23232y7.isVoice()) {
                    if (t1Var.F5) {
                        io0Var.g(f7, false);
                    } else {
                        e1Var.i(f7);
                    }
                } else if (t1Var.f23232y7.isRoundVideo()) {
                    if (t1Var.F5) {
                        if (io0Var != null) {
                            io0Var.g(f7, false);
                        }
                    } else if (e1Var != null) {
                        e1Var.i(f7);
                    }
                    t1Var.f23232y7.audioProgress = f7;
                } else {
                    return;
                }
                t1Var.b(f7);
                t1Var.invalidate();
                return;
            default:
                fo0 fo0Var = (fo0) this.f21922f;
                fo0Var.v = true;
                fo0Var.setProgress(f7);
                fo0Var.f(f7, true);
                fo0Var.v = false;
                return;
        }
    }

    public f1(t1 t1Var) {
        super(false);
        this.f21922f = t1Var;
    }
}
