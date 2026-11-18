package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class qa extends bk0 {
    public final int f38753c;
    public final Context d;
    public final Object f38754e;
    public final KeyEvent.Callback f38755f;

    public qa(fj fjVar, Context context) {
        this.f38753c = 1;
        this.f38755f = fjVar;
        this.f38754e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(v4.k0 k0Var) {
        switch (this.f38753c) {
            case 0:
                ((bk0) this.f38754e).B(new pa(this, k0Var));
                return;
            default:
                super.B(k0Var);
                return;
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        switch (this.f38753c) {
            case 0:
                return ((bk0) this.f38754e).D(f1Var);
            default:
                if (f1Var.f59126f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        switch (this.f38753c) {
            case 0:
                return ((bk0) this.f38754e).b() + 1;
            default:
                return ((ArrayList) this.f38754e).size();
        }
    }

    @Override
    public final int d(int i7) {
        int i10;
        switch (this.f38753c) {
            case 0:
                sa saVar = (sa) this.f38755f;
                if (saVar.K1) {
                    i10 = b() - 1;
                } else {
                    i10 = 0;
                }
                if (i7 == i10) {
                    return -1000;
                }
                return ((bk0) this.f38754e).d(i7 - (!saVar.K1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        switch (this.f38753c) {
            case 0:
                sa saVar = (sa) this.f38755f;
                if (saVar.K1) {
                    i10 = b() - 1;
                } else {
                    i10 = 0;
                }
                if (i7 != i10) {
                    ((bk0) this.f38754e).t(f1Var, i7 - (!saVar.K1 ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) f1Var.f59122a;
                uaVar.d(1, false, false);
                uaVar.setSize(((fj) this.f38755f).f35115r);
                uaVar.e(1, ((ArrayList) this.f38754e).get(i7), null, 0);
                return;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        switch (this.f38753c) {
            case 0:
                if (i7 == -1000) {
                    return new v4.f1(new bi.i3((sa) this.f38755f, this.d));
                }
                return ((bk0) this.f38754e).x(viewGroup, i7);
            default:
                ej ejVar = new ej(this, this.d);
                ejVar.f32132b = false;
                return new v4.f1(ejVar);
        }
    }

    public qa(sa saVar, bk0 bk0Var, Context context) {
        this.f38753c = 0;
        this.f38755f = saVar;
        this.f38754e = bk0Var;
        this.d = context;
    }
}
