package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ab extends yl0 {
    public final int f24506c;
    public final Context d;
    public final Object f24507e;
    public final KeyEvent.Callback f24508f;

    public ab(mj mjVar, Context context) {
        this.f24506c = 1;
        this.f24508f = mjVar;
        this.f24507e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.j0 j0Var) {
        switch (this.f24506c) {
            case 0:
                ((yl0) this.f24507e).B(new za(this, j0Var));
                return;
            default:
                super.B(j0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f24506c) {
            case 0:
                return ((yl0) this.f24507e).D(c1Var);
            default:
                if (c1Var.f46528f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f24506c) {
            case 0:
                return ((yl0) this.f24507e).h() + 1;
            default:
                return ((ArrayList) this.f24507e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f24506c) {
            case 0:
                cb cbVar = (cb) this.f24508f;
                if (cbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((yl0) this.f24507e).j(i10 - (!cbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        switch (this.f24506c) {
            case 0:
                cb cbVar = (cb) this.f24508f;
                if (cbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((yl0) this.f24507e).v(c1Var, i10 - (!cbVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) c1Var.f46524a;
                ebVar.d(1, false, false);
                ebVar.setSize(((mj) this.f24508f).f28630r);
                ebVar.e(1, ((ArrayList) this.f24507e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.f24506c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.c1(new ci.ab((cb) this.f24508f, this.d));
                }
                return ((yl0) this.f24507e).x(viewGroup, i10);
            default:
                lj ljVar = new lj(this, this.d);
                ljVar.f22060b = false;
                return new s4.c1(ljVar);
        }
    }

    public ab(cb cbVar, yl0 yl0Var, Context context) {
        this.f24506c = 0;
        this.f24508f = cbVar;
        this.f24507e = yl0Var;
        this.d = context;
    }
}
