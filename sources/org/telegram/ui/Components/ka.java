package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ka extends oj0 {
    public final int f35261c;
    public final Context d;
    public final Object f35262e;
    public final KeyEvent.Callback f35263f;

    public ka(pi piVar, Context context) {
        this.f35261c = 1;
        this.f35263f = piVar;
        this.f35262e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(v4.i0 i0Var) {
        switch (this.f35261c) {
            case 0:
                ((oj0) this.f35262e).B(new ja(this, i0Var));
                return;
            default:
                super.B(i0Var);
                return;
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        switch (this.f35261c) {
            case 0:
                return ((oj0) this.f35262e).D(d1Var);
            default:
                if (d1Var.f57056f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        switch (this.f35261c) {
            case 0:
                return ((oj0) this.f35262e).b() + 1;
            default:
                return ((ArrayList) this.f35262e).size();
        }
    }

    @Override
    public final int d(int i7) {
        int i10;
        switch (this.f35261c) {
            case 0:
                ma maVar = (ma) this.f35263f;
                if (maVar.J1) {
                    i10 = b() - 1;
                } else {
                    i10 = 0;
                }
                if (i7 == i10) {
                    return -1000;
                }
                return ((oj0) this.f35262e).d(i7 - (!maVar.J1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        switch (this.f35261c) {
            case 0:
                ma maVar = (ma) this.f35263f;
                if (maVar.J1) {
                    i10 = b() - 1;
                } else {
                    i10 = 0;
                }
                if (i7 != i10) {
                    ((oj0) this.f35262e).t(d1Var, i7 - (!maVar.J1 ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) d1Var.f57052a;
                uaVar.d(1, false, false);
                uaVar.setSize(((pi) this.f35263f).f36937r);
                uaVar.e(1, ((ArrayList) this.f35262e).get(i7), null, 0);
                return;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        switch (this.f35261c) {
            case 0:
                if (i7 == -1000) {
                    return new v4.d1(new bi.ec((ma) this.f35263f, this.d));
                }
                return ((oj0) this.f35262e).x(viewGroup, i7);
            default:
                oi oiVar = new oi(this, this.d);
                oiVar.f30609b = false;
                return new v4.d1(oiVar);
        }
    }

    public ka(ma maVar, oj0 oj0Var, Context context) {
        this.f35261c = 0;
        this.f35263f = maVar;
        this.f35262e = oj0Var;
        this.d = context;
    }
}
