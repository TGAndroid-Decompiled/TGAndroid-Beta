package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.pm0;
public final class u0 extends nz {
    public final int f28548e;
    public final ViewGroup f28549f;

    public u0(ViewGroup viewGroup, int i7) {
        super(false);
        this.f28548e = i7;
        this.f28549f = viewGroup;
    }

    @Override
    public CharSequence d() {
        int i7 = this.f28548e;
        ViewGroup viewGroup = this.f28549f;
        switch (i7) {
            case 0:
                return du0.a(((v0) viewGroup).getSpeed()) + "x  " + id.M0(2131754759, null);
            case 1:
            default:
                return super.d();
            case 2:
                lm0 lm0Var = ((mm0) viewGroup).f36023y;
                if (lm0Var == null) {
                    return null;
                }
                return lm0Var.getContentDescription();
        }
    }

    @Override
    public float h() {
        switch (this.f28548e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int q02 = ((mm0) this.f28549f).f36023y.q0();
                if (q02 > 0) {
                    return 1.0f / q02;
                }
                return 0.05f;
        }
    }

    @Override
    public float i() {
        switch (this.f28548e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override
    public float j() {
        switch (this.f28548e) {
            case 0:
                return 0.2f;
            default:
                return super.j();
        }
    }

    @Override
    public final float k() {
        float f10;
        int i7;
        int i10;
        switch (this.f28548e) {
            case 0:
                return ((v0) this.f28549f).getSpeed();
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f28549f;
                org.telegram.ui.Cells.i1 i1Var = q1Var.C4;
                if (q1Var.P5.J3()) {
                    f10 = i1Var.f35021b;
                    i7 = i1Var.f35024f;
                    i10 = jm0.E;
                } else if (ij.S4(q1Var.P5.f23262k)) {
                    if (q1Var.B4) {
                        pm0 pm0Var = q1Var.D4;
                        return pm0Var.f37020a / pm0Var.f37025g;
                    }
                    f10 = i1Var.f35021b;
                    i7 = i1Var.f35024f;
                    i10 = jm0.E;
                } else if (q1Var.P5.i4()) {
                    return q1Var.P5.f23222b0;
                } else {
                    return 0.0f;
                }
                return f10 / (i7 - i10);
            default:
                return ((mm0) this.f28549f).getProgress();
        }
    }

    @Override
    public final void l(float f10) {
        switch (this.f28548e) {
            case 0:
                ((v0) this.f28549f).e(true, f10);
                return;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f28549f;
                pm0 pm0Var = q1Var.D4;
                org.telegram.ui.Cells.i1 i1Var = q1Var.C4;
                if (q1Var.P5.J3()) {
                    i1Var.h(f10);
                } else if (ij.S4(q1Var.P5.f23262k)) {
                    if (q1Var.B4) {
                        pm0Var.g(false, f10);
                    } else {
                        i1Var.h(f10);
                    }
                } else if (q1Var.P5.i4()) {
                    if (q1Var.B4) {
                        if (pm0Var != null) {
                            pm0Var.g(false, f10);
                        }
                    } else if (i1Var != null) {
                        i1Var.h(f10);
                    }
                    q1Var.P5.f23222b0 = f10;
                } else {
                    return;
                }
                q1Var.a(f10);
                q1Var.invalidate();
                return;
            default:
                mm0 mm0Var = (mm0) this.f28549f;
                mm0Var.f36022x = true;
                mm0Var.setProgress(f10);
                mm0Var.f(true, f10);
                mm0Var.f36022x = false;
                return;
        }
    }

    public u0(mm0 mm0Var, boolean z9) {
        super(z9);
        this.f28548e = 2;
        this.f28549f = mm0Var;
    }
}
