package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class za extends vl0 {
    public final int f30821c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f30822f;

    public za(kj kjVar, Context context) {
        this.f30821c = 1;
        this.f30822f = kjVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(s4.j0 j0Var) {
        switch (this.f30821c) {
            case 0:
                ((vl0) this.e).B(new ya(this, j0Var));
                return;
            default:
                super.B(j0Var);
                return;
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f30821c) {
            case 0:
                return ((vl0) this.e).D(c1Var);
            default:
                if (c1Var.f42963f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f30821c) {
            case 0:
                return ((vl0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f30821c) {
            case 0:
                bb bbVar = (bb) this.f30822f;
                if (bbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((vl0) this.e).j(i10 - (!bbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        switch (this.f30821c) {
            case 0:
                bb bbVar = (bb) this.f30822f;
                if (bbVar.P) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((vl0) this.e).v(c1Var, i10 - (!bbVar.P ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) c1Var.f42960a;
                ebVar.d(1, false, false);
                ebVar.setSize(((kj) this.f30822f).f25796r);
                ebVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.f30821c) {
            case 0:
                if (i10 == -1000) {
                    return new s4.c1(new ci.bb((bb) this.f30822f, this.d));
                }
                return ((vl0) this.e).x(viewGroup, i10);
            default:
                jj jjVar = new jj(this, this.d);
                jjVar.f20266b = false;
                return new s4.c1(jjVar);
        }
    }

    public za(bb bbVar, vl0 vl0Var, Context context) {
        this.f30821c = 0;
        this.f30822f = bbVar;
        this.e = vl0Var;
        this.d = context;
    }
}
