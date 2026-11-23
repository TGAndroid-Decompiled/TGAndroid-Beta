package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
public final class mh implements r1.d {
    public final int f37452a = 1;
    public final boolean f37453b;
    public final float f37454c;
    public final float d;
    public final KeyEvent.Callback f37455e;

    public mh(ti tiVar, float f10, float f11, boolean z10) {
        this.f37455e = tiVar;
        this.f37454c = f10;
        this.d = f11;
        this.f37453b = z10;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f37452a) {
            case 0:
                ti tiVar = (ti) this.f37455e;
                LinearLayout linearLayout = tiVar.j3;
                LinearLayout linearLayout2 = tiVar.f39988l3;
                float f12 = f10 / 500.0f;
                ei eiVar = tiVar.Z1;
                li liVar = tiVar.f40029w2;
                Float valueOf = Float.valueOf(f12);
                eiVar.getClass();
                eiVar.a(liVar, valueOf);
                tiVar.V2.setAlpha(org.telegram.messenger.g0.T1(this.f37454c, this.d, f12));
                tiVar.N1(tiVar.f40029w2, 0);
                tiVar.N1(tiVar.f40033x2, 0);
                if (!(tiVar.f40033x2 instanceof pm) || this.f37453b) {
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
                qn0 qn0Var = (qn0) this.f37455e;
                boolean z10 = this.f37453b;
                if (z10) {
                    if (f10 > this.f37454c / 2.0f || !qn0Var.f38964s) {
                        return;
                    }
                } else if (f10 < this.d / 2.0f || !qn0Var.f38963r) {
                    return;
                }
                qn0Var.f38964s = !z10;
                qn0Var.f38963r = z10;
                return;
        }
    }

    public mh(qn0 qn0Var, boolean z10, float f10, float f11) {
        this.f37455e = qn0Var;
        this.f37453b = z10;
        this.f37454c = f10;
        this.d = f11;
    }
}
