package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.ro0;
public final class f1 extends b10 {
    public final int e = 0;
    public final ViewGroup f19104f;

    public f1(oo0 oo0Var, boolean z10) {
        super(z10);
        this.f19104f = oo0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.e) {
            case 1:
                no0 no0Var = ((oo0) this.f19104f).f25876w;
                if (no0Var != null) {
                    return no0Var.getContentDescription();
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
                int k02 = ((oo0) this.f19104f).f25876w.k0();
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
                t1 t1Var = (t1) this.f19104f;
                e1 e1Var = t1Var.G5;
                if (t1Var.f20403y7.isMusic()) {
                    f7 = e1Var.f24768b;
                    i10 = e1Var.f24770f;
                    i11 = ko0.E;
                } else if (t1Var.f20403y7.isVoice()) {
                    if (t1Var.F5) {
                        ro0 ro0Var = t1Var.H5;
                        return ro0Var.f26711a / ro0Var.f26715g;
                    }
                    f7 = e1Var.f24768b;
                    i10 = e1Var.f24770f;
                    i11 = ko0.E;
                } else if (t1Var.f20403y7.isRoundVideo()) {
                    return t1Var.f20403y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((oo0) this.f19104f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                t1 t1Var = (t1) this.f19104f;
                ro0 ro0Var = t1Var.H5;
                e1 e1Var = t1Var.G5;
                if (t1Var.f20403y7.isMusic()) {
                    e1Var.i(f7);
                } else if (t1Var.f20403y7.isVoice()) {
                    if (t1Var.F5) {
                        ro0Var.g(f7, false);
                    } else {
                        e1Var.i(f7);
                    }
                } else if (t1Var.f20403y7.isRoundVideo()) {
                    if (t1Var.F5) {
                        if (ro0Var != null) {
                            ro0Var.g(f7, false);
                        }
                    } else if (e1Var != null) {
                        e1Var.i(f7);
                    }
                    t1Var.f20403y7.audioProgress = f7;
                } else {
                    return;
                }
                t1Var.b(f7);
                t1Var.invalidate();
                return;
            default:
                oo0 oo0Var = (oo0) this.f19104f;
                oo0Var.v = true;
                oo0Var.setProgress(f7);
                oo0Var.f(f7, true);
                oo0Var.v = false;
                return;
        }
    }

    public f1(t1 t1Var) {
        super(false);
        this.f19104f = t1Var;
    }
}
