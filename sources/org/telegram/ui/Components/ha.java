package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ha extends tj0 {
    public final int f35205c;
    public final Context d;
    public final Object f35206e;
    public final KeyEvent.Callback f35207f;

    public ha(yi yiVar, Context context) {
        this.f35205c = 1;
        this.f35207f = yiVar;
        this.f35206e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(v4.j0 j0Var) {
        switch (this.f35205c) {
            case 0:
                ((tj0) this.f35206e).B(new ga(this, j0Var));
                return;
            default:
                super.B(j0Var);
                return;
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        switch (this.f35205c) {
            case 0:
                return ((tj0) this.f35206e).D(e1Var);
            default:
                if (e1Var.f58539f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        switch (this.f35205c) {
            case 0:
                return ((tj0) this.f35206e).b() + 1;
            default:
                return ((ArrayList) this.f35206e).size();
        }
    }

    @Override
    public final int d(int i7) {
        int i10;
        switch (this.f35205c) {
            case 0:
                ja jaVar = (ja) this.f35207f;
                if (jaVar.K1) {
                    i10 = b() - 1;
                } else {
                    i10 = 0;
                }
                if (i7 == i10) {
                    return -1000;
                }
                return ((tj0) this.f35206e).d(i7 - (!jaVar.K1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        switch (this.f35205c) {
            case 0:
                ja jaVar = (ja) this.f35207f;
                if (jaVar.K1) {
                    i10 = b() - 1;
                } else {
                    i10 = 0;
                }
                if (i7 != i10) {
                    ((tj0) this.f35206e).t(e1Var, i7 - (!jaVar.K1 ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) e1Var.f58535a;
                taVar.d(1, false, false);
                taVar.setSize(((yi) this.f35207f).f42002r);
                taVar.e(1, ((ArrayList) this.f35206e).get(i7), null, 0);
                return;
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        switch (this.f35205c) {
            case 0:
                if (i7 == -1000) {
                    return new v4.e1(new bi.o2((ja) this.f35207f, this.d));
                }
                return ((tj0) this.f35206e).x(viewGroup, i7);
            default:
                xi xiVar = new xi(this, this.d);
                xiVar.f31692b = false;
                return new v4.e1(xiVar);
        }
    }

    public ha(ja jaVar, tj0 tj0Var, Context context) {
        this.f35205c = 0;
        this.f35207f = jaVar;
        this.f35206e = tj0Var;
        this.d = context;
    }
}
