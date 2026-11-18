package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
public final class lh implements r1.d {
    public final int f37123a = 1;
    public final boolean f37124b;
    public final float f37125c;
    public final float d;
    public final KeyEvent.Callback f37126e;

    public lh(si siVar, float f10, float f11, boolean z10) {
        this.f37126e = siVar;
        this.f37125c = f10;
        this.d = f11;
        this.f37124b = z10;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f37123a) {
            case 0:
                si siVar = (si) this.f37126e;
                LinearLayout linearLayout = siVar.j3;
                LinearLayout linearLayout2 = siVar.f39691l3;
                float f12 = f10 / 500.0f;
                di diVar = siVar.Z1;
                ki kiVar = siVar.f39732w2;
                Float valueOf = Float.valueOf(f12);
                diVar.getClass();
                diVar.a(kiVar, valueOf);
                siVar.V2.setAlpha(org.telegram.messenger.g0.T1(this.f37125c, this.d, f12));
                siVar.N1(siVar.f39732w2, 0);
                siVar.N1(siVar.f39736x2, 0);
                if (!(siVar.f39736x2 instanceof pm) || this.f37124b) {
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
                pn0 pn0Var = (pn0) this.f37126e;
                boolean z10 = this.f37124b;
                if (z10) {
                    if (f10 > this.f37125c / 2.0f || !pn0Var.f38502s) {
                        return;
                    }
                } else if (f10 < this.d / 2.0f || !pn0Var.f38501r) {
                    return;
                }
                pn0Var.f38502s = !z10;
                pn0Var.f38501r = z10;
                return;
        }
    }

    public lh(pn0 pn0Var, boolean z10, float f10, float f11) {
        this.f37126e = pn0Var;
        this.f37124b = z10;
        this.f37125c = f10;
        this.d = f11;
    }
}
