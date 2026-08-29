package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.zn0;
public final class e1 extends q00 {
    public final int f24269e = 0;
    public final ViewGroup f24270f;

    public e1(ao0 ao0Var, boolean z10) {
        super(z10);
        this.f24270f = ao0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.f24269e) {
            case 1:
                zn0 zn0Var = ((ao0) this.f24270f).f26825w;
                if (zn0Var != null) {
                    return zn0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override
    public float h() {
        switch (this.f24269e) {
            case 1:
                int k02 = ((ao0) this.f24270f).f26825w.k0();
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
        float f9;
        int i10;
        int i11;
        switch (this.f24269e) {
            case 0:
                s1 s1Var = (s1) this.f24270f;
                d1 d1Var = s1Var.C5;
                if (s1Var.f25556u7.isMusic()) {
                    f9 = d1Var.f34447b;
                    i10 = d1Var.f34450f;
                    i11 = wn0.E;
                } else if (s1Var.f25556u7.isVoice()) {
                    if (s1Var.B5) {
                        co0 co0Var = s1Var.D5;
                        return co0Var.f27523a / co0Var.f27528g;
                    }
                    f9 = d1Var.f34447b;
                    i10 = d1Var.f34450f;
                    i11 = wn0.E;
                } else if (s1Var.f25556u7.isRoundVideo()) {
                    return s1Var.f25556u7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f9 / (i10 - i11);
            default:
                return ((ao0) this.f24270f).getProgress();
        }
    }

    @Override
    public final void l(float f9) {
        switch (this.f24269e) {
            case 0:
                s1 s1Var = (s1) this.f24270f;
                co0 co0Var = s1Var.D5;
                d1 d1Var = s1Var.C5;
                if (s1Var.f25556u7.isMusic()) {
                    d1Var.i(f9);
                } else if (s1Var.f25556u7.isVoice()) {
                    if (s1Var.B5) {
                        co0Var.g(f9, false);
                    } else {
                        d1Var.i(f9);
                    }
                } else if (s1Var.f25556u7.isRoundVideo()) {
                    if (s1Var.B5) {
                        if (co0Var != null) {
                            co0Var.g(f9, false);
                        }
                    } else if (d1Var != null) {
                        d1Var.i(f9);
                    }
                    s1Var.f25556u7.audioProgress = f9;
                } else {
                    return;
                }
                s1Var.c(f9);
                s1Var.invalidate();
                return;
            default:
                ao0 ao0Var = (ao0) this.f24270f;
                ao0Var.v = true;
                ao0Var.setProgress(f9);
                ao0Var.f(f9, true);
                ao0Var.v = false;
                return;
        }
    }

    public e1(s1 s1Var) {
        super(false);
        this.f24270f = s1Var;
    }
}
