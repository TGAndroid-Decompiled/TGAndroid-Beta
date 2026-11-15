package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.tm0;
public final class u0 extends qz {
    public final int f29675e;
    public final ViewGroup f29676f;

    public u0(ViewGroup viewGroup, int i7) {
        super(false);
        this.f29675e = i7;
        this.f29676f = viewGroup;
    }

    @Override
    public CharSequence d() {
        int i7 = this.f29675e;
        ViewGroup viewGroup = this.f29676f;
        switch (i7) {
            case 0:
                return eu0.a(((v0) viewGroup).getSpeed()) + "x  " + hd.M0(2131754759, null);
            case 1:
            default:
                return super.d();
            case 2:
                pm0 pm0Var = ((qm0) viewGroup).f38725y;
                if (pm0Var == null) {
                    return null;
                }
                return pm0Var.getContentDescription();
        }
    }

    @Override
    public float h() {
        switch (this.f29675e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int p02 = ((qm0) this.f29676f).f38725y.p0();
                if (p02 > 0) {
                    return 1.0f / p02;
                }
                return 0.05f;
        }
    }

    @Override
    public float i() {
        switch (this.f29675e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override
    public float j() {
        switch (this.f29675e) {
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
        switch (this.f29675e) {
            case 0:
                return ((v0) this.f29676f).getSpeed();
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f29676f;
                org.telegram.ui.Cells.i1 i1Var = q1Var.D4;
                if (q1Var.Q5.I3()) {
                    f10 = i1Var.f37627b;
                    i7 = i1Var.f37630f;
                    i10 = nm0.E;
                } else if (gj.R4(q1Var.Q5.f23819k)) {
                    if (q1Var.C4) {
                        tm0 tm0Var = q1Var.E4;
                        return tm0Var.f39722a / tm0Var.f39727g;
                    }
                    f10 = i1Var.f37627b;
                    i7 = i1Var.f37630f;
                    i10 = nm0.E;
                } else if (q1Var.Q5.h4()) {
                    return q1Var.Q5.f23779b0;
                } else {
                    return 0.0f;
                }
                return f10 / (i7 - i10);
            default:
                return ((qm0) this.f29676f).getProgress();
        }
    }

    @Override
    public final void l(float f10) {
        switch (this.f29675e) {
            case 0:
                ((v0) this.f29676f).e(true, f10);
                return;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f29676f;
                tm0 tm0Var = q1Var.E4;
                org.telegram.ui.Cells.i1 i1Var = q1Var.D4;
                if (q1Var.Q5.I3()) {
                    i1Var.h(f10);
                } else if (gj.R4(q1Var.Q5.f23819k)) {
                    if (q1Var.C4) {
                        tm0Var.g(false, f10);
                    } else {
                        i1Var.h(f10);
                    }
                } else if (q1Var.Q5.h4()) {
                    if (q1Var.C4) {
                        if (tm0Var != null) {
                            tm0Var.g(false, f10);
                        }
                    } else if (i1Var != null) {
                        i1Var.h(f10);
                    }
                    q1Var.Q5.f23779b0 = f10;
                } else {
                    return;
                }
                q1Var.e(f10);
                q1Var.invalidate();
                return;
            default:
                qm0 qm0Var = (qm0) this.f29676f;
                qm0Var.f38724x = true;
                qm0Var.setProgress(f10);
                qm0Var.f(true, f10);
                qm0Var.f38724x = false;
                return;
        }
    }

    public u0(qm0 qm0Var, boolean z10) {
        super(z10);
        this.f29675e = 2;
        this.f29676f = qm0Var;
    }
}
