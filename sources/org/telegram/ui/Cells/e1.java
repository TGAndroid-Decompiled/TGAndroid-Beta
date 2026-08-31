package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.v00;
public final class e1 extends v00 {
    public final int f22719e = 0;
    public final ViewGroup f22720f;

    public e1(lo0 lo0Var, boolean z4) {
        super(z4);
        this.f22720f = lo0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.f22719e) {
            case 1:
                ko0 ko0Var = ((lo0) this.f22720f).f28793w;
                if (ko0Var != null) {
                    return ko0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override
    public float h() {
        switch (this.f22719e) {
            case 1:
                int m0 = ((lo0) this.f22720f).f28793w.m0();
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
        float f10;
        int i10;
        int i11;
        switch (this.f22719e) {
            case 0:
                t1 t1Var = (t1) this.f22720f;
                d1 d1Var = t1Var.D5;
                if (t1Var.f24073v7.isMusic()) {
                    f10 = d1Var.f27533b;
                    i10 = d1Var.f27536f;
                    i11 = ho0.E;
                } else if (t1Var.f24073v7.isVoice()) {
                    if (t1Var.C5) {
                        no0 no0Var = t1Var.E5;
                        return no0Var.f29583a / no0Var.f29588g;
                    }
                    f10 = d1Var.f27533b;
                    i10 = d1Var.f27536f;
                    i11 = ho0.E;
                } else if (t1Var.f24073v7.isRoundVideo()) {
                    return t1Var.f24073v7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f10 / (i10 - i11);
            default:
                return ((lo0) this.f22720f).getProgress();
        }
    }

    @Override
    public final void l(float f10) {
        switch (this.f22719e) {
            case 0:
                t1 t1Var = (t1) this.f22720f;
                no0 no0Var = t1Var.E5;
                d1 d1Var = t1Var.D5;
                if (t1Var.f24073v7.isMusic()) {
                    d1Var.i(f10);
                } else if (t1Var.f24073v7.isVoice()) {
                    if (t1Var.C5) {
                        no0Var.g(f10, false);
                    } else {
                        d1Var.i(f10);
                    }
                } else if (t1Var.f24073v7.isRoundVideo()) {
                    if (t1Var.C5) {
                        if (no0Var != null) {
                            no0Var.g(f10, false);
                        }
                    } else if (d1Var != null) {
                        d1Var.i(f10);
                    }
                    t1Var.f24073v7.audioProgress = f10;
                } else {
                    return;
                }
                t1Var.b(f10);
                t1Var.invalidate();
                return;
            default:
                lo0 lo0Var = (lo0) this.f22720f;
                lo0Var.v = true;
                lo0Var.setProgress(f10);
                lo0Var.f(f10, true);
                lo0Var.v = false;
                return;
        }
    }

    public e1(t1 t1Var) {
        super(false);
        this.f22720f = t1Var;
    }
}
