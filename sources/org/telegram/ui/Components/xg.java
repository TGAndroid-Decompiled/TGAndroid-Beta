package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
public final class xg implements r1.d {
    public final int f40380a = 0;
    public final boolean f40381b;
    public final float f40382c;
    public final float d;
    public final KeyEvent.Callback f40383e;

    public xg(di diVar, float f10, float f11, boolean z9) {
        this.f40383e = diVar;
        this.f40382c = f10;
        this.d = f11;
        this.f40381b = z9;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f40380a) {
            case 0:
                di diVar = (di) this.f40383e;
                LinearLayout linearLayout = diVar.f33002f3;
                LinearLayout linearLayout2 = diVar.f33008h3;
                float f12 = f10 / 500.0f;
                oh ohVar = diVar.V1;
                vh vhVar = diVar.f33047s2;
                Float valueOf = Float.valueOf(f12);
                ohVar.getClass();
                ohVar.a(vhVar, valueOf);
                diVar.R2.setAlpha(org.telegram.messenger.g0.T1(this.f40382c, this.d, f12));
                diVar.M1(diVar.f33047s2, 0);
                diVar.M1(diVar.f33051t2, 0);
                if (!(diVar.f33051t2 instanceof bm) || this.f40381b) {
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
                dn0 dn0Var = (dn0) this.f40383e;
                boolean z9 = this.f40381b;
                if (z9) {
                    if (f10 > this.f40382c / 2.0f || !dn0Var.f33120s) {
                        return;
                    }
                } else if (f10 < this.d / 2.0f || !dn0Var.f33119r) {
                    return;
                }
                dn0Var.f33120s = !z9;
                dn0Var.f33119r = z9;
                return;
        }
    }

    public xg(dn0 dn0Var, boolean z9, float f10, float f11) {
        this.f40383e = dn0Var;
        this.f40381b = z9;
        this.f40382c = f10;
        this.d = f11;
    }
}
