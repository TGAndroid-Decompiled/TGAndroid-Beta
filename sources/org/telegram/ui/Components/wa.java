package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class wa extends il0 {
    public final int f34356c;
    public final Context d;
    public final Object f34357e;
    public final KeyEvent.Callback f34358f;

    public wa(bj bjVar, Context context) {
        this.f34356c = 1;
        this.f34358f = bjVar;
        this.f34357e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(f2.r0 r0Var) {
        switch (this.f34356c) {
            case 0:
                ((il0) this.f34357e).B(new va(this, r0Var));
                return;
            default:
                super.B(r0Var);
                return;
        }
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        switch (this.f34356c) {
            case 0:
                return ((il0) this.f34357e).D(n1Var);
            default:
                if (n1Var.f6436f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f34356c) {
            case 0:
                return ((il0) this.f34357e).h() + 1;
            default:
                return ((ArrayList) this.f34357e).size();
        }
    }

    @Override
    public final int j(int i10) {
        int i11;
        switch (this.f34356c) {
            case 0:
                xa xaVar = (xa) this.f34358f;
                if (xaVar.M) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 == i11) {
                    return -1000;
                }
                return ((il0) this.f34357e).j(i10 - (!xaVar.M ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        switch (this.f34356c) {
            case 0:
                xa xaVar = (xa) this.f34358f;
                if (xaVar.M) {
                    i11 = h() - 1;
                } else {
                    i11 = 0;
                }
                if (i10 != i11) {
                    ((il0) this.f34357e).v(n1Var, i10 - (!xaVar.M ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) n1Var.f6432a;
                waVar.d(1, false, false);
                waVar.setSize(((bj) this.f34358f).f27121r);
                waVar.e(1, ((ArrayList) this.f34357e).get(i10), null, 0);
                return;
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        switch (this.f34356c) {
            case 0:
                if (i10 == -1000) {
                    return new f2.n1(new cg.h0((xa) this.f34358f, this.d));
                }
                return ((il0) this.f34357e).x(viewGroup, i10);
            default:
                aj ajVar = new aj(this, this.d);
                ajVar.f25889b = false;
                return new f2.n1(ajVar);
        }
    }

    public wa(xa xaVar, il0 il0Var, Context context) {
        this.f34356c = 0;
        this.f34358f = xaVar;
        this.f34357e = il0Var;
        this.d = context;
    }
}
