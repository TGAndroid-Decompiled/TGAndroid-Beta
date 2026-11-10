package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
public final class wg implements r1.d {
    public final int f39965a = 0;
    public final boolean f39966b;
    public final float f39967c;
    public final float d;
    public final KeyEvent.Callback f39968e;

    public wg(ci ciVar, float f10, float f11, boolean z9) {
        this.f39968e = ciVar;
        this.f39967c = f10;
        this.d = f11;
        this.f39966b = z9;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f39965a) {
            case 0:
                ci ciVar = (ci) this.f39968e;
                LinearLayout linearLayout = ciVar.f32615i3;
                LinearLayout linearLayout2 = ciVar.f32620k3;
                float f12 = f10 / 500.0f;
                nh nhVar = ciVar.Y1;
                uh uhVar = ciVar.f32660v2;
                Float valueOf = Float.valueOf(f12);
                nhVar.getClass();
                nhVar.a(uhVar, valueOf);
                ciVar.U2.setAlpha(org.telegram.messenger.g0.T1(this.f39967c, this.d, f12));
                ciVar.M1(ciVar.f32660v2, 0);
                ciVar.M1(ciVar.f32664w2, 0);
                if (!(ciVar.f32664w2 instanceof am) || this.f39966b) {
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
                cn0 cn0Var = (cn0) this.f39968e;
                boolean z9 = this.f39966b;
                if (z9) {
                    if (f10 > this.f39967c / 2.0f || !cn0Var.f32721s) {
                        return;
                    }
                } else if (f10 < this.d / 2.0f || !cn0Var.f32720r) {
                    return;
                }
                cn0Var.f32721s = !z9;
                cn0Var.f32720r = z9;
                return;
        }
    }

    public wg(cn0 cn0Var, boolean z9, float f10, float f11) {
        this.f39968e = cn0Var;
        this.f39966b = z9;
        this.f39967c = f10;
        this.d = f11;
    }
}
