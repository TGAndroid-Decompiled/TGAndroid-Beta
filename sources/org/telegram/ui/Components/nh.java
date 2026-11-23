package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
public final class nh implements r1.d {
    public final int f37876a = 1;
    public final boolean f37877b;
    public final float f37878c;
    public final float d;
    public final KeyEvent.Callback f37879e;

    public nh(ui uiVar, float f10, float f11, boolean z10) {
        this.f37879e = uiVar;
        this.f37878c = f10;
        this.d = f11;
        this.f37877b = z10;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f37876a) {
            case 0:
                ui uiVar = (ui) this.f37879e;
                LinearLayout linearLayout = uiVar.j3;
                LinearLayout linearLayout2 = uiVar.f40400l3;
                float f12 = f10 / 500.0f;
                fi fiVar = uiVar.Z1;
                mi miVar = uiVar.f40441w2;
                Float valueOf = Float.valueOf(f12);
                fiVar.getClass();
                fiVar.a(miVar, valueOf);
                uiVar.V2.setAlpha(org.telegram.messenger.g0.T1(this.f37878c, this.d, f12));
                uiVar.N1(uiVar.f40441w2, 0);
                uiVar.N1(uiVar.f40445x2, 0);
                if (!(uiVar.f40445x2 instanceof rm) || this.f37877b) {
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
                rn0 rn0Var = (rn0) this.f37879e;
                boolean z10 = this.f37877b;
                if (z10) {
                    if (f10 > this.f37878c / 2.0f || !rn0Var.f39295s) {
                        return;
                    }
                } else if (f10 < this.d / 2.0f || !rn0Var.f39294r) {
                    return;
                }
                rn0Var.f39295s = !z10;
                rn0Var.f39294r = z10;
                return;
        }
    }

    public nh(rn0 rn0Var, boolean z10, float f10, float f11) {
        this.f37879e = rn0Var;
        this.f37877b = z10;
        this.f37878c = f10;
        this.d = f11;
    }
}
