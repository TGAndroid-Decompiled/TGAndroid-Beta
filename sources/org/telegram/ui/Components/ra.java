package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ra extends sl0 {
    public final int f30656c;
    public final Context d;
    public final Object f30657e;
    public final KeyEvent.Callback f30658f;

    public ra(bj bjVar, Context context) {
        this.f30656c = 1;
        this.f30658f = bjVar;
        this.f30657e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(f2.r0 r0Var) {
        switch (this.f30656c) {
            case 0:
                ((sl0) this.f30657e).B(new qa(this, r0Var));
                return;
            default:
                super.B(r0Var);
                return;
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        switch (this.f30656c) {
            case 0:
                return ((sl0) this.f30657e).D(m1Var);
            default:
                if (m1Var.f5879f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f30656c) {
            case 0:
                return ((sl0) this.f30657e).h() + 1;
            default:
                return ((ArrayList) this.f30657e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f30656c) {
            case 0:
                sa saVar = (sa) this.f30658f;
                if (saVar.N) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((sl0) this.f30657e).j(i10 - (!saVar.N ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        switch (this.f30656c) {
            case 0:
                sa saVar = (sa) this.f30658f;
                if (saVar.N) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((sl0) this.f30657e).v(m1Var, i10 - (!saVar.N ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) m1Var.f5875a;
                zaVar.d(1, false, false);
                zaVar.setSize(((bj) this.f30658f).f25602r);
                zaVar.e(1, ((ArrayList) this.f30657e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        switch (this.f30656c) {
            case 0:
                if (i10 == -1000) {
                    return new f2.m1(new fg.h0((sa) this.f30658f, this.d));
                }
                return ((sl0) this.f30657e).x(viewGroup, i10);
            default:
                aj ajVar = new aj(this, this.d);
                ajVar.f24543b = false;
                return new f2.m1(ajVar);
        }
    }

    public ra(sa saVar, sl0 sl0Var, Context context) {
        this.f30656c = 0;
        this.f30658f = saVar;
        this.f30657e = sl0Var;
        this.d = context;
    }
}
