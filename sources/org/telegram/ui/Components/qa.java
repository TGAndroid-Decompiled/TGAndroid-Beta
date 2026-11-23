package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class qa extends dk0 {
    public final int f38802c;
    public final Context d;
    public final Object f38803e;
    public final KeyEvent.Callback f38804f;

    public qa(hj hjVar, Context context) {
        this.f38802c = 1;
        this.f38804f = hjVar;
        this.f38803e = new ArrayList();
        this.d = context;
    }

    @Override
    public void B(v4.j0 j0Var) {
        switch (this.f38802c) {
            case 0:
                ((dk0) this.f38803e).B(new pa(this, j0Var));
                return;
            default:
                super.B(j0Var);
                return;
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        switch (this.f38802c) {
            case 0:
                return ((dk0) this.f38803e).D(e1Var);
            default:
                if (e1Var.f59115f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        switch (this.f38802c) {
            case 0:
                return ((dk0) this.f38803e).b() + 1;
            default:
                return ((ArrayList) this.f38803e).size();
        }
    }

    @Override
    public final int d(int i7) {
        int i10;
        switch (this.f38802c) {
            case 0:
                sa saVar = (sa) this.f38804f;
                if (saVar.K1) {
                    i10 = b() - 1;
                } else {
                    i10 = 0;
                }
                if (i7 == i10) {
                    return -1000;
                }
                return ((dk0) this.f38803e).d(i7 - (!saVar.K1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        switch (this.f38802c) {
            case 0:
                sa saVar = (sa) this.f38804f;
                if (saVar.K1) {
                    i10 = b() - 1;
                } else {
                    i10 = 0;
                }
                if (i7 != i10) {
                    ((dk0) this.f38803e).t(e1Var, i7 - (!saVar.K1 ? 1 : 0));
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) e1Var.f59111a;
                vaVar.d(1, false, false);
                vaVar.setSize(((hj) this.f38804f).f35868r);
                vaVar.e(1, ((ArrayList) this.f38803e).get(i7), null, 0);
                return;
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        switch (this.f38802c) {
            case 0:
                if (i7 == -1000) {
                    return new v4.e1(new bi.o3((sa) this.f38804f, this.d));
                }
                return ((dk0) this.f38803e).x(viewGroup, i7);
            default:
                gj gjVar = new gj(this, this.d);
                gjVar.f32186b = false;
                return new v4.e1(gjVar);
        }
    }

    public qa(sa saVar, dk0 dk0Var, Context context) {
        this.f38802c = 0;
        this.f38804f = saVar;
        this.f38803e = dk0Var;
        this.d = context;
    }
}
