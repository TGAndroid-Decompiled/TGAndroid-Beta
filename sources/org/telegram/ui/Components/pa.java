package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class pa extends dk0 {
    public final int f38440c;
    public final Context d;
    public final Object f38441e;
    public final KeyEvent.Callback f38442f;

    public pa(gj gjVar, Context context) {
        this.f38440c = 1;
        this.f38442f = gjVar;
        this.f38441e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(v4.k0 k0Var) {
        switch (this.f38440c) {
            case 0:
                ((dk0) this.f38441e).B(new oa(this, k0Var));
                return;
            default:
                super.B(k0Var);
                return;
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        switch (this.f38440c) {
            case 0:
                return ((dk0) this.f38441e).D(f1Var);
            default:
                if (f1Var.f59249f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        switch (this.f38440c) {
            case 0:
                return ((dk0) this.f38441e).b() + 1;
            default:
                return ((ArrayList) this.f38441e).size();
        }
    }

    @Override
    public final int d(int i7) {
        int i10;
        switch (this.f38440c) {
            case 0:
                ra raVar = (ra) this.f38442f;
                if (raVar.K1) {
                    i10 = b() - 1;
                } else {
                    i10 = 0;
                }
                if (i7 == i10) {
                    return -1000;
                }
                return ((dk0) this.f38441e).d(i7 - (!raVar.K1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        switch (this.f38440c) {
            case 0:
                ra raVar = (ra) this.f38442f;
                if (raVar.K1) {
                    i10 = b() - 1;
                } else {
                    i10 = 0;
                }
                if (i7 != i10) {
                    ((dk0) this.f38441e).t(f1Var, i7 - (!raVar.K1 ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) f1Var.f59245a;
                waVar.d(1, false, false);
                waVar.setSize(((gj) this.f38442f).f35452r);
                waVar.e(1, ((ArrayList) this.f38441e).get(i7), null, 0);
                return;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        switch (this.f38440c) {
            case 0:
                if (i7 == -1000) {
                    return new v4.f1(new bi.o3((ra) this.f38442f, this.d));
                }
                return ((dk0) this.f38441e).x(viewGroup, i7);
            default:
                fj fjVar = new fj(this, this.d);
                fjVar.f32365b = false;
                return new v4.f1(fjVar);
        }
    }

    public pa(ra raVar, dk0 dk0Var, Context context) {
        this.f38440c = 0;
        this.f38442f = raVar;
        this.f38441e = dk0Var;
        this.d = context;
    }
}
