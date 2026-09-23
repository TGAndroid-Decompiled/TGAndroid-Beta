package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class za extends ll0 {
    public final int f30550c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f30551f;

    public za(kj kjVar, Context context) {
        this.f30550c = 1;
        this.f30551f = kjVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.j0 j0Var) {
        switch (this.f30550c) {
            case 0:
                ((ll0) this.e).B(new ya(this, j0Var));
                return;
            default:
                super.B(j0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f30550c) {
            case 0:
                return ((ll0) this.e).D(c1Var);
            default:
                if (c1Var.f42630f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f30550c) {
            case 0:
                return ((ll0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f30550c) {
            case 0:
                bb bbVar = (bb) this.f30551f;
                if (bbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((ll0) this.e).j(i10 - (!bbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        switch (this.f30550c) {
            case 0:
                bb bbVar = (bb) this.f30551f;
                if (bbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((ll0) this.e).v(c1Var, i10 - (!bbVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.gb gbVar = (org.telegram.ui.Cells.gb) c1Var.f42627a;
                gbVar.d(1, false, false);
                gbVar.setSize(((kj) this.f30551f).f25608r);
                gbVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.f30550c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.c1(new ci.bb((bb) this.f30551f, this.d));
                }
                return ((ll0) this.e).x(viewGroup, i10);
            default:
                jj jjVar = new jj(this, this.d);
                jjVar.f20124b = false;
                return new s4.c1(jjVar);
        }
    }

    public za(bb bbVar, ll0 ll0Var, Context context) {
        this.f30550c = 0;
        this.f30551f = bbVar;
        this.e = ll0Var;
        this.d = context;
    }
}
