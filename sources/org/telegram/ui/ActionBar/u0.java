package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.fu0;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qm0;
public final class u0 extends nz {
    public final int f28539e;
    public final ViewGroup f28540f;

    public u0(ViewGroup viewGroup, int i7) {
        super(false);
        this.f28539e = i7;
        this.f28540f = viewGroup;
    }

    @Override
    public CharSequence d() {
        int i7 = this.f28539e;
        ViewGroup viewGroup = this.f28540f;
        switch (i7) {
            case 0:
                return fu0.a(((v0) viewGroup).getSpeed()) + "x  " + id.M0(2131754759, null);
            case 1:
            default:
                return super.d();
            case 2:
                mm0 mm0Var = ((nm0) viewGroup).f36420y;
                if (mm0Var == null) {
                    return null;
                }
                return mm0Var.getContentDescription();
        }
    }

    @Override
    public float h() {
        switch (this.f28539e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int q02 = ((nm0) this.f28540f).f36420y.q0();
                if (q02 > 0) {
                    return 1.0f / q02;
                }
                return 0.05f;
        }
    }

    @Override
    public float i() {
        switch (this.f28539e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override
    public float j() {
        switch (this.f28539e) {
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
        switch (this.f28539e) {
            case 0:
                return ((v0) this.f28540f).getSpeed();
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f28540f;
                org.telegram.ui.Cells.i1 i1Var = q1Var.C4;
                if (q1Var.P5.I3()) {
                    f10 = i1Var.f35377b;
                    i7 = i1Var.f35380f;
                    i10 = km0.E;
                } else if (ij.R4(q1Var.P5.f23262k)) {
                    if (q1Var.B4) {
                        qm0 qm0Var = q1Var.D4;
                        return qm0Var.f37418a / qm0Var.f37423g;
                    }
                    f10 = i1Var.f35377b;
                    i7 = i1Var.f35380f;
                    i10 = km0.E;
                } else if (q1Var.P5.h4()) {
                    return q1Var.P5.f23222b0;
                } else {
                    return 0.0f;
                }
                return f10 / (i7 - i10);
            default:
                return ((nm0) this.f28540f).getProgress();
        }
    }

    @Override
    public final void l(float f10) {
        switch (this.f28539e) {
            case 0:
                ((v0) this.f28540f).e(true, f10);
                return;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f28540f;
                qm0 qm0Var = q1Var.D4;
                org.telegram.ui.Cells.i1 i1Var = q1Var.C4;
                if (q1Var.P5.I3()) {
                    i1Var.h(f10);
                } else if (ij.R4(q1Var.P5.f23262k)) {
                    if (q1Var.B4) {
                        qm0Var.g(false, f10);
                    } else {
                        i1Var.h(f10);
                    }
                } else if (q1Var.P5.h4()) {
                    if (q1Var.B4) {
                        if (qm0Var != null) {
                            qm0Var.g(false, f10);
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
                nm0 nm0Var = (nm0) this.f28540f;
                nm0Var.f36419x = true;
                nm0Var.setProgress(f10);
                nm0Var.f(true, f10);
                nm0Var.f36419x = false;
                return;
        }
    }

    public u0(nm0 nm0Var, boolean z9) {
        super(z9);
        this.f28539e = 2;
        this.f28540f = nm0Var;
    }
}
