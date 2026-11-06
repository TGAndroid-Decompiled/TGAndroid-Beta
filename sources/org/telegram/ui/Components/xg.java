package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
public final class xg implements r1.d {
    public final int f40289a = 1;
    public final boolean f40290b;
    public final float f40291c;
    public final float d;
    public final KeyEvent.Callback f40292e;

    public xg(di diVar, float f10, float f11, boolean z9) {
        this.f40292e = diVar;
        this.f40291c = f10;
        this.d = f11;
        this.f40290b = z9;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f40289a) {
            case 0:
                di diVar = (di) this.f40292e;
                LinearLayout linearLayout = diVar.f32939f3;
                LinearLayout linearLayout2 = diVar.f32945h3;
                float f12 = f10 / 500.0f;
                oh ohVar = diVar.V1;
                vh vhVar = diVar.f32984s2;
                Float valueOf = Float.valueOf(f12);
                ohVar.getClass();
                ohVar.a(vhVar, valueOf);
                diVar.R2.setAlpha(org.telegram.messenger.g0.T1(this.f40291c, this.d, f12));
                diVar.M1(diVar.f32984s2, 0);
                diVar.M1(diVar.f32988t2, 0);
                if (!(diVar.f32988t2 instanceof bm) || this.f40290b) {
                    f12 = 1.0f - f12;
                }
                float i7 = Utilities.i(f12, 1.0f, 0.0f);
                linearLayout2.setAlpha(i7);
                float f13 = 1.0f - i7;
                linearLayout.setAlpha(f13);
                linearLayout.setTranslationX(i7 * (-org.telegram.messenger.g0.L(16.0f)));
                linearLayout2.setTranslationX(f13 * org.telegram.messenger.g0.L(16.0f));
                return;
            default:
                cn0 cn0Var = (cn0) this.f40292e;
                boolean z9 = this.f40290b;
                if (z9) {
                    if (f10 > this.f40291c / 2.0f || !cn0Var.f32616s) {
                        return;
                    }
                } else if (f10 < this.d / 2.0f || !cn0Var.f32615r) {
                    return;
                }
                cn0Var.f32616s = !z9;
                cn0Var.f32615r = z9;
                return;
        }
    }

    public xg(cn0 cn0Var, boolean z9, float f10, float f11) {
        this.f40292e = cn0Var;
        this.f40290b = z9;
        this.f40291c = f10;
        this.d = f11;
    }
}
