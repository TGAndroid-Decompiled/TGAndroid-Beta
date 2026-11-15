package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
public final class ch implements r1.d {
    public final int f33566a = 1;
    public final boolean f33567b;
    public final float f33568c;
    public final float d;
    public final KeyEvent.Callback f33569e;

    public ch(ki kiVar, float f10, float f11, boolean z10) {
        this.f33569e = kiVar;
        this.f33568c = f10;
        this.d = f11;
        this.f33567b = z10;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f33566a) {
            case 0:
                ki kiVar = (ki) this.f33569e;
                LinearLayout linearLayout = kiVar.j3;
                LinearLayout linearLayout2 = kiVar.f36468l3;
                float f12 = f10 / 500.0f;
                vh vhVar = kiVar.Z1;
                ci ciVar = kiVar.f36509w2;
                Float valueOf = Float.valueOf(f12);
                vhVar.getClass();
                vhVar.a(ciVar, valueOf);
                kiVar.V2.setAlpha(org.telegram.messenger.g0.T1(this.f33568c, this.d, f12));
                kiVar.M1(kiVar.f36509w2, 0);
                kiVar.M1(kiVar.f36513x2, 0);
                if (!(kiVar.f36513x2 instanceof im) || this.f33567b) {
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
                gn0 gn0Var = (gn0) this.f33569e;
                boolean z10 = this.f33567b;
                if (z10) {
                    if (f10 > this.f33568c / 2.0f || !gn0Var.f35035s) {
                        return;
                    }
                } else if (f10 < this.d / 2.0f || !gn0Var.f35034r) {
                    return;
                }
                gn0Var.f35035s = !z10;
                gn0Var.f35034r = z10;
                return;
        }
    }

    public ch(gn0 gn0Var, boolean z10, float f10, float f11) {
        this.f33569e = gn0Var;
        this.f33567b = z10;
        this.f33568c = f10;
        this.d = f11;
    }
}
