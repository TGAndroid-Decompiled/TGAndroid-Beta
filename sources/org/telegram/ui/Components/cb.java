package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class cb extends qm0 {
    public final int f25260c;
    public final Context d;
    public final Object f25261e;
    public final KeyEvent.Callback f25262f;

    public cb(nj njVar, Context context) {
        this.f25260c = 1;
        this.f25262f = njVar;
        this.f25261e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.k0 k0Var) {
        switch (this.f25260c) {
            case 0:
                ((qm0) this.f25261e).B(new bb(this, k0Var));
                return;
            default:
                super.B(k0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        switch (this.f25260c) {
            case 0:
                return ((qm0) this.f25261e).D(d1Var);
            default:
                if (d1Var.f47706f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f25260c) {
            case 0:
                return ((qm0) this.f25261e).h() + 1;
            default:
                return ((ArrayList) this.f25261e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f25260c) {
            case 0:
                eb ebVar = (eb) this.f25262f;
                if (ebVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((qm0) this.f25261e).j(i10 - (!ebVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        switch (this.f25260c) {
            case 0:
                eb ebVar = (eb) this.f25262f;
                if (ebVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((qm0) this.f25261e).v(d1Var, i10 - (!ebVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.cb cbVar = (org.telegram.ui.Cells.cb) d1Var.f47702a;
                cbVar.d(1, false, false);
                cbVar.setSize(((nj) this.f25262f).f29129r);
                cbVar.e(1, ((ArrayList) this.f25261e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        switch (this.f25260c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.d1(new ci.bb((eb) this.f25262f, this.d));
                }
                return ((qm0) this.f25261e).x(viewGroup, i10);
            default:
                mj mjVar = new mj(this, this.d);
                mjVar.f21953b = false;
                return new s4.d1(mjVar);
        }
    }

    public cb(eb ebVar, qm0 qm0Var, Context context) {
        this.f25260c = 0;
        this.f25262f = ebVar;
        this.f25261e = qm0Var;
        this.d = context;
    }
}
