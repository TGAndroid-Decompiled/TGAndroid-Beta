package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.zo0;
public final class g1 extends c10 {
    public final int e = 0;
    public final ViewGroup f22286f;

    public g1(dp0 dp0Var, boolean z10) {
        super(z10);
        this.f22286f = dp0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.e) {
            case 1:
                cp0 cp0Var = ((dp0) this.f22286f).f25602w;
                if (cp0Var != null) {
                    return cp0Var.getContentDescription();
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
                int Y = ((dp0) this.f22286f).f25602w.Y();
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
                u1 u1Var = (u1) this.f22286f;
                f1 f1Var = u1Var.G5;
                if (u1Var.f23571y7.isMusic()) {
                    f7 = f1Var.f32995b;
                    i10 = f1Var.f32997f;
                    i11 = zo0.E;
                } else if (u1Var.f23571y7.isVoice()) {
                    if (u1Var.F5) {
                        gp0 gp0Var = u1Var.H5;
                        return gp0Var.f26629a / gp0Var.f26633g;
                    }
                    f7 = f1Var.f32995b;
                    i10 = f1Var.f32997f;
                    i11 = zo0.E;
                } else if (u1Var.f23571y7.isRoundVideo()) {
                    return u1Var.f23571y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((dp0) this.f22286f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                u1 u1Var = (u1) this.f22286f;
                gp0 gp0Var = u1Var.H5;
                f1 f1Var = u1Var.G5;
                if (u1Var.f23571y7.isMusic()) {
                    f1Var.i(f7);
                } else if (u1Var.f23571y7.isVoice()) {
                    if (u1Var.F5) {
                        gp0Var.g(f7, false);
                    } else {
                        f1Var.i(f7);
                    }
                } else if (u1Var.f23571y7.isRoundVideo()) {
                    if (u1Var.F5) {
                        if (gp0Var != null) {
                            gp0Var.g(f7, false);
                        }
                    } else if (f1Var != null) {
                        f1Var.i(f7);
                    }
                    u1Var.f23571y7.audioProgress = f7;
                } else {
                    return;
                }
                u1Var.b(f7);
                u1Var.invalidate();
                return;
            default:
                dp0 dp0Var = (dp0) this.f22286f;
                dp0Var.v = true;
                dp0Var.setProgress(f7);
                dp0Var.f(f7, true);
                dp0Var.v = false;
                return;
        }
    }

    public g1(u1 u1Var) {
        super(false);
        this.f22286f = u1Var;
    }
}
