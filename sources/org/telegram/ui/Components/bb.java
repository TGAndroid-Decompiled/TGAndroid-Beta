package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class bb extends vm0 {
    public final int f24595c;
    public final Context d;
    public final Object f24596e;
    public final KeyEvent.Callback f24597f;

    public bb(pj pjVar, Context context) {
        this.f24595c = 1;
        this.f24597f = pjVar;
        this.f24596e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.k0 k0Var) {
        switch (this.f24595c) {
            case 0:
                ((vm0) this.f24596e).B(new ab(this, k0Var));
                return;
            default:
                super.B(k0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        switch (this.f24595c) {
            case 0:
                return ((vm0) this.f24596e).D(d1Var);
            default:
                if (d1Var.f47901f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f24595c) {
            case 0:
                return ((vm0) this.f24596e).h() + 1;
            default:
                return ((ArrayList) this.f24596e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f24595c) {
            case 0:
                db dbVar = (db) this.f24597f;
                if (dbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((vm0) this.f24596e).j(i10 - (!dbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        switch (this.f24595c) {
            case 0:
                db dbVar = (db) this.f24597f;
                if (dbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((vm0) this.f24596e).v(d1Var, i10 - (!dbVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.cb cbVar = (org.telegram.ui.Cells.cb) d1Var.f47897a;
                cbVar.d(1, false, false);
                cbVar.setSize(((pj) this.f24597f).f29509r);
                cbVar.e(1, ((ArrayList) this.f24596e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        switch (this.f24595c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.d1(new ci.bb((db) this.f24597f, this.d));
                }
                return ((vm0) this.f24596e).x(viewGroup, i10);
            default:
                oj ojVar = new oj(this, this.d);
                ojVar.f21712b = false;
                return new s4.d1(ojVar);
        }
    }

    public bb(db dbVar, vm0 vm0Var, Context context) {
        this.f24595c = 0;
        this.f24597f = dbVar;
        this.f24596e = vm0Var;
        this.d = context;
    }
}
