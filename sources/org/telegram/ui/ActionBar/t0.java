package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.bd;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.sm0;
public final class t0 extends jz {
    public final int f28578e;
    public final ViewGroup f28579f;

    public t0(ViewGroup viewGroup, int i3) {
        super(false);
        this.f28578e = i3;
        this.f28579f = viewGroup;
    }

    @Override
    public CharSequence d() {
        int i3 = this.f28578e;
        ViewGroup viewGroup = this.f28579f;
        switch (i3) {
            case 0:
                return cu0.a(((u0) viewGroup).getSpeed()) + "x  " + bd.M0(2131754759, null);
            case 1:
            default:
                return super.d();
            case 2:
                om0 om0Var = ((pm0) viewGroup).f37200y;
                if (om0Var == null) {
                    return null;
                }
                return om0Var.getContentDescription();
        }
    }

    @Override
    public float h() {
        switch (this.f28578e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int q02 = ((pm0) this.f28579f).f37200y.q0();
                if (q02 > 0) {
                    return 1.0f / q02;
                }
                return 0.05f;
        }
    }

    @Override
    public float i() {
        switch (this.f28578e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override
    public float j() {
        switch (this.f28578e) {
            case 0:
                return 0.2f;
            default:
                return super.j();
        }
    }

    @Override
    public final float k() {
        float f10;
        int i3;
        int i10;
        switch (this.f28578e) {
            case 0:
                return ((u0) this.f28579f).getSpeed();
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f28579f;
                org.telegram.ui.Cells.i1 i1Var = q1Var.C4;
                if (q1Var.P5.J3()) {
                    f10 = i1Var.f36189b;
                    i3 = i1Var.f36192f;
                    i10 = mm0.E;
                } else if (zi.S4(q1Var.P5.f26868k)) {
                    if (q1Var.B4) {
                        sm0 sm0Var = q1Var.D4;
                        return sm0Var.f38065a / sm0Var.f38070g;
                    }
                    f10 = i1Var.f36189b;
                    i3 = i1Var.f36192f;
                    i10 = mm0.E;
                } else if (q1Var.P5.i4()) {
                    return q1Var.P5.f26828b0;
                } else {
                    return 0.0f;
                }
                return f10 / (i3 - i10);
            default:
                return ((pm0) this.f28579f).getProgress();
        }
    }

    @Override
    public final void l(float f10) {
        switch (this.f28578e) {
            case 0:
                ((u0) this.f28579f).e(true, f10);
                return;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f28579f;
                sm0 sm0Var = q1Var.D4;
                org.telegram.ui.Cells.i1 i1Var = q1Var.C4;
                if (q1Var.P5.J3()) {
                    i1Var.h(f10);
                } else if (zi.S4(q1Var.P5.f26868k)) {
                    if (q1Var.B4) {
                        sm0Var.g(false, f10);
                    } else {
                        i1Var.h(f10);
                    }
                } else if (q1Var.P5.i4()) {
                    if (q1Var.B4) {
                        if (sm0Var != null) {
                            sm0Var.g(false, f10);
                        }
                    } else if (i1Var != null) {
                        i1Var.h(f10);
                    }
                    q1Var.P5.f26828b0 = f10;
                } else {
                    return;
                }
                q1Var.c(f10);
                q1Var.invalidate();
                return;
            default:
                pm0 pm0Var = (pm0) this.f28579f;
                pm0Var.f37199x = true;
                pm0Var.setProgress(f10);
                pm0Var.f(true, f10);
                pm0Var.f37199x = false;
                return;
        }
    }

    public t0(pm0 pm0Var, boolean z10) {
        super(z10);
        this.f28578e = 2;
        this.f28579f = pm0Var;
    }
}
