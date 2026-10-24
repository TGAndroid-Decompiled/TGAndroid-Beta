package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.jp0;
public final class f1 extends a10 {
    public final int e = 0;
    public final ViewGroup f22352f;

    public f1(gp0 gp0Var, boolean z10) {
        super(z10);
        this.f22352f = gp0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.e) {
            case 1:
                fp0 fp0Var = ((gp0) this.f22352f).f26761x;
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
                int Y = ((gp0) this.f22352f).f26761x.Y();
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
                t1 t1Var = (t1) this.f22352f;
                e1 e1Var = t1Var.G5;
                if (t1Var.f23660y7.isMusic()) {
                    f7 = e1Var.f25409b;
                    i10 = e1Var.f25411f;
                    i11 = cp0.E;
                } else if (t1Var.f23660y7.isVoice()) {
                    if (t1Var.F5) {
                        jp0 jp0Var = t1Var.H5;
                        return jp0Var.f27763a / jp0Var.f27767g;
                    }
                    f7 = e1Var.f25409b;
                    i10 = e1Var.f25411f;
                    i11 = cp0.E;
                } else if (t1Var.f23660y7.isRoundVideo()) {
                    return t1Var.f23660y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((gp0) this.f22352f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                t1 t1Var = (t1) this.f22352f;
                jp0 jp0Var = t1Var.H5;
                e1 e1Var = t1Var.G5;
                if (t1Var.f23660y7.isMusic()) {
                    e1Var.i(f7);
                } else if (t1Var.f23660y7.isVoice()) {
                    if (t1Var.F5) {
                        jp0Var.g(f7, false);
                    } else {
                        e1Var.i(f7);
                    }
                } else if (t1Var.f23660y7.isRoundVideo()) {
                    if (t1Var.F5) {
                        if (jp0Var != null) {
                            jp0Var.g(f7, false);
                        }
                    } else if (e1Var != null) {
                        e1Var.i(f7);
                    }
                    t1Var.f23660y7.audioProgress = f7;
                } else {
                    return;
                }
                t1Var.a(f7);
                t1Var.invalidate();
                return;
            default:
                gp0 gp0Var = (gp0) this.f22352f;
                gp0Var.f26760w = true;
                gp0Var.setProgress(f7);
                gp0Var.f(f7, true);
                gp0Var.f26760w = false;
                return;
        }
    }

    public f1(t1 t1Var) {
        super(false);
        this.f22352f = t1Var;
    }
}
