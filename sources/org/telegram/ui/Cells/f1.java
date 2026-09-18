package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.u00;
public final class f1 extends u00 {
    public final int e = 0;
    public final ViewGroup f20070f;

    public f1(go0 go0Var, boolean z10) {
        super(z10);
        this.f20070f = go0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.e) {
            case 1:
                fo0 fo0Var = ((go0) this.f20070f).f24376w;
                if (fo0Var != null) {
                    return fo0Var.getContentDescription();
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
                int m0 = ((go0) this.f20070f).f24376w.m0();
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
                t1 t1Var = (t1) this.f20070f;
                e1 e1Var = t1Var.G5;
                if (t1Var.f21333y7.isMusic()) {
                    f7 = e1Var.f23094b;
                    i10 = e1Var.f23096f;
                    i11 = co0.E;
                } else if (t1Var.f21333y7.isVoice()) {
                    if (t1Var.F5) {
                        jo0 jo0Var = t1Var.H5;
                        return jo0Var.f25378a / jo0Var.f25382g;
                    }
                    f7 = e1Var.f23094b;
                    i10 = e1Var.f23096f;
                    i11 = co0.E;
                } else if (t1Var.f21333y7.isRoundVideo()) {
                    return t1Var.f21333y7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f7 / (i10 - i11);
            default:
                return ((go0) this.f20070f).getProgress();
        }
    }

    @Override
    public final void l(float f7) {
        switch (this.e) {
            case 0:
                t1 t1Var = (t1) this.f20070f;
                jo0 jo0Var = t1Var.H5;
                e1 e1Var = t1Var.G5;
                if (t1Var.f21333y7.isMusic()) {
                    e1Var.i(f7);
                } else if (t1Var.f21333y7.isVoice()) {
                    if (t1Var.F5) {
                        jo0Var.g(f7, false);
                    } else {
                        e1Var.i(f7);
                    }
                } else if (t1Var.f21333y7.isRoundVideo()) {
                    if (t1Var.F5) {
                        if (jo0Var != null) {
                            jo0Var.g(f7, false);
                        }
                    } else if (e1Var != null) {
                        e1Var.i(f7);
                    }
                    t1Var.f21333y7.audioProgress = f7;
                } else {
                    return;
                }
                t1Var.b(f7);
                t1Var.invalidate();
                return;
            default:
                go0 go0Var = (go0) this.f20070f;
                go0Var.v = true;
                go0Var.setProgress(f7);
                go0Var.f(f7, true);
                go0Var.v = false;
                return;
        }
    }

    public f1(t1 t1Var) {
        super(false);
        this.f20070f = t1Var;
    }
}
