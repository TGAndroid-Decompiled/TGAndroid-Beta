package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ra extends rl0 {
    public final int f28423c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f28424f;

    public ra(zi ziVar, Context context) {
        this.f28423c = 1;
        this.f28424f = ziVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(f2.q0 q0Var) {
        switch (this.f28423c) {
            case 0:
                ((rl0) this.e).B(new qa(this, q0Var));
                return;
            default:
                super.B(q0Var);
                return;
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        switch (this.f28423c) {
            case 0:
                return ((rl0) this.e).D(l1Var);
            default:
                if (l1Var.f5788f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f28423c) {
            case 0:
                return ((rl0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f28423c) {
            case 0:
                sa saVar = (sa) this.f28424f;
                if (saVar.N) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((rl0) this.e).j(i10 - (!saVar.N ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        switch (this.f28423c) {
            case 0:
                sa saVar = (sa) this.f28424f;
                if (saVar.N) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((rl0) this.e).v(l1Var, i10 - (!saVar.N ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) l1Var.f5785a;
                zaVar.d(1, false, false);
                zaVar.setSize(((zi) this.f28424f).f31348r);
                zaVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        switch (this.f28423c) {
            case 0:
                if (i10 == -1000) {
                    return new f2.l1(new eg.h0((sa) this.f28424f, this.d));
                }
                return ((rl0) this.e).x(viewGroup, i10);
            default:
                yi yiVar = new yi(this, this.d);
                yiVar.f22707b = false;
                return new f2.l1(yiVar);
        }
    }

    public ra(sa saVar, rl0 rl0Var, Context context) {
        this.f28423c = 0;
        this.f28424f = saVar;
        this.e = rl0Var;
        this.d = context;
    }
}
