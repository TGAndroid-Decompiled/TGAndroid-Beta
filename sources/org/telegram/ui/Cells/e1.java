package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.v00;
public final class e1 extends v00 {
    public final int f22721e = 0;
    public final ViewGroup f22722f;

    public e1(ko0 ko0Var, boolean z4) {
        super(z4);
        this.f22722f = ko0Var;
    }

    @Override
    public CharSequence d() {
        switch (this.f22721e) {
            case 1:
                jo0 jo0Var = ((ko0) this.f22722f).f28469w;
                if (jo0Var != null) {
                    return jo0Var.getContentDescription();
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override
    public float h() {
        switch (this.f22721e) {
            case 1:
                int m0 = ((ko0) this.f22722f).f28469w.m0();
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
        switch (this.f22721e) {
            case 0:
                t1 t1Var = (t1) this.f22722f;
                d1 d1Var = t1Var.D5;
                if (t1Var.f24075v7.isMusic()) {
                    f10 = d1Var.f27205b;
                    i10 = d1Var.f27208f;
                    i11 = go0.E;
                } else if (t1Var.f24075v7.isVoice()) {
                    if (t1Var.C5) {
                        mo0 mo0Var = t1Var.E5;
                        return mo0Var.f29185a / mo0Var.f29190g;
                    }
                    f10 = d1Var.f27205b;
                    i10 = d1Var.f27208f;
                    i11 = go0.E;
                } else if (t1Var.f24075v7.isRoundVideo()) {
                    return t1Var.f24075v7.audioProgress;
                } else {
                    return 0.0f;
                }
                return f10 / (i10 - i11);
            default:
                return ((ko0) this.f22722f).getProgress();
        }
    }

    @Override
    public final void l(float f10) {
        switch (this.f22721e) {
            case 0:
                t1 t1Var = (t1) this.f22722f;
                mo0 mo0Var = t1Var.E5;
                d1 d1Var = t1Var.D5;
                if (t1Var.f24075v7.isMusic()) {
                    d1Var.i(f10);
                } else if (t1Var.f24075v7.isVoice()) {
                    if (t1Var.C5) {
                        mo0Var.g(f10, false);
                    } else {
                        d1Var.i(f10);
                    }
                } else if (t1Var.f24075v7.isRoundVideo()) {
                    if (t1Var.C5) {
                        if (mo0Var != null) {
                            mo0Var.g(f10, false);
                        }
                    } else if (d1Var != null) {
                        d1Var.i(f10);
                    }
                    t1Var.f24075v7.audioProgress = f10;
                } else {
                    return;
                }
                t1Var.b(f10);
                t1Var.invalidate();
                return;
            default:
                ko0 ko0Var = (ko0) this.f22722f;
                ko0Var.v = true;
                ko0Var.setProgress(f10);
                ko0Var.f(f10, true);
                ko0Var.v = false;
                return;
        }
    }

    public e1(t1 t1Var) {
        super(false);
        this.f22722f = t1Var;
    }
}
