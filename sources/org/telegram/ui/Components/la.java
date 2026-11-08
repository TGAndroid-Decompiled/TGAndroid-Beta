package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class la extends oj0 {
    public final int f35622c;
    public final Context d;
    public final Object f35623e;
    public final KeyEvent.Callback f35624f;

    public la(qi qiVar, Context context) {
        this.f35622c = 1;
        this.f35624f = qiVar;
        this.f35623e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(v4.i0 i0Var) {
        switch (this.f35622c) {
            case 0:
                ((oj0) this.f35623e).B(new ka(this, i0Var));
                return;
            default:
                super.B(i0Var);
                return;
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        switch (this.f35622c) {
            case 0:
                return ((oj0) this.f35623e).D(d1Var);
            default:
                if (d1Var.f57047f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        switch (this.f35622c) {
            case 0:
                return ((oj0) this.f35623e).b() + 1;
            default:
                return ((ArrayList) this.f35623e).size();
        }
    }

    @Override
    public final int d(int i7) {
        int i10;
        switch (this.f35622c) {
            case 0:
                na naVar = (na) this.f35624f;
                if (naVar.G1) {
                    i10 = b() - 1;
                } else {
                    i10 = 0;
                }
                if (i7 == i10) {
                    return -1000;
                }
                return ((oj0) this.f35623e).d(i7 - (!naVar.G1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        switch (this.f35622c) {
            case 0:
                na naVar = (na) this.f35624f;
                if (naVar.G1) {
                    i10 = b() - 1;
                } else {
                    i10 = 0;
                }
                if (i7 != i10) {
                    ((oj0) this.f35623e).t(d1Var, i7 - (!naVar.G1 ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) d1Var.f57043a;
                uaVar.d(1, false, false);
                uaVar.setSize(((qi) this.f35624f).f37333r);
                uaVar.e(1, ((ArrayList) this.f35623e).get(i7), null, 0);
                return;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        switch (this.f35622c) {
            case 0:
                if (i7 == -1000) {
                    return new v4.d1(new bi.ec((na) this.f35624f, this.d));
                }
                return ((oj0) this.f35623e).x(viewGroup, i7);
            default:
                pi piVar = new pi(this, this.d);
                piVar.f30594b = false;
                return new v4.d1(piVar);
        }
    }

    public la(na naVar, oj0 oj0Var, Context context) {
        this.f35622c = 0;
        this.f35624f = naVar;
        this.f35623e = oj0Var;
        this.d = context;
    }
}
