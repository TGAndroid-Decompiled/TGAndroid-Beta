package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class cb extends pm0 {
    public final int f25318c;
    public final Context d;
    public final Object f25319e;
    public final KeyEvent.Callback f25320f;

    public cb(nj njVar, Context context) {
        this.f25318c = 1;
        this.f25320f = njVar;
        this.f25319e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.k0 k0Var) {
        switch (this.f25318c) {
            case 0:
                ((pm0) this.f25319e).B(new bb(this, k0Var));
                return;
            default:
                super.B(k0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        switch (this.f25318c) {
            case 0:
                return ((pm0) this.f25319e).D(d1Var);
            default:
                if (d1Var.f47660f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f25318c) {
            case 0:
                return ((pm0) this.f25319e).h() + 1;
            default:
                return ((ArrayList) this.f25319e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f25318c) {
            case 0:
                eb ebVar = (eb) this.f25320f;
                if (ebVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((pm0) this.f25319e).j(i10 - (!ebVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        switch (this.f25318c) {
            case 0:
                eb ebVar = (eb) this.f25320f;
                if (ebVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((pm0) this.f25319e).v(d1Var, i10 - (!ebVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.cb cbVar = (org.telegram.ui.Cells.cb) d1Var.f47656a;
                cbVar.d(1, false, false);
                cbVar.setSize(((nj) this.f25320f).f29164r);
                cbVar.e(1, ((ArrayList) this.f25319e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        switch (this.f25318c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.d1(new ci.bb((eb) this.f25320f, this.d));
                }
                return ((pm0) this.f25319e).x(viewGroup, i10);
            default:
                mj mjVar = new mj(this, this.d);
                mjVar.f21949b = false;
                return new s4.d1(mjVar);
        }
    }

    public cb(eb ebVar, pm0 pm0Var, Context context) {
        this.f25318c = 0;
        this.f25320f = ebVar;
        this.f25319e = pm0Var;
        this.d = context;
    }
}
