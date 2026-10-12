package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class bb extends lm0 {
    public final int f23734c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f23735f;

    public bb(kj kjVar, Context context) {
        this.f23734c = 1;
        this.f23735f = kjVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.i0 i0Var) {
        switch (this.f23734c) {
            case 0:
                ((lm0) this.e).B(new ab(this, i0Var));
                return;
            default:
                super.B(i0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        switch (this.f23734c) {
            case 0:
                return ((lm0) this.e).D(b1Var);
            default:
                if (b1Var.f44841f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f23734c) {
            case 0:
                return ((lm0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f23734c) {
            case 0:
                db dbVar = (db) this.f23735f;
                if (dbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((lm0) this.e).j(i10 - (!dbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        switch (this.f23734c) {
            case 0:
                db dbVar = (db) this.f23735f;
                if (dbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((lm0) this.e).v(b1Var, i10 - (!dbVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.cb cbVar = (org.telegram.ui.Cells.cb) b1Var.f44838a;
                cbVar.d(1, false, false);
                cbVar.setSize(((kj) this.f23735f).f26709r);
                cbVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        switch (this.f23734c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.b1(new di.ab((db) this.f23735f, this.d));
                }
                return ((lm0) this.e).x(viewGroup, i10);
            default:
                jj jjVar = new jj(this, this.d);
                jjVar.f21050b = false;
                return new s4.b1(jjVar);
        }
    }

    public bb(db dbVar, lm0 lm0Var, Context context) {
        this.f23734c = 0;
        this.f23735f = dbVar;
        this.e = lm0Var;
        this.d = context;
    }
}
