package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class bb extends qm0 {
    public final int f24966c;
    public final Context d;
    public final Object f24967e;
    public final KeyEvent.Callback f24968f;

    public bb(nj njVar, Context context) {
        this.f24966c = 1;
        this.f24968f = njVar;
        this.f24967e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.k0 k0Var) {
        switch (this.f24966c) {
            case 0:
                ((qm0) this.f24967e).B(new ab(this, k0Var));
                return;
            default:
                super.B(k0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        switch (this.f24966c) {
            case 0:
                return ((qm0) this.f24967e).D(d1Var);
            default:
                if (d1Var.f47786f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f24966c) {
            case 0:
                return ((qm0) this.f24967e).h() + 1;
            default:
                return ((ArrayList) this.f24967e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f24966c) {
            case 0:
                db dbVar = (db) this.f24968f;
                if (dbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((qm0) this.f24967e).j(i10 - (!dbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        switch (this.f24966c) {
            case 0:
                db dbVar = (db) this.f24968f;
                if (dbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((qm0) this.f24967e).v(d1Var, i10 - (!dbVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.cb cbVar = (org.telegram.ui.Cells.cb) d1Var.f47782a;
                cbVar.d(1, false, false);
                cbVar.setSize(((nj) this.f24968f).f29171r);
                cbVar.e(1, ((ArrayList) this.f24967e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        switch (this.f24966c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.d1(new ci.bb((db) this.f24968f, this.d));
                }
                return ((qm0) this.f24967e).x(viewGroup, i10);
            default:
                mj mjVar = new mj(this, this.d);
                mjVar.f21977b = false;
                return new s4.d1(mjVar);
        }
    }

    public bb(db dbVar, qm0 qm0Var, Context context) {
        this.f24966c = 0;
        this.f24968f = dbVar;
        this.f24967e = qm0Var;
        this.d = context;
    }
}
