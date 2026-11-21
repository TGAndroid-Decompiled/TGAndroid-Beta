package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.Components.zz;
public final class t0 extends zz {
    public final int f30004e;
    public final ViewGroup f30005f;

    public t0(ViewGroup viewGroup, int i7) {
        super(false);
        this.f30004e = i7;
        this.f30005f = viewGroup;
    }

    @Override
    public CharSequence d() {
        int i7 = this.f30004e;
        ViewGroup viewGroup = this.f30005f;
        switch (i7) {
            case 0:
                return pu0.a(((u0) viewGroup).getSpeed()) + "x  " + gd.N0(2131754758, null);
            case 1:
            default:
                return super.d();
            case 2:
                an0 an0Var = ((bn0) viewGroup).f33891y;
                if (an0Var == null) {
                    return null;
                }
                return an0Var.getContentDescription();
        }
    }

    @Override
    public float h() {
        switch (this.f30004e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int r02 = ((bn0) this.f30005f).f33891y.r0();
                if (r02 > 0) {
                    return 1.0f / r02;
                }
                return 0.05f;
        }
    }

    @Override
    public float i() {
        switch (this.f30004e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override
    public float j() {
        switch (this.f30004e) {
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
        switch (this.f30004e) {
            case 0:
                return ((u0) this.f30005f).getSpeed();
            case 1:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f30005f;
                org.telegram.ui.Cells.j1 j1Var = r1Var.D4;
                if (r1Var.Q5.I3()) {
                    f10 = j1Var.f42465b;
                    i7 = j1Var.f42468f;
                    i10 = ym0.E;
                } else if (fj.R4(r1Var.Q5.f23993k)) {
                    if (r1Var.C4) {
                        en0 en0Var = r1Var.E4;
                        return en0Var.f34918a / en0Var.f34923g;
                    }
                    f10 = j1Var.f42465b;
                    i7 = j1Var.f42468f;
                    i10 = ym0.E;
                } else if (r1Var.Q5.h4()) {
                    return r1Var.Q5.f23953b0;
                } else {
                    return 0.0f;
                }
                return f10 / (i7 - i10);
            default:
                return ((bn0) this.f30005f).getProgress();
        }
    }

    @Override
    public final void l(float f10) {
        switch (this.f30004e) {
            case 0:
                ((u0) this.f30005f).e(true, f10);
                return;
            case 1:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f30005f;
                en0 en0Var = r1Var.E4;
                org.telegram.ui.Cells.j1 j1Var = r1Var.D4;
                if (r1Var.Q5.I3()) {
                    j1Var.h(f10);
                } else if (fj.R4(r1Var.Q5.f23993k)) {
                    if (r1Var.C4) {
                        en0Var.g(false, f10);
                    } else {
                        j1Var.h(f10);
                    }
                } else if (r1Var.Q5.h4()) {
                    if (r1Var.C4) {
                        if (en0Var != null) {
                            en0Var.g(false, f10);
                        }
                    } else if (j1Var != null) {
                        j1Var.h(f10);
                    }
                    r1Var.Q5.f23953b0 = f10;
                } else {
                    return;
                }
                r1Var.a(f10);
                r1Var.invalidate();
                return;
            default:
                bn0 bn0Var = (bn0) this.f30005f;
                bn0Var.f33890x = true;
                bn0Var.setProgress(f10);
                bn0Var.f(true, f10);
                bn0Var.f33890x = false;
                return;
        }
    }

    public t0(bn0 bn0Var, boolean z10) {
        super(z10);
        this.f30004e = 2;
        this.f30005f = bn0Var;
    }
}
