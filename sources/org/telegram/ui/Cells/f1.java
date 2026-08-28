package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.rn0;
public final class f1 extends f00 {
    public final int f24325e = 0;
    public final ViewGroup f24326f;

    public f1(pn0 pn0Var, boolean z10) {
        super(z10);
        this.f24326f = pn0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.f24325e) {
            case 1:
                on0 on0Var = ((pn0) this.f24326f).f31711w;
                if (on0Var != null) {
                    return on0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override
    public float h() {
        switch (this.f24325e) {
            case 1:
                int c02 = ((pn0) this.f24326f).f31711w.c0();
                if (c02 > 0) {
                    return 1.0f / c02;
                }
                return 0.05f;
            default:
                return super.h();
        }
    }

    @Override
    public final float k() {
        float f10;
        int i9;
        int i10;
        switch (this.f24325e) {
            case 0:
                t1 t1Var = (t1) this.f24326f;
                e1 e1Var = t1Var.C5;
                if (t1Var.f25593u7.isMusic()) {
                    f10 = e1Var.f30488b;
                    i9 = e1Var.f30491f;
                    i10 = ln0.E;
                } else if (t1Var.f25593u7.isVoice()) {
                    if (t1Var.B5) {
                        rn0 rn0Var = t1Var.D5;
                        return rn0Var.f32209a / rn0Var.f32214g;
                    }
                    f10 = e1Var.f30488b;
                    i9 = e1Var.f30491f;
                    i10 = ln0.E;
                } else if (t1Var.f25593u7.isRoundVideo()) {
                    return t1Var.f25593u7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f10 / (i9 - i10);
            default:
                return ((pn0) this.f24326f).getProgress();
        }
    }

    @Override
    public final void l(float f10) {
        switch (this.f24325e) {
            case 0:
                t1 t1Var = (t1) this.f24326f;
                rn0 rn0Var = t1Var.D5;
                e1 e1Var = t1Var.C5;
                if (t1Var.f25593u7.isMusic()) {
                    e1Var.i(f10);
                } else if (t1Var.f25593u7.isVoice()) {
                    if (t1Var.B5) {
                        rn0Var.g(f10, false);
                    } else {
                        e1Var.i(f10);
                    }
                } else if (t1Var.f25593u7.isRoundVideo()) {
                    if (t1Var.B5) {
                        if (rn0Var != null) {
                            rn0Var.g(f10, false);
                        }
                    } else if (e1Var != null) {
                        e1Var.i(f10);
                    }
                    t1Var.f25593u7.audioProgress = f10;
                } else {
                    return;
                }
                t1Var.b(f10);
                t1Var.invalidate();
                return;
            default:
                pn0 pn0Var = (pn0) this.f24326f;
                pn0Var.v = true;
                pn0Var.setProgress(f10);
                pn0Var.f(f10, true);
                pn0Var.v = false;
                return;
        }
    }

    public f1(t1 t1Var) {
        super(false);
        this.f24326f = t1Var;
    }
}
