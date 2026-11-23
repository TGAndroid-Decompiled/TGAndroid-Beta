package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.Components.zz;
public final class t0 extends zz {
    public final int f29973e;
    public final ViewGroup f29974f;

    public t0(ViewGroup viewGroup, int i7) {
        super(false);
        this.f29973e = i7;
        this.f29974f = viewGroup;
    }

    @Override
    public CharSequence d() {
        int i7 = this.f29973e;
        ViewGroup viewGroup = this.f29974f;
        switch (i7) {
            case 0:
                return pu0.a(((u0) viewGroup).getSpeed()) + "x  " + hd.N0(2131754758, null);
            case 1:
            default:
                return super.d();
            case 2:
                zm0 zm0Var = ((an0) viewGroup).f33538y;
                if (zm0Var == null) {
                    return null;
                }
                return zm0Var.getContentDescription();
        }
    }

    @Override
    public float h() {
        switch (this.f29973e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int r02 = ((an0) this.f29974f).f33538y.r0();
                if (r02 > 0) {
                    return 1.0f / r02;
                }
                return 0.05f;
        }
    }

    @Override
    public float i() {
        switch (this.f29973e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override
    public float j() {
        switch (this.f29973e) {
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
        switch (this.f29973e) {
            case 0:
                return ((u0) this.f29974f).getSpeed();
            case 1:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f29974f;
                org.telegram.ui.Cells.j1 j1Var = r1Var.D4;
                if (r1Var.Q5.I3()) {
                    f10 = j1Var.f42126b;
                    i7 = j1Var.f42129f;
                    i10 = xm0.E;
                } else if (gj.R4(r1Var.Q5.f24177k)) {
                    if (r1Var.C4) {
                        dn0 dn0Var = r1Var.E4;
                        return dn0Var.f34498a / dn0Var.f34503g;
                    }
                    f10 = j1Var.f42126b;
                    i7 = j1Var.f42129f;
                    i10 = xm0.E;
                } else if (r1Var.Q5.h4()) {
                    return r1Var.Q5.f24137b0;
                } else {
                    return 0.0f;
                }
                return f10 / (i7 - i10);
            default:
                return ((an0) this.f29974f).getProgress();
        }
    }

    @Override
    public final void l(float f10) {
        switch (this.f29973e) {
            case 0:
                ((u0) this.f29974f).e(true, f10);
                return;
            case 1:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f29974f;
                dn0 dn0Var = r1Var.E4;
                org.telegram.ui.Cells.j1 j1Var = r1Var.D4;
                if (r1Var.Q5.I3()) {
                    j1Var.h(f10);
                } else if (gj.R4(r1Var.Q5.f24177k)) {
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
                    r1Var.Q5.f24137b0 = f10;
                } else {
                    return;
                }
                r1Var.a(f10);
                r1Var.invalidate();
                return;
            default:
                an0 an0Var = (an0) this.f29974f;
                an0Var.f33537x = true;
                an0Var.setProgress(f10);
                an0Var.f(true, f10);
                an0Var.f33537x = false;
                return;
        }
    }

    public t0(an0 an0Var, boolean z10) {
        super(z10);
        this.f29973e = 2;
        this.f29974f = an0Var;
    }
}
