package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class bb extends rm0 {
    public final int f24896c;
    public final Context d;
    public final Object f24897e;
    public final KeyEvent.Callback f24898f;

    public bb(nj njVar, Context context) {
        this.f24896c = 1;
        this.f24898f = njVar;
        this.f24897e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.k0 k0Var) {
        switch (this.f24896c) {
            case 0:
                ((rm0) this.f24897e).B(new ab(this, k0Var));
                return;
            default:
                super.B(k0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        switch (this.f24896c) {
            case 0:
                return ((rm0) this.f24897e).D(d1Var);
            default:
                if (d1Var.f47752f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f24896c) {
            case 0:
                return ((rm0) this.f24897e).h() + 1;
            default:
                return ((ArrayList) this.f24897e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f24896c) {
            case 0:
                db dbVar = (db) this.f24898f;
                if (dbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((rm0) this.f24897e).j(i10 - (!dbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        switch (this.f24896c) {
            case 0:
                db dbVar = (db) this.f24898f;
                if (dbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((rm0) this.f24897e).v(d1Var, i10 - (!dbVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.cb cbVar = (org.telegram.ui.Cells.cb) d1Var.f47748a;
                cbVar.d(1, false, false);
                cbVar.setSize(((nj) this.f24898f).f29061r);
                cbVar.e(1, ((ArrayList) this.f24897e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        switch (this.f24896c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.d1(new ci.bb((db) this.f24898f, this.d));
                }
                return ((rm0) this.f24897e).x(viewGroup, i10);
            default:
                mj mjVar = new mj(this, this.d);
                mjVar.f21941b = false;
                return new s4.d1(mjVar);
        }
    }

    public bb(db dbVar, rm0 rm0Var, Context context) {
        this.f24896c = 0;
        this.f24898f = dbVar;
        this.f24897e = rm0Var;
        this.d = context;
    }
}
