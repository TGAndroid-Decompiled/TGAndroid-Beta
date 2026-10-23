package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.kp0;
public final class f1 extends c10 {
    public final int e = 0;
    public final ViewGroup f22351f;

    public f1(hp0 hp0Var, boolean z10) {
        super(z10);
        this.f22351f = hp0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.e) {
            case 1:
                gp0 gp0Var = ((hp0) this.f22351f).f27016x;
                if (gp0Var != null) {
                    return gp0Var.getContentDescription();
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
                int Y = ((hp0) this.f22351f).f27016x.Y();
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
                t1 t1Var = (t1) this.f22351f;
                e1 e1Var = t1Var.G5;
                if (t1Var.f23659y7.isMusic()) {
                    f7 = e1Var.f25684b;
                    i10 = e1Var.f25686f;
                    i11 = dp0.E;
                } else if (t1Var.f23659y7.isVoice()) {
                    if (t1Var.F5) {
                        kp0 kp0Var = t1Var.H5;
                        return kp0Var.f28102a / kp0Var.f28106g;
                    }
                    f7 = e1Var.f25684b;
                    i10 = e1Var.f25686f;
                    i11 = dp0.E;
                } else if (t1Var.f23659y7.isRoundVideo()) {
                    return t1Var.f23659y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((hp0) this.f22351f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                t1 t1Var = (t1) this.f22351f;
                kp0 kp0Var = t1Var.H5;
                e1 e1Var = t1Var.G5;
                if (t1Var.f23659y7.isMusic()) {
                    e1Var.i(f7);
                } else if (t1Var.f23659y7.isVoice()) {
                    if (t1Var.F5) {
                        kp0Var.g(f7, false);
                    } else {
                        e1Var.i(f7);
                    }
                } else if (t1Var.f23659y7.isRoundVideo()) {
                    if (t1Var.F5) {
                        if (kp0Var != null) {
                            kp0Var.g(f7, false);
                        }
                    } else if (e1Var != null) {
                        e1Var.i(f7);
                    }
                    t1Var.f23659y7.audioProgress = f7;
                } else {
                    return;
                }
                t1Var.a(f7);
                t1Var.invalidate();
                return;
            default:
                hp0 hp0Var = (hp0) this.f22351f;
                hp0Var.f27015w = true;
                hp0Var.setProgress(f7);
                hp0Var.f(f7, true);
                hp0Var.f27015w = false;
                return;
        }
    }

    public f1(t1 t1Var) {
        super(false);
        this.f22351f = t1Var;
    }
}
