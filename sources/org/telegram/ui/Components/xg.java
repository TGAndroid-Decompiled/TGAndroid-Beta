package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
public final class xg implements r1.d {
    public final int f40273a = 1;
    public final boolean f40274b;
    public final float f40275c;
    public final float d;
    public final KeyEvent.Callback f40276e;

    public xg(di diVar, float f10, float f11, boolean z9) {
        this.f40276e = diVar;
        this.f40275c = f10;
        this.d = f11;
        this.f40274b = z9;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f40273a) {
            case 0:
                di diVar = (di) this.f40276e;
                LinearLayout linearLayout = diVar.f32910f3;
                LinearLayout linearLayout2 = diVar.f32916h3;
                float f12 = f10 / 500.0f;
                oh ohVar = diVar.V1;
                vh vhVar = diVar.f32955s2;
                Float valueOf = Float.valueOf(f12);
                ohVar.getClass();
                ohVar.a(vhVar, valueOf);
                diVar.R2.setAlpha(org.telegram.messenger.g0.T1(this.f40275c, this.d, f12));
                diVar.M1(diVar.f32955s2, 0);
                diVar.M1(diVar.f32959t2, 0);
                if (!(diVar.f32959t2 instanceof bm) || this.f40274b) {
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
                cn0 cn0Var = (cn0) this.f40276e;
                boolean z9 = this.f40274b;
                if (z9) {
                    if (f10 > this.f40275c / 2.0f || !cn0Var.f32629s) {
                        return;
                    }
                } else if (f10 < this.d / 2.0f || !cn0Var.f32628r) {
                    return;
                }
                cn0Var.f32629s = !z9;
                cn0Var.f32628r = z9;
                return;
        }
    }

    public xg(cn0 cn0Var, boolean z9, float f10, float f11) {
        this.f40276e = cn0Var;
        this.f40274b = z9;
        this.f40275c = f10;
        this.d = f11;
    }
}
