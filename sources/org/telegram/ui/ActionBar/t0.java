package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.zm0;
public final class t0 extends wz {
    public final int f30065e;
    public final ViewGroup f30066f;

    public t0(ViewGroup viewGroup, int i7) {
        super(false);
        this.f30065e = i7;
        this.f30066f = viewGroup;
    }

    @Override
    public CharSequence d() {
        int i7 = this.f30065e;
        ViewGroup viewGroup = this.f30066f;
        switch (i7) {
            case 0:
                return ou0.a(((u0) viewGroup).getSpeed()) + "x  " + gd.N0(2131754758, null);
            case 1:
            default:
                return super.d();
            case 2:
                zm0 zm0Var = ((an0) viewGroup).f33521y;
                if (zm0Var == null) {
                    return null;
                }
                return zm0Var.getContentDescription();
        }
    }

    @Override
    public float h() {
        switch (this.f30065e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int a02 = ((an0) this.f30066f).f33521y.a0();
                if (a02 > 0) {
                    return 1.0f / a02;
                }
                return 0.05f;
        }
    }

    @Override
    public float i() {
        switch (this.f30065e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override
    public float j() {
        switch (this.f30065e) {
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
        switch (this.f30065e) {
            case 0:
                return ((u0) this.f30066f).getSpeed();
            case 1:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f30066f;
                org.telegram.ui.Cells.j1 j1Var = r1Var.D4;
                if (r1Var.Q5.I3()) {
                    f10 = j1Var.f42103b;
                    i7 = j1Var.f42106f;
                    i10 = xm0.E;
                } else if (fj.R4(r1Var.Q5.f24073k)) {
                    if (r1Var.C4) {
                        dn0 dn0Var = r1Var.E4;
                        return dn0Var.f34395a / dn0Var.f34400g;
                    }
                    f10 = j1Var.f42103b;
                    i7 = j1Var.f42106f;
                    i10 = xm0.E;
                } else if (r1Var.Q5.h4()) {
                    return r1Var.Q5.f24033b0;
                } else {
                    return 0.0f;
                }
                return f10 / (i7 - i10);
            default:
                return ((an0) this.f30066f).getProgress();
        }
    }

    @Override
    public final void l(float f10) {
        switch (this.f30065e) {
            case 0:
                ((u0) this.f30066f).e(true, f10);
                return;
            case 1:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f30066f;
                dn0 dn0Var = r1Var.E4;
                org.telegram.ui.Cells.j1 j1Var = r1Var.D4;
                if (r1Var.Q5.I3()) {
                    j1Var.h(f10);
                } else if (fj.R4(r1Var.Q5.f24073k)) {
                    if (r1Var.C4) {
                        dn0Var.g(false, f10);
                    } else {
                        j1Var.h(f10);
                    }
                } else if (r1Var.Q5.h4()) {
                    if (r1Var.C4) {
                        if (dn0Var != null) {
                            dn0Var.g(false, f10);
                        }
                    } else if (j1Var != null) {
                        j1Var.h(f10);
                    }
                    r1Var.Q5.f24033b0 = f10;
                } else {
                    return;
                }
                r1Var.e(f10);
                r1Var.invalidate();
                return;
            default:
                an0 an0Var = (an0) this.f30066f;
                an0Var.f33520x = true;
                an0Var.setProgress(f10);
                an0Var.f(true, f10);
                an0Var.f33520x = false;
                return;
        }
    }

    public t0(an0 an0Var, boolean z10) {
        super(z10);
        this.f30065e = 2;
        this.f30066f = an0Var;
    }
}
