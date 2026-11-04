package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ka extends sj0 {
    public final int f35355c;
    public final Context d;
    public final Object f35356e;
    public final KeyEvent.Callback f35357f;

    public ka(qi qiVar, Context context) {
        this.f35355c = 1;
        this.f35357f = qiVar;
        this.f35356e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(u4.j0 j0Var) {
        switch (this.f35355c) {
            case 0:
                ((sj0) this.f35356e).B(new ja(this, j0Var));
                return;
            default:
                super.B(j0Var);
                return;
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        switch (this.f35355c) {
            case 0:
                return ((sj0) this.f35356e).D(d1Var);
            default:
                if (d1Var.f55544f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        switch (this.f35355c) {
            case 0:
                return ((sj0) this.f35356e).b() + 1;
            default:
                return ((ArrayList) this.f35356e).size();
        }
    }

    @Override
    public final int d(int i3) {
        int i10;
        switch (this.f35355c) {
            case 0:
                ma maVar = (ma) this.f35357f;
                if (maVar.H1) {
                    i10 = b() - 1;
                } else {
                    i10 = 0;
                }
                if (i3 == i10) {
                    return -1000;
                }
                return ((sj0) this.f35356e).d(i3 - (!maVar.H1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        switch (this.f35355c) {
            case 0:
                ma maVar = (ma) this.f35357f;
                if (maVar.H1) {
                    i10 = b() - 1;
                } else {
                    i10 = 0;
                }
                if (i3 != i10) {
                    ((sj0) this.f35356e).t(d1Var, i3 - (!maVar.H1 ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) d1Var.f55540a;
                taVar.d(1, false, false);
                taVar.setSize(((qi) this.f35357f).f37465r);
                taVar.e(1, ((ArrayList) this.f35356e).get(i3), null, 0);
                return;
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        switch (this.f35355c) {
            case 0:
                if (i3 == -1000) {
                    return new u4.d1(new ai.x2((ma) this.f35357f, this.d));
                }
                return ((sj0) this.f35356e).x(viewGroup, i3);
            default:
                pi piVar = new pi(this, this.d);
                piVar.f30616b = false;
                return new u4.d1(piVar);
        }
    }

    public ka(ma maVar, sj0 sj0Var, Context context) {
        this.f35355c = 0;
        this.f35357f = maVar;
        this.f35356e = sj0Var;
        this.d = context;
    }
}
