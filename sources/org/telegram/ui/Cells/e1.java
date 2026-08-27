package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.qn0;
import org.telegram.ui.Components.sn0;

public final class e1 extends i00 {

    public final int f24252e = 0;

    public final ViewGroup f24253f;

    public e1(qn0 qn0Var, boolean z10) {
        super(z10);
        this.f24253f = qn0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.f24252e) {
            case 1:
                pn0 pn0Var = ((qn0) this.f24253f).f31945w;
                if (pn0Var != null) {
                    return pn0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override
    public float h() {
        switch (this.f24252e) {
            case 1:
                int iA0 = ((qn0) this.f24253f).f31945w.a0();
                if (iA0 > 0) {
                    return 1.0f / iA0;
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
        switch (this.f24252e) {
            case 0:
                s1 s1Var = (s1) this.f24253f;
                d1 d1Var = s1Var.C5;
                if (s1Var.f25546u7.isMusic()) {
                    f10 = d1Var.f30706b;
                    i10 = d1Var.f30709f;
                    i11 = mn0.E;
                } else {
                    if (!s1Var.f25546u7.isVoice()) {
                        if (s1Var.f25546u7.isRoundVideo()) {
                            return s1Var.f25546u7.audioProgress;
                        }
                        return 0.0f;
                    }
                    if (s1Var.B5) {
                        sn0 sn0Var = s1Var.D5;
                        return sn0Var.f32490a / sn0Var.f32495g;
                    }
                    f10 = d1Var.f30706b;
                    i10 = d1Var.f30709f;
                    i11 = mn0.E;
                }
                return f10 / (i10 - i11);
            default:
                return ((qn0) this.f24253f).getProgress();
        }
    }

    @Override
    public final void l(float f10) {
        switch (this.f24252e) {
            case 0:
                s1 s1Var = (s1) this.f24253f;
                sn0 sn0Var = s1Var.D5;
                d1 d1Var = s1Var.C5;
                if (s1Var.f25546u7.isMusic()) {
                    d1Var.i(f10);
                } else if (s1Var.f25546u7.isVoice()) {
                    if (s1Var.B5) {
                        sn0Var.g(f10, false);
                    } else {
                        d1Var.i(f10);
                    }
                } else if (s1Var.f25546u7.isRoundVideo()) {
                    if (s1Var.B5) {
                        if (sn0Var != null) {
                            sn0Var.g(f10, false);
                        }
                    } else if (d1Var != null) {
                        d1Var.i(f10);
                    }
                    s1Var.f25546u7.audioProgress = f10;
                }
                s1Var.b(f10);
                s1Var.invalidate();
                break;
            default:
                qn0 qn0Var = (qn0) this.f24253f;
                qn0Var.v = true;
                qn0Var.setProgress(f10);
                qn0Var.f(f10, true);
                qn0Var.v = false;
                break;
        }
    }

    public e1(s1 s1Var) {
        super(false);
        this.f24253f = s1Var;
    }
}
