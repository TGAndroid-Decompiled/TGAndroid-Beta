package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
public final class ug implements q1.d {
    public final int f38737a = 0;
    public final boolean f38738b;
    public final float f38739c;
    public final float d;
    public final KeyEvent.Callback f38740e;

    public ug(bi biVar, float f10, float f11, boolean z10) {
        this.f38740e = biVar;
        this.f38739c = f10;
        this.d = f11;
        this.f38738b = z10;
    }

    @Override
    public final void a(q1.g gVar, float f10, float f11) {
        switch (this.f38737a) {
            case 0:
                bi biVar = (bi) this.f38740e;
                LinearLayout linearLayout = biVar.f32230g3;
                LinearLayout linearLayout2 = biVar.i3;
                float f12 = f10 / 500.0f;
                lh lhVar = biVar.W1;
                th thVar = biVar.f32275t2;
                Float valueOf = Float.valueOf(f12);
                lhVar.getClass();
                lhVar.a(thVar, valueOf);
                biVar.S2.setAlpha(org.telegram.messenger.g0.T1(this.f38739c, this.d, f12));
                biVar.M1(biVar.f32275t2, 0);
                biVar.M1(biVar.f32279u2, 0);
                if (!(biVar.f32279u2 instanceof am) || this.f38738b) {
                    f12 = 1.0f - f12;
                }
                float i3 = Utilities.i(f12, 1.0f, 0.0f);
                linearLayout2.setAlpha(i3);
                float f13 = 1.0f - i3;
                linearLayout.setAlpha(f13);
                linearLayout.setTranslationX(i3 * (-org.telegram.messenger.g0.L(16.0f)));
                linearLayout2.setTranslationX(f13 * org.telegram.messenger.g0.L(16.0f));
                return;
            default:
                fn0 fn0Var = (fn0) this.f38740e;
                boolean z10 = this.f38738b;
                if (z10) {
                    if (f10 > this.f38739c / 2.0f || !fn0Var.f33829s) {
                        return;
                    }
                } else if (f10 < this.d / 2.0f || !fn0Var.f33828r) {
                    return;
                }
                fn0Var.f33829s = !z10;
                fn0Var.f33828r = z10;
                return;
        }
    }

    public ug(fn0 fn0Var, boolean z10, float f10, float f11) {
        this.f38740e = fn0Var;
        this.f38738b = z10;
        this.f38739c = f10;
        this.d = f11;
    }
}
