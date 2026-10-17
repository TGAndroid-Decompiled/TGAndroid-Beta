package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.yo0;
public final class g1 extends c10 {
    public final int e = 0;
    public final ViewGroup f22282f;

    public g1(cp0 cp0Var, boolean z10) {
        super(z10);
        this.f22282f = cp0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.e) {
            case 1:
                bp0 bp0Var = ((cp0) this.f22282f).f25340w;
                if (bp0Var != null) {
                    return bp0Var.getContentDescription();
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
                int Y = ((cp0) this.f22282f).f25340w.Y();
                if (Y > 0) {
                    return 1.0f / Y;
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
                u1 u1Var = (u1) this.f22282f;
                f1 f1Var = u1Var.G5;
                if (u1Var.f23561y7.isMusic()) {
                    f7 = f1Var.f32715b;
                    i10 = f1Var.f32717f;
                    i11 = yo0.E;
                } else if (u1Var.f23561y7.isVoice()) {
                    if (u1Var.F5) {
                        fp0 fp0Var = u1Var.H5;
                        return fp0Var.f26332a / fp0Var.f26336g;
                    }
                    f7 = f1Var.f32715b;
                    i10 = f1Var.f32717f;
                    i11 = yo0.E;
                } else if (u1Var.f23561y7.isRoundVideo()) {
                    return u1Var.f23561y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((cp0) this.f22282f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                u1 u1Var = (u1) this.f22282f;
                fp0 fp0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.f23561y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.f23561y7.isVoice()) {
                    if (u1Var.F5) {
                        fp0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.f23561y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (fp0Var != null) {
                            fp0Var.g(f7, false);
                        }
                    } else if (f1Var != null) {
                        f1Var.i(f7);
                    }
                    u1Var.f23561y7.audioProgress = f7;
                } else {
                    return;
                }
                u1Var.b(f7);
                u1Var.invalidate();
                return;
            default:
                cp0 cp0Var = (cp0) this.f22282f;
                cp0Var.v = true;
                cp0Var.setProgress(f7);
                cp0Var.f(f7, true);
                cp0Var.v = false;
                return;
        }
    }

    public g1(u1 u1Var) {
        super(false);
        this.f22282f = u1Var;
    }
}
