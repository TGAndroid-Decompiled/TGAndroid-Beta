package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
public final class tg implements o1.g {
    public final int f30652a = 0;
    public final boolean f30653b;
    public final float f30654c;
    public final float d;
    public final KeyEvent.Callback e;

    public tg(bi biVar, float f7, float f10, boolean z10) {
        this.e = biVar;
        this.f30654c = f7;
        this.d = f10;
        this.f30653b = z10;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.f30652a) {
            case 0:
                bi biVar = (bi) this.e;
                LinearLayout linearLayout = biVar.f24765f3;
                LinearLayout linearLayout2 = biVar.f24771h3;
                float f11 = f7 / 500.0f;
                mh mhVar = biVar.V1;
                uh uhVar = biVar.f24812s2;
                Float valueOf = Float.valueOf(f11);
                mhVar.getClass();
                mhVar.a(uhVar, valueOf);
                biVar.R2.setAlpha(org.telegram.messenger.i0.T1(this.f30654c, this.d, f11));
                biVar.L1(biVar.f24812s2, 0);
                biVar.L1(biVar.f24816t2, 0);
                if (!(biVar.f24816t2 instanceof jm) || this.f30653b) {
                    f11 = 1.0f - f11;
                }
                float i10 = Utilities.i(f11, 1.0f, 0.0f);
                linearLayout2.setAlpha(i10);
                float f12 = 1.0f - i10;
                linearLayout.setAlpha(f12);
                linearLayout.setTranslationX(i10 * (-org.telegram.messenger.i0.L(16.0f)));
                linearLayout2.setTranslationX(f12 * org.telegram.messenger.i0.L(16.0f));
                return;
            default:
                eo0 eo0Var = (eo0) this.e;
                boolean z10 = this.f30653b;
                if (z10) {
                    if (f7 > this.f30654c / 2.0f || !eo0Var.f25893s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !eo0Var.f25892r) {
                    return;
                }
                eo0Var.f25893s = !z10;
                eo0Var.f25892r = z10;
                return;
        }
    }

    public tg(eo0 eo0Var, boolean z10, float f7, float f10) {
        this.e = eo0Var;
        this.f30653b = z10;
        this.f30654c = f7;
        this.d = f10;
    }
}
