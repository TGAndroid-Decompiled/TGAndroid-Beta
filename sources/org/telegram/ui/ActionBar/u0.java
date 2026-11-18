package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.ym0;
public final class u0 extends xz {
    public final int f30021e;
    public final ViewGroup f30022f;

    public u0(ViewGroup viewGroup, int i7) {
        super(false);
        this.f30021e = i7;
        this.f30022f = viewGroup;
    }

    @Override
    public CharSequence d() {
        int i7 = this.f30021e;
        ViewGroup viewGroup = this.f30022f;
        switch (i7) {
            case 0:
                return mu0.a(((v0) viewGroup).getSpeed()) + "x  " + gd.M0(2131754759, null);
            case 1:
            default:
                return super.d();
            case 2:
                xm0 xm0Var = ((ym0) viewGroup).f42545y;
                if (xm0Var == null) {
                    return null;
                }
                return xm0Var.getContentDescription();
        }
    }

    @Override
    public float h() {
        switch (this.f30021e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int r02 = ((ym0) this.f30022f).f42545y.r0();
                if (r02 > 0) {
                    return 1.0f / r02;
                }
                return 0.05f;
        }
    }

    @Override
    public float i() {
        switch (this.f30021e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override
    public float j() {
        switch (this.f30021e) {
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
        switch (this.f30021e) {
            case 0:
                return ((v0) this.f30022f).getSpeed();
            case 1:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f30022f;
                org.telegram.ui.Cells.j1 j1Var = r1Var.D4;
                if (r1Var.Q5.I3()) {
                    f10 = j1Var.f40708b;
                    i7 = j1Var.f40711f;
                    i10 = vm0.E;
                } else if (fj.R4(r1Var.Q5.f23965k)) {
                    if (r1Var.C4) {
                        bn0 bn0Var = r1Var.E4;
                        return bn0Var.f33726a / bn0Var.f33731g;
                    }
                    f10 = j1Var.f40708b;
                    i7 = j1Var.f40711f;
                    i10 = vm0.E;
                } else if (r1Var.Q5.h4()) {
                    return r1Var.Q5.f23925b0;
                } else {
                    return 0.0f;
                }
                return f10 / (i7 - i10);
            default:
                return ((ym0) this.f30022f).getProgress();
        }
    }

    @Override
    public final void l(float f10) {
        switch (this.f30021e) {
            case 0:
                ((v0) this.f30022f).e(true, f10);
                return;
            case 1:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f30022f;
                bn0 bn0Var = r1Var.E4;
                org.telegram.ui.Cells.j1 j1Var = r1Var.D4;
                if (r1Var.Q5.I3()) {
                    j1Var.h(f10);
                } else if (fj.R4(r1Var.Q5.f23965k)) {
                    if (r1Var.C4) {
                        bn0Var.g(false, f10);
                    } else {
                        j1Var.h(f10);
                    }
                } else if (r1Var.Q5.h4()) {
                    if (r1Var.C4) {
                        if (bn0Var != null) {
                            bn0Var.g(false, f10);
                        }
                    } else if (j1Var != null) {
                        j1Var.h(f10);
                    }
                    r1Var.Q5.f23925b0 = f10;
                } else {
                    return;
                }
                r1Var.a(f10);
                r1Var.invalidate();
                return;
            default:
                ym0 ym0Var = (ym0) this.f30022f;
                ym0Var.f42544x = true;
                ym0Var.setProgress(f10);
                ym0Var.f(true, f10);
                ym0Var.f42544x = false;
                return;
        }
    }

    public u0(ym0 ym0Var, boolean z10) {
        super(z10);
        this.f30021e = 2;
        this.f30022f = ym0Var;
    }
}
